package beyblade;

public class Driger extends Beyblade{
    private String sacredbeast;
    public Driger(String beyblader, int rot_speed, int damage,String sacredbeast) {
        super(beyblader, rot_speed, damage);
        this.sacredbeast = sacredbeast;
    }
    @Override
    public void releaseBeast() {
        System.out.println(getBeyblader() + " has released the " + this.sacredbeast);
        System.out.println(getBeyblader() + " is attacking with Tiger Claw");
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Sacred beast : " +this.sacredbeast);
    }
}
