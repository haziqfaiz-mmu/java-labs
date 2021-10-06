import java.util.Scanner;
import java.util.Stack;

public class Exercise3Lecturer {

    public static void main(String[] args){

        //Create 3 towers
        Stack<Integer>[] towers = new Stack[3];
        for(int i=0;i<towers.length;i++){
            towers[i] = new Stack<>();
        }
        //Add disk to towers[0]
        for(int disk=4;disk>0;disk--){
            towers[0].push(disk);
        }

        Scanner input = new Scanner(System.in);
        int source,dest;
        do{
            for(int i=0;i<towers.length;i++){
                System.out.println(("Tower "+i+" :"+ towers[i].toString()));
            }
    
            System.out.println("Enter source tower and destination");
            source = input.nextInt();
            if(source == -1) break;

            dest = input.nextInt();
            if(dest == -1) break;

            int topDisk = towers[source].pop();
            towers[dest].push(topDisk);
        }while(true);

        
    }
    
}
