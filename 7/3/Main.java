import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int[] array = {64, 51,39, 87, 31, 57};

        System.out.println("Enter a target to search: ");
        int target = input.nextInt();
        int result = linearSearch(array, target);

        if (result>=0) System.out.println("Target found at index "+ result);

        else System.out.println("Target not found");

        String[] arrayStr = {"aa","uu","ee","bb"};

        System.out.println("Enter a target to search: ");
        String targetStr = input.nextLine();
        int newresult = linearSearchGeneric(arrayStr, targetStr);

        if (newresult>=0) System.out.println("Target found at index "+ newresult);

        else System.out.println("Target not found");
    }

    public static int linearSearch(int[] list, int key){

        for (int i = 0; i < list.length; i++){
            if (list[i]== key)
                return i;
        }
        return -1;
    }

    public static <E> int linearSearchGeneric(E[] list, E key){

        for (int i = 0; i < list.length; i++){
            if (list[i]== key)
                return i;
        }
        return -1;
    }
}