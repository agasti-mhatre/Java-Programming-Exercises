import java.util.List;


public class DoublyLinkedList {
    List<Node> list_of_nodes;
    Node head;
    Node tail;

    public DoublyLinkedList(List<Node> list_of_nodes){
        if(list_of_nodes.size() == 0){
            this.head = null;
            this.tail = null;
        }else{
            this.head = this.tail = list_of_nodes.get(0);
            
            for(int i = 1; i < list_of_nodes.size(); i++){
                this.add_node(list_of_nodes.get(i));
            }
        }
    }


    public void add_node(Node node){
        if ((this.head == null) && (this.tail == null)){
            this.head = this.tail = node;
        }else{
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }

    }


    public Node pop() throws Exception{
        Node temp = null;
        if ((this.head == null) && (this.tail == null)){
            throw new Exception("Can't pop from empty list!");
            //System.out.println("Can't pop from empty list!");
        }else if (this.head == this.tail){
            temp = this.tail;
            this.head = this.tail = null;
        }else{
            temp = this.tail;
            this.tail = this.tail.prev;
            this.tail.next = null;
            temp.prev = null;
        }
        return temp;
    }


    public void print_all_nodes(){
        Node temp = this.head;
        while(temp.next != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println(temp.val);
    }
    
}
