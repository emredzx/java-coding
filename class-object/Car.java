public class Car {

    private String color;
    private int doors;
    private int wheels;
    private String engine;
    private String model;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        if (doors < 1)
        {
            System.out.println("Enter a valid value for wheels");
        }
        else {
            this.doors = doors;
        }
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        if (wheels < 2){
            System.out.println("Enter a valid value for wheels.");
        }
        else {
            this.wheels = wheels;
        }
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static void main(String[] args){

        Car firstcar = new Car();
        firstcar.setColor("Blue");
        firstcar.setDoors(4);
        firstcar.setEngine("OHV V-8");
        firstcar.setWheels(4);
        firstcar.setModel("Sport");
        String carspecs = "Colour : " + firstcar.getColor() + "\n"
                + "Number of door : " + firstcar.getDoors() + "\n"
                + "Number of wheels : " + firstcar.getWheels() + "\n"
                + "Engine : " +  firstcar.getEngine() + "\n"
                + "Model : " + firstcar.getModel();
        System.out.print(carspecs);

    }
}
