public class Main {
    public static void main(String[] args){
        //part1
        Complex C1=new Complex(4,8);
        Complex C2=new Complex(5,7);
        Complex C3 = new Complex();
        C3.AddComplex(C1,C2);
        C3.SubComplex(C1,C2);
        C3.MulComplex(C1,C2);
        C3.DivComplex(C1,C2);



        //part 2
        GroceryItem item1 = new GroceryItem("Snicker",1,2.00);
        GroceryItem item2 = new GroceryItem("Yams",2,5.00);
        GroceryItem item3 = new GroceryItem("General Tso",1,10.00);
        GroceryList list= new GroceryList();
        list.add(item1);
        list.add(item2);
        list.add(item3);
        list.getTotalCost();
    }
}
