public class Animal {
    private String name;
    private int age;

    public Animal (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("MakeSound");
    }
    public void eat() {
        System.out.println("Eat something");
    }


}
class Dog extends Animal {
    private String breed;

    public Dog (String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void makeSound() {
        System.out.println("Woof");
    }

    public void eat() {
        System.out.println("Eat bone");
    }
}

class Cat extends Animal {
    private boolean hasFur;

    public Cat (String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
    }
    
    public void makeSound() {
        System.out.println("Meow");
    }

    public void eat() {
        System.out.println("Eat milk");
    }
}


class Main12 {
    public static void main(String[] args) {
        Animal coc = new Animal("coc", 1);
        Animal bob = new Dog("Bob", 1, "haski");
        coc.makeSound(); coc.eat();
        bob.makeSound(); bob.eat();
    }
}