import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your state to get your Geo-Political Area: ");
        String stuserState = input.nextLine();


        for (States region : States.values()) {
            for (String state : region.getState()) {
                if (state.equalsIgnoreCase(stuserState)) {
                    System.out.println("Your Geo Political Zone is: " + region);
                    return;
                }
            }
        }
        System.out.println("State not found check spelling");

    }
}