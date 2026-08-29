
    public static void main(String[] args) {
        
        Dog myDog = new Dog();
        myDog.name = "Tommy";

        myDog.eat();
        myDog.bark();
    }
}

class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating");

    }
}

class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking");
    }
}
