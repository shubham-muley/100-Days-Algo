#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the jumpingOnClouds function below.
def jumpingOnClouds(c):
    jump=0
    a=0
    for i in range(1,len(c)):
        
        if a==1:
            a=0
            continue
        
        if(c[i]==0):
            jump+=1
        else:
            a=0
            continue
            
        if(c[i-1]==0 and c[i]==0):
            if(i+1!=len(c)):
                if(c[i+1]==0):
                    a=1
                    
    return jump    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    c = list(map(int, input().rstrip().split()))

    result = jumpingOnClouds(c)

    fptr.write(str(result) + '\n')

    fptr.close()
[]
