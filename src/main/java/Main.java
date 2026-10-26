import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Learning about OOP");

        Car.dealershipInfo();

        Customer c1 = new Customer();
        c1.setAge(123123);

        Car car1 = new Car();
         car1.brand = "Toyota";
         car1.model = "Supra";
         car1.buildYear = 1998;
         car1.vin = "122222";
         car1.color = "White";

        Car car2 = new Car();
        car2.brand = "BMW";
        car2.model = "M3";
        car2.buildYear = 2020;
        car2.vin = "122267";
        car2.color = "Gun Metal";

        Car car3 = new Car();
        car3.brand = "Honda";
        car3.model = "Civic";
        car3.buildYear = 2023;
        car3.vin = "167267";
        car3.color = "Grey";

        Car car4 = new Car();
        car4.brand = "Ferrari";
        car4.model = "488 GTB";
        car4.buildYear = 2027;
        car4.vin = "767767";
        car4.color = "Red";


        Car car5 = new Car();
        car5.brand = "Porsche";
        car5.model = "Taycan 4S";
        car5.buildYear = 2027;
        car5.vin = "767776";
        car5.color = "Grey";

        Car car6 = new Car();
        car6.brand = "Porsche";
        car6.model = "Taycan 4S";
        car6.buildYear = 2026;
        car6.vin = "676667";
        car6.color = "Grey";

       car1.displayInfo();
       car2.displayInfo();
       car3.displayInfo();
       car4.displayInfo();
       car5.displayInfo();
       car6.displayInfo();

// Rental 1
        Rental rental1 = new Rental();
        rental1.rentalID = 1001;
        rental1.customerName = "John Smith";
        rental1.pricePerDay = 75.00;
        rental1.rentalStartDate = LocalDate.of(2026,10, 21);
        rental1.rentalEndDate = LocalDate.of(2026,10, 25);
        rental1.vin = "1HGCM82633A004352";
        rental1.howManyDays = 4;

// Rental 2
        Rental rental2 = new Rental();
        rental2.rentalID = 1002;
        rental2.customerName = "Sarah Johnson";
        rental2.pricePerDay = 95.00;
        rental2.rentalStartDate = LocalDate.of(2026,10, 22);
        rental2.rentalEndDate = LocalDate.of(2026,10, 29);
        rental2.vin = "2T1BURHE5JC123456";
        rental2.howManyDays = 7;

// Rental 3
        Rental rental3 = new Rental();
        rental3.rentalID = 1003;
        rental3.customerName = "Michael Brown";
        rental3.pricePerDay = 120.00;
        rental3.rentalStartDate = LocalDate.of(2026,10, 24);
        rental3.rentalEndDate = LocalDate.of(2026,10, 27);
        rental3.vin = "1FAFP404X1F192837";
        rental3.howManyDays = 3;

// Rental 4
        Rental rental4 = new Rental();
        rental4.rentalID = 1004;
        rental4.customerName = "Emily Davis";
        rental4.pricePerDay = 65.00;
        rental4.rentalStartDate = LocalDate.of(2026,10, 21);
        rental4.rentalEndDate = LocalDate.of(2026,10, 26);
        rental4.vin = "3VWFE21C04M567890";
        rental4.howManyDays = 5;

// Rental 5
        Rental rental5 = new Rental();
        rental5.rentalID = 1005;
        rental5.customerName = "David Wilson";
        rental5.pricePerDay = 150.00;
        rental5.rentalStartDate = LocalDate.of(2026,10, 21);
        rental5.rentalEndDate = LocalDate.of(2026,10, 21);
        rental5.vin = "5YJSA1E26HF123456";
        rental5.howManyDays = 2;

        // Rental 6
        Rental rental6 = new Rental();
        rental6.rentalID = 1006;
        rental6.customerName = "Ben Wilson";
        rental6.pricePerDay = 250.00;
        rental6.rentalStartDate = LocalDate.of(2026,10, 20);
        rental6.rentalEndDate = LocalDate.of(2026,10, 26);
        rental6.vin = "5YJSA1E26HF123456";
        rental6.howManyDays = 6;

        rental1.displayInfo();
        rental2.displayInfo();
        rental3.displayInfo();
        rental4.displayInfo();
        rental5.displayInfo();
        rental6.displayInfo();

        // Static information that does not change and is not linked to any object
        // non-static method is always linked to the individual object
        // can this be a generic calculation


    }
}
