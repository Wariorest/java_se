package abstractFactory.race;

import abstractFactory.Stats;

public class HumanFactory implements RaceAbstractFactory{

    @Override
    public Human create(){
        return new Human(new Stats(0, 0, 0, 0, 0, 0));
    }
}
