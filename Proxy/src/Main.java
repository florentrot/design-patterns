public class Main {
    public static void main(String[] args) {

        Image image = new ProxyImage("texst.png");

        image.display();
        System.out.println("-----------");
        image.display();
    }
}