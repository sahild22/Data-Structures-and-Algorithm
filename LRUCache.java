class LRUCache {
     static class Node{
        Node next;
        int key;
        int value;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    private static Node head;
    private static Node tail;
    private static int size = 0;
    private static int capacity;

    LRUCache(int capacity){
        this.capacity = capacity;
    }

    void put(int key, int value){
        Node n = new Node(key, value);
        if(size == capacity){
            head.next = n;
            head = n;
            tail = tail.next;
            return;
        }
        if(head == null){
            head = n;
            tail = head;
            size++;
        }else{
            head.next = n;
            head = n;
            size++;
        }

    }

    Node get(int key){
        if(size == 0) return null;
        if(tail.key == key){
            Node i = tail;
            head.next = i;
            head = i;
            tail = tail.next;
            return tail;
        }
        Node result = tail;
        while(result != null){
            if(result.next.key == key){
                Node k = result.next;
                result.next = result.next.next;
                head.next = k;
                head = k;
                return head;
            }else{
                result = result.next;
            }
        }
        return null;
    }

     static void printLRUCache(){
        Node n = tail;
        while(tail != null && n != null){
            System.out.println("Key: " + n.key + ", Value:" + n.value);
            n = n.next;
        }
    }
}

class Main{
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(5);
        cache.put(1,1);
        cache.put(2,2);
        cache.put(3,3);
        cache.get(1);
        cache.put(4,4);
        cache.put(5,5);
        cache.put(6,6);
        cache.get(3);
        cache.put(7,7);

        LRUCache.printLRUCache();
    }
}
