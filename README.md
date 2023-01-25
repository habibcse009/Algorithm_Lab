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
#### Example 7: A Java program that compares the performance of two algorithms using Big O notation
Asymptotic notation is used to describe the behavior of an algorithm as the input size increases. The three most common asymptotic notations are Big O notation, Big Ω notation and Big Θ notation.

```
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

```

#### Output: 
```
Enter the value of n:
500
Algorithm 1> Factorial Calculation (O(n)): 
Start Time: 363563512005400 ns, 
End Time: 363563514270800 ns
Notation (O(n)): 2265400 ns
----------------------------------------
Algorithm 2> Bubble Sort (O(n^2)): 
Start Time: 363563514460300 ns, 
End Time: 363563516544200 ns
Notation (O(n^2)): 2083900 ns

```
***
#### Example 8: A java code program that implements the Floyd-Warshall algorithm to find the shortest paths between all pairs of vertices in a weighted, directed graph

```
import java.util.Scanner;

public class FloydWarshall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int n = scanner.nextInt();
        System.out.println("Enter the number of edges:");
        int e = scanner.nextInt();
        int[][] p = new int[10][10];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                p[i][j] = 999;
            }
        }

        for (int i = 1; i <= e; i++) {
            System.out.println("Enter the end vertices of edge" + i + " with its weight");
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            p[u][v] = w;
        }

        System.out.println("Matrix of input data:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(p[i][j] + "\t");
            }
            System.out.println();
        }

        floyds(p, n);

        System.out.println("Transitive closure:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(p[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("The shortest paths are:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i != j) {
                    System.out.println("<" + i + "," + j + ">=" + p[i][j]);
                }
            }
        }
    }

    public static void floyds(int[][] p, int n) {
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == j) {
                        p[i][j] = 0;
                    } else {
                        p[i][j] = Math.min(p[i][j], p[i][k] + p[k][j]);
                    }
                }
            }
        }
    }
}

```

#### Output: 
```
Enter the number of vertices:
3
Enter the number of edges:
4
Enter the end vertices of edge1 with its weight
5
4
5
Enter the end vertices of edge2 with its weight
2
3
4
Enter the end vertices of edge3 with its weight
5
5
6
Enter the end vertices of edge4 with its weight
4
5
6
Matrix of input data:
999	999	999	
999	999	4	
999	999	999	
Transitive closure:
0	999	999	
999	0	4	
999	999	0	
The shortest paths are:
<1,2>=999
<1,3>=999
<2,1>=999
<2,3>=4
<3,1>=999
<3,2>=999

```
![OgxYZ1fX2o-floyd-warshall-problem2](https://user-images.githubusercontent.com/27882232/214528496-a5622985-a45d-419d-8ab3-8a518da9b71e.png)

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
