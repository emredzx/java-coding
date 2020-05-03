package inheritance_2;

public class Dog extends Animal{
    private int age;
    public Dog(String name,double height,double weight,int age){
        super(name, height, weight);
        this.age=age;
    }
    public void runAnimal(double speed){
        System.out.println("Overrided Dog is running.Its speed is : " + speed);
    }
    public void runDog(double speed){
        System.out.println("Dogs is running.Its speed is : "+ speed);
        runAnimal(speed);
        super.runAnimal(speed); //difference of super
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
