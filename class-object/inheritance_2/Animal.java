package inheritance_2;

public class Animal {

    private String name;
    private double height;
    private double weight;

    public Animal(String name,double height,double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public void feedAnimal(){
        System.out.println("Animal is eating food that was given by you.");
    }
    public void runAnimal(double speed){
        System.out.println("Animal is running.Its speed is : " + speed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
