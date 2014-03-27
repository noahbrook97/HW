public class Driver{   
    
    public static void main(String[]args){

	Node<String> s = new Node<String>("Hello!");


	MyLinkedList<Integer> a = new MyLinkedList<Integer>();

	System.out.println("\n printing tail: " + a.getTail() + "\n");
	
	int[] test = {315,0,10,1,6848,64,41,31,13,14,415,14,143,31,4314,341};
    
	System.out.println("\nAdding Integers to List...\n\n");
	for (int i = 0; i < 7; i ++){
	    a.add(new Integer(test[test.length-i-1]),i);
	}
    
	System.out.println(a);
	System.out.println(" \n printing tail: " + a.getTail() + "\n");
    
	/*    
	System.out.println("Removing Integers:");
	System.out.println(a);
	a.remove(1);
	System.out.println(a);
	a.remove(a.length()-1);
	System.out.println(a);
	a.remove(0);
	System.out.println(a);
    
	System.out.println("\n\nSetting:");        
	for(int i = 0; i < test.length && i < a.length(); i++){
	    System.out.println("Setting Index " + i + " to Integer " + test[i]);
	    a.set(i, test[i]);
	    System.out.println(a);
	}    
    
	System.out.println("\n\nGetting:");    
	for(int i = 0; i < a.length();i++){
	    System.out.println(i + ": " + a.get(i));
	}
    
	System.out.println("\n\nFinding");
	for(int i = 0; i < a.length(); i++){
	    System.out.println(a.find(a.get(i)));
	    }*/
    }
}



