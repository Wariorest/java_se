package singletone;

public class Employee {
    protected int id;
    protected int nextId;
    protected String firstName;
    protected String lastName;
    protected String dept;
    protected double sal;
    protected int managerID;
    Employee(){
        setId(0);
        setFirstName(null);
        setLastName(null);
        setDept(null);
        setSal(0.0);
        setManagerID(0);
    }
    Employee(int id,String firstName, String lastName, String dept, Double sal, int managerID){
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setDept(dept);
        setSal(sal);
        setManagerID(managerID);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNextId() {
        return nextId;
    }

    public void setNextId(int nextId) {
        this.nextId = id + 1;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }
    public void printEmpData(){
        System.out.println("#" +
                this.id + " " +
                this.firstName + " " +
                this.lastName + " dept #" +
                this.dept +  " sal: " +
                this.sal + " mgr id: " +
                this.managerID
        );
    }

}
