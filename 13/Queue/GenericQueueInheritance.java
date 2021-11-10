public class GenericQueueInheritance<E> extends java.util.LinkedList<E> {
    
    public void enqueue(E e) {
        super.addLast(e);
      }
    
      public E dequeue() {
        return super.removeFirst();
      }
    
      public int getSize() {
        return super.size();
      }
    
      public void clear(){
        super.clear();
    }

      @Override
      public String toString() {
        return  super.toString();
      }
}
