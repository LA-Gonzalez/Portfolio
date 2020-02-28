"""

Calculates the average score and the letter grade for each student in the course.
You will also determine some class statistics and output the results. You may assume
that all the required information is provided to you as a text file.

"""
import math
from math import sqrt

#emply lists and dictionaries
grades = []

students = {}

avg = []

#getAverage Function:: Returns Average of list values
def getAvg(list):
    return sum(list)/len(list)

#getStDev Function:: Returns Standard Deviation of list values
def getStDev(list):
    temp = 0
    for item in list:
        temp += (item-getAvg(list))**2
    return sqrt(temp/(len(list)-1))

#Open Text File
readFile = open("input.txt", 'r')

#Read Values in Text File
file = readFile.readlines()

#Split Student names from Scores
for line in file:
    grades.append(line.split(":"))

#convert scores into lists, place keys and scores into student dictionary
for i in grades:
    i[1] = i[1].replace(' ', '')
    i[1] = i[1].rstrip()
    name = (i[0])
    points = (i[1].split(','))
    points = list(map(int, points))
    students[name] = points

readFile.close()

#open write file
writeFile = open("output.txt", 'w')

#Output Average for each Student in "output.txt"
writeFile.write("******************\n")
writeFile.write("Student Records\n")
writeFile.write("******************\n\n")

#returns average and final letter grade
for (key, value) in students.items():
    writeFile.write(key + "\n")
    writeFile.write("Average Score: "+str(getAvg(value))+"\n")
    avg.append(getAvg(value))
    if getAvg(value) >= 90:
        writeFile.write("Letter Grade: A\n\n")
    elif getAvg(value) >= 80:
        writeFile.write("Letter Grade: B\n\n")
    elif getAvg(value) >= 70:
        writeFile.write("Letter Grade: C\n\n")
    elif getAvg(value) >= 60:
        writeFile.write("Letter Grade: D\n\n")
    else:
        writeFile.write("Letter Grade: F\n\n")

writeFile.write("******************\n")
writeFile.write("Class Statistics\n")
writeFile.write("******************\n\n")

#Output Number of Students
writeFile.write("Number of Students: " + str(len(avg)))
#Output class average
writeFile.write("\n\nClass Average: " + str(round(getAvg(avg), 2)))
#Output Maximum Student Average
writeFile.write("\n\nMaximum Student Average: " + str(max(avg)))
#Output Minimum Student Average
writeFile.write("\n\nMinimum Student Average: " + str(min(avg)))
#Output Standard Deviation
writeFile.write("\n\nStandard Deviation: " + str(round(getStDev(avg), 2)))

writeFile.close()