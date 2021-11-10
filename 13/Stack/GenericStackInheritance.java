public class GenericStackInheritance<E> extends java.util.ArrayList<E>{


    public int getSize(){
        return super.size();
    }

    //return last element
    public E peek(){
        return super.get(getSize()-1);
    }

    //add at the end
    public void push(E o){
        super.add(o);
    }

    //remove and get last element
    public E pop(){
        return super.remove(getSize()-1);
    }

    //check if empty
    public boolean isEmpty(){
        return super.isEmpty();
    }

    public void clear(){
        super.clear();
    }

    //better if we show it in reverse
    @Override
    public String toString(){
        return super.toString();
    }

    
}
