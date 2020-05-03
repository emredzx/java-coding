package composition;

public class Motherboard {
    private String model;
    private String brand;
    private String cpu;
    private int ram;
    private String gpu;
    public Motherboard(String model,String brand,String cpu,int ram,String gpu){ //Constructor
        this.model = model;
        this.brand = brand;
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
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

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }
}
