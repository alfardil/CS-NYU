word1 = input("Word 1: ")
word2 = input("Word 2 :")
num = int(input("Number of times: "))

for i in range(num):
    print(word1)
    for j in range(num):
        print(" * " + word2)