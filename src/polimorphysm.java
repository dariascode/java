public class polimorphysm {
    static abstract class Shape {
        abstract void area();
    }

    static class Circle extends Shape {
        private int radius;
        Circle(int radius) {
            this.radius = radius;
        }

        @Override
        void area() {
            System.out.println("Circle: " + Math.PI * radius * radius);
        }
    }

    static class Triangle extends Shape {
        private int height, width;
        Triangle(int height, int width) {
            this.height = height;
            this.width = width;
        }

        @Override
        void area() {
            System.out.println("Triangle: " + 0.5 * height * width);
        }
    }

    static void show(){
        Circle circle = new Circle(5);
        circle.area();
        Triangle triangle = new Triangle(5, 10);
        triangle.area();
    }
}
