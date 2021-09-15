public class Staff extends Person{
    private double salary;

    public double getSalary(){
        return salary;
    }

    @Override
    public String toString(){
        return "Name = "+ this.getName() +" Salary = " + this.getSalary();
    }
}
