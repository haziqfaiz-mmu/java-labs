import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class TestRectangle {
    public static void main (String[] args) {
        ArrayList<Rectangle> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        double width, height;
        
        System.out.print ("Enter width & height: ");

        try{
            width = input.nextDouble();  
            height = input.nextDouble();
            list.add (new Rectangle(width, height));
            }
            catch(InputMismatchException e){
                System.out.println("2 positive numbers are required");
            }
                
    System.out.println ("Area of rectangles:");
    
    for (int i = 0; i < list.size(); i++)
            System.out.println (i + " " + list.get(i).getArea());
}
}