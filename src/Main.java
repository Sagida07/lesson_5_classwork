public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("BMW X7", "Dark Blue", 2017, 3.5);

        System.out.println(myCar);
        System.out.println("MODEL: " + myCar.model + " COLOUR: " + myCar.colour + " YEAR: " + myCar.year + " POWER: " + myCar.power);
        myCar.power = 3.7;
        System.out.println("MODEL: " + myCar.model + " COLOUR: " + myCar.colour + " YEAR: " + myCar.year + " NEW POWER: " + myCar.power);


        Car bestCar = new Car("Mercedes", "Black", 2009);

        System.out.println("MODEL: " + bestCar.model + " NEW COLOUR: " + bestCar.colour + " YEAR: " + bestCar.year + " POWER: " + bestCar.power);
        bestCar.colour = "White";
        System.out.println("MODEL: " + bestCar.model + " COLOUR: " + bestCar.colour + " YEAR: " + bestCar.year + " POWER: " + bestCar.power);


        Car friendsCar = new Car();
        System.out.println("MODEL: " + friendsCar.model + " COLOUR: " + friendsCar.colour + " YEAR: " + friendsCar.year + " POWER: " + friendsCar.power);
        friendsCar.model = "Lexus 570";
        friendsCar.colour = "White";
        friendsCar.year = 2022;
        friendsCar.power = 4;
        System.out.println("MODEL: " + friendsCar.model + " COLOUR: " + friendsCar.colour + " YEAR: " + friendsCar.year + " POWER: " + friendsCar.power);

        friendsCar.drive();
        myCar.drive("Tokyo");

        bestCar.makingSignal(4);
        bestCar.drive("New York");


        Owner me = new Owner("Almazbek Damirov", 17);
        System.out.println("FULL NAME: " + me.getFullName() + " AGE: " + me.getAge() + " BIRTH YEAR: " + me.calculateBirthYear());
        me.setAge(-78);
        System.out.println("FULL NAME: " + me.getFullName() + " AGE: " + me.getAge() + " BIRTH YEAR: " + me.calculateBirthYear());

        Owner dad = new Owner("Erlan Abdykerimov", 40);
        System.out.println("FULL NAME: " + dad.getFullName() + " AGE: " + dad.getAge() + " BIRTH YEAR: " + dad.calculateBirthYear());

        Owner girl = new Owner("Sagida Erlanova", 16);
        System.out.println("FULL NAME: " + girl.getFullName() + " AGE: " + girl.getAge() + " BIRTH YEAR: " + girl.calculateBirthYear());

        myCar.setCarsOwner(me);
        friendsCar.setCarsOwner(new Owner("Tariel Arstanbekov", 18));


        System.out.println("MODEL: " + myCar.model + " COLOUR: " + myCar.colour + " YEAR: " + myCar.year + " POWER: " + myCar.power +
                " OWNER INFO " + myCar.getCarsOwner().getFullName() + " " + myCar.getCarsOwner().getAge());

        System.out.println("MODEL: " + friendsCar.model + " COLOUR: " + friendsCar.colour + " YEAR: " + friendsCar.year + " POWER: " + friendsCar.power +
                " OWNER INFO " + friendsCar.getCarsOwner().getFullName() + " " + friendsCar.getCarsOwner().getAge());
    }
}