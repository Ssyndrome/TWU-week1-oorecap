import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Test {

    Rectangle rectangle = new Rectangle(2, 3);

   @org.junit.Test

    public void should_return_area_when_has_height_and_width() throws Exception {
       int expectedArea = 6;
       int unexpectedArea = 4;
       assertEquals(expectedArea, rectangle.getArea());
       assertNotEquals(unexpectedArea, rectangle.getArea());
   }

    @org.junit.Test
    public void should_return_perimeter_when_has_height_and_width() {
        int expectedPerimeter = 10;
        assertEquals(expectedPerimeter,rectangle.getPerimeter());
    }
}
