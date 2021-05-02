#Decrement OR Increment Problem Code: DECINC
#Add problem to Todo list
#Submit 
#Write a program to obtain a number N and increment its value by 1 if the number is divisible by 4 otherwise decrement its value by 1.
#Input:
#First line will contain a number N.
#Output:
#Output a single line, the new value of the number.

# cook your dish here
n=int(input())
if n%4==0:
    print(n+1)
else:
    print(n-1)