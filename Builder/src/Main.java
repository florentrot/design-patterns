public class Main {
    public static void main(String[] args) {
        ApartmentBuilder builder = new ApartmentBuilder();
        Apartment ap1 = builder.setSqm(25)
                .setRooms(2)
                .setArea("Center")
                .setCity("Craiova")
                .setKitchen(true).build();
        ap1.display();

        Apartment ap2 = builder.setSqm(40)
                .setRooms(3)
                .setCity("Craiova")
                .setKitchen(true).build();
        ap2.display();
    }
}