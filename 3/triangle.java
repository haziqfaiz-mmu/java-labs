public class triangle {
    private point[] points = new point[3];
    private double perimeter;

    public triangle(){
        for(int i=0; i<points.length;i++){
            points[i] = new point();
        }
    }
    public triangle(point p1, point p2, point p3){
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
        calcPerimeter();
    }
    private void calcPerimeter(){
        perimeter = this.points[0].distance(points[1]) + this.points[0].distance(points[2]) + this.points[1].distance(points[2])
    }
    public String toString(){
        return "Points:" + points[0]+","+ points[1]+","+ points[2]+". Perimeter = "+ perimeter;
    }
}
