import java.util.Scanner;

public class fortuneTeller {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    // Characteristics
    
        // User's First Name
            System.out.println("What is your first name?");
            String firstName = input.nextLine();
            // Make sure first name is not empty or over 50 characters
            if (firstName == null || firstName.isEmpty()) {
                System.out.println("First name can not be null or empty.");
                return;
            } else if (firstName.length () > 50) {
                System.out.println("First Name can not be greater than 50 characters.");
                return;
            } else if (firstName.equalsIgnoreCase("Quit")) {
                System.out.println("Nobody likes a quitter...");
                return;
            }


        // User's Last Name
            System.out.println("What is your last name?");
            String lastName = input.nextLine();
            // Make sure last name is not empty or over 50 characters
            if (lastName == null || firstName.isEmpty()) {
                System.out.println("Last name can not be null or empty");
                return;
            } else if (lastName.length() > 50) {
                System.out.println("Last name can not be greater than 50 characters.");
            }
        // User's Age
            System.out.println("What is your age?");
            int age = input.nextInt();
            // Make sure is not less than 0 or greater than 130
            if (age > 0 || age < 130) {
            return;   
            } 

        // User's Birth Month
            System.out.println("What is your birth month, enter number from 1 - 12.");
            int birthMonth = input.nextInt();
            // Birth month must be 1 - 12
            if (birthMonth > 1 || birthMonth < 12) {
            return;
            }

        // User's Number of siblings
            System.out.println("How many siblings do you have?");
            int siblings = input.nextInt();
            // Number of siblings can not be greater than 13
            if (siblings < 13) {
                return;
            }

        // User's favorite ROYGBIV color
            System.out.println("what is your favorite ROYGBIV color? Type 'Help' for a list.");
            String favoriteColor = input.nextLine();
            if (favoriteColor.equalsIgnoreCase("Help")) {
                System.out.println("Red, Orange, Yellow, Green, Blue, Indigo, Violet");
                System.out.println("");
                System.out.println("What is your favorite ROYGBIV color?");

            }
    
// Fortunes

    // Years until retirement 
        int retire;
        if (age % 2 == 0){
            retire = 12;
        } else {
            retire =14;
        }
    
    // Vacation Home Location
        String vacationHome;
        if (siblings == 0) {
            vacationHome = "Boca Raton, FL";
        } else if (siblings == 1) {
            vacationHome = "Nassau, Bahamas";
        } else if (siblings == 2) {
            vacationHome = "Ponta Negra, Brazil";
        } else if (siblings == 3) {
            vacationHome = "Portland, Oregon";
        } else if (siblings > 3) {
            vacationHome = "Baton Rouge, Louisiana";
        } else {
            vacationHome = "Chernobyl, Ukraine";
        }

    // Mode of Transportation
        String transportationType;
       if (favoriteColor.contains("Red")) {
        transportationType = "Maserati";
       } else if (favoriteColor.contains("Orange")) {
        transportationType = "Stallion";
       } else if (favoriteColor.contains("Yellow")) {
        transportationType = "Chariot";
       } else if (favoriteColor.contains("Green")) {
        transportationType = "taxi";
       } else if (favoriteColor.contains("Blue")) {
        transportationType = "Rickshaw";
       } else if (favoriteColor.contains("Indigo")) {
        transportationType = "Motor Scooter";
       } else if (favoriteColor.contains("Violet")) {
        transportationType = "Flying Saucer";
       }

    // Bank Balance
       double bankBalance;
       if (birthMonth >= 1 && birthMonth <= 4) {
        bankBalance = 256000.76;
       } else if (birthMonth >= 5 && birthMonth <= 8) {
        bankBalance = 3687105.42;
       } else if  (birthMonth >= 9 && birthMonth <= 12) {
        bankBalance = 86.23;
       } else {
        bankBalance = 0.00;
       }

    // User's Fortune
    System.out.println(firstName + lastName + " will retire in" + retire);
    System.out.println( " years, with $ " + bankBalance + " in the bank, a vacation home in");
    System.out.println(vacationHome + ", and travel by" + transportationType + ".");

     }
    }
