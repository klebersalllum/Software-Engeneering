import java.util.ArrayList;
import java.util.Scanner;
/*With this code, the main method creates an instance of the Menu class 
and an instance of the OrderController class, passing the Menu instance 
as an argument to the controller's constructor. Then, it uses the getOrderItems()
method of the controller to place an order, by asking the user to select items 
from the menu and displaying the order total.*/
class OrderController {
    private Menu menu;

    public OrderController(Menu menu) {
        this.menu = menu;
    }

    public ArrayList<MenuItem> getOrderItems() {
        ArrayList<MenuItem> orderItems = new ArrayList<>();
        double totalCost = 0;
        Scanner scanner = new Scanner(System.in);
        boolean ordering = true;
        while (ordering) {
            menu.viewMenu();
            System.out.println("Please select an item from the menu:");
            int choice = scanner.nextInt();
            MenuItem item = menu.getMenu().get(choice-1);
            orderItems.add(item);
            totalCost += item.getPrice();
            System.out.println("Item added to the order:");
            System.out.println(item.getName() + " - $" + item.getPrice());
            System.out.println("Do you want to add more items to the order? (Y/N)");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("n")) {
                ordering = false;
            }
        }
        System.out.println("Your order total is: $" + totalCost);
        return orderItems;
    }
}