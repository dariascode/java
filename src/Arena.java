public class Arena {
    public static void main(String[] args) {
        Character [] characters = new Character[]{
                new Warrior("war", 120),
                new Archer("arch", 120),
                new Mage("mage", 120),
        };


        characters[0].attack(characters[1]);
        characters[1].showInfo();

    }

    static abstract class Character {
        private String name;
        private int hp;

        Character(String name, int hp) {
            this.name = name;
            this.hp = hp;

        }

        public String getName() {
            return name;
        }

        public void getHp() {
            System.out.println("HP: " + hp);
        }

        protected void takeDamage(int damage) {
            if (hp > 0) {
                hp -= damage;
            }
            else {
                System.out.println("You are dead!");
            }
        }

        int damage() {
            return 0;
        }

        void showInfo() {
            System.out.println(name +  hp);
        }

        public void attack (Character c) {
            c.takeDamage(this.damage());
        }

    }

    static class Warrior extends Character {
        Warrior(String name, int hp) {
            super(name, hp);
        }

        @Override
        int damage() {
            return 25;
        }
    }

    static class Mage extends Character {
        Mage(String name, int hp) {
            super(name, hp);
        }

        @Override
        int damage() {
            return 15;
        }
    }

    static class Archer extends Character {
        Archer(String name, int hp) {
            super(name, hp);
        }

        @Override
        int damage() {
            return 20;
        }
    }
}
