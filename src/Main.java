import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        acrostic("Quiz5.txt");
    }

    public static void acrostic(String file) throws Exception {
        Scanner input = new Scanner(new File(file));
        PrintWriter output = new PrintWriter("myFile.txt");
        String result = "";
        while (input.hasNext())
            result += input.nextLine().charAt(0);
        output.print(result);
        output.close();
    }
}