import java.util.List;
import java.util.ArrayList;

public class Hashmap {
    List<ContainerObj> list_of_ContainerObjs;
    List<List> table = new ArrayList<List>();
    int modulator = 2;
    int current_size = 0;
    int high = 6;
    int low = 0; 
    ContainerObj co;

    public Hashmap(List<ContainerObj> list_of_ContainerObjs){
        for (int i = 0; i < this.modulator; i++){
            List<ContainerObj> new_bucket = new ArrayList<ContainerObj>();
            this.table.add(new_bucket);
        }

        for (int i = 0; i < list_of_ContainerObjs.size(); i++){
            this.add_to_map(list_of_ContainerObjs.get(i));
        }
    }

    public void add_to_map(ContainerObj co){
        if((this.current_size + 1) >= this.high){
            this.low = this.current_size + 1;
            this.high *= 2;
            this.modulator *= 2;

            List<List> new_table = new ArrayList<>();
   
            for(int i = 0; i < this.modulator; i++){
                List<ContainerObj> new_bucket = new ArrayList<ContainerObj>();
                new_table.add(new_bucket);
            }

            for(int x = 0; x < this.table.size(); x++){
                for(int y = 0; y < this.table.get(x).size(); y++){
                    int bucket_num = this.table.get(x).get(y).hashCode() % this.modulator;
                    new_table.get(bucket_num).add(this.table.get(x).get(y));
                }
            }

            this.table = new_table;

        }
        
        int bucket_num = co.hashCode() % this.modulator;
        this.table.get(bucket_num).add(co);


        this.current_size += 1;
    }

}