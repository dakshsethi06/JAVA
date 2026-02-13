//Q6. Method Overriding – Shape Example
//Problem Statement:
//Create a base class Shape with method draw().
//Create subclasses Circle and Rectangle that override the draw() method.
//Call methods using parent reference.
//Concept Covered:
//✔ Runtime polymorphism
//✔ Method overriding
public class q6 {

    static class Shape {
        void draw() {
            System.out.println("Drawing a Shape");
        }
    }

    static class Circle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a Circle");
        }
    }

    static class Rectangle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a Rectangle");
        }
    }

    public static void main(String[] args) {

        Shape s;

        s = new Circle();
        s.draw();

        s = new Rectangle();
        s.draw();
    }
}
