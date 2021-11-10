import java.util.Random;
import java.util.Scanner;

 public class Main {
    public static void main(String[] args){

        int choice = -1;
        MyLinkedList<Integer> ll = new MyLinkedList<>();
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        while(choice !=0){

            System.out.println(ll.toString());

            System.out.println("1 -Add random integer as first");
            System.out.println("2 -Add random integer as last");
            System.out.println("3 -Add random integer at specified index");
            System.out.println("4 -Get first integer");
            System.out.println("5 -Get last integer");
            System.out.println("6 -Remove first integer");
            System.out.println("7 -Remove last integer");
            System.out.println("8 -Remove integer at specified index");
            System.out.println("0 -Exit");
            System.out.print("Command > ");

            choice = input.nextInt();

            switch(choice){

                case 1:
                    ll.addFirst(rand.nextInt(999));
                    break;
                case 2:
                    ll.addLast(rand.nextInt(999));
                    break;
                case 3:
                    ll.add(2, rand.nextInt(999));
                    break;
                case 4:
                    //
                    break;
                case 5:
                    //
                    break;
                case 6:
                    //
                    break;
                case 7:
                    //
                    break;
                case 8:
                    //
                    break;
                case 0:
                    
                    break;
                   
            }
        }
    }

    public void menu(){
        
    }
}
