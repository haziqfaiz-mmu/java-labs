import java.util.Scanner;

public class exercise2{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array1: ");
        double[] array1 = createArrayFromInput();

        System.out.print("Enter array2: ");
        double[] array2 = createArrayFromInput();

        double[] array3 = merge(array1,array2);
        System.out.println("array1: ");
        print(array1);
        System.out.println("array2: ");
        print(array2);
        System.out.println("array3: ");
        print(array3);
    }

    public static double[] createArrayFromInput(){
        
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        double[] array = new double[size];

        for(int i=0;i<size;i++){
            array[i]=input.nextDouble();
        }
        return array;
    }

    public static void print(double[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static double[] merge(double[] array1, double[] array2){
        int size = array1.length + array2.length;
        double array3[] = new double[size];
        for (int i=0;i<array1.length;i++){
            array3[i] = array1[i];
        }

        for (int i=array1.length + 1;i<size;i++){
            array3[i] = array2[i];
        }
        return null;
    }
}