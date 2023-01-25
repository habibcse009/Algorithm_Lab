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
#### Example 4: A java code Linear Search Algorithm 

```
```

#### Output: 
```
```
***
#### Example 5: A java code Linear Search Algorithm 

```
```

#### Output: 
```
```
***
#### Example 6: A java code Linear Search Algorithm 

```
```

#### Output: 
```
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
