public class Node {

    int data;
    Node next;

    public Node(int data , Node next){
        this.data=data;
        this.next=next;
    }
}
class linked{
    Node head;

    public linked(Node head){
        this.head=head;
    }

    public void add(Node newnode) {
        newnode.next = head;
        head = newnode;
    }

    public void all(){
        Node n = head;

        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }

    public static void main(String[] args){
        Node n = new Node(1,null);
        Node n1 = new Node(2,n);
        linked l1 = new linked(n);
        linked l2 = new linked(n1);
        l2.all();
    }


}

