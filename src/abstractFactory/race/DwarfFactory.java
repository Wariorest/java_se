package abstractFactory.race;

import abstractFactory.Stats;

public class DwarfFactory implements RaceAbstractFactory{

    @Override
    public Dwarf create(){
        return new Dwarf(new Stats(0, 0, 0, 0, 0, 0));
    }
}
