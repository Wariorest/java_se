import bridge.StartBridgeCode;
import composite.CompositeStartCode;
import memento.StartMemento;
import prototype.StartPrototypeCode;
import singletone.StartSingletoneCode;

public class Main {
    public static void main(String[] args) {
        //StartSingletoneCode.start(); //use for start Singletone code
        //StartPrototypeCode.run(); //use for start Prototype code
        //CompositeStartCode.run(); //use for run Composite code
        //StartMemento.run();
        StartBridgeCode.run();
    }
}