package beyblade;

public class Dragoon extends Beyblade{
    private String sacredbeast;
    private String secretmove;
    public Dragoon(String beyblader, int rot_speed, int damage,String sacredbeast,String secretmove) {
        super(beyblader, rot_speed, damage);
        this.sacredbeast = sacredbeast;
        this.secretmove = secretmove;
    }
    @Override
    public void releaseBeast() {
        System.out.println(getBeyblader() + " has released the " + this.sacredbeast);
        System.out.println(getBeyblader() + " is attacking with Galaxy Storm");
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Sacred beast : " + this.sacredbeast);
        System.out.println("Secret move : " + this.secretmove);
    }
}
