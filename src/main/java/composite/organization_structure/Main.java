package composite.organization_structure;
/*
    The goal is to design an application that represents and keeps track
    of an organizational structure using the Composite design pattern.
 */

public class Main {
    public static void main(String[] args) {
        Organization itDepartment = new Department("IT department");
        Organization hrDepartment = new Department("HR department");
        Organization developerDepartment = new Department("Developer department");

        Organization employee = new Employee("Sara", 3000);
        Organization employee2 = new Employee("Mala", 4000);
        Organization employee3 = new Employee("Alice", 2200);
        Organization employee4 = new Employee("Venessa", 3500);
        Organization employee5 = new Employee("Maija", 2500);
        Organization employee6 = new Employee("Kaisa", 3200);
        Organization employee7 = new Employee("Lira", 2800);

        developerDepartment.add(employee6);
        developerDepartment.add(employee7);



        itDepartment.add(employee);
        itDepartment.add(employee2);
        itDepartment.add(employee5);
        itDepartment.add((developerDepartment));
        itDepartment.printData();

        employee.printData();
        employee2.printData();

        System.out.println("--After removed employee");
        itDepartment.remove(employee);
        developerDepartment.remove(employee7);
        itDepartment.printData();


        System.out.println();
        System.out.println(itDepartment.toXML(""));


        hrDepartment.add(employee4);
        hrDepartment.add(employee3);
        System.out.println(hrDepartment.toXML(""));
    }
}
