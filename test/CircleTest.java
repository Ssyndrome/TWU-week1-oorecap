import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CircleTest {

    Circle testCircle = new Circle(3);

    @Test
    public void should_return_area_when_has_radius() {
        double expectedRadius = Math.PI * 9;
        assertEquals(expectedRadius, testCircle.getRadius(), .000001);
    }
}
