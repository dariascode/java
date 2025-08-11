public class OOP {

    static class Vehicle{
        public int maxSpeed;
        public void drive(int maxSpeed){
            System.out.println("Max Speed: " + maxSpeed);
        }
    }

    static class Car extends Vehicle{
        @Override
        public void drive(int maxSpeed){
            System.out.println("Max Speed of Car: " + maxSpeed);
        }
    }

    static class Bike extends Vehicle{
        @Override
        public void drive(int maxSpeed){
            System.out.println("Max Speed of Bike: " + maxSpeed);
        }
    }


    public static void show(){
        Car car = new Car();
        Bike bike = new Bike();
        car.drive(100);
        bike.drive(15);
    }



}
