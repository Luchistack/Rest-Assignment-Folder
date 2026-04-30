
public class BackToSender{

    int total = 0;
    int BasePay = 5000;

    public int functionOne(int collectionRate) {

        if(collectionRate < 50){
            int amountPerParcel = 160;
            total = collectionRate * amountPerParcel + BasePay;
        }

        return total;
    }

    public int functionTwo(int collectionRate) {

        if(collectionRate > 50 && collectionRate <=59 ){
            int amountPerParcel = 200;
            total = collectionRate * amountPerParcel + BasePay;
        }

        return total;
    }

    public int functionThree(int collectionRate) {

        if(collectionRate > 60 && collectionRate <=69 ){
            int amountPerParcel = 250;
            total = collectionRate * amountPerParcel + BasePay;
        }

        return total;
    }
    public int functionFour(int collectionRate) {

        if(collectionRate >= 70){
            int amountPerParcel = 500;
            total = collectionRate * amountPerParcel + BasePay;
        }

        return total;
    }
}
