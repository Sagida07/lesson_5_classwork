public class Car {
    //fields/attributes
    public String model;
    public String colour;
    public int year;
    public double power;
    private Owner carsOwner;


    //construction
    public Car(String model, String colour, int year, double power) {
        this.model = model;
        this.colour = colour;
        this.year = year;
        this.power = power;
    }

    public Owner getCarsOwner() {
        return carsOwner;
    }

    public void setCarsOwner(Owner carsOwner) {
        this.carsOwner = carsOwner;
    }

    //construction
    public Car(String model, String colour, int year) {
        this.model = model;
        this.colour = colour;
        this.year = year;
    }

    //default construction
    public Car() {
    }

    //method
    public void drive() {
        System.out.println("Car " + this.model + " is driving");
    }

    //method
    public void drive(String city) {
        System.out.println("Car " + this.model + " is driving to " + city);
    }

    //method
    public void makingSignal(int times) {
        System.out.println("Car " + this.model + " is beeping " + times + " times");
        for (int i = 0; i < times; i++) {
            System.out.print("BEEP ");
        }
        System.out.println();
    }
}
