import java.util.Scanner;

public class exercise1{
    public static void main(String[] args){
        String number;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter phone number: ");
        number = scan.next();
        System.out.println();

        for(int i=0;i<number.length();i++){
           char current_char = number.charAt(i);
            if(Character.isLetter(current_char)){
                int number1 = getNumber(current_char);
                System.out.print(number1);
            }
            else{
                System.out.print(current_char);
            }
        }

        System.out.print(number);
    }

    public static int getNumber(char letter){
        switch (Character.toLowerCase(letter)){
            case 'a':
            case 'b':
            case 'c':return 2;
            case 'd':
            case 'e':
            case 'f':return 3;
            case 'g':
            case 'h':
            case 'i':return 4;
            case 'j':
            case 'k':
            case 'l':return 5;
            case 'm':
            case 'n':
            case 'o':return 6;
            case 'p':
            case 'q':
            case 'r':
            case 's':return 7;
            case 't':
            case 'u':
            case 'v':return 8;
            case 'w':
            case 'x':
            case 'y':
            case 'z':return 9;

        }
        return 0;
    }
}