import java.util.ArrayList;

public class StackOfObjects {
    private ArrayList<Object> objectList;
    int capacity=2;//size variable

    public StackOfObjects(){
        objectList=new ArrayList<Object>(capacity);
    }

    public int size(){
        return objectList.size();
    }

    public void push(Object c){
        objectList.add(0,c);
    }

    public void pop(){
        objectList.remove(objectList.size()-1);
    }

    private void expand(){
        this.capacity*=2;
        ArrayList<Object> expand =new ArrayList<Object>(capacity);

        for(int x=0;x<objectList.size();x++){
            expand.add(x,objectList.get(x));
        }
        objectList=expand;
    }

    public void printOut(){
        for(int x=0;x<objectList.size();x++){
            System.out.println(objectList.get(x));
        }
    }



}
