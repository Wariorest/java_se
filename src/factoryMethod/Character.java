package factoryMethod;

import factoryMethod.CharacterClass;

import java.util.Set;

public class Character {
    private String name;
    private factoryMethod.CharacterClass dndClass;
    private Stats attributes;
    private int hp;

    public Character(String name, CharacterClass dndClass){
        this.name = name;
        this.dndClass = dndClass;
        this.hp = dndClass.roll();
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stats getAttributes() {
        return attributes;
    }

    public void setAttributes(Stats attributes) {
        this.attributes = attributes;
    }

    public void addRaceBonuses(){
        Set<String> key = this.attributes.getStats().keySet();

        for(String title : key){
            int val = this.attributes.getStats().get(title);
            this.attributes.getStats().put(title, val);
        }

        this.hp += Math.floor(this.attributes.getStats().get("Constilation")/2) - 6;
    }

    public void printSheet(){
        System.out.println("Name of character: " + name + "\n"
                + dndClass.toString() + "\n"
                + "HP: " + hp);
        dndClass.skillCast();
        attributes.print();
    }
}
