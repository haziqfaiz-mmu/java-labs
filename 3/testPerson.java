public class testPerson {
    public static void main(String[] args){

        Person Ali = new Person("Ali");
        Person Siti = new Person("Siti");
        
        System.out.println(Ali);
        System.out.println(Siti);

        //Ali.setName("Abu");
        Ali.setSpouse(Siti);
        Siti.setSpouse(Ali);

        System.out.println(Ali);
        System.out.println(Siti);

        Ali.setName("Abu");
        System.out.println(Ali);
        System.out.println(Siti);
    }
}
