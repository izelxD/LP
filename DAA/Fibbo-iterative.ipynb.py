
# Write a iterative program to calculate Fibonacci numbers and find its step count.
COUNT = 0
x=int(input("Enter Number of Terms :"))
first=0
sec=1
c=0
if(x<0):
    print("Enter valid input..")
elif(x==0):
    print(0)
elif(x==1):
    print("Fibbonacci series upto",x,"is",first)
else:
    while c<x:
        print(first) 
        COUNT = COUNT +1
        nth=first+sec 
        COUNT = COUNT +1
        first=sec 
        COUNT = COUNT +1
        sec=nth 
        COUNT = COUNT +1
        c+=1  
        COUNT = COUNT +1
        

print("Steps required using Counter ", COUNT)
#Time and Space Complexity of Space Optimized Method
#The time complexity of the Fibonacci series is T(N) i.e, linear. We have to find the sum of twoterms and it is repeated n times depending on the value of n.
#The space complexity of the Fibonacci series using dynamic programming is O(1).
     
