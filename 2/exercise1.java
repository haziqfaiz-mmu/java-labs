public class exercise1{
    public static void main(String[] args){
        System.out.println("The number of rectangles = "+ Rectangle.acessorNumber());

        Rectangle rect1 = new Rectangle();

        rect1.setter(-4.0,-7.0);

        System.out.println("Width = "+rect1.acessorWidth());
        System.out.println("Height = "+rect1.acessorHeight());
        System.out.println("Area = "+rect1.getArea());

        rect1.setter(4.0,7.0);

        System.out.println("Width = "+rect1.acessorWidth());
        System.out.println("Height = "+rect1.acessorHeight());
        System.out.println("Area = "+rect1.getArea());

        Rectangle[] rectArray= new Rectangle[5];

        System.out.println("The number of rectangles = "+ Rectangle.acessorNumber());
    }
}

class Rectangle{
    private double width;
    private double height;

    private static int numberOfRectangles =0;

    Rectangle(){
        this.height=1;
        this.width=1;
        numberOfRectangles++;
        System.out.println("Rectangle number "+numberOfRectangles+" is created");
    }

    Rectangle(double width, double height){
        this.height = height;
        this.width = width;
        numberOfRectangles++;
        System.out.println("Rectangle number "+numberOfRectangles+" is created");
    }

    public double acessorHeight(){
        return this.height;
    }

    public double acessorWidth(){
        return this.width;
    }

    public static double acessorNumber(){
        return numberOfRectangles;
    }

    public double getArea(){
        return height*width;
    }

    public void setter(double width, double height){
        if(width<=0||height<=0){
            //throw new IllegalArgumentException("Measurement must be bigger than 0");
            System.out.println("Git gud scrub");
        }

        else{
            this.width=width;
            this.height=height;
        }
    }   
}
