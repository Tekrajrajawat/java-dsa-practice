public class Day13Practice {
    public static void main(String[] args) {
        
        Day13Dog myDog = new Day13Dog();
        Day13Cat myCat = new Day13Cat();

        myDog.makeSound();
        myCat.makeSound();

    }
}

class Day13Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Day13Dog extends Day13Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Day13Cat extends Day13Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
