public class point{
    private int x,y;

public point(){
    this.x=0;
    this.y=0;
}

public point(int x, int y){
    this.x=x;
    this.y=y;
}

public double distance (point p){
    int dx = this.x - p.x;
    int dy = this.x- p.y;
    return Math.sqrt(dx*dx + dy*dy);
} 

/**Every java object has a toString method that is defined in the Object superclass
of all Java objects. So System.out.print(obj) is same as obj.toString()**/
public String toString (){
    return x + ","+ y;
}

}

 