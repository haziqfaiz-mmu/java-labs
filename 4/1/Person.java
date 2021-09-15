public class Person{
    protected String name;

    Person(){}

    Person(String name){
        this.name = name;
    }

    public String toString(){
        return "Name = "+ this.name;
    }
}

