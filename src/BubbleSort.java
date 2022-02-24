import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		int n, c, d, temp;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		n = obj.nextInt();
		int array[] = new int[n];
		System.out.println("Enter the array of integers:");
		for (c = 0; c < n; c++) 
		      array[c] = obj.nextInt();
		for (c = 0; c < ( n - 1 ); c++) {
			for (d = 0; d < n - c - 1; d++) {
				if (array[d] > array[d+1]){
					temp       = array[d];
					array[d]   = array[d+1];
					array[d+1] = temp;
				}
			}
		}
		System.out.println("Sorted array:");
		for (c = 0; c < n; c++) 
		      System.out.println(array[c]);
	}

}
