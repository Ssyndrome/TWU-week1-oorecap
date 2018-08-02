import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class SquareTest {
    Rectangle rectangle = new Rectangle(2,2);
    @Test
    public void should_return_area_when_given_length() {
        int expected = 4;
        assertEquals(expected,rectangle.getArea());
    }
}
