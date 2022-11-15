package bridge;

public class StartBridgeCode {
    public static void run(){
        Shape redCircle = new Circle(10, 10, 6, new RedPen());
        Shape redSquare = new Square(9, 9, 5, new RedPen());

        redCircle.draw();
        redSquare.draw();

        Shape greenCircle = new Circle(8, 8, 4, new GreenPen());
        Shape greenSquare = new Square(7, 7, 3, new GreenPen());

        greenSquare.draw();
        greenCircle.draw();
    }
}
