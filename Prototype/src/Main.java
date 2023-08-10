public class Main {
    public static void main(String[] args) {

        Vehicle c1 = new Car(4, 4000, "red");
        Vehicle c2 = c1.clone();

        c2.isClone(c1);
        c1.isClone(c2);

        Vehicle b1 = new Bicycle(2, 300, true);
        Vehicle b2 = b1.clone();

        b2.isClone(b1);
        b1.isClone(b2);

        //Test not clones
        Vehicle v1 = new Car(6, 7900, "white");
        Vehicle v2 = new Car(6, 7800, "white");
        Vehicle v3 = v2.clone();
        v3.price = 8000;

        v1.isClone(v2);
        v2.isClone(v1);
        v3.isClone(v2);
        c1.isClone(b1);
    }
}