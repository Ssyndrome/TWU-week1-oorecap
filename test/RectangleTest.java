import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RectangleTest {

    Rectangle rectangle = new Rectangle(2, 3);

   @Test

    public void should_return_area_when_has_height_and_width() throws Exception {
       int expectedArea = 6;
       int unexpectedArea = 4;
       assertEquals(expectedArea, rectangle.getArea());
       assertNotEquals(unexpectedArea, rectangle.getArea());
   }

    @Test
    public void should_return_perimeter_when_has_height_and_width() {
        int expectedPerimeter = 10;
        assertEquals(expectedPerimeter,rectangle.getPerimeter());
    }
}
