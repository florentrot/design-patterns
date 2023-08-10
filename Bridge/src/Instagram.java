public class Instagram implements App{
    private PhoneOS os;

    public Instagram(PhoneOS os) {
        this.os = os;
    }
    @Override
    public void runApp() {
        System.out.println("---------------");
        os.display("cached data");
        os.upload("instagram data upload");
        os.display("instagram data");
        os.display("fresh data");
        System.out.println("---------------");
    }
}
