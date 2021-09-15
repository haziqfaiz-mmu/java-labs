public class Main {

    public static void main(String[] args){

        Staff[] array = { new Technician ("Ali", 2000, 1200),new Manager ("Siti", 4000, 800),new Technician ("Zul", 2000, 0),new Technician ("Abu", 2500, 1000)};
        java.util.Arrays.sort (array);
        for (Staff s: array)
            System.out.println (s);
    }
}
