import java.util.Scanner;
class testPoint{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x,y;

        System.out.println("Enter x and y for p1:");
        x = input.nextInt();
        y = input.nextInt();
        point p1 = new point(x,y);
        System.out.println(p1);

        System.out.println("Enter x and y for p2:");
        x = input.nextInt();
        y = input.nextInt();
        point p2 = new point(x,y);
        System.out.println(p2);

        System.out.println("The distance is");
        System.out.println(p1.distance(p2));

    }
}