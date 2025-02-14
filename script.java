let userInput = document.getElementById("userInput");
let gameResult = document.getElementById("gameResult");
let randomnum = Math.ceil(Math.random() * 100);
console.log(randomnum);

function checkGuess() {
    let guessednum = parseInt(userInput.value);
    if (guessednum < randomnum) {
        gameResult.textContent = "Too low, try again Bro.";
        gameResult.style.backgroundColor = "red";
    } else if (guessednum > randomnum) {
        gameResult.textContent = "Too High, try again Bro.";
        gameResult.style.backgroundColor = "blue";

    } else if (guessednum === randomnum) {
        gameResult.textContent = "Congrats You are Ramanujan..";
        gameResult.style.backgroundColor = "green";

    } else {
        gameResult.textContent = "Please provide a valid input.";
        gameResult.style.backgroundColor = "#1e217c";
    }
}