"""
1) Write the corresponding Python codes for the following sets using List Comprehension:
"""
from math import sqrt

#1.{ x: x is a vowel in the string 'WAYNE STATE UNIVERSITY' }
print("Vowels in WAYNE STATE UNIVERSITY:")
list1 = [x for x in 'WAYNE STATE UNIVERSITY' if x in ['A','E','I','O','U']]
print(list1)

#2.{ x: x is a natural number less than or equal to 50, x is a perfect square }
print("\nNatural numbers less than or equal to 50 where x is a perfect square:")
list2 = [x for x in range(0,51) if sqrt(x)%1 == 0]
print(list2)

#3.{ x: x is a word in in the list ['pen', 'staple', 'ruler', 'pencil',  'eraser'] and x ends with 'er'}
print("\nWords that end with 'er' from the list ['pen', 'staple', 'ruler', 'pencil',  'eraser']:")
list3 = [x for x in ['pen', 'staple', 'ruler', 'pencil',  'eraser'] if x.endswith('er',len(x)-2)]
print(list3)

#4.{ x: x is a Fahrenheit value converted from Celsius list [39.2, 36.5, 37.3, 37.8]}
print("\nFahrenheit value converted from Celsius list [39.2, 36.5, 37.3, 37.8]:")
list4 = [(x*(9/5)+32) for x in [39.2, 36.5, 37.3, 37.8]]
print(list4)

#5.{ (x, y): x and y are natural numbers less than or equal to 100, x+y is an even number}
print("\nx and y are natural numbers less than or equal to 100 where x+y is an even number:")
list5 = [(x,y) for x in range(101) for y in range(101) if (x+y)%2==0]
print(list5)

#6.{ x: x is a natural number less than or equal to 100, x  is divisible by 7}
print("\nNatural numbers less than or equal to 100, that are divisible by 7:")
list6 = [x for x in range(101) if (x/7)%1==0]
print(list6)

#7.{ x: x is a natural number less than or equal to 100, x has digit 3 in it}
print("\nNatural numbers less than or equal to 100, that contain digit '3':")
list7 = [x for x in range(101) if x%10==3]
print(list7)

#8.{ x: is a word in the string "This is a list comprehension example", x is less than 5 letters}
print("\nWords that contain less than 5 letters in the string, \"This is a list comprehension example\":")
list8 = [x for x in "This is a list comprehension example".split(' ') if len(x)<5]
print(list8)