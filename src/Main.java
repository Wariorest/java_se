import abstractFactory.StartAbstractFactoryCode;
import bridge.StartBridgeCode;
import composite.CompositeStartCode;
import facade.StartFacadeCode;
import factoryMethod.StartFMCode;
import memento.StartMemento;
import prototype.StartPrototypeCode;
import singletone.StartSingletoneCode;
import treds.StartThreadCode;
import visitor_JSON.StartVisitorCode;

import java.io.IOException;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        //StartSingletoneCode.start(); //use for start Singletone code
        //StartPrototypeCode.run(); //use for start Prototype code
        //CompositeStartCode.run(); //use for run Composite code
        //StartMemento.run();
        //StartBridgeCode.run();
        //StartFacadeCode.run();
        //StartFMCode.run();
        //StartAbstractFactoryCode.run();
        //StartVisitorCode.run();
        StartThreadCode.Run();

    }
}