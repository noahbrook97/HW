public class Driver{

    public static void main(String [] args){

	MyLinkedListm = new MyLinkedList();

	//add tests
	System.out.println("List m: " + m);

	System.out.println("Adding to the list... \n");
	m.add("hi", 0);
	m.add("by", 1);
	m.add("sad", 2);
	m.add("mad", 3);
	System.out.println(m);

	/*
	//set and get tests 
	System.out.println();
	System.out.println("Setting index 2 to apple \n");
	m.set(2, "apple");
	System.out.println(m);
	
	//remove tests
	System.out.println();
	System.out.println("Removing value at index 2 from list... \n");
	m.remove(2);
	System.out.println(m);

	System.out.println();
	System.out.println("Finding values in list... \n" + m + "  \n");
	System.out.println("Finding 'by': \t"  + m.find("by"));
	System.out.println("Finding 'boy': \t" + m.find("boy"));
	*/
    }
}
