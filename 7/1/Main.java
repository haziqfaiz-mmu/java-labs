import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long n = input.nextLong();

        int x = sumDigits(n);
        int y = recursiveSumDigits(n);

        System.out.println(x);
        System.out.println(y);
    }

    public static int sumDigits(long n){

        int sum=0; long divisor=10;
        while(n>0){
            sum = sum+ (int)(n % divisor);
            n= n/10;
        }
       
       return sum;
    }

    public static int recursiveSumDigits(long n){

       

        if(n==0)
        return (int)n;

        else{
            return (int)n%10 + recursiveSumDigits(n/10);
        }
    }
}