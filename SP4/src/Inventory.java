import java.util.ArrayList;

public class Inventory {
    ArrayList<Items> items = new ArrayList<>();

    public Inventory(){}

    public void addItem(){
        items.add(new Items());
    }

    public void showItems(){
        for (int i = 0; i < items.size(); i++) {

            System.out.println(i + ". Name: " + items.get(i).name +
                                "\nDamage: " + items.get(i).damage +
                                "\nHP: " + items.get(i).hp +
                                "\nDefence: " + items.get(i).defence);
        }

    }
}