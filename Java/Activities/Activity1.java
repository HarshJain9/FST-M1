package Activities;

public class Activity1 {
    public static void main(String[] args) {
        Car carName = new Car();
        carName.make = 2014;
        carName.color = "Black";
        carName.transmission = "Manual";

        carName.displayCharacterstics();
        carName.accelerate();
        carName.brake();
    }
}
    class Car {

        String color;
        String transmission;
        int make;
        int tyres;
        int doors;

        Car() {
            tyres = 4;
            doors = 4;
        }

        public void displayCharacterstics() {
            System.out.println("Color of the Car :" + color);
            System.out.println("Make of the Car :" + make);
            System.out.println("Transmission of the Car :" + transmission);
            System.out.println("Number of doors in the Car :" + doors);
            System.out.println("Number of the tyres :" + tyres);
        }

        public void accelerate() {
            System.out.println("Car is moving forward.");
        }

        public void brake() {
            System.out.println("Car has stopped.");
        }

    }
