package HashTable;

public class HashTable {

    int TABLE_SIZE = 10;
    HashEntry [] table;

    public HashTable() {
        table = new HashEntry[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = null;
        }
    }

    public void add(int key, int value){
        int hash = key % TABLE_SIZE;
        while(table[hash] != null && table[hash].getKey() != key ){
            hash = (hash+1)%TABLE_SIZE;
        }
        table[hash] = new HashEntry(key,value);
    }

    public int get(int key){
        int hash = key % TABLE_SIZE;
        while(table[hash] != null && table[hash].getKey() != key){
            hash = (hash+1)%TABLE_SIZE;
        }
        return table[hash].getValue();
    }

    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.add(26,134);
        ht.add(25,103);
        ht.add(27,105);

        System.out.println(ht.get(25));
    }
}
