public interface TrieDS {
    static class  Node {
        Node child[];            
        //it does not have a data field as it assumes that 0-a, 1-b, 2-c ...... 
        boolean endOfWord; 

        public Node(){
            child = new Node[26];                //26 size array 
            for (int i = 0; i < 26; i++) {
                child[i] = null;
            }
            //every node in this has its very own array
            endOfWord = false;
        }
    }

    static Node root = new Node();
    public static void main(String[] args) {
        
    }
}
