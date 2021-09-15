public class Student extends Person {
    private int ID;

    public int getID(){
        return ID;
    }

    @Override
    public String toString(){
        return "Name = "+ this.getName() +" ID = " + this.getID();
    }
    
}