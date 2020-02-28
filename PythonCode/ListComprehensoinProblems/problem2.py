"""
2) Use map and lambda functions only to convert the following list of temperatures
from Celsius to Fahrenheit: [39.2, 36.5, 37.3, 37.8]
"""
#list with initial celsius values
celsius = [39.2, 36.5, 37.3, 37.8]

#create new list for fahrenheit values using map and lambda
fahrenheit = list(map(lambda x: float(9/5)*x+32, celsius))

#output
print("Celsius Values:",celsius)
print("Fahrenheit Values:",fahrenheit)


