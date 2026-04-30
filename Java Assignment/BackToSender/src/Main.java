import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BackToSender collection = new BackToSender();


//        System.out.println("\nCOMMISSION TABLE");

//        System.out.println("""____________________________________________________________________
//                |                                                       |
//                |  COLLECTION RATE  |  AMOUNT PER PARCEL  |  BASE PAY   |
//                |_______________________________________________________|
//                |  Less than 50%    |        ₦160         |   ₦5,000    |
//                |___________________|_____________________|_____________|
//                |  50 - 59%         |        ₦200         |   ₦5,000    |
//                |___________________|_____________________|_____________|
//                |  60 - 69%         |        ₦250         |   ₦5,000    |
//                |___________________|_____________________|_____________|
//                |   >=70%           |        ₦500         |   ₦5,000    |
//                |___________________|_____________________|_____________|""");



        System.out.println("\nEnter Number Of Delivery Done Today🚴️: ");
        int collectionRate = input.nextInt();

        if(collectionRate < 50){
            System.out.println(collection.functionOne(collectionRate));
        }
        else if(collectionRate >= 50 && collectionRate <= 59){
            System.out.println(collection.functionTwo(collectionRate));
        }
        else if(collectionRate >= 60 && collectionRate <= 69){
            System.out.println(collection.functionThree(collectionRate));
        }
        else{
            System.out.println(collection.functionFour(collectionRate));
        }


    }

}