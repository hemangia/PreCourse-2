//Time Complexity-O(n)
//Space Complexity-O(1)
// Problem : issues in understanding complexity analysis

class Exercise_3 
{
    Node head; // head of linked list 
  
    /* Linked list node */
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    /* Function to print middle of linked list */
   //Complete this function
    void printMiddle() 
    { 
        //Write your code here
	//Implement using Fast and slow pointers
    	
    	Node midPrev = null ;
        while(head!=null && head.next!=null){
            midPrev = (midPrev==null) ? head : midPrev.next;

            head = head.next.next ;
        }
        Node mid  = midPrev.next ;
            midPrev.next = null ;
        System.out.println("Middle of Linked Lis is : "+ mid.data) ;
        
    } 
  
    public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 

    public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+"->"); 
            tnode = tnode.next; 
        } 
        System.out.println("NULL"); 
    } 
  
    public static void main(String [] args) 
    { 
    	Exercise_3 llist = new Exercise_3(); 
        for (int i=15; i>0; --i) 
        { 
            llist.push(i); 
            
        } 
        llist.printList(); 
        llist.printMiddle(); 
    } 
    } 