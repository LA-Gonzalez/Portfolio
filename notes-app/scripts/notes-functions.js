"use strict"


// read existing notes from local storage
const getSavedNotes = () =>{
    const notesJSON = localStorage.getItem("notes")

    try{
        return notesJSON ? JSON.parse(notesJSON) : []
    }
    catch(e){
        return []
    }

}

// Remove note function
const removeNote = (id)=>{
    const noteIndex = notes.findIndex((note)=> note.id === id)
    if (noteIndex > -1 ){
        notes.splice(noteIndex, 1)
    }
}

// Generate DOM structure for a note
const generateNoteDOM = (note)=>{
    const noteElement = document.createElement("a")
    const textElement = document.createElement("p")
    const statusElement = document.createElement("p")
    

    // Setup the note title text 
    if(note.title.length > 0){
        textElement.textContent = note.title

    }
    else{
        textElement.textContent = "Unnamed note"
    }
    textElement.classList.add("list-item__title")
    noteElement.appendChild(textElement)

    // Setup the link
    noteElement.setAttribute("href", "note.html#"+note.id)
    noteElement.classList.add("list-item")

    // Setup status message
    statusElement.textContent= lastEdited(note.updatedAt)
    statusElement.classList.add("list-item__subtitle")
    noteElement.appendChild(statusElement)


    return noteElement
}

// sorts notes
const sortNotes = (notes, sortBy)=>{
    if(sortBy === "byEdited"){
        return notes.sort((a,b)=>{
            if(a.updatedAt > b.updatedAt){
                return -1
            }
            else if(a.updatedAt < b.updatedAt){
                return 1
            }
            else{
                return 0
            }
        })
    }
    else if(sortBy === "byCreated"){
        return notes.sort((a,b)=>{
            if(a.createdAt > b.createdAt){
                return -1
            }
            else if(a.createdAt < b.createdAt){
                return 1
            }
            else return 0
        })
    }
    else if(sortBy === "aplhabetical"){
        return notes.sort((a,b)=>{
            if(a.title.toLowerCase() < b.title.toLowerCase()){
                return -1
            }
            else if(a.title.toLowerCase() > b.title.toLowerCase()){
                return 1
            }
            else return 0
        })
    }
    else{
        return notes
    }
}

// render application notes
const renderNotes = (notes, filters)=>{
    const notesElement = document.querySelector("#notes")
    notes = sortNotes(notes, filters.sortBy)
    const filteredNotes = notes.filter((note)=>{
        return note.title.toLowerCase().includes(filters.searhText.toLowerCase())
    })

    notesElement.innerHTML = ""

    if(filteredNotes.length >0){
        filteredNotes.forEach((note)=>{
            const noteElement = generateNoteDOM(note)
            notesElement.appendChild(noteElement)
        })
    }
    else{
        const emptyMessage = document.createElement("p")
        emptyMessage.textContent = "No notes to show"
        emptyMessage.classList.add("empty-message")
        notesElement.appendChild(emptyMessage)
    }

}

// Save the notes to local storage
const saveNotes = (notes) =>{
    localStorage.setItem("notes", JSON.stringify(notes))

}

// Generate the last edited message
const lastEdited = (timestamp)=>{
    return `Last edited ${moment(timestamp).fromNow()}`

}