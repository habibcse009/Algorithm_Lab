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
