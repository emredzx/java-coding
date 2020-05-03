package composition;

public class Main {
    public static void main(String[] args){
        Resolution resolution = new Resolution(1920,1080);
        Monitor monitor = new Monitor("VX2457","ViewSonic",23.6,resolution);
        Case aCase = new Case("Thermaltake",3,"MidTower");
        Motherboard motherboard = new Motherboard("Z170A GAMING M5","MSI","i7 6700K",16,"RX 480");
        Computer computer = new Computer(monitor,aCase,motherboard);
        computer.getaCase().openCom();
        computer.getMonitor().openMon();
    }
}
