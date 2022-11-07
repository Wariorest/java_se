package singletone;

public class StartSingletoneCode {
    public static void start(){
        Registry hr = Registry.getInstance();

        Employee emp = null;

        try {
            emp = new Employee(1,"Vlad1","m","1",100.0,1);
            emp.printEmpData();
            hr.addEmployeee(emp);
        } catch (EmployeeRiegistryException e) {
            e.printStackTrace();
        }
        try {
            emp = new Employee(2,"Vlad2","m","10",200.0,13);
            emp.printEmpData();
            hr.addEmployeee(emp);
        } catch (EmployeeRiegistryException e) {
            e.printStackTrace();
        }
        try {
            emp = new Employee(3,"Vlad3","mmmm","30",333.0,33);
            emp.printEmpData();
            hr.addEmployeee(emp);
        } catch (EmployeeRiegistryException e) {
            e.printStackTrace();
        }
    }
}
