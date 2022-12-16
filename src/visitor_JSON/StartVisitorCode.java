package visitor_JSON;

import org.json.simple.JSONObject;
import visitor_JSON.classes.ClassFactory;
import visitor_JSON.race.DwarfFactory;
import visitor_JSON.race.HumanFactory;
import visitor_JSON.race.RaceFactory;
import visitor_JSON.visitor.DataElement;
import visitor_JSON.visitor.ElementVisitor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StartVisitorCode {
    public static void run() throws IOException {
        ElementVisitor visitor = new ElementVisitor();
        FileWriter file = new FileWriter("Characters.json");
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("Characteristics", "Values");

        file.write("[");

        Character character1 = new Character("Wariorest", ClassFactory.getClass("classes.Barbarian"), RaceFactory.getRace(new HumanFactory()));
        putCharacterToJSON(character1, jsonObject, file, visitor);

        Character character2 = new Character("Farahorn", ClassFactory.getClass("classes.Barbarian"), RaceFactory.getRace(new DwarfFactory()));
        file.write(",");
        putCharacterToJSON(character2, jsonObject, file, visitor);

        file.write("]");
        file.flush();

        file.close();
    }

    public static void putCharacterToJSON(Character character, JSONObject jsonObject, FileWriter file, ElementVisitor visitor) throws IOException {
        List<DataElement> list = new ArrayList<>();

        character.setAttributes(Stats.generate());
        character.addRaceBonuses();

        list.add(character);
        list.add(character.getDndClass());
        list.add(character.getRace());
        list.add(character.getAttributes());

        for (DataElement val : list){
            jsonObject.putAll(val.accept(visitor));
        }

        file.write(jsonObject.toJSONString());
        list.clear();
        file.flush();
    }
}

