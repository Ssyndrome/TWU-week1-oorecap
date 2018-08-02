import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CircleTest {

    Circle testCircle = new Circle(3);

    @Test
    void should_return_area_when_has_radius() {
        double expectedRadius = Math.PI * 9;
        assertEquals(expectedRadius, testCircle.getRadius(), .000001);
    }
}
