package visitor_JSON.race;

public class RaceFactory {
    public static CharacterRace getRace(RaceAbstractFactory factory){
        return factory.create();
    }
}
