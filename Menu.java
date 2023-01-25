import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menu;

    public Menu() {
        menu = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item){
        menu.add(item);
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public void viewMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i).getName() + " - $" + menu.get(i).getPrice());
        }
    }
}
