package facade;

public class StartFacadeCode {
    public static void run(){
        ShapeCreator shapeMaker = new ShapeCreator();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
