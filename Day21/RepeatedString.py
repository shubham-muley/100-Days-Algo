#!/bin/python3

import math
import os
import random
import re
import sys
from collections import Counter

# Complete the repeatedString function below.
def repeatedString(s, n):
    c= Counter(s)
    
    count = (n//len(s))*c['a']
    
    for i in range(0,n-(n//len(s))*len(s)):
        if s[i]=='a':
            count+=1

    return count
            

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    n = int(input())

    result = repeatedString(s, n)

    fptr.write(str(result) + '\n')

    fptr.close()
