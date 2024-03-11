import java.util.Scanner;
import java.io.PrintWriter;
public class TwoDArray {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            PrintWriter writer = new PrintWriter(System.out); 
            int rows = sc.nextInt();
            int columns = sc.nextInt();

            System.out.println("Enter the elements: ");
            int[][] array = new int[rows][columns];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    array[i][j] = sc.nextInt();
                }
            }
    
            System.out.println("The 2D array is: ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    writer.write(array[i][j] + " ");
                    writer.flush();
                }
                System.out.println();
            }
    }
    
}
