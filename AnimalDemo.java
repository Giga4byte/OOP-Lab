class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Herbivore extends Animal {
    String type;

    Herbivore(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Herbivore");
        System.out.println("Herbivore Type: " + type);
    }
}

class Carnivore extends Animal {
    String type;

    Carnivore(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Carnivore");
        System.out.println("Carnivore Type: " + type);
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Herbivore herbivore = new Herbivore("Zebra", 8, "Browser");
        Carnivore carnivore = new Carnivore("Panther", 5, "Predator");

        System.out.println("Herbivore Details:");
        herbivore.displayDetails();

        System.out.println("\nCarnivore Details:");
        carnivore.displayDetails();
    }
}
