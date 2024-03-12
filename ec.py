colum = 9

for i in range(colum):


    for j in range(colum):
        # checking if first character is 
        if (i + j) % 2 == 0:
            print("@", end=" ")  
        else:
            print("#", end=" ")  


    # print new line after inside for loop iterates 10 times    
    print()