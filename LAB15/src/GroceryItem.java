public class GroceryItem {
    private String itemName;
    private int quantity;
    private double unitPrice;

    public GroceryItem(String itemName, int quantity, double unitPrice) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double getCost(){
        double total = this.unitPrice*this.quantity;
        return total;
    }
    public void SetQuantity(){}

}
