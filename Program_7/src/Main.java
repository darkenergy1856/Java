import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File(args[0]));

            String line;

            while (input.hasNext()) {
                line = input.nextLine();
                if (line.startsWith("\\"))
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not Available.");
        }
    }
}
