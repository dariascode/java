import java.util.ArrayList;
import java.util.List;

public class Sales {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(1000);
        cart.add(2500);
        NoDiscount noDiscount = new NoDiscount();
        PercentDiscount percentDiscount = new PercentDiscount(10);
        FixedDiscount fixedDiscount = new FixedDiscount(300);

        System.out.println(cart.total(noDiscount));
        System.out.println(cart.total(percentDiscount));
        System.out.println(cart.total(fixedDiscount));
    }

    interface DiscountStrategy { int apply(int priceCents); }

    static class NoDiscount implements DiscountStrategy { public int apply(int p){ return p; } }

    static class PercentDiscount implements DiscountStrategy {
        private final int percent;
        public PercentDiscount(int percent){ this.percent = percent; }
        public int apply(int p){ return p - (p * percent / 100); }
    }

    static class FixedDiscount implements DiscountStrategy {
        private final int amount;
        public FixedDiscount(int amount){ this.amount = amount; }
        public int apply(int p){ return Math.max(0, p - amount); }
    }

    static class Cart {
        private final List<Integer> items = new ArrayList<>();
        public void add(int priceCents){ items.add(priceCents); }
        public int total(DiscountStrategy s){
            int sum = 0;
            for (int p : items) sum += s.apply(p);
            return sum;
        }
    }
}


