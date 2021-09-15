public class personPoly {
    public static void main(String[] args){
        m(new Person());
        m(new Student());
        m(new Staff());
        m(new Lecturer());
    }

    public static void m(Person x){
        System.out.println(x);
    }
    
}
