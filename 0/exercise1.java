import java.util.Scanner;
import java.util.Arrays;

public class exercise1 {
    public static void main(String[] args){
        int size;
        Scanner myobj = new Scanner(System.in);
        System.out.print("Enter total number of items: ");

        size = myobj.nextInt();

        double prices[] = new double[size];

        System.out.println("Enter the prices for "+ size+ " items: ");        

        for(int i=0;i<size;i++){
            prices[i]= myobj.nextDouble();
        }

        System.out.print("The prices: ");

        for(int i=0;i<size;i++){
            System.out.print(prices[i]+" ");
        }
        System.out.println(Arrays.toString(prices));
        System.out.println();

        double sum = 0;
        for(int i=0;i<size;i++){
            sum= sum + prices[i];
        }

        System.out.println("Sum of all items are "+sum);
    }
}
