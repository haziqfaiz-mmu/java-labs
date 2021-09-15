public class Technician extends Staff {

    protected double overtimePay;

    Technician(){
        super();
    }
    
    Technician(String name, double salary, double overtimePay){
        super(name, salary);
        this.overtimePay = overtimePay;
    }

    @Override
    public double getPaid(){
        return this.overtimePay + getSalary();
    }

    @Override
    public String toString(){
        return getName()+" "+String.valueOf(getSalary()) +" "+String.valueOf(getPaid()) ;
    }

    public int compareTo(Technician obj){

        if (this.getPaid()>obj.getPaid()) {return 1;}
        if (this.getPaid()<obj.getPaid()) {return -1;}
        else return 0;

    }
    
}
