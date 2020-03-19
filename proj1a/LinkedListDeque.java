/**
 * LinkedListDeque
 */
public class LinkedListDeque<T> {

    /**
     * InnerLinkedListDeque
     */
    public class TNode {
        public TNode pre;
        public T item;
        public TNode next;

        public TNode(TNode p, T x, TNode n) {
            pre = p;
            item = x;
            next = n;
        }

    }

    private TNode sentinel;
    private int size;

    public LinkedListDeque() {
        size = 0;
        sentinel = new TNode(null, null, null);
        sentinel.pre = sentinel.next = sentinel;
    }

    public LinkedListDeque(LinkedListDeque<T> other) {
        if (other.size == 0) {
            size = 0;
            sentinel = new TNode(null, null, null);
            sentinel.pre = sentinel.next = sentinel;
        } else {
            size = other.size;
            sentinel = new TNode(null, null, null);
            sentinel.pre = sentinel.next = sentinel;
            
            for (int i = 0; i < size; i++) {
                addLast(other.get(i));
            }
        }

    }

    public void addFirst(T item) {
        TNode p = new TNode(sentinel, item, sentinel.next);
        sentinel.next.pre = p;
        sentinel.next = p;
        size++;
    }
    
    public void addLast(T item) {        
        TNode p = new TNode(sentinel.pre, item, sentinel);
        sentinel.pre.next = p;
        sentinel.pre = p;
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void printDeque() {
        TNode p = sentinel;
        while (p.next != sentinel) {
            System.out.print(p.next.item);
            System.out.print("  ");
            p = p.next;
        }
        System.out.println();
    }

    public T removeFirst() {
        if (size == 0) {
            return null;
        }
        T removeditem = sentinel.next.item;

        sentinel.next = sentinel.next.next;
        sentinel.next.pre = sentinel;
        size--;

        return removeditem;
    }

    public T removeLast() {
        T removeditem = sentinel.pre.item;
        
        sentinel.pre = sentinel.pre.pre;
        sentinel.pre.next = sentinel;

        return removeditem;
    }

    public T get(int index) {
        if (index >= size) return null;
        int i = 0;
        TNode p = sentinel;
        while (i < size) {
            p = p.next;
            i++;
        }
        return p.item;
    }

    private T getRecursive(int index, TNode p) {
        if (index == 0) {
            return p.next.item;
        }
        return getRecursive(index - 1, p.next);
    }

     public T getRecursive(int index) {

        if (index >= size || index < 0) return null;

        return getRecursive(index, sentinel);
     }
}