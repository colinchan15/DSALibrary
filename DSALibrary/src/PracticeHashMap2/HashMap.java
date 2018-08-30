package PracticeHashMap2;

public class HashMap {

    HashEntry [] table;
    int TABLE_SIZE;

    public HashMap(int TABLE_SIZE){
        table = new HashEntry[TABLE_SIZE];
        this.TABLE_SIZE = TABLE_SIZE;
    }

    public void add(int key, int value){
        int hash = key % TABLE_SIZE;
        while(table[hash] != null && table[hash].getKey() != key){
            hash = (hash + 1) % TABLE_SIZE;
        }
        table[hash] = new HashEntry(key,value);
    }

    public int get (int key){
        int hash = key % TABLE_SIZE;
        while(table[hash] != null && table[hash].getKey() != key){
            hash = (hash + 1) % TABLE_SIZE;
        }
        return table[hash].getValue();
    }

    public static void main(String[] args) {
        HashMap hm = new HashMap(10);
        hm.add(1,5);
        hm.add(2,98);

        System.out.println(hm.get(2));
    }

}
