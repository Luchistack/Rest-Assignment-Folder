const collector = require("prompt-sync")();

console.log(`\nCOMMISSION TABLE`);

console.log(`____________________________________________________________________
            |                                                       |
            |  COLLECTION RATE  |  AMOUNT PER PARCEL  |  BASE PAY   |
            |_______________________________________________________|
            |  Less than 50%    |        ₦160         |   ₦5,000    |
            |___________________|_____________________|_____________|
            |  50 - 59%         |        ₦200         |   ₦5,000    |
            |___________________|_____________________|_____________|
            |  60 - 69%         |        ₦250         |   ₦5,000    |
            |___________________|_____________________|_____________|
            |   >=70%           |        ₦500         |   ₦5,000    |
            |___________________|_____________________|_____________|`)



let choice = parseInt(collector("\nEnter Number Of Delivery Done Today🚴️: "))

let BasePay = 5000;

if(choice < 50){
    console.log(one(choice));
}
if(choice > 50 && choice <= 59){
    console.log(two(choice));
}
if(choice > 60 && choice <= 69){
    console.log(three(choice));
}
else if(choice >= 70){
    console.log(four(choice));
}


function one(choice){
    amountPerParcel = 160;
    total = choice * amountPerParcel + BasePay;
    console.log(`Your total profit today is ${total}`);
}

function two(choice){
    amountPerParcel = 200;
    total = choice * amountPerParcel + BasePay;
    console.log(`Your total profit today is ${total}`);
}


function three(choice){
    amountPerParcel = 250;
    total = choice * amountPerParcel + BasePay;
    console.log(`Your total profit today is ${total}`);
}


function four(choice){
    amountPerParcel = 500;
    total = choice * amountPerParcel + BasePay;
    console.log(`Your total profit today is ${total}`);

}



