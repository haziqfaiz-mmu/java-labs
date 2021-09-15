public class Manager extends Staff{

    protected double allowance;

    Manager(){
        super();
    }
    
    Manager(String name, double salary, double allowance){
        super(name, salary);
        this.allowance = allowance;
    }

    @Override
    public double getPaid(){
        return this.allowance + getSalary();
    }

    @Override
    public String toString(){
        return getName()+" "+String.valueOf(getSalary()) +" "+String.valueOf(getPaid()) ;
    }

    
    public int compareTo(Manager obj){

        if (this.getPaid()>obj.getPaid()) {return 1;}
        if (this.getPaid()<obj.getPaid()) {return -1;}
        else return 0;

    }
}
