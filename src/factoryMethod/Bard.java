package factoryMethod;

public class Bard extends CharacterClass{
    private String skill;

    public Bard(){
        this.name = "Bard";
        this.dice = 8;
        this.skill = "Charm person#Heroism";
    }
    private String chooseCastedSkill(int skillNumber){
        String skills[];
        skills =this.skill.split("#");
        String chosenSkill = skills[skillNumber - 1];
        return chosenSkill;
    }
    @Override
    public void skillCast(){
        System.out.println("Class " + name + "can cast skill " + skill);
    }
    public void skillCast(int skillNumber){
        String castSkill = chooseCastedSkill(skillNumber);
        System.out.println("Class " + name + "can cast skill " + castSkill);
    }

}
