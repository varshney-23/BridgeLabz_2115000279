class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark! Bark!");
    }
}

public class UseOverideCorrectly {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
