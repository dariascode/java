import java.math.BigDecimal;
import java.math.RoundingMode;

public class Lesson1 {
    public static void main(String[] args) {

        task1();
        task2();
    }

    public static void task1 () {
        int i  = 20;
        System.out.println(i);
        System.out.println(i- (6/2));
        System.out.println(i/3);

        BigDecimal rideFee = BigDecimal.valueOf(i).setScale(2);
        System.out.println(rideFee);
        BigDecimal amountOfPeople = BigDecimal.valueOf(3);
        System.out.println(amountOfPeople);
        BigDecimal chargePerPerson = rideFee.divide(amountOfPeople, RoundingMode.HALF_UP);
        System.out.println(chargePerPerson);
    }

    public static void task2 () {
        double d = 3.1;
        double d2 = 1.56;

        BigDecimal num1 = BigDecimal.valueOf(d).setScale(2);
        BigDecimal num2 = BigDecimal.valueOf(d2).setScale(2);
        BigDecimal result = num1.subtract(num2);
        System.out.println(result);
        System.out.println(d - d2);
    }
}

