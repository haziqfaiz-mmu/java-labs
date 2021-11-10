import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        GenericQueue<Integer> gq = new GenericQueue<Integer>();
        GenericQueueInheritance<Integer> gqi = new GenericQueueInheritance<>();
        Integer command = 99;
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Queue: "+ gq);
        System.out.println("Queue inheritance: "+ gqi);

        while(command!=0){

            System.out.println("1 - Enqueue a random integer (0-100) into queue");
            System.out.println("2 - Dequeue queue");
            System.out.println("3 - Clar queue");
            System.out.println("0 - Exit");

            System.out.println("Queue: "+gq);
            System.out.println("Queue inheritance: "+ gqi);
            System.out.print("Command > ");
            command = input.nextInt();

            switch(command){
                case 1: gq.enqueue(random.nextInt(101));
                        gqi.enqueue(random.nextInt(101));
                        break;
                case 2: gq.dequeue();
                        gqi.dequeue();
                        break;
                case 3: System.out.println("Queue is cleared");
                        gq.clear();
                        gqi.clear();
                        break;
                default:
                        return;       
            }
        }


    }
}