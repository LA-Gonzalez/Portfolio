"use strict"

    let todos = getSavedTodos()

    // load data
    
    const filters = {
        searchText: '',
        hideCompleted: false
    }
      
    renderTodos(todos, filters)
    
    document.querySelector('#search-text').addEventListener('input',  (e)=> {
        filters.searchText = e.target.value
        renderTodos(todos, filters)
    })

    document.querySelector("#new-todo").addEventListener("submit", (e)=>{
        e.preventDefault()
        let todoText = e.target.elements.newTodo.value.trim()
        if(todoText.length >0){
            todos.push({
                id: uuidv4(),
                text: todoText, 
                completed: false
            })
        }
        
        e.target.elements.newTodo.value = ""
        renderTodos(todos, filters)
        saveTodos(todos)
    })

    document.querySelector("#hide-completed").addEventListener("change", (e)=>{
        filters.hideCompleted = e.target.checked
        renderTodos(todos, filters)

    })

   


