package beyblade;

public class Beyblade {
    private String beyblader;
    private int rot_speed;
    private int damage;

    public Beyblade(String beyblader, int rot_speed, int damage) {
        this.beyblader = beyblader;
        this.rot_speed = rot_speed;
        this.damage = damage;
    }

    public String getBeyblader() {
        return beyblader;
    }

    public void setBeyblader(String beyblader) {
        this.beyblader = beyblader;
    }

    public int getRot_speed() {
        return rot_speed;
    }

    public void setRot_speed(int rot_speed) {
        this.rot_speed = rot_speed;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void attack(){
        System.out.println(this.beyblader + " is attacking " + this.damage + " and " + this.rot_speed);
    }
    public void releaseBeast(){
        System.out.println("There is no sacred beast inside this beyblade..");
    }
    public void showInfo(){
        System.out.println("Blader : " + this.beyblader);
        System.out.println("Attack damage : " + this.damage);
        System.out.println("Rotation speed : " + this.rot_speed);
    }
}
