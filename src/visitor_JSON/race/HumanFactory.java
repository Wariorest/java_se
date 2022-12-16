package visitor_JSON.race;
import visitor_JSON.Stats;
public class HumanFactory implements RaceAbstractFactory{

    @Override
    public Human create(){
        return new Human(new Stats(0, 0, 0, 0, 0, 0));
    }
}