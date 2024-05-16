import java.io.File;
import java.io.PrintWriter;
import java.util.PriorityQueue;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Guess guess = new Guess();
        PriorityQueue<Cloth> clothes = new PriorityQueue<Cloth>();
        guess.run(clothes);
        CalvinKlein calvinKlein= new CalvinKlein();
        Trussardi trussardi=new Trussardi();
        calvinKlein.run(clothes);
        trussardi.run(clothes);
        File file = new File("cheapest.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }
        // Create a file
        PrintWriter output = new PrintWriter(file);

        // Write formatted output to the file

        for(int i=0;i<10;i++)
        {
            Cloth cloth= clothes.poll();
            output.println(cloth.cloth+" "+cloth.name+" "+cloth.price);
            // Close the file
        }
        output.close();
    }
}