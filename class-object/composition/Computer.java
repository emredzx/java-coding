package composition;

public class Computer {
    //composition
    private Monitor monitor;
    private Case aCase;
    private Motherboard motherboard;

    public Computer(Monitor monitor, Case aCase, Motherboard motherboard) {
        this.monitor = monitor;
        this.aCase = aCase;
        this.motherboard = motherboard;
    }
    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Case getaCase() {
        return aCase;
    }

    public void setaCase(Case aCase) {
        this.aCase = aCase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }
}
