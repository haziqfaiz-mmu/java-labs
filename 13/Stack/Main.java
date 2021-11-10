import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        GenericStack<Integer> gs = new GenericStack<Integer>();
        GenericStackInheritance<Integer> gsi = new GenericStackInheritance<>();
        Integer command = 99;
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Stack: "+ gs);
        System.out.println("Stack inheritance: "+ gsi);

        while(command!=0){

            System.out.println("1 - Push a random integer (0-100) into stack");
            System.out.println("2 - Peek tack");
            System.out.println("3 - Pop stack");
            System.out.println("4 - Clear stack");
            System.out.println("0 - Exit");

            System.out.println("Stack: "+gs);
            System.out.println("Stack inheritance: "+ gsi);
            System.out.print("Command > ");
            command = input.nextInt();

            switch(command){
                case 1: gs.push(random.nextInt(101));
                        gsi.push(random.nextInt(101));
                        break;
                case 2: System.out.println(gs.peek());
                        System.out.println(gsi.peek());
                        break;
                case 3: System.out.println(gs.pop());
                        System.out.println(gsi.pop());
                        break;
                case 4: System.out.println("Stack is cleared");
                        gs.clear();
                        gsi.clear();
                        break;
                default:
                        return;       
            }
        }


    }
}