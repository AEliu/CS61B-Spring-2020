import java.util.Objects;

/**
 * ArrayDeque
 *
 * public void addFirst(T item): Adds an item of type T to the front of the deque.
 * public void addLast(T item): Adds an item of type T to the back of the deque.
 * public boolean isEmpty(): Returns true if deque is empty, false otherwise.
 * public int size(): Returns the number of items in the deque.
 * public void printDeque(): Prints the items in the deque from first to last, separated by a space. Once all the items have been printed, print out a new line.
 * public T removeFirst(): Removes and returns the item at the front of the deque. If no such item exists, returns null.
 * public T removeLast(): Removes and returns the item at the back of the deque. If no such item exists, returns null.
 * public T get(int index): Gets the item at the given index, where 0 is the front, 1 is the next item, and so forth. If no such item exists, returns null. Must not alter the deque!
 * public ArrayDeque()
 * public ArrayDeque(ArrayDeque other)
 */
public class ArrayDeque<T> {
    private T[] items;
    private int size;
    private int length;
    private int sentinel;
    private int firstindex, lastindex;

    public ArrayDeque() {
        size = 8;
        items = (T[]) new Object[size];
        sentinel = length = 0;
        firstindex = lastindex = 1;
    }

    public T get(int index) {
        if (index > length || index < 0 || length == 0) {
            return null;
        } else if (index + sentinel + 1 < size) {
            return items[index + sentinel + 1];
        } else {
            return items[index + sentinel + 1 - size];
        }
    }
    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    private void Arraycopy(ArrayDeque<T> from, T[] to) {
        for (int i = 0; i < from.length; i++) {
            to[i+1] = from.get(i);
        }
        sentinel = 0;
        firstindex = 1;
        lastindex = from.length;

    }

    public ArrayDeque(ArrayDeque<T> other) {
        items = (T []) new Object[other.length + 1];
        length  = other.length;
        size = length + 1;
        sentinel = 0;
        for (int i = 0; i < length; i++) {
            items[i + 1] = other.get(i);
        }
        firstindex = sentinel + 1;
        lastindex = sentinel + length;

    }

    private void resize(int cap) {
        T[] a = (T[]) new Object[cap];
        Arraycopy(this, a);
        size = cap;
        items = a;
    }

    public void addFirst(T item) {
        if (length == size - 1) {
            resize(size * 2);
        }
        if (sentinel == 0) {
            sentinel = size -1;
            firstindex = 0;
            items[firstindex] = item;
            length++;

        } else {
            firstindex = sentinel;
            items[firstindex] = item;
            sentinel--;
            length++;
        }
    }

    public void addLast(T item) {
        if (length == size - 1) {
            resize(size * 2);
        }

        items[(sentinel + length + 1) % size] = item;
        length++;
    }

    public void printDeque() {
        for (int i = 0; i < length; i++) {
            System.out.print(get(i) + "  ");
        }
        System.out.println();
    }

    
}