package beyblade;

public class Dranzer extends Beyblade{
    private String sacredbeast;
    public Dranzer(String beyblader, int rot_speed, int damage, String sacredbeast) {
        super(beyblader, rot_speed, damage);
        this.sacredbeast = sacredbeast;
    }
    @Override
    public void releaseBeast() {
        System.out.println(getBeyblader() + " has released the " + this.sacredbeast);
        System.out.println(getBeyblader() + " is attacking with Flame Saber");
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Sacred beast : " +this.sacredbeast);
    }
}
