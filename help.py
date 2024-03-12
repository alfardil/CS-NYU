Num_Orders= int(input("How many orders do you want to submit? "))

while Num_Orders<1:
    print("Invalid, try again")
    Num_Orders= int(input("How many orders do you want to submit? "))

print()

OrderRange = 1
TotalCandy = 0
for order in range (Num_Orders):
      print("(Order ", OrderRange,")", sep="", end="")
      CandyQuantity= int(input(" How many candy bars in this order? "))
      TotalCandy+=CandyQuantity
      OrderRange+=1

print()

TotalCases= TotalCandy//144
TotalBoxes= (TotalCandy%144)//12
Single_Candy= (TotalCandy%144)%12


CostSingle=format(float(Single_Candy), '.2f')
CostBoxes=format(float(TotalBoxes*10), '.2f')
CostCases=format(float(TotalCases*100), '.2f')

WithoutDiscount=format(float(TotalCandy), '.2f')
GrandTotal=format(float(float(CostSingle)+float(CostBoxes)+float(CostCases)), '.2f')

print ("Total number of candy bars purchased:", format(TotalCandy,','))
print("Cost of order without any bulk discounts:", "$"+format(float(WithoutDiscount), ',.2f'))

if TotalCases ==0 and TotalBoxes ==0:
    print("Your order does not qualify for a bulk discount")

else:
    print("Your order qualifies for a bulk discount!")
    print("The most advantageous way to structure your order is:")
    print("*",Single_Candy, "single bars @ $1.00/bar =", "$"+format(float(CostSingle), ",.2f"))
    print("*",TotalBoxes, "boxes of bars @ $10.00/box =", "$"+format(float(CostBoxes), ",.2f"))
    print("*",TotalCases, "cases of bars @ $100.00/case =", "$"+format(float(CostCases), ",.2f"))
    print("Grand total:", "$"+format(float(GrandTotal), ",.2f"))



    