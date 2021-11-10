import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

/* 
There are 3 Maps:
1. HashMap: Unordered, can have one null key and multiple null values, fastest
2. LinkedHashMap: Insertion ordered, can have one null key and multiple null values
3. TreeMap: Ascending ordered, can't have null key, slowest
*/

public class Exercise2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Map<String,Integer> lhMap = new LinkedHashMap<String,Integer>();
        Map<String,Integer> treeMap = new TreeMap<String,Integer>();

        System.out.println("Enter next character: ");
        String letter = input.next().toLowerCase();
        while(!letter.equals("0")){

            if(lhMap.containsKey(letter)){
                lhMap.put(letter, lhMap.get(letter)+1);
            }
            else lhMap.put(letter,1);

            if(treeMap.containsKey(letter)){
                treeMap.put(letter, treeMap.get(letter)+1);
            }
            else treeMap.put(letter,1);

            letter = input.next().toLowerCase();

            Stack<Integer> testStack = new Stack<>();
            Queue<Integer> testQueue = new LinkedList<>(); 
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        }

        System.out.println("Letter occurences in original order: "+ lhMap);
        for(var entry : lhMap.entrySet())
            System.out.println(entry.getKey()+ "\t"+ entry.getValue());

        System.out.println("Letter occurences in ascending order: "+ treeMap);
        for(var entry : treeMap.entrySet())
            System.out.println(entry.getKey()+ "\t"+ entry.getValue());
    
    }
}

