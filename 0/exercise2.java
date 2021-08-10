import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class exercise2 {
    
    public static void main(String args[]){
    ArrayList<String> words = new ArrayList<String>();
    String word;
    Scanner scan = new Scanner(System.in);

    do{
        System.out.print("Enter a word (0 to end): ");
        word = scan.nextLine();
        if (word.equals("0")) break;
        words.add(word);

    }while (!word.equals("0"));

    System.out.println();
    System.out.println("You entered: ");
    
    for(int j =0;j<words.size();j++){
        System.out.println(words.get(j));
    }
    //Print ArrayList in one line
    System.out.println(words);
    System.out.println();

    Boolean ascending = true;
    Boolean duplicate = false;
    
    for(int j =0;j<words.size()-1;j++){
        if ((words.get(j).compareTo(words.get(j+1)))>0){
            ascending = false;
        }
    
        for(int k =j+1;k<words.size();k++){
            if (words.get(j).compareTo(words.get(k))==0){
                //if (words.get(j).equals(words.get(k))){
                duplicate = true;
                };
            }
        }
    if(ascending) System.out.println("In ascending order");
    else System.out.println("Not in ascending order");

    if(duplicate) System.out.println("Has duplicates");
    else System.out.println("No duplicates");

    }
}
