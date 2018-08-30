package HashTable;

public class HashEntry {

    int key;
    int value;
    int tableSize;

    public HashEntry (int key, int value){
        this.key = key;
        this.value = value;
    }

    public int getKey (){
        return key;
    }

    public int getValue(){
        return value;
    }

}
