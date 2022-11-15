package facade;

public class ShapeCreator {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeCreator(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
