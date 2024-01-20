// import java.util.*;

// public class Hashhing {

//     public static class HashMAp<K, V> { // k,V are generic

//         private class Node {

//             K key;
//             V val;

//             public Node(K k, V v) {
//                 this.key = k;
//                 this.val = v;
//             }

//         }

//         private int n; // n
//         private int N;
//         private LinkedList<Node> bucket[]; // N =buccket.length
//         // private LinkedList<Node> bucket[]; // N =buccket.length

//         // private LinkedList<Node>[] bucket;



//         @SuppressWarnings("unchecked")
//         public HashMAp() {
//             this.N = 4;
//             this.bucket = new LinkedList[4];


//             for (int i = 0; i < 4; i++) {
//                 this.bucket[i] = new LinkedList<>();
//             }
//         }

//         private int Hashfun(K key) {

//             int hc = key.hashCode();

//             hc = Math.abs(hc);

//             hc = hc % N;

//             return hc;

//         }

//         public int SearchinLL(K key, int bi) {

//             LinkedList<Node> ll = bucket[bi];
//             // LinkedList<Node> ll = bucket[bi];
//             int di = 0;

//             for (int i = 0; i < ll.size(); i++) {

//                 Node node = ll.get(i);
//                 if (node.key == key) {
//                     return di;

//                 }
//                 di++;
//             }
//             return -1;
//         }

//         @SuppressWarnings("unchecked")
//         private void rehash() {
//             LinkedList<Node> oldbucket[] = bucket;

//             bucket = new LinkedList[N * 2];
//             N = 2 * N;

//             for (int i = 0; i < N; i++) {
//                 this.bucket[i] = new LinkedList<>();
//             }

//             // node addig to new Bucket

//             for (int i = 0; i < oldbucket.length; i++) {

//                 LinkedList<Node> ll = oldbucket[i];

//                 for (int j = 0; j < ll.size(); j++) {
//                     Node n = ll.remove();

//                     put(n.key, n.val);
//                 }
//             }

//         }

//         public void put(K key, V value) {
//             int bi = Hashfun(key);

//             int di = SearchinLL(key, bi); // valid or -1

//             if (di != -1) {
//                 Node node = bucket[bi].get(di);

//                 node.val = value;
//             }

//             else {
//                 bucket[bi].add(new Node(key, value));
//                 n++;
//             }

//             double lambda = (double) n / N;

//             if (lambda > 2.0) {
//                 rehash();
//             }

//         }

//         public boolean conttainsKey(K key) {
//             int bi = Hashfun(key);

//             int di = SearchinLL(key, bi); // valid or -1

//             if (di != -1) {
//                 return true;
//             }

//             else {
//                 return false;
//             }

//         }

//         public V get(K key) {

//             int bi = Hashfun(key);

//             int di = SearchinLL(key, bi); // valid or -1

//             if (di != -1) {
//                 Node node = bucket[bi].get(di);

//                 return node.val;
//             }

//             else {
//                 return null;
//             }

//         }

//         public V remove(K key) {
//             int bi = Hashfun(key);

//             int di = SearchinLL(key, bi); // valid or -1

//             if (di != -1) {
//                 Node node = bucket[bi].remove(di);
//                 n--;
//                 return node.val;

//             }

//             else {
//                 return null;
//             }
//         }

//         public boolean isEmpty(){
//             return n==0;
//         }

//     }

//     public static void main(String[] args) {

//         // HashMap<String,Integer> hm = new HashMap<>();

//         // hm.put("India", 100);
//         // hm.put("Japan", 70);
//         // hm.put("America", 170);

//         // System.out.println(hm);

//         // System.out.println(hm.get("India"));
//         // System.out.println(hm.containsKey("India"));
//         // System.out.println(hm.remove("India"));
//         // System.out.println(hm.containsKey("India"));

//         // Set<String> keys = hm.keySet();

//         // for (String s : keys) {
//         // System.out.println(s+" = "+hm.get(s));
//         // }

//         // System.out.println(hm.entrySet());

//         HashMAp<String, Integer> hm = new HashMAp<>();

//         hm.put("India", 100);
//         hm.put("nepal", 10);
//         hm.put("mald", 20);

//         System.out.println(hm.get("mald"));
//     }

// }


import java.util.*;

public class Hashhing {

    public static class HashMAp<K, V> {

        private class Node {
            K key;
            V val;

            public Node(K k, V v) {
                this.key = k;
                this.val = v;
            }
        }

        private int n;
        private int N;
        private List<LinkedList<Node>> bucket;

        @SuppressWarnings("unchecked")
        public HashMAp() {
            this.N = 4;
            this.bucket = new ArrayList<>(4);

            for (int i = 0; i < 4; i++) {
                this.bucket.add(new LinkedList<>());
            }
        }

        private int Hashfun(K key) {
            int hc = key.hashCode();
            hc = Math.abs(hc);
            hc = hc % N;
            return hc;
        }

        public int SearchinLL(K key, int bi) {
            LinkedList<Node> ll = bucket.get(bi);
            int di = 0;

            for (Node node : ll) {
                if (node.key.equals(key)) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            List<LinkedList<Node>> oldbucket = bucket;

            bucket = new ArrayList<>(N * 2);
            N = 2 * N;

            for (int i = 0; i < N; i++) {
                this.bucket.add(new LinkedList<>());
            }

            // node adding to new Bucket
            for (LinkedList<Node> ll : oldbucket) {
                while (!ll.isEmpty()) {
                    Node n = ll.removeFirst();
                    put(n.key, n.val);
                }
            }
        }

        public void put(K key, V value) {
            int bi = Hashfun(key);
            int di = SearchinLL(key, bi);

            if (di != -1) {
                Node node = bucket.get(bi).get(di);
                node.val = value;
            } else {
                bucket.get(bi).add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;

            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = Hashfun(key);
            int di = SearchinLL(key, bi);

            return di != -1;
        }

        public V get(K key) {
            int bi = Hashfun(key);
            int di = SearchinLL(key, bi);

            if (di != -1) {
                Node node = bucket.get(bi).get(di);
                return node.val;
            } else {
                return null;
            }
        }

        public V remove(K key) {
            int bi = Hashfun(key);
            int di = SearchinLL(key, bi);

            if (di != -1) {
                Node node = bucket.get(bi).remove(di);
                n--;
                return node.val;
            } else {
                return null;
            }
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMAp<String, Integer> hm = new HashMAp<>();

        hm.put("India", 100);
        hm.put("nepal", 10);
        hm.put("mald", 20);

        System.out.println(hm.get("mald"));
    }
}
 