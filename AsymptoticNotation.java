import java.math.BigInteger;
import java.util.Scanner;

public class AsymptoticNotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        long startTime, endTime;

        startTime = System.nanoTime();
        algorithm1(n);
        endTime = System.nanoTime();
        System.out.println("Algorithm 1> Factorial Calculation (O(n)): \n" + "Start Time: " + startTime + " ns, \nEnd Time: " + endTime + " ns");
        System.out.println("Notation (O(n)): " + (endTime - startTime) + " ns\n----------------------------------------");
        startTime = System.nanoTime();
        algorithm2(n);
        endTime = System.nanoTime();
        System.out.println("Algorithm 2> Bubble Sort (O(n^2)): \n" + "Start Time: " + startTime + " ns, \nEnd Time: " + endTime + " ns");
        System.out.println("Notation (O(n^2)): " + (endTime - startTime) + " ns");
    }

    public static void algorithm1(int n) {
        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
    }

    public static void algorithm2(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
