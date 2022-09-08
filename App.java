import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        List<Node> node_list = new ArrayList<Node>();

        node_list.add(new Node(1));
        node_list.add(new Node(2));
        node_list.add(new Node(3));
        node_list.add(new Node(4));
        node_list.add(new Node(5));
        
        DoublyLinkedList x_DLL = new DoublyLinkedList(node_list);
        x_DLL.pop();
        x_DLL.add_node(new Node(6));

        x_DLL.print_all_nodes();

    }
}
