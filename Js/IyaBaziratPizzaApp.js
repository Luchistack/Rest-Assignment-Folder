const input = require("prompt-sync")();



function sapaSizeDetails(numberOfPeople, numberOfSlice, sufficientQuantity, totalSlice, leftOver, price){

 return `\nSapa Box contains ${numberOfSlice}🍕️ slices per box, ${sufficientQuantity}🥰️ boxes should be sufficient for ${numberOfPeople}🧑‍🤝‍🧑️ people as it would contain total of ${totalSlice}🍕️ in all\n\nAfter serving ${numberOfPeople}🧑‍🤝‍🧑️ people, you should have ${leftOver}🍕️ slices left\n\nPer Sapa Size Box Price is ₦2,000 and Your total cost is ₦${price}💰️ `;

}



function smallMoneyDetails(numberOfPeople, numberOfSlice, sufficientQuantity, totalSlice, leftOver, price){

 return `\nSmall Money box contains ${numberOfSlice}🍕️ slices per box, ${sufficientQuantity}🥰️ boxes should be sufficient for ${numberOfPeople}🧑‍🤝‍🧑️ people as it would contain total of ${totalSlice}🍕️ in all\n\nAfter serving ${numberOfPeople}🧑‍🤝‍🧑️ people, you should have ${leftOver}🍕️ slices left\n\nPer Sapa Size Box Price is ₦2,000 and Your total cost is ₦${price}💰️ `;

}


function bigBoysDetails(numberOfPeople, numberOfSlice, sufficientQuantity, totalSlice, leftOver, price){

 return `\nBig Boy box contains ${numberOfSlice}🍕️ slices per box, ${sufficientQuantity}🥰️ boxes should be sufficient for ${numberOfPeople}🧑‍🤝‍🧑️ people as it would contain total of ${totalSlice}🍕️ in all\n\nAfter serving ${numberOfPeople}🧑‍🤝‍🧑️ people, you should have ${leftOver}🍕️ slices left\n\nPer Sapa Size Box Price is ₦2,000 and Your total cost is ₦${price}💰️ `;

}


function odogwuDetails(numberOfPeople, numberOfSlice, sufficientQuantity, totalSlice, leftOver, price){

 return `\nOdogwu box contains ${numberOfSlice}🍕️ slices per box, ${sufficientQuantity}🥰️ boxes should be sufficient for ${numberOfPeople}🧑‍🤝‍🧑️ people as it would contain total of ${totalSlice}🍕️ in all\n\nAfter serving ${numberOfPeople}🧑‍🤝‍🧑️ people, you should have ${leftOver}🍕️ slices left\n\nPer Sapa Size Box Price is ₦2,000 and Your total cost is ₦${price}💰️ `;

}

function calculatePrice(numberOfPeople, numberOfSlice, priceperBox){

    let sufficientQuantity = Math.ceil(numberOfPeople / numberOfSlice);

    let totalSlice = sufficientQuantity * numberOfSlice;

    let leftOver = totalSlice - numberOfPeople;

    let price = priceperBox * sufficientQuantity;

    return {sufficientQuantity, totalSlice, leftOver, price};
}

function menu(){
console.log(`\nWELCOME TO IYA BAZIRAT PIZZA JOINT APP!\n`);

console.log(`\t\t\t\t\t\t\t     MENU\n

            ___________________________________________________________

            | Pizza Type         |  Number Of Slices   | Price Per Box |
            ___________________________________________________________

            | 1. Sapa Size 🍕️    |        4 😋️         | ₦2,000  💵️    |
            ___________________________________________________________

            | 2. Small Money 🍕️  |        6 😋️         | ₦2,400 💵️     |
            ___________________________________________________________
    
            | 3. Big Boys 🍕️     |        8 😋️         | ₦3,000 💵️     |
            ___________________________________________________________
    
            | 4. Odogwu 🍕️       |       12 😋️         | ₦4,200  💵️    |
            ___________________________________________________________
            
            `)


let choice = Number(input("Enter Choice Of Pizza: "));

let numberOfPeople = Number(input("Number of Persons: "));

let result;

if(choice == 1){

    result = calculatePrice(numberOfPeople, 4, 2000);

    console.log(sapaSizeDetails(numberOfPeople, 4, result.sufficientQuantity, result.totalSlice, result.leftOver, result.price));


    }else if(choice == 2){

     result = calculatePrice(numberOfPeople, 6, 2400);

    console.log(smallMoneyDetails(numberOfPeople, 6, result.sufficientQuantity, result.totalSlice, result.leftOver, result.price));


     }else if(choice == 3){

       result = calculatePrice(numberOfPeople, 8, 3000);

    console.log(bigBoysDetails(numberOfPeople, 8, result.sufficientQuantity, result.totalSlice, result.leftOver, result.price));


    }else if(choice == 4){

    result = calculatePrice(numberOfPeople, 12, 4200);

    console.log(odogwuDetails(numberOfPeople, 12, result.sufficientQuantity, result.totalSlice, result.leftOver, result.price));


    }else{
        console.log("Invalid Input")
}
      
}
menu();


























//
//if(choice == 1){
//
//
//    let numberOfSlice = 4;
//
//    let pricePerBox = 2000;
//
//    let sufficientQuantity = Math.ceil(numberOfPeople / numberOfSlice);
//
//    let totalSlice = sufficientQuantity * numberOfSlice;
//
//    let leftOver = totalSlice - numberOfPeople;
//
//    let price = pricePerBox * sufficientQuantity;

//    console.log(sapaSizeDetails(choice, numberOfPeople, numberOfSlice, sufficientQuantity, totalSlice, leftOver, price));
//
//    }else if(choice == 2){
//
//     let numberOfSlice = 6;
//
//    let pricePerBox = 2400;
//
//    let sufficientQuantity = Math.ceil(numberOfPeople / numberOfSlice);
//
//    let totalSlice = sufficientQuantity * numberOfSlice;
//
//    let leftOver = totalSlice - numberOfPeople;
//
//    let price = pricePerBox * sufficientQuantity;
//
//    console.log(smallMoneyDetails(choice, numberOfPeople, numberOfSlice, sufficientQuantity, totalSlice, leftOver, price));
//
//     }else if(choice == 3){
//
//     let numberOfSlice = 8;
//
//    let pricePerBox = 3000;
//
//    let sufficientQuantity = Math.ceil(numberOfPeople / numberOfSlice);
//
//    let totalSlice = sufficientQuantity * numberOfSlice;
//
//    let leftOver = totalSlice - numberOfPeople;
//
//    let price = pricePerBox * sufficientQuantity;
//
//    console.log(bigBoysDetails(choice, numberOfPeople, numberOfSlice, sufficientQuantity, totalSlice, leftOver, price));
//
//    }else if(choice == 4){
//
//     let numberOfSlice = 12;
//
//    let pricePerBox = 4200;
//
//    let sufficientQuantity = Math.ceil(numberOfPeople / numberOfSlice);
//
//    let totalSlice = sufficientQuantity * numberOfSlice;
//
//    let leftOver = totalSlice - numberOfPeople;
//
//    let price = pricePerBox * sufficientQuantity;
//    console.log(OdogwuDetails(choice, numberOfPeople, numberOfSlice, sufficientQuantity, totalSlice, leftOver, price));
//
//    }else{
//        console.log("Invalid Input")
//}
//      
//}

