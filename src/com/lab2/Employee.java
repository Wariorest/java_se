package com.lab2;

public class Employee {
    String full_name;
    String dName; //department name
    double sal;
    int id;
    int manager_id;

    public Employee(String full_name,String dept_name, double sal, int id, int manager_id ){
        setFull_name(full_name);
        setdName(dept_name);
        setSal(sal);
        setId(id);
        setManager_id(manager_id);
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getdName() {
        return dName;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getSal() {
        return sal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public int getManager_id() {
        return manager_id;
    }
}
