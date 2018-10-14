import java.util.Arrays;
import java.util.LinkedList;

public class TEST {

    private static LinkedList <Configuration> [] table = new LinkedList[5];

    public static void main(String[] args) throws DictionaryException {

//        for (int i = 0; i < 5; i++){
//            table[i] = null;
//        }

        System.out.println(Arrays.toString(table));

        Configuration b = new Configuration("great",4);
        Configuration c = new Configuration("ok",3);
        Configuration d = new Configuration("greatt",3);
        table[2] = new LinkedList<>();
        table[2].add(b);
        table[2].add(c);
//        if (table[2].contains(c.getStringConfiguration())){
//            throw new DictionaryException("Key already exists");
//        }
        for (Configuration r : table[2]){
            if (d.getStringConfiguration().equals(r.getStringConfiguration())){
//                System.out.println("element already exists");
                throw new DictionaryException("element already exists");
            }
        }
        table[2].add(d);
        System.out.println(Arrays.toString(table));
        System.out.println(table[2].getLast().getStringConfiguration());
    }

}
