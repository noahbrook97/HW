import java.util.*;

public class Sorts{

    public static String name(){
	return "Brook,Noah";
    }
    //~~~~~~~~~~~~MSort~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~                                                      
    public static <T extends Comparable<T>> void msort(ArrayList<T> L){
        if(L.size() > 1){

            //make 2 smaller arrays                                                              
            ArrayList<T> halfL = new ArrayList<T>();
            for(int i = 0; i < L.size() / 2; i++) {
                halfL.add(L.get(i));
            }
            ArrayList<T> halfR = new ArrayList<T>();
            for(int i = L.size() / 2; i < L.size(); i++){
                halfR.add(L.get(i));
            }

            //sort the two halves                                                                    
            msort(halfL);
            msort(halfR);
            ArrayList<T> ans = merge(halfL, halfR);

            //merge the two halves and copy to L                                                                 
	    for(int i = 0; i < ans.size(); i++){
                L.set(i, ans.get(i));
            }}}

    //~~~~~~~~~~~~~~~~~~MERGE~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~                                          
    public static <T extends Comparable<T>> ArrayList<T> merge(ArrayList<T> a, ArrayList<T> b) {

        ArrayList<T> ans = new ArrayList<T>();

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

}//end class Sorts



    
