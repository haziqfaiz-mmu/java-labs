import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    
    public static void main(String[] args){

        LinkedList<Integer> list = new LinkedList<>();
        
        for(int i=0;i<10;i++){
            Random rand = new Random();
            list.add(rand.nextInt(99));
        }

        int choice;
        do{
            System.out.print("Random list: ");
            System.out.println(list.toString());

            System.out.println("Enter your choice:");
            System.out.println("1: New random list");
            System.out.println("2: Sort list");
            System.out.println("3: Reverse list");
            System.out.println("4: Shuffle list");
            System.out.println("0: Quit");

            Scanner input = new Scanner(System.in);
            choice = input.nextInt();

            switch (choice){
                case 1:
                        newRandomList(list);
                        break;

                case 2:
                        Collections.sort(list);
                        break;
            
                case 3:
                        Collections.reverse(list);
                        break;

                case 4:
                        Collections.shuffle(list);
                        break;  
            }
        }while(choice!=0);
    }

    public static void newRandomList(LinkedList<Integer> list){
        list.clear();
        for(int i=0;i<10;i++){
            Random rand = new Random();
            list.add(rand.nextInt(99));
        }
    }
}
