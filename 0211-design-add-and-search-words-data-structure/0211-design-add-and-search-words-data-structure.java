class WordDictionary {

    public class Node{
        Node[] children=new Node[26];
        boolean isEnd=false;
    }

    private Node root;

    public WordDictionary() {
        root=new Node();
    }
    
    public void addWord(String word) {
        Node current=root;
        
        for(char c:word.toCharArray()){
            int index=c-'a';

            if(current.children[index]==null){
                current.children[index]=new Node();
            }

            current=current.children[index];
        }

        current.isEnd=true;
    }
    
    public boolean search(String word) {

        return dfs(word, 0, root);
        
    }

    public boolean dfs(String word,int position, Node current){

        if(current==null) return false;

        if(position==word.length()) return current.isEnd;

        char ch=word.charAt(position);

        if(ch=='.'){

            for(int i=0;i<26;i++){

                if(dfs(word,position+1,current.children[i])){
                    return true;
                }
            }
            return false;

        }else{

            int index=ch-'a';

            return dfs(word,position+1,current.children[index]);
        }


    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */