import java.util.Scanner;

public class FullNameParser {

 /*   1. Create a Java application called FullNameParser that prompts the user to enter a
    name in one of the following two formats:

    first last or first middle last

    2. Make sure to trim the name before proceeding in case the user entered leading or
    trailing spaces. //We can use Trim Method

   3. Parse the name and process it so that you can display the individual pieces of the name.

    4. A sample trace of your program output is shown below. Bolded code is what the
    user entered.

Please enter your name: Dana L. Wyatt ↵
First name: Dana
Middle name: L.
Last name: Wyatt


    */



   import java.util.Scanner;

    public class FullNameParser {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Step 1: Prompt user
            System.out.print("Enter your full name: ");
            String fullName = scanner.nextLine().trim(); // Trim leading/trailing spaces

            // Step 2: Split name into parts
            String[] nameParts = fullName.split(" ");

            // Step 3: Display based on how many parts
            if (nameParts.length == 2) {
                System.out.println("First name: " + nameParts[0]);
                System.out.println("Last name: " + nameParts[1]);
            } else if (nameParts.length == 3) {
                System.out.println("First name: " + nameParts[0]);
                System.out.println("Middle name: " + nameParts[1]);
                System.out.println("Last name: " + nameParts[2]);
            } else {
                System.out.println("Invalid name format. Please enter first and last name, or first, middle, and last name.");
            }

        }
    }

