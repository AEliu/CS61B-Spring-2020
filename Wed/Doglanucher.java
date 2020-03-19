/**
 * Doglanucher
 */
public class Doglanucher {

    public static void main(String[] args) {
        Dog d= new Dog(54);
        // d.weightInPounds = 5;
        d.makeNoise();
        Dog d2 = new Dog(34);
        Dog big = d.maxDog(d2);
        big.makeNoise();
        System.out.println(d.binomen);
    }
}