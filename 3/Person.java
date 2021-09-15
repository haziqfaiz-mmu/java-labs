public class Person{
    private String name;
    private Person spouse;

    public Person(){}

    public Person (String name){
        this.name = name;
        //this.spouse = new Person("none");
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSpouse(Person spouse){
        this.spouse = spouse;
    }
    public String toString(){
        if(this.spouse == null){
            return "Name = " + this.name +", spouse = none";
        }
        else
        return "Name = " + this.name +", spouse = "+ spouse.name ;
    }

}