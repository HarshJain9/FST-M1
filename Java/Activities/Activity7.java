package Activities;

interface BicycleParts {
    public int gears = 0;
    public int speed = 0;
}

interface BicycleOperations {
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}
class Bicycle implements BicycleParts, BicycleOperations {
    public int gears;
    public int speed;

    public Bicycle(int gears, int speed) {
        this.gears = gears;
        this.speed = speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
        System.out.println("Speed :" + speed);
    }

    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Speed :" + speed);
    }

    public String bicycleDesc() {
        return ("No of gears are : " + gears + "\nSpeed of the bicycle is: " + speed);
    }

    static class MountainBike extends Bicycle {

        public int seatHeight;

        public MountainBike(int gears, int speed, int startHeight) {
            super(gears, speed);
            seatHeight = startHeight;
        }

        public void setHeight(int newValue) {
            seatHeight = newValue;
        }

        public String bicycleDesc() {
            return (super.bicycleDesc() + "\nSeat height is: " + seatHeight);
        }

    }

    public static class Activity7 {
        public static void main(String[] args) {
            MountainBike mbike = new MountainBike(3, 0, 30);
            System.out.println(mbike.bicycleDesc());
            mbike.speedUp(90);
            mbike.applyBrake(3);
        }

    }
}
