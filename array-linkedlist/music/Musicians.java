package music;

import java.util.ArrayList;

public class Musicians {
    private ArrayList<String> musician_list = new ArrayList<String>();

    public void showMusicians(){
        for (int i = 0 ; i < this.musician_list.size() ; i++){
            System.out.println(i+1 + ".Musician : " + this.musician_list.get(i));
        }
    }
    public void addMusician(String name){
        if (!this.musician_list.contains(name)) {
            this.musician_list.add(name);
            System.out.println("Musicians list has been updated.");
        }
        else{
            System.out.println("This musician is already in the list.");
        }
    }
    public void updateMusician(String bupdate, String aupdate){
        this.musician_list.set(this.musician_list.indexOf(bupdate),aupdate) ;
        System.out.println(bupdate + " is updated to : " + aupdate);
        }
    public void deleteMusician(String delete){
        this.musician_list.remove(delete);
        System.out.println(delete + " is deleted from the list.");
    }
    public void searchMusician(String search){
        if (this.musician_list.contains(search)){
            System.out.println("Musician is in the list.");
            System.out.println(search + " is in " + this.musician_list.indexOf(search) + "." + " place of the list.");
        }
        else {
            System.out.println("Musician couldn't find.");
        }
    }
}
