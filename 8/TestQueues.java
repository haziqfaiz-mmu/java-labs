import java.util.*;

class Task implements Comparable<Task>{
    private int priority;
    private String name;

    public Task(int priority, String name) {
    this.priority = priority;
    this.name = name;
    }

    public String toString() {
    return "Task <priority=" + priority + " name=" + name + ">";
    }

    @Override
    public int compareTo(Task t) {
        
        return this.priority - t.priority;
    }
}
    
class TestQueues {
    public static void main (String[] args) {
    PriorityQueue<Integer> intPQ = new PriorityQueue<>(
    Collections.reverseOrder());
    intPQ.add (40);
    intPQ.add (60);
    intPQ.add (20);
    while (!intPQ.isEmpty())
        System.out.println ("Removed from PriorityQueue<Integer>: " + intPQ.poll());

        //Queue of Task
    Queue<Task> q = new LinkedList<>();
    q.offer(new Task(3,"Eat"));
    q.offer(new Task(8,"Sleep"));
    q.offer(new Task(1,"Study"));

    while(!q.isEmpty()){
        System.out.println("Removed from Queue<Task>: "+ q.poll());
        }
    
    //PriorityQueue of Task
    PriorityQueue<Task> taskPQ = new PriorityQueue<>();
    taskPQ.add(new Task(3,"Eat"));
    taskPQ.add(new Task(8,"Sleep"));
    taskPQ.add(new Task(1,"Study"));
    while(!taskPQ.isEmpty())
        System.out.println ("Removed from PriorityQueue<Integer>: " + taskPQ.poll());
    
    }
}