import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class HelloWorld {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Hello World!");
        System.out.println("Hi");
        System.out.println("test");

        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Hello " + name);

        File f = new File("Class.txt");
        
        s.close();
        s = new Scanner(f);
        
        String course = s.nextLine();

        System.out.println("Welcome to " + course + "!");
    


        s.close();


    }
}