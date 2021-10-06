import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n =6;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> strlist = new ArrayList<>();

        System.out.println("Enter 6 integers with duplication");
        while(n >0){
            list.add(input.nextInt());
            n = n-1;
        }

        n=6;
        while(n >0){
            System.out.println("Enter 6 characters with duplication");
            strlist.add(input.next());
            n = n-1;
        }


        ArrayList<Integer> newlist = removeDuplicates(list);
        ArrayList<String> newstrlist = removeDuplicatesGeneric(strlist);

        System.out.println("Original list = "+list.toString());
        System.out.println("New list = " + newlist.toString());
        System.out.println("Original list = "+strlist.toString());
        System.out.println("New list = " + newstrlist.toString());
    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer value: list) 
            {if (!result.contains(value)) 
                result.add(value);}
        return result;
    }

    public static<T>ArrayList<T> removeDuplicatesGeneric(ArrayList<T> list) {
        
        ArrayList<T> result = new ArrayList<>();
        for (T value: list) 
            {if (!result.contains(value)) 
                result.add(value);}
        return result;
    }
}