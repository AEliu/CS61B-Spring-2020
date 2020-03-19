/**
 * Sort
 */
public class Sort {

    public static int smallest(String[] s, int start) {
        int smallestindex = start;
        for (int i = start + 1; i < s.length; i++) {
            int cmp = s[smallestindex].compareTo(s[i]);
            if (cmp > 0) {
                smallestindex = i;
            }
        }
        return smallestindex;
    }

    public static void swap(String[] s, int b, int e) {
        String tmp = s[b];
        s[b] = s[e];
        s[e] = tmp;
    }

    public static void sort(String[] s, int start) {
        if (start >= s.length) return;
        int smallestIndex = smallest(s, start);
        swap(s, start, smallestIndex);
        sort(s, start + 1);
    }
}