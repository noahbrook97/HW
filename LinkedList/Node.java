public class Node{

    private String data;
    private Node next;
    
    public Node(String data){
	this.data = data;
	next = null;
    }

    public void setNext(Node next){
	this.next = next;
    }

    public void setData(String data) {
	this.data = data;
    }

    public Node getNext(){
	return next;
    }

    public String getData(){
	return data;
    }

    public String toString(){
	return "Data: " + data;
    }
}//end class Node