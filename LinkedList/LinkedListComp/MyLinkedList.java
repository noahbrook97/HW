public class MyLinkedList<T> {
   
    private Node<T> head;
    private Node<T> tail;
    private int length;

    public MyLinkedList() {
	head = new Node<T>(null);
	tail = head;
    }

    
    //create a node and add it to the position location....throw an exception if position >= length of the list
    public void add(T s, int pos){
	//if pos out of range throw acception
	if (pos < 0 || pos > this.length()){
	    throw new IndexOutOfBoundsException();
	}
	
	/*	else if(pos == this.length())
	    add(s);	
	*/
	Node temp = new Node<T>(s);
	//if there is nothing in list make s head
	if(length() == 0){
	    head.setNext(temp);
	    length++;
	}
	else {
	    //otherwise point temp to pos s is being added to and point the node before it to temp
	    temp.setNext(getNode(pos));
	    getNode(pos - 1).setNext(temp);
	    length++;
	}
    }
    

    public void add(T s) {
	Node temp = new Node<T>(s);
	tail.setNext(temp);
	tail = temp;
    }
    
    //remove the Node from that location                                                                    
    public void remove(int pos) {
	if(pos < 0 || pos > this.length()) {
	    throw new IndexOutOfBoundsException();
	}
	//point node before node at pos to node at pos + 1 in order to remove pos from list
	getNode(pos -1).setNext(getNode(pos + 1));
	length--;
    }
    
    //getNode 
    public Node<T> getNode(int i ) throws NullPointerException {
	Node<T> temp = this.head.getNext();
	int index = 0;
	//if retrieving -1 its the head
	if(i == -1)
	    temp = head;

	else{
	    //search through list until you get to node at pos i and return node
	    while(index < i) {
		temp = temp.getNext();
		index++;
	    }
	}
	return temp;
    }
    

    //return the  string found at the indicated position
    public T get(int pos) {
	return getNode(pos).getData();
	    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public Node<T> getTail() {
        return tail;
    }
    public Node<T> getHead() {
	return head;
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //change the value of the string found at indicated position to newString
     public void set(int pos, T newval) {
	 getNode(pos).setData(newval);
	 
    }

    //return the location of the 1st occurance of s in the list... -1 if the string isn't found
    public int find(T s) {
	//go through list 
	for(int i = 0; i < this.length(); i++) {
	    //if node data is s return index of node
	    if (getNode(i).getData().equals(s))
		return i;
	}
	//if not found return -1
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

