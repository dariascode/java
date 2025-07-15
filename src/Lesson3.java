import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Enter number 1: ");
        if (sc.hasNextInt()) {
            num = sc.nextInt();
        } else {
            System.out.println("Invalid input. Not an integer.");
            return;
        }

        int num2;
        System.out.println("Enter number 2: ");
        if (sc.hasNextInt()) {
            num2 = sc.nextInt();
        } else {
            System.out.println("Invalid input. Not an integer.");
            return;
        }

        System.out.println("Enter operation (+, -, *, /): ");
        String op = sc.next();

        switch (op) {
            case "+":
                System.out.println(num + num2);
                break;
            case "-":
                System.out.println(num - num2);
                break;
            case "*":
                System.out.println(num * num2);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                } else {
                    System.out.println(num / num2);
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
