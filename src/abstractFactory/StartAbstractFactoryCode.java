package abstractFactory;

import abstractFactory.race.DwarfFactory;
import abstractFactory.race.RaceFactory;
import abstractFactory.classes.ClassFactory;

import java.util.Objects;

public class StartAbstractFactoryCode {
    public static void run(){
        Character character = new Character("Wariorest",
                Objects.requireNonNull(ClassFactory.getClass("abstractFactory.classes.Barbarian")),
                RaceFactory.getRace(new DwarfFactory()));
        character.setAttributes(Stats.generate());
        character.addRaceBonuses();
        character.printSheet();
    }
}
