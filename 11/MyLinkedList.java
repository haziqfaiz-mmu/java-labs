import java.util.Random;

public class MyLinkedList<E>{

    private class Node<E>{
        E element;
        Node<E> next;

        public Node(E e){
            this.element = e;
        }

        public E getElement(){
            return element;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0 ;
    }

    public String tostring(){
        StringBuilder result = new StringBuilder("[");
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (i == size-1)  // last element
                result.append (current.element);
            else // not last element
                result.append (current.element + ", ");
            // make current reference to the next node
            current = current.next;
        }
        return result.toString() + "]";
    }

    // add element as the first node
    public void addFirst (E e) {
        Node<E> newNode = new Node<>(e); // 1. create new Node for e        
        newNode.next = head; // 2. link head node to become a node after newNode 
        head = newNode;      // 3. makenewNode the head
        if (tail == null) // adding to empty list
            tail = head;  // 4.
        size++;
    }

    public void addLast (E e) {
        if (size == 0)
            addFirst(e);
        else { // size > 0
            Node<E> newNode = new Node<>(e); // 1
            tail.next = newNode; // 2
            tail = newNode;      // 3
            size++;
        }
    }

    public boolean add (E e) { // add to end
        addLast(e);
        return true;
    }

    // add e to the specified index
    public void add (int index, E e) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException
                ("Index: " + index + ", Size:" + size);
    
        if (index == 0)
            addFirst(e);
        else if (index == size)
            addLast(e);
        else { // not first nor last
            // 1. move current to one node before index
            Node<E> current = head;
            for (int i = 0; i < index-1; i++)
                current = current.next;
            Node<E> newNode = new Node<>(e); // 2
            newNode.next = current.next;     // 3
            current.next = newNode;          // 4
            size++;
        }
    }

    public E peek(){
        return head.getElement();
    }

    public E getLast(){
        return tail.getElement();
    }

    
}