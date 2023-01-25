import java.util.ArrayList;

class Order {
    private ArrayList<MenuItem> items;
    private double totalCost;

    public Order() {
        items = new ArrayList<>();
        totalCost = 0;
    }

    public void addItem(MenuItem item) {
        items.add(item);
        totalCost += item.getPrice();
    }

    public double getTotalCost() {
        return totalCost;
    }
}