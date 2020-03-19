/**
 * DogArraydemo
 */
public class DogArraydemo {

    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog(3);
        dogs[1] = new Dog(55);
        dogs[2] = new Dog(32);

        int i = 0;
        while (i < 3) {
            dogs[i].makeNoise();
            i++;
        }

    }
}