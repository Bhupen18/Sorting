import java.util.*;
public class NewSort {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("--New Sorting Algorithm--");
		System.out.println("Enter the size of array:");
		int n = obj.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array of integers:");
		for (int c = 0; c < n; c++) 
		      arr[c] = obj.nextInt();
		int pos;
        int temp;
        for (int i = 0; i < n; i++) 
        { 
            pos = i; 
            for (int j = i+1; j < n; j++) 
           {
                if (arr[j] < arr[pos])               
                {
                    pos = j;
                }
            }

            temp = arr[pos];       
            arr[pos] = arr[i]; 
            arr[i] = temp; 
        } 
        System.out.println("Sorted array:");
        for (int i=0; i<n; i++) 
        {
            System.out.print(arr[i]+" ");
        }

	}

}
