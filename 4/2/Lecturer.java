public class Lecturer extends Staff{
    private String subject;

    public String getSubject(){
        return subject;
    }

    @Override
    public String toString(){
        return "Name = "+ this.getName() +" Salary = " + this.getSalary() + " Subject = "+this.getSubject();
    }
    
}
