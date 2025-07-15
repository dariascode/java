public class Lesson2 {
   public static void main(String[] args) {
      System.out.println(Math.random());
      System.out.println((int)(Math.random() * 100));
      System.out.println((int)(Math.random() * 100)+100);

      Integer i = 127;
      Integer i2 = 127;
      System.out.println(i==i2);

      Integer i3 = 128;
      Integer i4 = 128;
      System.out.println(i3.equals(i4));
   }
}
