package ClassTest;

@SuppressWarnings("unused")
public class Single_linked_List {
	
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node head = null;
	public Node tail = null;
	
	  void addNode(int data) {
		  Node newNode = new Node(data);
		  if(head == null) {
			  head= newNode;
			  tail = newNode;
		  }
	  
		  else {
			  tail.next = newNode; 
			  tail = newNode;   
		  }
	  }
	  
	  
	  void addBeginning(int data) {
		  Node newNode = new Node(data);
		  if(head == null) {
			  head= newNode;
			  tail = newNode; 
	  }
		  else {
			  newNode.next = head;  
			  head = newNode;       
		  }
	  }
	  
	  void addlast(int data) {
		  Node newNode = new Node(data);
		 
		Node current = head;	  
	    if(head==null) {
	    	head = newNode;
	    	tail = newNode;
	    }
	    else {
	    	tail.next= newNode;
	    	tail = newNode;
	    }
	  }
	  
	  public void deleteNodeFront() {
	        if (head == null) {
	            System.out.println("Linked list is empty. Cannot delete from front.");
	            
	        }
	        head = head.next;
	    }

	    public void deleteNodeBack() {
	        if (head == null) {
	            System.out.println("Linked list is empty. Cannot delete from back.");
	        }
	        if (head == tail) {
	            head = tail = null;
	        }
	        Node current = head;
	        while (current.next != tail) {
	            current = current.next;
	        }
	        current.next = null;
	        tail = current;
	    }
	    void addinbetween(int pos,int data) {
	    	Node newNode = new Node(data);
	    	Node current=head;
	    	if(head==null){
	    		head = newNode;
	    		tail = newNode;
	    	}
	    	else {
	    	while(current.data!=pos) {
	    		  current=current.next;
	    	}
	    	newNode.next=current.next;
	   	    current.next=newNode;
	    	}
	    }
	    public void delete(int data) {
	    	Node current=head;
	    	if(head==null)
		    	System.out.println("list is empty");
		    	else {
		    		while(current.next.data!=data) {
		    			current=current.next;
		    		}
		    		if(current.next==null)
		    			System.out.println("Element is not present");
		    		else {
		    			current.next=current.next.next;
		    		}
		    		}
	    		}
	    	
	    
	  
	  public void display() {
		  Node current = head;
		  if(head == null){
			  System.out.println("Linked list is empty");		  
		  }
		  else {
			  System.out.println("Singly linked list elements are: ");
			  while(current!=null) {
				  System.out.print(current.data+" ");
				  current = current.next;
			  
		  }
			}
		      }
	 
	
		public static void main(String[] args) {
			Single_linked_List sll = new Single_linked_List();
			
			sll.addNode(2);
			sll.addNode(4);
			sll.display();
			sll.addBeginning(6);
			sll.display();
			sll.addlast(10);
			sll.display();
			sll.addNode(12);
			sll.display();
			sll.deleteNodeFront();
			sll.display();
			sll.deleteNodeBack();
			sll.display();
			sll.addinbetween(4,24);
			sll.display();
			sll.delete(4);
			sll.display();
			
			

		}

	}