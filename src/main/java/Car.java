public class Car {
    // CAR INFORMATION
    String brand;
    String model;
    int buildYear;
    String vin;
    String color;

    public Car(String model, String brand, int buildYear, String vin, String color) {
        this.model = model;
        this.brand = brand;
        this.buildYear = setBuildYear();
        this.vin = vin;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public int setBuildYear(int buildYear) {
        if(buildYear > 1000 ) {
            this.buildYear = buildYear;
        } else {
            System.out.println("This is not allowed");
        }
        return buildYear;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Car() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }






    void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Build Year: " + buildYear);
        System.out.println("VIN: " + vin);
        System.out.println("----------------------");
    }

    static void dealershipInfo() {
        System.out.println("Welcome to the future of RentalCars");
    }
}
