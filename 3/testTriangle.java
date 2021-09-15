import java.util.ArrayList;
import java.util.Scanner;
public class testTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<point> points = new ArrayList<>();
        int x,y,index1, index2,index3;

        do{
            System.out.println("Enter a and y (negative to exit");
            x = input.nextInt();
            if(x<0) break;
            y = input.nextInt();
            if(y<0) break;
        }while (true);

        for(int i=0;i<points.size();i++){
            System.out.println(points.get(i));
        }

        ArrayList<triangle> triangles = new ArrayList<>();

        do{
            System.out.println("Select 3 indexes to form a triangle");
            index1 = input.nextInt();
            if(index1<0) break;
            index2 = input.nextInt();
            if(index2<0) break;
            index3 = input.nextInt();
            if(index3<0) break;

            triangles.add(new triangle(points.get(index1), points.get(index2), points.get(index3)));
        }while (true);

        for(int i=0;i<points.size();i++){
            System.out.println(i +" "+ triangles.get(i));
        }

        
    }
}
