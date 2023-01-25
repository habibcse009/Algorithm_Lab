import java.util.Scanner;

public class NQueen {
    public static int[] x = new int[10];
    public static int solutionNumber = 0;

    public static void printboard(int n) {
        int i;
        for (i = 1; i <= n; i++) {
            System.out.print(x[i] + "  ");
        }
        System.out.println();
    }

    public static void NQueen(int k, int n) {
        int i;
        for (i = 1; i <= n; i++) {
            if (place(k, i) == 1) {
                x[k] = i;
                if (k == n) {
                    solutionNumber++;
                    System.out.println("Solution Number: " + solutionNumber);
                    printboard(n);
                } else {
                    NQueen(k + 1, n);
                }
            }
        }
    }

    public static int place(int k, int i) {
        int j;
        for (j = 1; j < k; j++) {
            if ((x[j] == i) || Math.abs(x[j] - i) == Math.abs(j - k)) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Value of N:");
        n = scanner.nextInt();
        if(n<4){
          System.out.println("Invalid input, n should be greater or equal than 4");
        }
        else{
          NQueen(1, n);
        }
    }
}
