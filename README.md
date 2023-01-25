# CSE_Algorithm_Lab - Searching Algorithm and Sorting Algorithm
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

#### Output: 
```
Enter the size of arrays 
4
Enter number 1 element of array: 
2
Enter number 2 element of array: 
4
Enter number 3 element of array: 
5
Enter number 4 element of array: 
11
Enter the number you want to search: 
5
5 Found at  Position :3
```
***
#### Example 2: A java code Linear Search Algorithm 

```
import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int a,b,c,search;
		System.out.println("Enter the size of arrays ");
		a=scan.nextInt();
	    if(a <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }
		int arr[]=new int[a];
		for (int i=0;i<a;i++)
		{
			System.out.println("Enter number "+(i+1)+" element of array: ");
			arr[i]=scan.nextInt();

		}
		System.out.println("Enter the number you want to search: ");
		search=scan.nextInt();
		for ( c = 0 ; c < a ; c++ )
		{
			if ( arr[c] == search )
			{
				System.out.println(search+" is present at location "+(c+1));
				break;
			}
		}
		if ( c == a )
			System.out.println(search+" is not present in array.");     


	}

}

```

#### Output: 
```
Enter the size of arrays 
2
Enter number 1 element of array: 
5
Enter number 2 element of array: 
4
Enter the number you want to search: 
2
2 is not present in array.

```
***
#### Example 3: A java code Merge Sort Algorithm 

```
import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {
        int i;

        System.out.println("Simple Merge Sort Example - Functions and Array\n");
        System.out.println("Enter the size of the array:");

        Scanner scanner = new Scanner(System.in);
        int MAX_SIZE = scanner.nextInt();
        int[] arr_sort = new int[MAX_SIZE];

        System.out.println("Enter " + MAX_SIZE + " Elements for Sorting");
        for (i = 0; i < MAX_SIZE; i++)
            arr_sort[i] = scanner.nextInt();

        System.out.println("\nYour Data   :");
        for (i = 0; i < MAX_SIZE; i++) {
            System.out.print("\t" + arr_sort[i]);
        }

        merge_sort(arr_sort, 0, MAX_SIZE - 1);

        System.out.println("\n\nSorted Data :");
        for (i = 0; i < MAX_SIZE; i++) {
            System.out.print("\t" + arr_sort[i]);
        }
    }

    private static void merge_sort(int[] arr_sort, int i, int j) {
        int m;

        if (i < j) {
            m = (i + j) / 2;
            merge_sort(arr_sort, i, m);
            merge_sort(arr_sort, m + 1, j);
            // Merging two arrays
            merge_array(arr_sort, i, m, m + 1, j);
        }
    }

    private static void merge_array(int[] arr_sort, int a, int b, int c, int d) {
        int[] t = new int[50];
        int i = a, j = c, k = 0;

        while (i <= b && j <= d) {
            if (arr_sort[i] < arr_sort[j])
                t[k++] = arr_sort[i++];
            else
                t[k++] = arr_sort[j++];
        }

        //collect remaining elements 
        while (i <= b)
            t[k++] = arr_sort[i++];

        while (j <= d)
            t[k++] = arr_sort[j++];

        for (i = a, j = 0; i <= d; i++, j++)
            arr_sort[i] = t[j];
    }
}

```

#### Output: 
```
Simple Merge Sort Example - Functions and Array

Enter the size of the array:
5
Enter 5 Elements for Sorting
2
10
4
6
8

Your Data   :
	2	10	4	6	8

Sorted Data :
	2	4	6	8	10
```
***
#### Example 4: A java code to Find nCr and nPr

```
import java.util.Scanner;

public class NCR_NPR {
    public static void main(String[] args) {
        int n, r;
        long npr, ncr;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        n = scanner.nextInt();
        System.out.print("Enter the value of r : ");
        r = scanner.nextInt();

        npr = fact(n) / fact(n - r);
        ncr = npr / fact(r);
        System.out.println("NPR value = " + npr);
        System.out.println("NCR value = " + ncr);
    }

    public static long fact(int x) {
        int i;
        long f = 1;
        for (i = 2; i <= x; i++) {
            f = f * i;
        }
        return f;
    }
}

```

#### Output: 
```
Enter the value of n : 5
Enter the value of r : 4
NPR value = 120
NCR value = 5
```
***
#### Example 5: A java code to generate all possible solutions for the N-Queens problem for a given value of N

```
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

```

#### Output: 
```
Enter Value of N:6
Solution Number: 1
2  4  6  1  3  5  
Solution Number: 2
3  6  2  5  1  4  
Solution Number: 3
4  1  5  2  6  3  
Solution Number: 4
5  3  1  6  4  2  

```
***
#### Example 6: A java code Insertion Sort Algorithm 

```
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        insertionSort(arr);
        System.out.print("Sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}

```

#### Output: 
```
Enter the size of the array:
4
Enter the elements of the array:
3
1
8
6
Sorted array: 1 3 6 8 
```
***
#### Example 7: A java code Linear Search Algorithm 

```
```

#### Output: 
```
```
***
#### Example 8: A java code Linear Search Algorithm 

```
```

#### Output: 
```
```
***
#### Example 9: A java code Linear Search Algorithm 

```
```

#### Output: 
```
```
***
#### Example 10: A java code Linear Search Algorithm 

```
```

#### Output: 
```
```
***
#### Example 11: A java code Linear Search Algorithm 

```
```

#### Output: 
```
```
