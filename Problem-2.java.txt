// Problem-2.java
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        for (int i = 1; i <= a * 2; i += 2) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
