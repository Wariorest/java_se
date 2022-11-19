package abstractFactory.classes;

import abstractFactory.classes.Barbarian;
import abstractFactory.classes.Bard;
import abstractFactory.classes.CharacterClass;

public class ClassFactory {
    public static CharacterClass getClass(String type){
        if("Barbarian".equalsIgnoreCase(type))
            return new Barbarian();
        else if ("Bard".equalsIgnoreCase(type))
            return new Bard();

        return null;
    }
}
