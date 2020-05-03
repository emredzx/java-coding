class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String speak(){
        return "Animal speaking..";
    }
}

class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Woof Woof Woof...";
    }
}

class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Meow Meow Meow...";
    }
}
class Horse extends Animal{
    public Horse(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Neigh Neigh Neigh...";
    }
}

public class Polymorphism {
    public static void speakall(Animal animal){
        System.out.println(animal.speak());
    }
    public static void main(String[] args){
        Animal animal = new Animal("Chombi");
        System.out.println(animal.speak());
        System.out.println("*****************************************");
        Animal animal1 = new Dog("Laida");
        System.out.println(animal1.speak());
        Animal animal2 = new Cat("Daila");
        System.out.println(animal2.speak());
        Animal animal3 = new Horse("Aliad");
        System.out.println(animal3.speak());
        System.out.println("*****************************************");
        speakall(new Dog("Laida"));
        speakall(new Cat("Daila"));
        speakall(new Horse("Aliad"));
        System.out.println("*****************************************");
        speakall(new Animal("Trying"));
    }
}
