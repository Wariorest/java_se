package com.lab2;

public class Manager extends Employee{

    double bonus;

    public Manager(String full_name, String dept_name, double sal, double bonus, int id, int manager_id) {
        super(full_name, dept_name, sal, id, manager_id);
        setBonus(bonus);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
}
