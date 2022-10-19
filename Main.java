import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int line = sc.nextInt();
        int columns = sc.nextInt();

        int[][] matrix = new int[line][columns];

        sc.nextLine();
        for(int i = 0; i < line; i++) {
            for(int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == m) {
                    System.out.print("Position ");
                    System.out.println(i + "," + j +":");
                    if(j != 0) {
                        System.out.println("Left: " + matrix[i][j - 1]);
                    }
                    if(j != matrix.length) {
                        System.out.println("Right: " + matrix[i][j + 1]);
                    }
                    if(i != 0) {
                        System.out.println("Up: " + matrix[i - 1][j]);
                    }
                    if(i != matrix[i].length) {
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}