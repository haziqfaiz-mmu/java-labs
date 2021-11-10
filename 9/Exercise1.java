import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

import javax.management.Query;

/* 
There are 3 type of sets
1. HashSet - fastest but unordered
2. LinkedHashSet - insertion order
3. TreeSet - slowest, in ascending order
*/

public class Exercise1{

    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);
        LinkedHashSet<Integer> lhSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        HashSet<Integer> hashSet = new HashSet<>();

        System.out.println("Enter integer: ");
        int number = input.nextInt();
        while(number !=0){
            lhSet.add(number);
            treeSet.add(number);
            number = input.nextInt();
        }

        System.out.println("Nonduplicate numbers in ascending order: "+ treeSet);
        System.out.println("Nonduplicate numbers in insertion order: "+ lhSet);

            
    }
}
