"""
Title: Assignment4
Author: Alejandro Gonzalez
Description: Word Scramble game using breezypythongui. Program reads words from words.txt and puts them into
             a list. A word is selected randomly from this list and scrambled. The user has 3 attempts to
             guess the word per round. After each round the user has an option to continue or end the game
             if there are any words left in the list. End screen shows total number of points earned.
"""

import random
from random import randint
from breezypythongui import EasyFrame

class WordScrambleUI(EasyFrame):
    # initialize list and points
    wordList = []
    points = 0
    lives = 3

    # Open Text File
    readFile = open("words.txt", 'r')
    file = readFile.readlines()

    # Inputs file words into List
    for line in file:
        line = line.strip('\n')
        wordList.append(line)
        # randomly prints selects word
        word = wordList[randint(0, len(wordList) - 1)]
        word_list = list(word)
        random.shuffle(word_list)
        scrambled = ''.join(word_list)

    def __init__(self):
        EasyFrame.__init__(self,title="Word Scramble!")

        #UI Labels, Text Feilds, Buttons
        self.label1 = self.addLabel(text="Guess the Word!", row=0, column=0, sticky="NSEW")
        self.label2 = self.addLabel(text=self.scrambled,row=2, column=0,sticky="NSEW")
        self.scoreLabel = self.addLabel(text="Score: "+str(self.points), row=6, column=0,sticky="NSEW")
        self.lifeLabel = self.addLabel(text="Lives: "+str(self.lives),row=3,column=0,sticky="NSEW")
        self.inputFeild = self.addTextField(text="", row=4, column=0,sticky="NSEW")
        self.submitButton = self.addButton(text="Submit", row=5, column=0, command=self.guessAns)

    #Submit Button Method
    def guessAns(self):
        guess = self.inputFeild.getText()
        if (guess.lower() == self.word):
            self.messageBox(title="", message="Congratulations, you won!")
            self.points += len(self.word)*10
            self.wordList.remove(self.word)
            #check if there are any more words left in list
            if len(self.wordList) == 0:
                self.messageBox(title="",message="There are no more words left")
                self.endGame()
            else:
             self.contGame()

        else:
            self.lives -= 1
            #Check if lives are > 0
            if(self.lives>0):
                #update life label, give another attempt
                self.lifeLabel["text"] = "Lives: "+str(self.lives)
                self.messageBox(title="", message="Incorrect, guess again")
                self.inputFeild.setText("")
            else:
                #ends round if no lives left
                self.wordList.remove(self.word)
                self.messageBox(title="", message="Sorry, you didn’t win\nCorrect Word: "+self.word)
                self.contGame()

    #Starts next round
    def nextGuess(self):
        # randomly prints selects word

        self.word = self.wordList[randint(0, len(self.wordList) - 1)]
        word_list = list(self.word)
        random.shuffle(word_list)
        scrambled = ''.join(word_list)
        self.lives = 3
        self.inputFeild.setText("")
        self.lifeLabel["text"] = "Lives: " + str(self.lives)
        self.label2["text"] = scrambled
        self.scoreLabel["text"]= "Score: "+str(self.points)

    #Prompts user to continue
    def contGame(self):
        input = self.prompterBox(title="", promptString="Would you like to continue? y/n")
        contBool = True
        while contBool == True:
            if input.lower() == 'y':
                contBool = False
                self.nextGuess()
            elif input.lower() == 'n':
                contBool = False
                self.endGame()

            else:
                input = self.prompterBox(title="", promptString="Incorrect Input: Would you like to continue? y/n")

    #Displays end game screen
    def endGame(self):
        self.label1["text"] = "You finished the game with " + str(self.points) + " points!"
        self.label2["text"] = "Thank you for playing!"
        self.inputFeild.destroy()
        self.submitButton.destroy()
        self.lifeLabel.destroy()
        self.scoreLabel.destroy()


def main():
    WordScrambleUI().mainloop()

if __name__== "__main__":
    main()