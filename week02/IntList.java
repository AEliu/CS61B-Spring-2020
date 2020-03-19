/**
 * IntList
 */
public class IntList {

    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    public int size() {
        if (this.rest == null) return 1;
        else return 1 + this.rest.size();
    }

    public int iterativeSize() {
        int size = 0;
        IntList pl = this;
        while (pl != null) {
            pl = pl.rest;
            size ++;
        }
        return size;
    }

    public int get(int i) {
        int value;

        if (i < 0 || i >= this.size()) {
            System.out.println("Error: negative or too big index");
            System.exit(0);
            return 0;
        } else {
            IntList p = this;
            int j = 0;
            while(p.rest != null && j < i) {
                p = p.rest;
                j++;
            }
            return p.first;
        } 
    }

    public static void main(String[] args) {
        IntList l = new IntList(15, null);
        l.rest = new IntList(23, null);
        l = new IntList(2, l);
        System.out.println(l.size());
        System.out.println(l.iterativeSize());
        System.out.println(l.get(-1));

    }
}