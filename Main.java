import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Generator generator = new Generator();
        boolean loop = true;

        while(loop) {
            System.out.print("Please enter an item: ");
            String item = stdin.readLine().trim();
            System.out.print("Please enter a weight for that item: ");
            int number = Integer.parseInt(stdin.readLine().trim());
            generator.add(number, item);
            System.out.print("Would you like to continue? (Y/N): ");
            if(!stdin.readLine().trim().equalsIgnoreCase("y")) {
                loop = false;
            }
        }

        System.out.println("The weighted generator resulted in: " + generator.generate());
    }
}
