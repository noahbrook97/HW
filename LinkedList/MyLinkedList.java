public class MyLinkedList {
   
    private Node head;
    private int length;

    public MyLinkedList() {
	head = new Node(null);
    }
    
    //create a node and add it to the position location....throw an exception if position >= length of the list
    public void add(String s, int pos){
	if (pos < 0 || pos > this.length()){
	    throw new IndexOutOfBoundsException();
	}

	Node temp = new Node(s);
	if(length() == 0){
	    head.setNext(temp);
	    length++;
	}
	else {
	    temp.setNext(getNode(pos));
	    getNode(pos - 1).setNext(temp);
	    length++;
	}
    }

    //remove the Node from that location                                                                    
    public void remove(int pos) {
	if(pos < 0 || pos > this.length()) {
	    throw new IndexOutOfBoundsException();
	}
	getNode(pos -1).setNext(getNode(pos + 1));
	length--;
    }
    
    //getNode 
    public Node getNode(int i ) throws NullPointerException {
	Node temp = this.head.getNext();
	int index = 0;
	if(i == -1)
	    temp = head;

	else{
	    while(index < i) {
		temp = temp.getNext();
		index++;
	    }
	}
	return temp;
    }
    

    //return the  string found at the indicated position
    public String get(int pos) {
	return getNode(pos).getData();

	    }
    
    //change the value of the string found at indicated position to newString
     public void set(int pos, String newString) {
	 getNode(pos).setData(newString);
	 
    }

    //return the location of the 1st occurance of s in the list... -1 if the string isn't found
    public int find(String s) {
	for(int i = 0; i < this.length(); i++) {
	    if (getNode(i).getData().equals(s))
		return i;
	}
	return -1;
    }

    //return the number of elements stored in the linked list.
    public int length() {
	return length;
    }

    //convert the list to a string in the format "[word1, word2, word3]"
    public String toString(){
	String s = "[";
	int i = 0;
	
	if(this.length() == 0)
	    return "[]";

	while (i < length() - 1){
	    s += get(i);
	    s+= ",";
	    i++;
	}
	
	s+= get(i) +  "]";
	return s;
 }
    

}//end class MyLinkedList

