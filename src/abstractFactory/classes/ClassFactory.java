package abstractFactory.classes;

import factoryMethod.Barbarian;
import factoryMethod.Bard;
import factoryMethod.CharacterClass;

public class ClassFactory {
    public static CharacterClass getClass(String type){
        if("Barbarian".equalsIgnoreCase(type))
            return new Barbarian();
        else if ("Bard".equalsIgnoreCase(type))
            return new Bard();

        return null;
    }
}
