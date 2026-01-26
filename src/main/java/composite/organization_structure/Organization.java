package composite.organization_structure;

public abstract class Organization {
    public String name;

    public Organization(String name) {
        this.name = name;
    }

    public void printData() {
        System.out.println("name " + this.name + " salary: " + totalSalary());
    }


    public abstract double totalSalary();

    public abstract void add(Organization organization);

    public abstract void remove(Organization organization);

    public abstract String toXML(String indent);

}
