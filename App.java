import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        List<ContainerObj> list_of_Containers = new ArrayList<ContainerObj>(){
            {
                add(new ContainerObj(1, "a"));
                add(new ContainerObj(2, "b"));
                add(new ContainerObj(3, "c"));
                add(new ContainerObj(4, "d"));
                add(new ContainerObj(5, "e"));
                add(new ContainerObj(6, "f"));
                add(new ContainerObj(7, "g"));
            }
        };
        
        
        Hashmap x_hashmap = new Hashmap(list_of_Containers);
        System.out.println(x_hashmap.table);
    }
}
