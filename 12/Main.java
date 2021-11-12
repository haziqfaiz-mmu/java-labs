import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Integer choice =100, element;
        BST<Integer> bst = new BST<>();

        while(choice!=0){

            bst.inorder();
            bst.preorder();
            bst.postorder();
            
            System.out.println("1. Insert specified integer");
            System.out.println("2. Search specified integer");
            System.out.println("0. Exit");
            System.out.print("Command > ");

            choice = input.nextInt();
            element = input.nextInt();

            switch(choice){
                case 1: bst.insert(element);
                        break;
                case 2: bst.search(element);
                        break;
                case 0: return;
            }


        }
    }
}