/**
 * DLList
 */
public class DLList {

    /**
     * IntNode
     */
    private class IntNode {
        public IntNode prev;
        public int item;
        public IntNode next;

        public IntNode(IntNode p, int x, IntNode n) {
            prev = p;
            item = x;
            next = n;

        }

    }

    private IntNode sentinel;
    private IntNode last;
    private int size;

    public DLList() {
        size = 0;
        sentinel = last = new IntNode(null, 63, null);

    }
}