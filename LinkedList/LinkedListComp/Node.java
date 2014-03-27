public class Node<T>{

    private T data;
    private Node<T> next;
    
    public Node(T data){
	this.data = data;
	next = null;
    }

    public void setNext(Node next){
	this.next = next;
    }

    public void setData(T data) {
	this.data = data;
    }

    public Node getNext(){
	return next;
    }

    public T getData(){
	return data;
    }

    public String toString(){
	return "Data: " + data;
    }
}//end class Node