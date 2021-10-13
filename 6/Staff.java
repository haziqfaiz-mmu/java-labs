public abstract class Staff implements Comparable<Staff>{

    private String name;
    private double salary;

    public Staff(){}
    public Staff(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }

    public abstract double getPaid();

    public abstract String toString();

    public int compareTo(Staff obj){

        return (int)(this.salary-obj.getSalary());
    }


}