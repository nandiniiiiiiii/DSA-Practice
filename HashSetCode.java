import java.util.LinkedList;
import java.util.*;

public class HashSetCode {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked") // use to supress unchecked warning which might arrise due to unspecified, // linklist type
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        // this is the hashfunction we will be useing
        private int hashFunction(K key){
            int hf = key.hashCode();
            return Math.abs(hf) % N;
        }

        private void rehash(){
            LinkedList<Node> oldbucket[] = buckets;       //storing val of old linked list to another list
            buckets = new LinkedList[N *2];               //re-initialising the buckets
            for (int i = 0; i < buckets.length; i++) {
                this.buckets[i] = new LinkedList<>();     //assigning new list to all the buckets index
            }

            //filling new linkedlist with the old val
            for (int i = 0; i < oldbucket.length; i++) {
                LinkedList<Node> li = oldbucket[i];
                for (int j = 0; j < li.size(); j++) {
                    Node node = li.get(j);
                    put(node.key, node.value);
                }
            }
        }

        // to add ele in it
        public void put(K key, V value) {
            double k = 2.0;
            int hf = hashFunction(key);
            int di = seraceIndex(key,hf);

            if(di == -1){
                buckets[hf].add(new Node(key, value));
                n++;
            }else{
                Node data = buckets[hf].get(di);
                data.value = value;
            }

            //checking the val of lambda
            double lambda = (double)n/N;
            if(lambda > k){
                //rehashing
                rehash();
            }
        }

        private int seraceIndex(K key, int hf) {
            for (int i = 0; i < buckets[hf].size(); i++) {
                if(key == buckets[hf].get(i).key){
                    return i;
                }
            }
            return -1;
        }

        public V get(K key){
            int hf = hashFunction(key);
            int di = seraceIndex(key, hf);
            if(di != -1){
                return buckets[hf].get(di).value;
            }
            return null;
        }

        public boolean contains(K key){
            int hf = hashFunction(key);
            int di = seraceIndex(key, hf);
            if(di != -1){
                return true;
            }
            return false;
        }

        public V remove(K key){
            int bi = hashFunction(key);     //hf
            int di = seraceIndex(key, bi);
            if(di != -1){
                Node node = buckets[bi].remove(di);
                return node.value;
            }else{
                System.out.println("Key not present");
                return null;
            }
        }

        public ArrayList<K> keyset(){
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> li = buckets[i];
                for (int j = 0; j < li.size(); j++) {
                    keys.add(li.get(j).key);
                }
            }
            return keys;
        }
        
        public boolean isEmpty(){
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India",120);
        map.put("Japan",110);
        map.put("china",150);
        map.put("us",90);
        
        ArrayList<String> keys = map.keyset();
        System.out.println(keys);
    }
}
