import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;
import java.util.Scanner;

public class WebpageLineCounter {
    public static void main(String[] args) {
        System.out.print("Enter a URL: ");
        Scanner input = new Scanner(System.in);
        String URLString = input.next();
        try{
        int count = countWebpageLine (URLString);
        
        System.out.println("The webpage has " + count + " lines of codes.");
        }
        catch(MalformedURLException e){
            System.out.println("Error: The URL must have a valid protocol like https");
        }
        catch(IOException e){
            System.out.println("Error: URL does not exist");
        }
        
    }

    public static int countWebpageLine (String URLString) 
            throws IOException, MalformedURLException{
        URL url = new URL (URLString);
        int count = 0;
        Scanner input = new Scanner(url.openStream());
        while (input.hasNext()) {
            String line = input.nextLine();
            count++;
        }

        return count;
    }
}