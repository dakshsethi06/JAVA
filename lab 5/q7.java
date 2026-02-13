//Q7. Abstract Class – Vehicle System
//Problem Statement:
//Create an abstract class Vehicle with:
//•	Abstract method start()
//Create subclasses:
//•	Car
//•	Bike
//Implement the start() method in both classes.
//Concept Covered:
//✔ Abstract class
//✔ Mandatory method implementation
public class q7 {

    static abstract class Vehicle {

        abstract void start();
    }

    static class Car extends Vehicle {

        @Override
        void start() {
            System.out.println("Car starts with a key or push button.");
        }
    }

    static class Bike extends Vehicle {

        @Override
        void start() {
            System.out.println("Bike starts with a kick or self-start button.");
        }
    }

    public static void main(String[] args) {

        Vehicle v;

        v = new Car();
        v.start();

        v = new Bike();
        v.start();
    }
}

