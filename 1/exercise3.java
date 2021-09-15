import java.util.ArrayList;
import java.util.Scanner;

public class exercise3 {
    public static void main(String arg){
        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        System.out.print("Enter a word");
        String word = input.next();
        while(!word.equals("0")){
            words.add(word);
            word = input.next();
        }
        System.out.println("The distinct words are:");

    }

    public static void removeDuplicate(ArrayList<String> list){
        ArrayList<String> temp = new ArrayList<>();

        for(int i=0;i<list.size();i++){
            if(!temp.contains(list.get(i))){
                temp.add(list.get(i));
            }
        }
        list.clear();

        
    }
}

