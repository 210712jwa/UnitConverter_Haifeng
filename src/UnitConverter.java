import java.util.*;

public class UnitConverter {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Functions uc = new Functions();
        double output;
        uc.printMenuOption();
        String menuOption = sc.nextLine();

        // create an infinite loop for user to continue until they exit.
        while (1 != 2) {

            // first layer option
            switch (menuOption) {

                case "a":
                    uc.printVolumeOption();
                    String userOption = sc.next();

                    // different selection option
                    switch (userOption) {

                        case "1":
                            System.out.println("You choose to convert Cups to Teaspoons");
                            System.out.print("Type in a number: ");
                            // check if user enter an number.
                            while (!sc.hasNextDouble()) {
                                System.out.println("Please enter a numerical value");
                                System.out.print("Type in a number: ");
                                sc.next();
                            }

                            double input = sc.nextDouble();
                            output = uc.convertCupsToTeaspoons(input);
                            System.out.println(input + " Cups is " + output + " Teaspoons.\n");
                            uc.printMenuOption();
                            menuOption = sc.next();
                            break;

                        case "2":
                            System.out.println("You choose to convert Teaspoons to Cups");
                            System.out.print("Type in a number: ");
                            // check if user enter an number.
                            while (!sc.hasNextDouble()) {
                                System.out.println("Please enter a numerical value");
                                System.out.print("Type in a number: ");
                                sc.next();
                            }

                            input = sc.nextDouble();
                            output = uc.convertTeaspoonsToCpus(input);
                            System.out.println(input + " Teaspoons is " + output + " Cups.\n");
                            uc.printMenuOption();
                            menuOption = sc.next();
                            break;

                        case "3":
                            System.out.println("You choose to convert US gallons to Imperia gallons.");
                            System.out.print("Type in a number: ");
                            // check if user enter an number
                            while (!sc.hasNextDouble()) {
                                System.out.println("Please enter a numerical value.");
                                System.out.print("Type in a number: ");
                                sc.next();
                            }

                            input = sc.nextDouble();
                            output = uc.convertUSGallonsToImperialGallons(input);
                            System.out.println(input + " US gallons is " + output + " Imperia gallons.\n");
                            uc.printMenuOption();
                            menuOption = sc.next();
                            break;
                        // exit program if 4 is enter for an option
                        case "4":
                            System.out.println("You choose to convert Ounces to Liters.");
                            System.out.print("Type in a number: ");
                            // check if user enter an number
                            while (!sc.hasNextDouble()) {
                                System.out.println("Please enter a numerical value.");
                                System.out.print("Type in a number: ");
                                sc.next();
                            }

                            input = sc.nextDouble();
                            output = uc.convertOuncesToLiters(input);
                            System.out.println(input + " Ounces is " + output + " Liters.\n");
                            uc.printMenuOption();
                            menuOption = sc.next();
                            break;

                        case "5":
                            System.out.println("You choose to convert Gallons to Liters.");
                            System.out.print("Type in a number: ");
                            // check if user enter an number
                            while (!sc.hasNextDouble()) {
                                System.out.println("Please enter a numerical value.");
                                System.out.print("Type in a number: ");
                                sc.next();
                            }

                            input = sc.nextDouble();
                            output = uc.convertGallonsToLiters(input);
                            System.out.println(input + " Gallons is " + output + " Liters.\n");
                            uc.printMenuOption();
                            menuOption = sc.next();
                            break;

                        case "6":
                            uc.printMenuOption();
                            menuOption = sc.next();
                            break;

                        case "7":
                            System.out.println("Quit successfully. Goodbye!\n");
                            sc.close();
                            System.exit(0);
                            break;

                        // if user input unrecognize selection prompt the user to re-enter.
                        default:
                            System.out.println("\nPlease enter a valid option.");
                            break;
                    }
                    break;

                case "b":
                    uc.printDistanceOption();
                    userOption = sc.next();

                    switch (userOption) {
                        case "1":
                            System.out.println("You choose to convert Feet to Meters");
                            System.out.print("Type in a number: ");
                            // check if user enter an number.
                            while (!sc.hasNextDouble()) {
                                System.out.println("Please enter a numerical value");
                                System.out.print("Type in a number: ");
                                sc.next();
                            }

                            double input = sc.nextDouble();
                            output = uc.convertFeettoMeters(input);
                            System.out.println(input + " Feet is " + output + " Meters.\n");
                            uc.printMenuOption();
                            menuOption = sc.next();
                            break;

                        case "2":
                            System.out.println("You choose to convert Miles to Kilometer");
                            System.out.print("Type in a number: ");
                            // check if user enter an number.
                            while (!sc.hasNextDouble()) {
                                System.out.println("Please enter a numerical value");
                                System.out.print("Type in a number: ");
                                sc.next();
                            }

                            input = sc.nextDouble();
                            output = uc.convertMilestoKilometers(input);
                            System.out.println(input + " miles is " + output + " kilometer.\n");
                            uc.printMenuOption();
                            menuOption = sc.next();
                            break;
                        // exit when 3 is enter as option
                        case "3":
                            System.out.println("You choose to convert Centimeters to Inches");
                            System.out.print("Type in a number: ");
                            // check if user enter an number.
                            while (!sc.hasNextDouble()) {
                                System.out.println("Please enter a numerical value");
                                System.out.print("Type in a number: ");
                                sc.next();
                            }

                            input = sc.nextDouble();
                            output = uc.convertCentimeterstoInches(input);
                            System.out.println(input + " Centimeters is " + output + " Inches.\n");
                            uc.printMenuOption();
                            menuOption = sc.next();
                            break;

                        case "4":
                            System.out.println("You choose to convert Inches to Centimeters");
                            System.out.print("Type in a number: ");
                            // check if user enter an number.
                            while (!sc.hasNextDouble()) {
                                System.out.println("Please enter a numerical value");
                                System.out.print("Type in a number: ");
                                sc.next();
                            }

                            input = sc.nextDouble();
                            output = uc.convertInchestoCentimeters(input);
                            System.out.println(input + " Inches is " + output + " Centimeters.\n");
                            uc.printMenuOption();
                            menuOption = sc.next();
                            break;

                        case "5":
                            System.out.println("You choose to convert Inches to Feet");
                            System.out.print("Type in a number: ");
                            // check if user enter an number.
                            while (!sc.hasNextDouble()) {
                                System.out.println("Please enter a numerical value");
                                System.out.print("Type in a number: ");
                                sc.next();
                            }

                            input = sc.nextDouble();
                            output = uc.convertInchesToFeet(input);
                            System.out.println(input + " Inches is " + output + " Feet.\n");
                            uc.printMenuOption();
                            menuOption = sc.next();
                            break;

                        case "6":
                            uc.printMenuOption();
                            menuOption = sc.next();
                            break;

                        case "7":
                            System.out.println("Quit successfully, Goodbye!\n");
                            sc.close();
                            System.exit(0);
                            break;

                        // if user input unrecognize selection for distance conversion prompt the user
                        // to re-enter.
                        default:
                            System.out.println("\nPlease enter a valid option.");
                            break;
                    }
                    break;

                // exit program when 3 is enter as option
                case "c":
                    System.out.println("Quit successfully, Goodbye!\n");
                    sc.close();
                    System.exit(0);
                    break;

                // if user input unrecognize selection prompt the user to re-enter.
                default:
                    System.out.println("\nPlease enter a valid option.");
                    uc.printMenuOption();
                    menuOption = sc.next();
                    break;
            }
        }

    }
}
