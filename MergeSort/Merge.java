import java.util.*;
public class Merge {
    
    public int[] merge (int[] a, int [] b) {
	int[] merge = new int[a.length + b.length];	
	int i = 0; 
	int j = 0;
	int index = 0;

	while(index  < merge.length) {
	    if(i >= a.length) {
		merge[index] = b[j];
		j++;
	    }  
	    else if(j >= b.length) {
		merge[index] = a[i];
		i++;
	    }
	    else if (a[i] < b[j]) {
		merge[index] = a[i];
		i++;
	    }
	    else {
		merge[index] = b[j];
		j++;
	    }
	    index = index + 1;
	}
	return merge;
    }
    

    public static void main(String args[]) {

	Merge foo = new Merge();

	int[]a = {0,1,2,4,12,13};
	int[]b = {2,3,5,7,8}; 

	System.out.println("\n array a is: " + Arrays.toString(a) + "\t array b is: " + Arrays.toString(b));

	System.out.println(" \n Merging arrays... ");
	System.out.println ( Arrays.toString ( foo.merge ( a , b ) ) );
		       
    }//end main
}//end Merge

