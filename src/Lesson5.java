import java.util.Scanner;

public class Lesson5 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       double r;
       System.out.print("Enter radius: ");
       if (sc.hasNextDouble()) {
           r = sc.nextDouble();
       }
       else {
           System.out.println("You entered a non-numeric value");
           return;
       }

       double c = (double) Math.round(Math.PI * 2 * r *100)/100;
       System.out.println("The C of the circle is " + c);
   }
}
