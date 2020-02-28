"""
3) Use reduce and lambda functions only to calculate the factorial of 30.
"""
from functools import reduce

print("30! =",(reduce(lambda x,y: x*y, [i for i in range(1,31)])))
