public class ShapeFactory {

    public Shape getShape(String type) {
        if(type == null) {
            return null;
        }
        switch (type) {
            case "Round": return new Pizza();
            case "Cylinder": return new Burrito();
            default: throw new IllegalArgumentException("Unknown shape");
        }
    }
}
