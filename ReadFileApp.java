import java.io.File;
import java.util.Scanner;

/**
 * Joao Pedro Petkov e Luiza Tropea Scaglia
 * 22180442 e 22104919
 */
public class ReadFileApp
{
    public static void readFromFile() {
        File f = new File("matriz.txt");
        try(Scanner in = new Scanner(f)) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.printf("%d + %d = %d\n", a, b, a + b);
        } catch (Exception e) {
        }

    }

    public static void main(String[] args) {
        readFromFile();

    }

}
