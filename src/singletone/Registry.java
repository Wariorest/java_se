package singletone;

import java.util.ArrayList;

public class Registry {

    static Registry instance = null;
    ArrayList <Employee> employers = new ArrayList<>();

    public static Registry getInstance(){
        if(instance == null){
            instance = new Registry();
        }
        return instance;
    }
    public void addEmployeee(Employee emp)throws EmployeeRiegistryException{
        if(employers.contains(emp)){
            throw new EmployeeRiegistryException("Employee: "+
                    emp.getId() + " " +
                    emp.getFirstName() + " " +
                    emp.getLastName() + " is exist already");
        }else{
            employers.add(emp);
        }

    }


}
