public class Triess {

    static class Node {

        Node children[] = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }

    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        curr.eow = true;

    }

    public static boolean search(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }

            curr = curr.children[idx];
        }

        if (curr.eow == true) {
            return true;
        }

        return false;
    }

    public static boolean WordBreak(String key){

            if(key.length()==0){
                return true;
            }

        for(int i=0;i<key.length();i++){
            //substr(0, i-> exclusive)
            
            boolean s =search(key.substring(0,i+1));

            boolean b = WordBreak(key.substring(i+1));
           
            if(s && b){
                return true;

            }
                
        }

        // for (int i = 0; i < key.length(); i++) {
        //     if (search(key.substring(0, i + 1)) && WordBreak(key.substring(i + 1))) {
        //         return true;
        //     }
        // }

            

        

    return false;

    }

    

    public static void main(String[] args) {

        // String arr[]={"the","a","there","their","any","thee"};
        String arr[]={"i","like","sam","samsung","mobile","ice"};

        
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
        
        String key="i likesamsung";

        // System.out.println(search("theree"));
        System.out.println(WordBreak(key));



        
    }
}