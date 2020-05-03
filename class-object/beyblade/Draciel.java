package beyblade;

public class Draciel extends Beyblade{
    private String sacredbeast;
    public Draciel(String beyblader, int rot_speed, int damage, String sacredbeast) {
        super(beyblader, rot_speed, damage);
        this.sacredbeast = sacredbeast;
    }
    @Override
    public void releaseBeast() {
        System.out.println(getBeyblader() + " has released the " + this.sacredbeast);
        System.out.println(getBeyblader() + " is defending with Metal Ball Defence");
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Sacred beast : " +this.sacredbeast);
    }
}
