package structures;

public class BasicStack<X> implements StackInterface<X> {
    private X [] data;
    private int stackPointer;

    public BasicStack() {
        data = (X[]) new Object[1000];
        stackPointer =0;
    }

    public void push(Object newitem){
        data[stackPointer++] = (X) newitem;
    }


    public X pop(){
        if (stackPointer == 0)
        {
            throw new IllegalStateException("no more items in the stack");
        }
        return data[--stackPointer];
    }

    public boolean contains(X item) {
        boolean contains = false;
        for(int i =0; i<stackPointer; i++)
        {
            if (data[i].equals(item)) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    public  X access(X item){
        while(stackPointer>0){
            X popItem = pop();
            if(item.equals(popItem))
                return popItem;
        }
        throw new IllegalStateException("item you were searching for not found");
    }

    public int size(){
        return stackPointer;
    }
}
