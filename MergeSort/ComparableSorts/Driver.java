import java.util.*;
public class Driver{
    public static void main(String[]args){
	System.out.println(Sorts.name());
	ArrayList<String>A1= new ArrayList<String>();
	ArrayList<String>A2= new ArrayList<String>();
	ArrayList<String>B1= new ArrayList<String>();
	ArrayList<String>B2= new ArrayList<String>();
	for(int i=0;i<10000;i++){
	    String value=""+(10000-i);
	    String value2=""+(i);
	    A1.add(value);
	    A2.add(value);
	    B1.add(value);
	    B2.add(value);
	    B1.add(value2);
	    B2.add(value2);
	}

	Collections.sort(A2);
	Collections.sort(B2);

	Sorts.msort(A1);
	Sorts.msort(B1);

	String ans=Sorts.name();
	if(A1.equals(A2))
	    ans+="Sorted A!";
	if(B1.equals(B2))
	    ans+="Sorted B!";
	System.out.println(ans);    
    }
}




/*import java.util.*;
public class Driver{
    public static void main(String[]args){
        ArrayList<Person> L= new ArrayList<Person>();
        L.add(new Person("Ben"));
        L.add(new Person("Dave"));
        L.add(new Person("Amy"));
        L.add(new Person("Liz"));
        L.add(new Person("Portnoy"));
        L.add(new Person("Wolf"));
        L.add(new Person("Zed"));
        L.add(new Person("Xin"));
        L.add(new Person("Smith"));
        L.add(new Person("Will"));
        L.add(new Person("Ed"));
        L.add(new Person("Eddie"));
        L.add(new Person("Aaron"));
        L.add(new Person("Cary"));
	System.out.println("Sorting list: " + L + "... \n");
        Sorts.msort(L);
        System.out.println("L sorted is:  " + L);
    }
}


*/