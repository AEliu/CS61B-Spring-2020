public class ArrayDequeTest {
    @org.junit.Test
    public void testisempty() {
        ArrayDeque<String> ad1 = new ArrayDeque<String>();

        org.junit.Assert.assertTrue(ad1.isEmpty());

        ad1.addFirst("Hello");
        String expget0 = "Hello";
        String actget0 = ad1.get(0);
        org.junit.Assert.assertEquals(expget0, actget0);

        ad1.addLast("world");
        String expget1 = "world";
        String actget1 = ad1.get(1);
        org.junit.Assert.assertEquals(expget1, actget1);

        ad1.addLast("1");
        ad1.addLast("2");
        ad1.addLast("3");
        ad1.addLast("4");
        ad1.addLast("5");
        ad1.addLast("6");
        ad1.addLast("7");
        ad1.addFirst("oo");
        org.junit.Assert.assertEquals("oo", ad1.get(0));

        ad1.printDeque();

    }
}
