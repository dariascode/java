import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a;
        System.out.print("Please, enter A side of a triangle: ");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
        }
        else {
            System.out.println("You entered a non-numeric value");
            return;
        }

        double b;
        System.out.print("Please, enter B side of a triangle: ");
        if (sc.hasNextDouble()) {
            b = sc.nextDouble();
        }
        else {
            System.out.println("You entered a non-numeric value");
            return;
        }

        double c;
        System.out.print("Please, enter C side of a triangle: ");
        if (sc.hasNextDouble()) {
            c = sc.nextDouble();
        }
        else {
            System.out.println("You entered a non-numeric value");
            return;
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Invalid triangle sides!");
            return;
        }

        double p = (a+b+c)/2;
        double triangleArea =  Math.sqrt(p * (p - a) * (p - b) * (p - c));


        System.out.println("Triangle area is: " + triangleArea);

    }

}
