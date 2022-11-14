package composite;


import java.util.ArrayList;

public class Registry {

    static Registry instance = null;

    private ArrayList<Employee> workers = new ArrayList<>();

    private Registry(){}

    public static Registry getRegistry(){
        if (instance == null) instance = new Registry();

        return instance;
    }

    public void addEmployee(Employee emp) throws EmployeeInRegistryException {
        if(workers.contains(emp)){
            throw new EmployeeInRegistryException("Employee " + emp.name + " is already exist");
        } else {
            workers.add(emp);
        }
    }

}
