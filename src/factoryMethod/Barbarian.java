package factoryMethod;

import abstractFactory.CharacterClass;

public class Barbarian extends CharacterClass {
    private String skill;

    public Barbarian(){
        this.name = "Barbarian";
        this.dice = 12;
        this.skill = "Battle Rage";
    }

    @Override
    public void skillCast(){
        System.out.println("Class " + name + "can cast skill " + skill);
    }
}
