package factoryMethod;

import factoryMethod.ClassFactory;

public class StartFMCode {

    public static void run(){
        Character character = new Character(
                "Wariorest",
                ClassFactory.getClass("Bard"));
        character.setAttributes(Stats.generate());
        character.printSheet();
    }

}
