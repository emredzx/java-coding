package composition;

public class Monitor {
    private String model;
    private String brand;
    private double inches;
    private Resolution resolution; //composition

    public Monitor(String model, String brand, double inches, Resolution resolution) {
        this.model = model;
        this.brand = brand;
        this.inches = inches;
        this.resolution = resolution;
    }
    public void openMon(){
        System.out.println("Monitor is opening...");
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getInches() {
        return inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
}
