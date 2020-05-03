package composition;

public class Case {

    public String brand;
    public int fan;
    public String tower;

    public Case(String brand, int fan, String tower) {
        this.brand = brand;
        this.fan = fan;
        this.tower = tower;
    }
    public void openCom(){
        System.out.println("Computer is starting...");
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getFan() {
        return fan;
    }

    public void setFan(int fan) {
        this.fan = fan;
    }

    public String getTower() {
        return tower;
    }

    public void setTower(String tower) {
        this.tower = tower;
    }
}
