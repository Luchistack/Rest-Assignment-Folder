let basesalary = 30_000;
let overtime = 10;
let rate = 20;

function getWage(basesalary,overtime, rate){
    return basepay + (overtime * rate);

}

let employee = {
    basepay : 30_000,
    overtime : 10,
    rate :20    
        
    getWage : function()   {
        return this.basesalary + (this.overtime * this.rate)
    }
    
};

employee.getWage()




for num in range(1, 101):
    print(f"Factors of {num}: ", end="")
    
    for i in range(1, num + 1):
        if num % i == 0:
            print(i, end=" ")
    
    print()




for num in range(1, 101):
    print(f"Multiples of {num}: ", end="")
    
    for multiple in range(num, 101, num):
        print(multiple, end=" ")
    
    print()







num = int(input("Enter a number: "))

factorial = 1

for i in range(1, num + 1):
    factorial *= i

print(f"Factorial of {num} is {factorial}")
