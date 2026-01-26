package composite.organization_structure;

public class Employee extends Organization {
    double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double totalSalary() {
        return this.salary;
    }

    @Override
    public void printData() {
        System.out.println("Employee name: " + this.name + " - salary: " + totalSalary());
    }

    @Override
    public void add(Organization organization){
        throw new UnsupportedOperationException("Not supported on leaf");
    }

    @Override
    public void remove(Organization organization) {
        throw new UnsupportedOperationException("Not supported on leaf");
    }

    @Override
    public String toXML(String indent) {
        return indent + "<employee name=\"" +  name + "\" salary=\"" + salary+ "\" />\n";
    }

}
