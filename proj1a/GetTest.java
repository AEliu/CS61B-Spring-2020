public class GetTest {
    @org.junit.Test
    public void testget() {
        String expected = "am";
        String expected1 = "I";
        String expected2 = null;


        LinkedListDeque<String> lld =new LinkedListDeque<>();
        lld.addFirst("am");
        lld.addFirst("I");

//        org.junit.Assert.assertEquals(expected, lld.get(1));
        org.junit.Assert.assertEquals(expected, lld.getRecursive(1));
        org.junit.Assert.assertEquals(expected1, lld.getRecursive(0));
        org.junit.Assert.assertEquals(expected2, lld.getRecursive(20));
        org.junit.Assert.assertEquals(expected2, lld.getRecursive(-20));

    }

}
