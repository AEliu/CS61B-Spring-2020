/**
 * TestSort
 */
public class TestSort {

    @org.junit.Test
    public void testSort() {
        String[] input = {"i", "am", "a", "dog"};
        String[] expected = {"a", "am", "dog", "i"};

        String[] input1 = {"he", "is", "am", "a", "dog"};
        String[] expected1 = {"a", "am", "dog", "he", "is"};

        Sort.sort(input, 0);
        Sort.sort(input1, 0);

        org.junit.Assert.assertArrayEquals(expected, input);
        org.junit.Assert.assertArrayEquals(expected1, input1);
    }

    @org.junit.Test
    public void testFindSmallest() {
        String[] input = {"i", "am", "a", "dog"};
        int expected = 2;

        int actual = Sort.smallest(input, 0);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void  testSwap() {
        String[] input = {"i", "am", "a", "dog"};
        String[] expected = {"a", "am", "i", "dog"};

        Sort.swap(input, 0, 2);
        org.junit.Assert.assertArrayEquals(expected, input);
    }



    
}