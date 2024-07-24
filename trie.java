public class trie {
    static class Node {
        Node[] children;
        boolean eow;

        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    // Insertion
    public static void insert(String word) {
        Node curr = root;
        for (int j = 0; j < word.length(); j++) {
            int idx = word.charAt(j) - 'a';
            if (curr.children[idx] == null) {
                // Add new node
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true; // Set end of word flag
    }

    // Search
    public static boolean search(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow; // Check if it's the end of a word
    }

    // Word Break
    public static boolean wordBreak(String key) {
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) { // Ensure to check the full length
            String first = key.substring(0, i);
            String sec = key.substring(i);
            if (search(first) && wordBreak(sec)) {
                return true;
            }
        }
        return false;
    }
    public static boolean startsWith(String prefix){
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;

    }

    public static void main(String[] args) {
        String words[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
        @SuppressWarnings("unused")
        String key = "ilikesam";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            insert(word);
        }
        //System.out.println(wordBreak(key));
        System.out.println(startsWith("mob"));
        System.out.println(startsWith("sams"));
    }
}
