# CSE_Algorithm_Lab - Binary Search, Linear Search and many more searching algorithim
Java codes for Lab Classes of Computer Science &amp; Engineering's Courses<br>
#### Example 1: A java code Binary Search Algorithm 

```
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b = 0, c = 0, f = 0, search, mid;

        System.out.println("Enter the size of arrays ");
        a = scan.nextInt();

        if(a <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Enter number " + (i + 1) + " element of array: ");
            arr[i] = scan.nextInt();
        }

        // check if array is sorted
        for (int i = 0; i < a - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Array is not sorted. Binary search cannot be performed.");
                return;
            }
        }

        System.out.println("Enter the number you want to search: ");
        search = scan.nextInt();

        while (f <= a) {
            mid = (f + a) / 2;

            if (arr[mid] == search) {
                System.out.println(+search + " Found at  Position :" + (mid + 1));
                break;
            } else if (arr[mid] < search)
                f = mid + 1;
            else
                a = mid - 1;
        }

        if (f > a)
            System.out.println("Search Element :" + search + " : Not Found \n");
    }
}

```
