public class Hello {
    public static void main(String[] args){
        try{
            p();
            System.out.println("Afte");
        }
        catch(NumberFormatException ex){
            System.out.println("Number");
        }
        catch(RuntimeException ex){
            System.out.println("Runtime");
        }
    }

    static void p(){
        String s = "5.6";
        Integer.parseInt(s);

        int i=0;
        int y=2/i;
        System.out.println("Welcome");
    }
    
}


