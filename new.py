orders = int(input("How many orders? "))
sum = 0

for i in range(orders):
    sum += int(input("(Order " + str(i+1) + ") How many candy bars in this order? "))

print(sum)