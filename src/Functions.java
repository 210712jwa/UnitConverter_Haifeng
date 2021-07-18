public class Functions {

    // Volume conversion

    // convert Cups to Teaspoons
    public double convertCupsToTeaspoons(double num) {
        num = num * 48;
        return num;
    }

    // convert Teaspoons to Cups
    public double convertTeaspoonsToCpus(double num) {
        num = num / 48;
        return num;
    }

    // convert US gallons to Imerial gallons
    public double convertUSGallonsToImperialGallons(double num) {
        num = num * 0.832674;
        return num;
    }

    // convert Ounces to Liters
    public double convertOuncesToLiters(double num) {
        num = num / 33.814;
        return num;
    }

    // convert Gallons to Liters
    public double convertGallonsToLiters(double num) {
        num = num * 3.78541;
        return num;
    }
    // Distance conversion

    // Convert Feet to Meters
    public double convertFeettoMeters(double num) {
        num = num * 0.3048;
        return num;
    }

    // convert Miles to killometers
    public double convertMilestoKilometers(double num) {
        num = num * 1.609344;
        return num;
    }

    // convert Centimeters to Inches
    public double convertCentimeterstoInches(double num) {
        num = num / 2.54;
        return num;
    }

    // convert Inches to Centimeters
    public double convertInchestoCentimeters(double num) {
        num = num * 2.54;
        return num;
    }

    // convert Inches to Feet
    public double convertInchesToFeet(double num) {
        num = num / 12;
        return num;
    }

    // first layer selction prompt
    public void printMenuOption() {
        System.out.println("\na.Volume conversions");
        System.out.println("b.Distance conversions");
        System.out.println("c.Quit");
        System.out.print("select your option: ");

    }

    // printout Volume conversion option prompt
    public void printVolumeOption() {
        System.out.println("\n1. Cups to Teaspoons");
        System.out.println("2. Teaspoons to Cups");
        System.out.println("3. US Gallons to Imperial Gallons");
        System.out.println("4. Ounces to Liters");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Go back to the first menu");
        System.out.println("7. Quit");
        System.out.print("select an option above: ");
    }

    // printout Distance conversion option prompt
    public void printDistanceOption() {
        System.out.println("\n1. Feet to Meters");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Centimeters to Inches");
        System.out.println("4. Inches to Centimeters");
        System.out.println("5. Inches to Feet");
        System.out.println("6. Go back to the first menu");
        System.out.println("7. Quit");
        System.out.print("Please select an option above: ");
    }
}