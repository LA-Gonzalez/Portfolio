"use strict"

const titleElement = document.querySelector("#note-title")
const updatedElement = document.querySelector("#updated")
const bodyElement = document.querySelector("#note-body")
const noteId = location.hash.substring(1)
let notes = getSavedNotes()

let note = notes.find((note)=>note.id === noteId)

if (!note){
    location.assign("/index.html")
}

titleElement.value = note.title
bodyElement.value = note.body
updatedElement.textContent = `Last edited ${moment(note.updatedAt).fromNow()}`

// Setup input event for title and saves notes
titleElement.addEventListener("input", (e)=>{
    note.title = e.target.value
    note.updatedAt = moment().valueOf()
    saveNotes(notes)
    lastEdited(note.updatedAt)
})

// repeat 1 and 2 for body
bodyElement.addEventListener("input", (e)=>{
    note.body = e.target.value
    note.updatedAt = moment().valueOf()
    saveNotes(notes)
    lastEdited(note.updatedAt)
})
// set up a remove button that removes and sends users back to the home page
document.querySelector("#remove-note").addEventListener("click", ()=>{
    removeNote(noteId)
    saveNotes(notes)
    location.assign("/index.html")
})

window.addEventListener("storage", (e)=>{
    if(e.key === "notes"){
        notes = JSON.parse(e.newValue)
        note = notes.find((note)=>{
            return note.id === noteId
        })
        
        if (!note){
            location.assign("/index.html")
        }
        
        titleElement.value = note.title
        bodyElement.value = note.body
        lastEdited(note.updatedAt)   
    }
})
