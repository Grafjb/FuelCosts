import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallons=0, efficiency=0, price=0;
        boolean validInput = false;

        do {
            System.out.print("Enter number of gallons of gas in the tank: ");
            if (scanner.hasNextDouble()) {
                gallons = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input! Please enter a valid number of gallons.");
                scanner.next(); // Clear invalid input
            }
        } while (!validInput);

        validInput = false;
        do {
            System.out.print("Enter fuel efficiency in miles per gallon: ");
            if (scanner.hasNextDouble()) {
                efficiency = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input! Please enter a valid fuel efficiency.");
                scanner.next(); // Clear invalid input
            }
        } while (!validInput);

        validInput = false;
        do {
            System.out.print("Enter price of gas per gallon: ");
            if (scanner.hasNextDouble()) {
                price = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input! Please enter a valid price per gallon.");
                scanner.next(); // Clear invalid input
            }
        } while (!validInput);

        double costPer100Miles = (100 / efficiency) * price;
        double distanceWithTank = gallons * efficiency;

        System.out.println("Cost per 100 miles: $" + costPer100Miles);
        System.out.println("Distance the car can go with the gas in the tank: " + distanceWithTank + " miles");

        scanner.close();
    }
}

