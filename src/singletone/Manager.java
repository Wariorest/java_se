package singletone;

public class Manager extends Employee{

    double bonus;

    Manager(int id, String firstName, String lastName, String dept, Double sal, double bonus, int managerID) {
        super(id, firstName, lastName, dept, sal, managerID);
        setBonus(bonus);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
