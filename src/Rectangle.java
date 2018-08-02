public class Rectangle {

    private final int height, width;
    Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int getArea() {
        return this.height*this.width;
    }

    public int getPerimeter() {
        return (this.height+this.width)*2;
    }
}
