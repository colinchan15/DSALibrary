package PracticeHashMap;

public class HashMap {

    int TABLE_SIZE = 10;
    HashEntry [] table;

    public HashMap(){
        table = new HashEntry[TABLE_SIZE];
        for(int i = 0; i < TABLE_SIZE; i++){
            table[i] = null;
        }
    }

    public void add (int key, int value){
        int hash = key % TABLE_SIZE;
        while(table[hash] != null && table[hash].getKey() != key){
            hash = (hash + 1) % TABLE_SIZE;
        }
        table[hash] = new HashEntry(key,value);
    }

    public int get (int key){
        int hash = key % TABLE_SIZE;
        while(table[hash] != null && table[hash].getKey() != key){
            hash = (hash+1 % TABLE_SIZE);
        }
        return table[hash].getValue();
    }

    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.add(1,6);
        hm.add(2,7);
        hm.add(3,10);

        System.out.println(hm.get(2));
    }
}
