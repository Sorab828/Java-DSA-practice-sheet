import java.util.*;

public class HollowHourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("*".repeat(2 * n));

        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("*".repeat(2 * n));

        
    }
}