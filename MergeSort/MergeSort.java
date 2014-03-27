import java.util.*;
public class MergeSort {

    int[] ary;

    public void msort(int[]a) {
	if(a.length < 2) 
	    return;
	int[]halfL, halfR;

	//make 2 smaller arrays
	halfL = new int[a.length / 2];
	halfR = new int[a.length - halfL.length];

	//copy two halves to smaller arrays
	copy(a, 0, halfL, 0,  halfL.length);
	copy(a, halfL.length, halfR, 0, halfR.length);
	
	//sort the two halves
	msort(halfL);
	msort(halfR);

	//merge the two halves
	//copy res of merging to a
	copy(merge(halfL, halfR), 0, a, 0, a.length);

	ary = new int[a.length]; 
	copy(a, 0, ary, 0, a.length);
    }

    private void copy(int[] source, int sstart, int[]dest, int dstart, int count) {
	for(int i = 0; i < count; i ++) {
	    dest[dstart + i] = source[sstart + i];
	}
    }

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

    public String toString() {
	return Arrays.toString(ary); 
    }
    
    //~~~~~~~~~~~~~~~~~~~~~~~~MAIN METHOD~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static void main(String args[]) {
	
	int[]a = new int [50];
	for(int i = 0; i < a.length; i++) {
	    a[i] = (int) (Math.random() * 100);
	}

	MergeSort m = new MergeSort();

       
	System.out.println("\n Mergesor I choose you!... \n \n" + Arrays.toString(a) + "\n \n merge sorted is: \n");

	m.msort(a);

	System.out.println( m + "\n");
	    
    }
}//end class MergeSort