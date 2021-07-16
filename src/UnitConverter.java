import java.util.*;


/**
This an unitconverter to convert Cups to Teaspoon, Teaspoons to Cups, 
US gallons to Imeria gallons, Mile to Kilometer, and Feet to Meters.
*/

public class UnitConverter {

    
   //convert cups to teaspoons
    public double convertCupsToTeaspoons(double num){ 
        num = num * 48;
        return num;
    }
    
    //convert Teaspoons to Cups
    public double convertTeaspoonsToCpus(double num){
        num = num / 48;
        return num;
    }

     //convert US gallons to Imerial gallons
     public double convertUSGallonsToImperialGallons(double num){
        num = num * 0.832674;
        return num;
    }

    //convert Miles to killometers
    public double convertMilestoKilometers(double num){
        num = num * 1.609344;
        return num;
    }

    //convert Feet to Meters
    public double convertFeettoMeters(double num){
        num = num / 3.28084;
        return num;
    }

    //first layer selction prompt
    public void printMenuOption(){
        System.out.println("\n1.Volume conversions");
        System.out.println("2.Distance conversions");
        System.out.println("3.Quit");
        System.out.print("Please type in the number in front of the option to select: ");

    }

    //printout Volume conversion option prompt
    public void printVolumeOption(){
        System.out.println("\n1. Cups to Teaspoons");
        System.out.println("2. Teaspoons to Cups");
        System.out.println("3. US Gallons to Imperial Gallons");
        System.out.println("4. US Gallons to Imperial Gallons");
        System.out.println("5. US Gallons to Imperial Gallons");
        System.out.println("6. Quit");
        System.out.print("Please type in the number in front of the option to select: ");
    }

    //printout Distance conversion option prompt
    public void printDistanceOption(){
        System.out.println("\n1. Feet to Meters");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Centimeters to Inches");
        System.out.println("4. US Gallons to Imperial Gallons");
        System.out.println("5. US Gallons to Imperial Gallons");
        System.out.println("6. Quit");
        System.out.print("Please type in the number in front of the option to select: ");
    }


    public static void main(String[] args) {

        Functions uc = new Functions();
        double output = 0;
        Scanner sc = new Scanner(System.in);
        uc.printMenuOption();        
        String menuOption = sc.nextLine();
       
        //create an infinite loop for user to continue until they exit.
        while(1 != 2) {

            //first layer option
            switch(menuOption){
                
                case "1":
                    uc.printVolumeOption();
                    String userOption = sc.next();

                    //different selection option
                    switch(userOption) {

                        case "1": 
                            System.out.println("You choose to convert Cups to Teaspoons");
                            System.out.print("Type in a number: ");
                            //check if user enter an number.
                            while(!sc.hasNextDouble()){
                                System.out.println("Please enter a numerica value");
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
                            //check if user enter an number.
                            while(!sc.hasNextDouble()){
                                System.out.println("Please enter a numerica value");
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
                            //check if user enter an number
                            while(!sc.hasNextDouble()){
                                System.out.println("Please enter a numerica value.");
                                System.out.print("Type in a number: ");
                                sc.next();
                            }

                            input = sc.nextDouble();
                            output = uc.convertUSGallonsToImperialGallons(input);
                            System.out.println(input + " US gallons is " + output + " Imperia gallons.\n");
                            uc.printMenuOption();
                            menuOption = sc.next();
                            break;
                        //exit program if 4 is enter for an option
                        case "4":
                            System.out.println("You choose to convert Ounces to Liters.");
                            System.out.print("Type in a number: ");
                            //check if user enter an number
                            while(!sc.hasNextDouble()){
                                System.out.println("Please enter a numerica value.");
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
                            //check if user enter an number
                            while(!sc.hasNextDouble()){
                                System.out.println("Please enter a numerica value.");
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
                            System.out.println("Quit successfully. Goodbye!\n");
                            sc.close();
                            System.exit(0);
                            break;
                        
                        //if user input unrecognize selection prompt the user to re-enter.
                        default:
                            System.out.println("\nPlease enter a valid option.");
                            uc.printVolumeOption();
                            userOption = sc.next();
                            break;
                    }
                    break;

                case "2":
                    uc.printDistanceOption();
                    userOption = sc.next();

                    switch(userOption) {
                        case "1":
                            System.out.println("You choose to convert Feet to Meters");
                            System.out.print("Type in a number: ");
                            //check if user enter an number.
                            while(!sc.hasNextDouble()){
                                System.out.println("Please enter a numerica value");
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
                            //check if user enter an number.
                            while(!sc.hasNextDouble()){
                                System.out.println("Please enter a numerica value");
                                System.out.print("Type in a number: ");
                                sc.next();
                            }
            
                            input = sc.nextDouble();
                            output = uc.convertMilestoKilometers(input);
                            System.out.println(input + " miles is " + output + " kilometer.\n");
                            uc.printMenuOption();
                            menuOption = sc.next();
                            break;
                            //exit when 3 is enter as option
                        case "3":
                            System.out.println("You choose to convert Centimeters to Inches");
                            System.out.print("Type in a number: ");
                            //check if user enter an number.
                            while(!sc.hasNextDouble()){
                                System.out.println("Please enter a numerica value");
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
                            //check if user enter an number.
                            while(!sc.hasNextDouble()){
                                System.out.println("Please enter a numerica value");
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
                            //check if user enter an number.
                            while(!sc.hasNextDouble()){
                                System.out.println("Please enter a numerica value");
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
                            System.out.println("Quit successfully, Goodbye!\n");
                            sc.close();
                            System.exit(0);
                            break;
                            
                        //if user input unrecognize selection for distance conversion prompt the user to re-enter.
                        default:
                            System.out.println("\nPlease enter a valid option.");
                            uc.printDistanceOption();
                            userOption = sc.next();
                            break;
                    }
                    break;
                
                //exit program when 3 is enter as option
                case "3":
                    System.out.println("Quit successfully, Goodbye!\n");
                    sc.close();
                    System.exit(0);
                    break;
                
                //if user input unrecognize selection prompt the user to re-enter.
                default:
                    System.out.println("\nPlease enter a valid option.");
                    uc.printMenuOption();
                    menuOption = sc.next();
                    break;
            }
        }
    
    }
}
