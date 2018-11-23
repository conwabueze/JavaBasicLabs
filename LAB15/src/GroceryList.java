public class GroceryList {
    private GroceryItem[] groceryItems = new GroceryItem[10];
    private int listCounter=0;

    public GroceryList() {

    }

    public void add(GroceryItem item){
        if(this.listCounter==9) {
            System.out.println("No more items can be added to your list");
        }else{
            this.groceryItems[listCounter]=item;
            this.listCounter++;
        }
    }

    public void getTotalCost(){
        double total=0;
        for(int x=0; x<listCounter; x++){
            total+=groceryItems[x].getCost();
        }
        System.out.println(total);
    }
}
