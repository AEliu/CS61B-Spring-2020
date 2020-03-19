import java.io.PrintStream;

/**
 * Dog
 */
public class Dog {

    public int weightInPounds;
    public static String binomen = "Canis familiaris";

    // constructor
    public Dog(int w) {
        weightInPounds = w;
    }

    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yip yip yip yip");
        } else if (weightInPounds < 40) {
            System.out.println("Bark!!");
        } else {
            System.out.println("Woof!");
        }
        
    }

    public Dog maxDog(Dog d2) {
        if (this.weightInPounds > d2.weightInPounds) return this;
        return d2;
    }

    // public static Dog maxDog(Dog d1, Dog d2) {
    //     if (weightInPounds < d2.weightInPounds) return this;
    //     return d2; 
    // }

    // public static void main(String[] args) {
    //     Dog.bark();
    // }
}