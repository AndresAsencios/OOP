import java.time.LocalDate;

public class Rental {
    // RENTINFORMATION
    int rentalID;
    String customerName;
    int howManyDays;
    double pricePerDay;
    LocalDate rentalStartDate;
    LocalDate rentalEndDate;
    String vin;



    void displayInfo() {
        System.out.println("Rental ID: " + rentalID);
        System.out.println("Customer: " + customerName);
        System.out.println("Price per day:$" +pricePerDay);
        System.out.println("Rental Start: " + rentalStartDate);
        System.out.println("Rental End: " + rentalEndDate);
        System.out.println("Car VIN: " + vin);
        System.out.println("Total: $" + calculateTotalPrice());
        System.out.println("-------------------");

    }

    public double calculateTotalPrice() {
        return howManyDays * pricePerDay;
    }




}
