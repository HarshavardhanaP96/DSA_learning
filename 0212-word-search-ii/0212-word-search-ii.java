import java.util.*;

class Solution {
    // Standard Trie Node structure optimized for Word Search II
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word = null; // Stores the complete word at the leaf node
    }

    // Helper to build the Trie from the words array
    private TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();
        for (String w : words) {
            TrieNode current = root;
            for (char ch : w.toCharArray()) {
                int index = ch - 'a';
                if (current.children[index] == null) {
                    current.children[index] = new TrieNode();
                }
                current = current.children[index];
            }
            current.word = w; // Store word at the end node
        }
        return root;
    }

    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        TrieNode root = buildTrie(words);

        // Traverse every cell in the board as a starting point
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, root, res);
            }
        }

        return res;
    }

    private void dfs(char[][] board, int i, int j, TrieNode current, List<String> res) {
        // Boundary checks
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return;
        }

        char ch = board[i][j];
        // If the cell is already visited ('#') or character doesn't exist in Trie path
        if (ch == '#' || current.children[ch - 'a'] == null) {
            return;
        }

        // Move to the child node in the Trie
        current = current.children[ch - 'a'];

        // If we matched a complete word, add it to our results
        if (current.word != null) {
            res.add(current.word);
            current.word = null; // De-duplicate: ensure we don't pick it up again
        }

        // Mark the current cell as visited
        board[i][j] = '#';

        // Explore all 4 directions (Up, Down, Left, Right)
        dfs(board, i + 1, j, current, res);
        dfs(board, i - 1, j, current, res);
        dfs(board, i, j + 1, current, res);
        dfs(board, i, j - 1, current, res);

        // Backtrack: Restore the original character for other paths
        board[i][j] = ch;
    }
}