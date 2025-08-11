public class Lesson6 {
    public static void main(String[] args) {
        String s = "\u2002\u2002hello\u2002";
        System.out.println("Result: " +  s.trim());
        System.out.println("Result: " + s.strip());
    }
}
