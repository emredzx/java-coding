package beyblade;

public class Factory {
    public Beyblade createBeyblade(String beybladeType){
        if (beybladeType.equals("Dragoon")){
            return new Dragoon("Takao Kinomiya",1000,1000,"Dragoon","Twin Tornado");
        }
        else if(beybladeType.equals("Draciel")){
            return new Draciel("Max Tate",1000,1000,"Black Turtle");
        }
        else if(beybladeType.equals("Driger")){
            return new Driger("Ray Kon",1000,1000,"White Tiger");
        }
        else if(beybladeType.equals("Dranzer")){
            return new Dranzer("Kai Hiwatari",1000,1000,"Red Phoenix");
        }
        else{
            return null;
        }
    }
}
