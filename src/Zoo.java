public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Cat ("Murka", 2 ),
                new Dog ("Gav", 3 ),
                new Dog ("Ball", 4 ),
        };
        for (Animal animal : animals) {
            System.out.printf("%s (%d): ", animal.getName(), animal.getAge());
            animal.makeNoise();
        }

    }
    static abstract class Animal {
        int age;
        String name;
        abstract void makeNoise();


        protected Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static class Cat extends Animal {
        public Cat(String name, int age) {
            super(name, age);
        }
        @Override
        void makeNoise() {
            System.out.println("MEOW");
        }
    }

    static class Dog extends Animal {
        public Dog(String name, int age) {
            super(name, age);
        }
        @Override
        void makeNoise() {
            System.out.println("BARK");
        }

    }

}
