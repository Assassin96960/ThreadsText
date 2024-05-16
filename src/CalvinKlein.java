import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class CalvinKlein extends Thread  {
    public void run(PriorityQueue<Cloth> clothes)  {


        File file = new File("src/calvinKlein");

        // Create a Scanner for the file
        Scanner input = null;
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Read data from a file
        while (input.hasNext()) {
            String name = input.next();
            String type = input.next();
            double price = input.nextDouble();
            Cloth cloth = new Cloth(name, type, price);
            clothes.add(cloth);
        }


        // Close the file

        //StringBuilder
        input.close();
//            for (int i=0;i<pQueue.size();i++)
//            {
//                Cloth cloth =pQueue.poll();
//                System.out.println(cloth.name+" "+cloth.price);
//            }
    }


}

