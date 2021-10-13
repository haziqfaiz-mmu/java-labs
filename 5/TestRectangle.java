import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class TestRectangle {
    public static void main (String[] args) {
        ArrayList<Rectangle> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        double width, height;
        
        

        for(int j=0;j<3;j++){
            String s1 ="j";
            String s2 ="l";

            if(s1 !=s2){System.out.print("fakkkkkkkkkkkk");}

            try{
                System.out.print ("Enter width & height of Rectangle "+(j+1)+" : ");
                width = input.nextDouble();  
                height = input.nextDouble();
                list.add (new Rectangle(width, height));
                }
                catch(InputMismatchException e){
                    System.out.println("Please enter an integer");
                    input.nextLine();
                    list.add(new Rectangle());
                }
                catch(IllegalArgumentException e){
                    System.out.println("2 positive numbers are required");
                    System.out.println(e.getMessage());;
                    //throw new IllegalArgumentException();
                    list.add(new Rectangle());
                }
        }
        
                
    System.out.println ("Area of rectangles:");
    
    for (int i = 0; i < list.size(); i++)
            System.out.println ("Rectangle "+ (i+1) + " " + list.get(i).getArea());
}
}