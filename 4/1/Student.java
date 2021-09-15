public class Student extends Person {
    protected int ID;

    Student(){}

    Student(String name, int ID){
        super(name);
        this.ID=ID;
    }

    @Override
    public String toString(){
        return getClass().getName()+"Name = "+ this.name +" ID = " + this.ID;
    }
    
}