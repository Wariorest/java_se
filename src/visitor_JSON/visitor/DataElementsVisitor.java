package visitor_JSON.visitor;

import visitor_JSON.Stats;

import java.util.TreeMap;
import visitor_JSON.Character;
import visitor_JSON.classes.CharacterClass;
import visitor_JSON.race.CharacterRace;

public interface DataElementsVisitor {
    public TreeMap visit(Character character);
    public TreeMap visit(CharacterClass characterClass);
    public TreeMap visit(CharacterRace characterRace);
    public TreeMap visit(Stats stats);
}
