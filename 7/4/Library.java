import java.util.ArrayList;

public class Library {

    private ArrayList medias = new ArrayList();

    public void add (Object m) {
        medias.add (m);
    }

    public Object retrieveLast() {
        int size = medias.size();
        if (size == 0) return null;
        else return medias.get (size -1); 
    }
}

abstract class Media {

    protected String title;

    public Media(String title) {
        this.title=title;
        }
    
    public abstract String toString();
}
   
class Book{

    protected String isbn;

    public Book(String title, String isbn){}

    public String toString(){

        return "qwq";
    }
}