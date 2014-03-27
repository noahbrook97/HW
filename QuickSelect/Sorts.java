import java.util.*; 
import java.io.*;
public class Sorts {
    

    //~~~~~~~~QUICKSORT~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public static void quicksort(int[] L) {
	quicksort( L, 0, L.length - 1 );
    }

    public static void quicksort ( int[] L, int left, int right) {
	//If the size of L is 1 no need to Sort
	if (right - left < 1)
	    return;
	//else partition array
	int i = partition(L, left, right);
	quicksort(L, left, i - 1);
	quicksort(L, left + 1, right);
    }

    //~~~~~~~~PARTITION~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      //select a pivot
      //partitions array
      //returns index of the pivot 
      public static int partition(int[] L, int left, int right) {
	int start = left; 
	int end = right;
	int pivotIndex = (int) (Math.random() * (right - left + 1) + left); 
	int pivot = L[ pivotIndex ];
	
	//move the pivot to the end and set the index to the last one
	swap(L, pivotIndex, right);
	pivotIndex = right;
	end--;

	//continue comparing until we've gone through everything to the left of the pivot
	while(start <= end) {
	    //if they're equal, do nothing but check next value
	    if(L[start] == pivot) 
		start++;
	    //if value is greater than pivot, swap start and end and move right value down one
	    else if(L[start] > pivot) {         
		swap(L, start, end);
		end--;
	    }
	    //if value is less than pivot, swap it with left value and move left vaule up one
	    else if (L[start] < pivot) {   
		swap(L, start, left);
		left++;
		start++;
	    }
	}
	//start is where pivot should be
	swap(L, start, pivotIndex);
	return start;
      }

    //~~~~~~~~~SWAP~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static void swap(int[] L, int a, int b) {
	int temp = L[a];
	L[a] = L[b];
	L[b] = temp;
    }

    //~~~~~~~~~~~~MAIN METHOD~~~~~~~~~~~~~~~~~~~~    
    public static void main(String[] args) {
	
	Sorts foo = new Sorts();
	

	int[] a = new int[100];
	
	//randomly fills array of length 100 with random integers [0, 1000)
	for (int i = 0; i < a.length; i++) {
	    a[i] = (int)(Math.random() * 100);
	} 

	System.out.println("A before quicksorting is: \n \n" + Arrays.toString(a));
	
	quicksort(a);
	
	System.out.println("\n A after quicksorting is : \n \n" + Arrays.toString(a));
	
    }//end main

}//end class Sorts