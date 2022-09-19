import java.util.ArrayList;

//Scharara Islam 101149731
public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook(){
        this.buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        this.buddies.add(buddy);
    }
    public void removeBuddy(BuddyInfo buddy){
        this.buddies.remove(buddy);
    }

    public static void main(String[] args){
        System.out.println("Address Book");
    }
}
