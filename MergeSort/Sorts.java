import java.io.*;
import java.util.*;
public class Sorts {
    
    public static String name() {
	return "Brook, Noah";
    }
    
    //~~~~~~~~~~~~MSort~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static void msort(ArrayList<String> L){ 
	if(L.size() > 1){
	
	    //make 2 smaller arrays
	    ArrayList<String> halfL = new ArrayList<String>();
            for(int i = 0; i < L.size() / 2; i++) {
                halfL.add(L.get(i));
            }
            ArrayList<String> halfR = new ArrayList<String>();
            for(int i = L.size() / 2; i < L.size(); i++){
		halfR.add(L.get(i));
            }

	    //sort the two halves                                                                         
	    msort(halfL);
	    msort(halfR);
	    ArrayList<String> ans = merge(halfL, halfR);

	    //merge the two halves and copy to L              
	    for(int i = 0; i < ans.size(); i++){
		L.set(i, ans.get(i));
            }}}
	
    //~~~~~~~~~~~~~~~~~~MERGE~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static ArrayList<String> merge(ArrayList<String> a, ArrayList<String> b) {

	ArrayList<String> ans = new ArrayList<String>();
       
	int size = a.size() + b.size();
	for (int i = 0; i < size; i++){
	  
	    if(!a.isEmpty() && !b.isEmpty()){
		if(a.get(0).compareTo(b.get(0)) > 0) {
		    ans.add(b.remove(0));
		}   
		
		else if (a.get(0).compareTo(b.get(0)) <= 0){
		    ans.add(a.remove(0));
		}} 
	    
	    else if(b.isEmpty() && !a.isEmpty()) {
		ans.add(a.remove(0));
	    }
	        
	    else if(a.isEmpty() && !b.isEmpty()) {
		ans.add(b.remove(0));
	    }}
	return ans;
    }

    //~~~~~~~~~~~~~~~~~Main~~~~~~~~~~~~~~~~~~~~~
    public static void main(String args[]) {
	
	ArrayList<String> foo = new ArrayList<String>();
	ArrayList<String> moo = new ArrayList<String>();
	foo.add("bubble"); 
	foo.add("dog");
	foo.add("jesus");
	foo.add("apple");
	foo.add("cup");
	foo.add("elephant");
	foo.add("fat");
	foo.add("kake");
	
	msort(foo);
	
        System.out.println("\n foo[bubble, dog, jesus, apple, cup, elephant, fat, kake] \n \n" + "Sorted is: \n \n" + foo + "\n");
    
    }//end main
}//end clas Sorts
    