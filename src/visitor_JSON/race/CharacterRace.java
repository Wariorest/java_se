package visitor_JSON.race;

import visitor_JSON.Stats;
import visitor_JSON.visitor.DataElement;
import visitor_JSON.visitor.DataElementsVisitor;

import java.util.TreeMap;

public abstract class CharacterRace implements DataElement {
    protected String name;
    protected Stats bonuses;

    public abstract int getRaceBonuses(String type);

    public abstract void battleCry();

    @Override
    public TreeMap accept(DataElementsVisitor visitor){
        return visitor.visit(this);
    }
}
