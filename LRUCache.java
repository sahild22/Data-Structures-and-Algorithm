public class LRUCache {
    static class Node{
        Node next;
        int key;
        int value;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    static Node head;
    static Node tail;
    static int size = 0;
    static int capacity;

    public static void put(int key, int value){
        Node n = new Node(key, value);
        if(size == capacity){
            tail.key = key;
            tail.value = value;
            return;
        }
        if(head == null){
            head = n;
            tail = head;
            size++;
        }else{
            tail.next = n;
            tail = n;
            size++;
        }

    }

    public static Node get(int key){
        if(size == 0) return null;
        if(size == 1 || head.key == key) return head;
        Node result = head;
        while(result != null){
            if(result.next.key == key){
                Node k = result.next;
                result.next = result.next.next;
                k.next = head;
                head = k;
                return head;
            }else{
                result = result.next;
            }
        }
        return null;
    }

    public static void printLRUCache(){
        Node n = head;
        while(head != null && n != null){
            System.out.println("Key: " + n.key + ", Value:" + n.value);
            n = n.next;
        }
    }
}

class Main{
    public static void main(String[] args) {
        LRUCache cache = new LRUCache();
        cache.capacity = 5;
        cache.put(1,1);
        cache.put(2,2);
        cache.put(3,3);
       // LRUCache.Node result = cache.get(3);
        //System.out.println("Result{Key: " + result.key + ", Value: " + result.value + "}");
        cache.put(4,4);
        cache.put(5,5);
        cache.put(6,6);

        cache.printLRUCache();
    }
}
