//Write	a	program	that	copies	content	of	one	file	to	another.	Pass	the	names	of	the	files
//through	command-line	arguments.


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String fileName_1 = args[0];
        String fileName_2 = args[1];

        File primaryFile = new File(fileName_1);

        try {
            FileWriter secondaryFile = new FileWriter(fileName_2);
            try {
                Scanner read = new Scanner(primaryFile);
                while (read.hasNextLine()) {
                    String line = read.nextLine();
                    secondaryFile.write(line);
                    secondaryFile.write("\n");
                }
                read.close();
                System.out.println("Operation Completed Successfully . All content of file "+fileName_1+" was copied to "+fileName_2+".");
            } catch (Exception e) {
                System.out.println("Entered Source file name was not Found.");
            }
            secondaryFile.close();
        } catch (IOException e) {
            System.out.println("Unable to create new file with specified name ");
        }

    }
}