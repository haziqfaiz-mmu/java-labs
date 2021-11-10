public class MyArrayList<E> {

    public static final int INITIAL_CAPACITY = 2;
    private E[] data = (E[])new Object[INITIAL_CAPACITY];
    private int size = 0; // Number of elements in the list
  
    /** Add a new element at the specified index */
    public void add(int index, E e) {   
      // Ensure the index is in the right range
      if (index < 0 || index > size)
        throw new IndexOutOfBoundsException
          ("Index: " + index + ", Size: " + size);
      
      ensureCapacity();
  
      // Move the elements to the right after the specified index
      for (int i = size - 1; i >= index; i--)
        data[i + 1] = data[i];
  
      // Insert new element to data[index]
      data[index] = e;
  
      // Increase size by 1
      size++;
    }
  
    /** Create a new larger array, double the current size + 1 */
    private void ensureCapacity() {
      if (size >= data.length) {
        E[] newData = (E[])(new Object[size * 2 + 1]);
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
      }
    }
    
    /** Return the element at the specified index */
    public E get(int index) {
      checkIndex(index);
      return data[index];
    }
  
    private void checkIndex(int index) {
      if (index < 0 || index >= size)
        throw new IndexOutOfBoundsException
          ("Index: " + index + ", Size: " + size);
    }
    
    /** Return the index of the first matching element 
     *
     *  in this list. Return -1 if no match. */
    //public int indexOf(Object e) {
    public int indexOf(E e) {
      for (int i = 0; i < size; i++)
        if (e.equals(data[i]))
          return i;
  
      return -1;
    }
  
    /** Remove the element at the specified position 
     *  in this list. Shift any subsequent elements to the left.
     *  Return the element that was removed from the list. */
    public E remove(int index) {
      checkIndex(index);
      
      E e = data[index];
  
      // Shift data to the left
      for (int j = index; j < size - 1; j++)
        data[j] = data[j + 1];
  
      data[size - 1] = null; // This element is now null
  
      // Decrement size
      size--;
  
      return e;
    }
  
    public String toString() {
      StringBuilder result = new StringBuilder("[");
  
      for (int i = 0; i < size; i++) {
        result.append(data[i]);
        if (i < size - 1) result.append(", ");
      }
  
      return result.toString() + "]";
    }
  
    /** Return the number of elements in this list */
    public int size() {
      return size;
    }
  
    /** Add a new element at the end of this list */
    public boolean add(E e) {
      add(size(), e);
      return true;
    }
  
    /** Remove the first occurrence of the element e 
     *  from this list. Shift any subsequent elements to the left.
     *  Return true if the element is removed. */
    //public boolean remove(Object e) {
      public boolean remove(E e) {
      if (indexOf((E)e) >= 0) {
        remove(indexOf((E)e));
        return true;
      }
      else
        return false;
    }
  }
  
  