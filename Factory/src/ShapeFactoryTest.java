import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShapeFactoryTest {
        ShapeFactory factory = new ShapeFactory();
        Shape roundFood = factory.getShape("Round");
        Shape cylinderFood = factory.getShape("Cylinder");


    @Test
    public void factoryMethodTest() {
        assertEquals("Round", roundFood.getShape());
        assertEquals("Cylinder", cylinderFood.getShape());
    }
}