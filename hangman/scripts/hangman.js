class Hangman{
    constructor(word, guessesAllowed){
        this.word = word.toLowerCase().split("")
        this.guessesAllowed = guessesAllowed
        this.guessed = []
        this.status = "playing"
    }
    get puzzle(){
        let puzzle = ``
        
        this.word.forEach((letter) => {
            if(this.guessed.includes(letter)|| letter === " "){
                puzzle += letter
    
            }
            else{
                puzzle += `*`
            }
        })
        return puzzle
    }
    makeGuess(guess){
        // Should accept a character for guessing
        guess = guess.toLowerCase()
        if(typeof guess === "string" && guess.length === 1){  
            const isUnique = !this.guessed.includes(guess)
            const isBadGuess = !this.word.includes(guess) 
            
            if(this.status !== "playing"){
                return
            }
            
            if(isUnique){
                this.guessed.push(guess)
            }
            if(isUnique && isBadGuess){
                this.guessesAllowed --
            }        
        }
        this.calcStatus()
    }
    // calcStatus method --> calculates game status for player
    calcStatus(){
    let word = this.word.join("")

    if(this.guessesAllowed === 0){
        this.status = "failed"
    }
    if(word === this.puzzle){
        this.status = "finished"
    }

}

    get statusMessage(){
    if(this.status === "playing"){
        return `Guesses Left: ${this.guessesAllowed}`
    }
    else if(this.status === "failed"){
        return `Nice try! The word was "${this.word.join("")}"`
    }
    else{
        return `Great work! You guessed the word.`
    }
}
}


// Generates Puzzle DOM
const renderPuzzle = (puzzle)=>{
    document.querySelector("#puzzle").innerHTML = ""
    document.querySelector("#guesses").innerHTML = ""

    //const puzzleElement = document.createElement("div")
    puzzleWord = puzzle.puzzle.split("")
    puzzleWord.forEach((char)=>{
        const charElement = document.createElement("span")
        charElement.textContent = char
        document.querySelector("#puzzle").appendChild(charElement)
    })
    //puzzleElement.textContent = puzzle.puzzle
    //document.querySelector("#puzzle").appendChild(puzzleElement)
    const guessElement = document.createElement("div")
    
    guessElement.textContent = puzzle.statusMessage
      
    document.querySelector("#guesses").appendChild(guessElement)
}
