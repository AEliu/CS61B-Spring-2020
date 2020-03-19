/**
 * SLList
 */
public class SLList<Blorp> {

    public class IntNode {
        public Blorp item;
        public IntNode next;

        public IntNode(Blorp i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode sentinel;
    // private IntNode last;
    private int size;

    public SLList(Blorp x) {
        sentinel = new IntNode(null, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    public void addFirst(Blorp x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size++;
    }

    public Blorp getFirst() {
        return sentinel.next.item;
    }

    public void addLast(Blorp x) {
        IntNode p = sentinel;

        while (p.next != null) {
            p = p.next;
        }

        p.next = new IntNode(x, null);
        size++;
    }

    // private static int size(IntNode<> p) {
    //     if(p.next == null) return 1;
    //     return 1 + size(p.next);
    // }

    public int size() {
        // return size(first);
        return size;
    }

    public Blorp get(int i) {
        IntNode p = sentinel;
        for (int j = 0; j < i; j++) {
            p = p.next;
        }

        return p.item;
    }

    // construct an empty class, let first = null
    public SLList() {
        sentinel = new IntNode(null, null);
        size = 0;
    }

    public static void main(String[] args) {
        SLList<Integer> L = new SLList<>(4);
        L.addFirst(78);
        System.out.println(L.getFirst());
    }
}