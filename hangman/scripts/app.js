let game

window.addEventListener("keypress", (e)=>{

    guess = String.fromCharCode(e.charCode)
    game.makeGuess(guess)
    renderPuzzle(game)

})

const startGame = async ()=>{
    const puzzle = await getPuzzle("2")
    game = new Hangman(puzzle,5)
    renderPuzzle(game)
}

document.querySelector("#reset").addEventListener("click",startGame)

startGame()

getCurrentCountry().then((country)=>{
    console.log(country.name)
}).catch(err=>{
    console.log(`Error: ${err}`)
})
