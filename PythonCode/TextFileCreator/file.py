from datetime import date
import os
from os import path

#Python class named “File”, that allows the user to create a new text file, with or without any content

class File():

    fileNumber = 0

    def __init__(self, fileName, fileContent = ""):
        self.fileContent = []
        self.fileContent.append(fileContent)
        self.fileOwner = ""
        self.dateModified = date.today()
        self.__class__.fileNumber += 1
        self.fileName = fileName
        if os.path.exists(self.fileName + ".txt"):
            self.fileName = str(self.fileName + str(self.fileNumber))
        self.updateFile()


    #methods
    def getName(self):
        #returns the file name.
        return self.fileName

    def setOwner(self, ownerName):
        #adds the name of the fileowner.
        self.setDate()
        self.fileOwner = ownerName

    def getOwner(self):
        #returns the name of the file owner.
        return self.fileOwner

    def setDate(self):
        #adds the last time date file was modified.
        self.dateModified = date.today()

    def getDate(self):
        #returns the last time date file was modified.
        return self.dateModified

    def addLine(self,aString):
        #adds a new line to the end of file.
        self.fileContent.append(aString)
        self.updateFile()

    def deleteLine(self, aLineNumber):
        #deletes a specific line from file.
        temp = self.getContent().pop(aLineNumber)
        self.updateFile()


    def getContent(self):
        #fetches the entire content of the file and returns it.
        return self.fileContent

    def setContent(self,aString):
        #changes the content of the text file, overwriting any existing text.
        self.fileContent = aString
        self.updateFile()

    def hasWord(self, aString):
        #checks if the file has a specific word in it. Returns true if the word is found, otherwise returns false.
        temp = self.getContent()
        for item in temp:
            temp2 = item.split(" ")
            for word in temp2:
                if aString.lower() == word.lower():
                    return True
        return False

    def addFrom(self, other):
        #adds the content of the other file to the end of the current file.
        self.fileContent.extend(other.getContent())

    def countWords(self):
        #counts the number of words in a file and returns it.
        count = 0
        temp = self.getContent()
        for item in temp:
            temp2 = item.split(" ")
            for word in temp2:
                count += 1
        return count

    def replace(self,sting1, string2):
    #replaces string 1 with string 2 everywhere in the file.
        temp1 = self.getContent()
        tempList = []
        for i, item in enumerate(temp1):
            temp2 = list(item.split(" "))

            for n, word in enumerate(temp2):
                if word == sting1:
                    temp2[n] = string2
            fullStr = ' '.join(temp2)
            temp1[i] = fullStr
        self.setContent(temp1)
        self.updateFile()

    def updateFile(self):
        #Writes updated file content to .txt file, also updates date
        self.setDate()
        writeFile = open(self.fileName+".txt", 'w')
        for i in self.fileContent:
            writeFile.write(i+"\n")
        writeFile.close()

    def __str__(self):
        #Prints file name, file owner, the time date file modified, and the number words in the file.
        return ("\nFile Name: "+ self.getName() +
                "\nAuthor: "+self.getOwner()+
                "\nDate Modified: "+ str(self.getDate())+
                "\nNumber of Words: "+ str(self.countWords()))
    def __gt__(self, other):
        if self.countWords() > other.countWords():
            return True
        else:
            return False
    def __add__(self, other):
        temp = list(self.getContent())
        temp.extend(list(other.getContent()))
        tempFile = File("")
        tempFile.setContent(temp)
        return tempFile

#test constructor
A = File("myFile", "This is a file with some text")
B = File("anotherFile")
C = File("myFile", "This is another file with some text")
D = File("anotherFile")
C.addFrom(A)
print(C.hasWord("bob"))
print(C.getContent())
print(C.countWords())

#test get and set owner methods
C.setOwner("John Smith")
D.setOwner("Hassan")
print(A.getOwner())
print(D.getOwner())

D.setContent("This is a new content")

print(A.getDate())

A.addLine("Hello World!")
A.addLine("This is a new line!")
A.deleteLine(1)
print(B.hasWord("this"))

C.replace("This","That")
print(C.getContent())
print(C.getName())
print(C)
print(A<C)
E = A+C
print(E)
