package seekerApp.Controller.seekerController;
import seekerApp.Exceptions.SeekerNotFoundException;
import seekerApp.models.Complexion;
import seekerApp.models.Gender;
import seekerApp.models.Seeker;

import seekerApp.repository.SeekerRepositoryImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeekerController  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String>  messages = new ArrayList<>();


        SeekerRepositoryImpl seeker1 = new SeekerRepositoryImpl();



        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        String BLUE = "\u001B[34m";
        String PURPLE = "\u001B[35m";
        String CYAN = "\u001B[36m";
        String WHITE = "\u001B[37m";
        String RESET = "\u001B[0m";


        while(true) {
            System.out.println("_________________________\uD83E\uDDD1\u200D\uD83E\uDD1D\u200D\uD83E\uDDD1\uFE0F");
            System.out.println(CYAN + "\n❤\uFE0F SEEKERS DATING APP ❤\uFE0F" + RESET);
            System.out.println("_________________________\uD83E\uDDD1\u200D\uD83E\uDD1D\u200D\uD83E\uDDD1\uFE0F");
            System.out.println(YELLOW + """
                        \n\t1. Register Seeker 👥️ ️
                        2. Login
                        3. Update Profile
                        4. Delete Account
                        5. View Matches 🤩️
                        6. Search Users 🔎️
                        7. Messages 💬️
                        8. Exit ⛔️
                    """+ RESET);

            System.out.println("Discover: ");
            int choice = input.nextInt();
            input.nextLine();


            switch (choice){

                case 1 -> {

                    System.out.println("Enter name: ");
                    String name = input.nextLine();

                    System.out.println("Enter DOB: ");
                    LocalDate dob = LocalDate.parse(input.nextLine());

                    System.out.println("Enter Gender: ");
                    Gender gender = Gender.valueOf(input.nextLine().toUpperCase());

                    System.out.println("Enter Current Location: ");
                    String location = input.nextLine();

                    System.out.println("Enter Height: ");
                    int height = input.nextInt();
                    input.nextLine();

                    System.out.println("Enter Complexion: ");
                    Complexion complexion = Complexion.valueOf(input.next().toUpperCase());

                    Seeker seeker = new Seeker(

                                name,
                                dob,
                                gender,
                                location,
                                height,
                                complexion
                    );

                    Seeker saved = seeker1.save(seeker);
                    System.out.println("Profile created Successfully");
                    System.out.println("Your ID is: " + saved.getId());
                }
                case 2 -> {
                    System.out.println("Login below");
                    System.out.println("Enter User ID: ");
                    int id = input.nextInt();

                    Seeker foundSeeker = seeker1.findById(id);

                    try{
                        System.out.println("You've Login Successfully");
                        System.out.println("""
                                ============================
                                WELCOME TO SEEKER DATING APP
                                =============================
                                """);

                        System.out.println("Name: " + foundSeeker.getName());
                        System.out.println("Location: " + foundSeeker.getCurrentLocation());

                    } catch (SeekerNotFoundException error){
                        System.out.println(error.getMessage());
                    }

                }
                case 3 -> {
                    System.out.println("Update profile below");

                    System.out.println("Enter User ID: ");
                    int id = input.nextInt();
                    input.nextLine();

                    Seeker seeker = seeker1.findById(id);

                    if(seeker != null) {
                        System.out.println("User Found: " + seeker.getName());

                        System.out.println("Enter new name (leave blank to skip): ");
                        String name = input.nextLine();

                        if (!name.isBlank()) {
                            seeker.setName(name);
                        }

                        System.out.println("Enter new location(leave blank to skip): ");
                        String location = input.nextLine();

                        if (!location.isBlank()) {
                        seeker.setCurrentLocation(location);
                    }
                        System.out.println("Profile updated successfully");
                    }else{
                        System.out.println("User not found");
                    }


                }
                case 4 -> {
                    System.out.println("Delete Account Below");

                    System.out.println("Enter User ID: ");
                    int id = input.nextInt();

                    boolean deleted = seeker1.deleteById(id);

                    if(deleted) {
                        System.out.println("Account Deleted Successfully");
                    }else{
                        System.out.println("Account not found");
                    }
                }
                case 5 -> {
                    System.out.println("View Matches Below");
                    List<Seeker> seekers = seeker1.findAll();

                    if(seekers.isEmpty()){
                        System.out.println("No seekers found");
                    }else{
                        for(Seeker seeker : seekers){
                            System.out.println("""
                                    ___________________________
                                    ID: %d
                                    Name : %s
                                    Gender : %s
                                    Location : %s
                                    ___________________________
                                    """.formatted(seeker.getId(), seeker.getName(), seeker.getGender(), seeker.getCurrentLocation()));
                        }
                    }
                }
                case 6 -> {

                    System.out.println("Search users below");

                    List<Seeker> seekers = seeker1.findAll();

                    for(int index = 0; index < seekers.size(); index ++){
                        Seeker seeker = seekers.get(index);

                        System.out.println("Name: " + seekers.get(index).getName() + " DOB: " + seekers.get(index).getDateOfBirth());
                    }
                }
                case 7 -> {
                    System.out.println("Send Message");

                    System.out.println("Enter your ID: ");
                    int id = input.nextInt();

                    System.out.println("Enter Receiver ID: ");
                    int receiverId = input.nextInt();
                    input.nextLine();

                    System.out.println("Enter message: ");
                    String content = input.nextLine();

                    String message = " From ID " + id + " To ID " + receiverId + ":" + content;

                    messages.add(message);

                    System.out.println("Message Sent Successfully");

                }
                case 8 -> {
                    System.out.println("Goodbye");
                    input.close();
                    return;
                }

            }

        }
        }
    }
