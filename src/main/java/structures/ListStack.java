package structures;

import java.util.ArrayList;

public class ListStack<X> implements StackInterface<X> {
    private ArrayList<X> data;

    public ListStack(){
        data = new ArrayList<X>();
    }
    public void push(X newitem) {
        data.add(newitem);
    }

    public X pop() {
        if (data.isEmpty())
            throw new IllegalStateException("no more items in the stack");
        X poppedItem = data.get(data.size()-1);
        data.remove(data.size()-1);
        return poppedItem;
    }

    public boolean contains(X item) {
        boolean found = false;
        if ( data.contains(item))
            return true;
        return found;
    }

    public X access(X item) {
        int num = data.size();
        for (int i = num-1;i>=0;i--)
        {
           X stuff =  pop();
           if(stuff.equals(item))
               return stuff;
        }
        throw new IllegalStateException("item you were searching for not found");
    }

    public int size() {
        return data.size();
    }
}
