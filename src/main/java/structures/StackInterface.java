package structures;

public interface StackInterface<X> {
    void push(X newitem);
    X pop();
    boolean contains(X item);
    X access(X item);
    int size();

}
