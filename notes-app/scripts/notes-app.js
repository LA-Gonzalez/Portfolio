"use strict"

// Check for saved data
let notes = getSavedNotes()

// Fitler Searches
const filters = {
    searhText: "",
    sortBy: "byEdited"
}


// Renders notes by taking notes, and filters as parameters 
renderNotes(notes, filters)

const timestamp = moment().valueOf()

// Listener for create note button
document.querySelector("#create-note").addEventListener("click", (e)=>{
    notes.push({
        id: uuidv4(),
        title: "",
        body: "",
        createdAt: timestamp,
        updatedAt: timestamp
    })
    saveNotes(notes)
    let id = notes[notes.length -1].id
    location.assign("/note.html#"+id)
})


document.querySelector("#search-text").addEventListener("input", (e)=>{
    filters.searhText= e.target.value
    renderNotes(notes, filters)
})

document.querySelector("#filter-by").addEventListener("change", (e)=>{
    filters.sortBy= e.target.value
    renderNotes(notes, filters)
})

window.addEventListener("storage", (e)=>{
    if(e.key === "notes"){
        notes = JSON.parse(e.newValue)
        renderNotes(notes, filters)
    }
})

