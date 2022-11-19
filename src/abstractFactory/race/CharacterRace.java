package abstractFactory.race;
import abstractFactory.Stats;

public abstract class CharacterRace {
    protected String name;
    protected Stats bonuses;

    public abstract int getRaceBonuses(String type);

    public abstract void battleCry();
}
