import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Cyber Cafe!\n");

        boolean continueOrder = true;
        while (continueOrder) {
            System.out.println("Please select an option:");
            System.out.println("1. Register");
            System.out.println("2. View menu and prices");
            System.out.println("3. Place an order");
            System.out.println("4. Provide feedback");
            System.out.println("5. Exit\n");

            int userChoice = input.nextInt();
            switch (userChoice) {
                case 1:
                    register();
                    break;
                case 2:
                    viewMenu();
                    break;
                case 3:
                    placeOrder();
                    break;
                case 4:
                    provideFeedback();
                    break;
                case 5:
                    continueOrder = false;
                    System.out.println("Thank you for visiting the Cyber Cafe!");
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.\n");
                    break;
            }
        }
    }
    private static UserDatabase userDatabase = new UserDatabase();

    private static void register() {
        System.out.println("Registration Selected!\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = input.nextLine();
        System.out.println("Please enter your email:");
        String email = input.nextLine();
        if(userDatabase.checkEmail(email)){
            System.out.println("This email is already registered, please enter another email.");
        }else {
            System.out.println("Please enter your password:");
            String password = input.nextLine();
    
            Person newUser = new Person(name, email, password);
            userDatabase.addUser(newUser);
            System.out.println("Registration completed!");
        }
    }
    private static Menu menu = new Menu();

    private static void viewMenu() {
        // Code to display the menu and prices
        System.out.println("Menu and prices selected.");
        menu.addMenuItem(new MenuItem("Coffee", 2.5));
        menu.addMenuItem(new MenuItem("Tea", 2));
        menu.addMenuItem(new MenuItem("Hot chocolate", 3));
        menu.addMenuItem(new MenuItem("Pastry", 4));
        System.out.println("Menu bellow:");
        menu.viewMenu();
    }

    private static void placeOrder() {
        // Create an instance of the controller
        OrderController controller = new OrderController(menu);
        // Use the controller to place an order
        ArrayList<MenuItem> orderItems = controller.getOrderItems();
        // Code to handle placing an order
        System.out.println("Place order selected.");
        // Iterate through the order items and display them
        for (MenuItem item : orderItems) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        // Display the order total
        double total = 0;
        for (MenuItem item : orderItems) {
            total += item.getPrice();
        }
        System.out.println("Total: $" + total);
    }

    private static void provideFeedback() {
        // Code to handle user feedback
        System.out.println("Provide feedback selected.");
    }
}
