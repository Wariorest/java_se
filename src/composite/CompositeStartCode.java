package composite;

public class CompositeStartCode {
    public static void run(){
        Registry hr = Registry.getRegistry();

        Manager mgr = null;
        try{
            mgr = new Manager("Vlad", "m", 3000, 200, 0);
            mgr.printemployee();
            hr.addEmployee(mgr);
        } catch (FieldLengthLimitException e){
            System.out.println(e.getMessage());
        } catch (IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeInRegistryException e){
            System.out.println(e.getMessage());
        }

        Employee salesHead = null;
        try{
            salesHead = new Employee("Vlad2", "m", 2000, mgr.id);
            salesHead.printemployee();
            hr.addEmployee(salesHead);
        } catch (FieldLengthLimitException e){
            System.out.println(e.getMessage());
        } catch (IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeInRegistryException e){
            System.out.println(e.getMessage());
        }

        Employee marketingHead = null;
        try{
            marketingHead = new Employee("Vlad3", "m", 1000, mgr.id);
            marketingHead.printemployee();
            hr.addEmployee(marketingHead);
        } catch (FieldLengthLimitException e){
            System.out.println(e.getMessage());
        } catch (IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeInRegistryException e){
            System.out.println(e.getMessage());
        }

        Employee emp = null;
        try{
            emp = new Employee("Vlad4", "m", 700, salesHead.id);
            emp.printemployee();
            hr.addEmployee(emp);
        } catch (FieldLengthLimitException e){
            System.out.println(e.getMessage());
        } catch (IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeInRegistryException e){
            System.out.println(e.getMessage());
        }

        mgr.add(salesHead);
        mgr.add(marketingHead);

        salesHead.add(emp);

        System.out.println("\nEmployee List:");
        mgr.printemployee();
        for (Employee headEmployee : mgr.getManager()) {
            System.out.print("  ");
            headEmployee.printemployee();

            for (Employee emp_t : headEmployee.getManager()){
                System.out.print("       ");
                emp_t.printemployee();
            }
        }

    }
}

