import java.util.ArrayList;

public class GenericStack<E> {

    /*
    for stack we use array list because we usulually work with last element
    so faster than using linked list
    */
    private ArrayList<E> list = new ArrayList<>();

    //GenericStack(){}

    public int getSize(){
        return list.size();
    }

    //return last element
    public E peek(){
        return list.get(getSize()-1);
    }

    //add at the end
    public void push(E o){
        list.add(o);
    }

    //remove and get last element
    public E pop(){
        return list.remove(getSize()-1);
    }

    //check if empty
    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void clear(){
        list.clear();
    }

    //better if we show it in reverse
    @Override
    public String toString(){
        return list.toString();
    }

}
