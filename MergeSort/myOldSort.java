import java.io.*;
import java.util.*;
public class Sorts {

    static ArrayList<String> ary;
    
    public static String name() {
	return "Brook, Noah";
    }
    
    //~~~~~~~~~~~~~Copy~~~~~~~~~~~~~~~~~~~~~~~~~~   
    private static void copy(ArrayList<String> source,int sstart, ArrayList<String> dest, int dstart, int count) {
        for(int i = 0; i < count; i++) {
	    dest.add(i,source.get(i + sstart));
	    
        }
    }

    //~~~~~~~~~~~~MSort~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static void msort(ArrayList<String> L){ 
	if(L.size() < 2)
            return;
       
        //make 2 smaller arrays                                                                                                                   
	ArrayList<String> halfL = new ArrayList<String>(L.size() / 2);
        ArrayList<String> halfR = new ArrayList<String>(L.size() - L.size() / 2);

        //copy two halves to smaller arrays                                               
	copy(L, 0, halfL, 0, L.size() / 2);
	copy(L, L.size() / 2, halfR, 0, L.size() - L.size() /2);
       
       //sort the two halves                                                                         
       
	msort(halfL);
	msort(halfR);

        //merge the two halves and copy to L              
	System.out.println("L: " + L);//diag
	copy(merge(halfL,halfR), 0, L, 0, L.size());
	System.out.println("L AFTER: " + L); //diag

	ary = new ArrayList<String>();
	copy(L, 0, ary, 0, L.size());
    }   
	
    
    //~~~~~~~~~~~~~~~~~~MERGE~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static ArrayList<String> merge(ArrayList<String> a, ArrayList<String> b) {
	ArrayList<String> ans = new ArrayList<String>();
	
	String nextval = "";
	while ( !a.isEmpty() && !b.isEmpty()) {
	    if(a.get(0).compareTo(b.get(0)) > 0) {
		nextval = b.get(0);
		b.remove(0);
		ans.add(nextval);
	    }
	    else {
		nextval = a.get(0);
		a.remove(0);
		ans.add(nextval);
	    }
	}
	    //ans.add(nextval);
	//   ans.addAll(merge(a,b));
	
	while ( !a.isEmpty() ) {
	    ans.add(a.get(0));
	    a.remove(0);
	}
	
	while( !b.isEmpty() ) {
	    ans.add(b.get(0));
	    b.remove(0);
	}

	return ans;
    }
	
    //~~~~~~~~~~~~~~~toString~~~~~~~~~~~~~~~~~~
    public String toString() {
        return Arrays.toString(ary.toArray());
	}
    //~~~~~~~~~~~~~~~~~Main~~~~~~~~~~~~~~~~~~~~~
    public static void main(String args[]) {
	
	ArrayList<String> foo = new ArrayList<String>();
	ArrayList<String> moo = new ArrayList<String>();
	foo.add ("bubble"); 
	foo.add("dog");
	foo.add("jesus");

	foo.add("apple");
	foo.add("cup");
	foo.add("elephant");
	foo.add("fat");
	foo.add("kake");

	Sorts bob = new Sorts();

	//System.out.println ( bob.merge ( moo , foo ) );
	
	//System.out.println("ary" + ary);
	//System.out.println("foo" + foo);
	//whole thing driver
	bob.msort(foo);
	
	System.out.println("foo[bubble, dog, jesus, apple, cup, elephant, fat, kake] sorted is: \n \n " + bob);
	    
    }//end main
 
}//end class Sorts

