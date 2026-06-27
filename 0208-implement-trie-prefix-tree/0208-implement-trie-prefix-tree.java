class Trie {

    public class Node{
        Node[] children=new Node[26];
        boolean isEnd=false;
    }

    private Node root;

    public Trie() {
        root =new Node();    
    }
    
    public void insert(String word) {
        Node current=root;
        
        for(char c: word.toLowerCase().toCharArray()){
            int index= c-'a';

            if(current.children[index]==null){
                current.children[index]=new Node();
            }
            
            current=current.children[index];


        }
        current.isEnd=true;


    }
    
    public boolean search(String word) {

        Node current=root;

        for(char c:word.toLowerCase().toCharArray()){
            int index=c-'a';

            if(current.children[index]==null){
                return false;
            }
            current=current.children[index];
        }

        if(current.isEnd==true) return true;

        return false;
        
    }
    
    public boolean startsWith(String prefix) {
        Node current=root;

        for(char c:prefix.toLowerCase().toCharArray()){
            int index=c-'a';

            if(current.children[index]==null){
                return false;
            }
            current=current.children[index];
        }


        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */