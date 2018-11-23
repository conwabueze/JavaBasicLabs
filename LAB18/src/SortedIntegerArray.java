public class SortedIntegerArray {
    private int[] list;
    private int listLength;

    public SortedIntegerArray(int listLength){
        this.listLength=listLength;
        list = new int[this.listLength];
    }

    public int size(){return listLength;}

    public int get(int index){
        if(index<0||index>list.length-1)return -1;
        return list[index];
    }

    @Override
    public String toString(){
        for(int x=0;x<list.length;x++){
            return list[x]+" ";
        }
        return "";
    }
    

}
