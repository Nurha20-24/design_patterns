package composite.organization_structure;

import java.util.ArrayList;
import java.util.List;

public class Department extends Organization{

    public List<Organization> children = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public double totalSalary() {
        double total = 0;
        for (Organization child : this.children) {
             total += child.totalSalary();
        }
        return total;
    }


    @Override
    public void printData() {
        System.out.println("Department name: " + this.name + " - total salary: " + totalSalary());
    }


    @Override
    public void add(Organization organization) {
        this.children.add(organization);
    }

    @Override
    public void remove(Organization organization) {
        this.children.remove(organization);
    }

    @Override
    public String toXML(String indent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(indent).append("<department name=\"").append(this.name).append("\">\n");
        for (Organization child : this.children) {
            stringBuilder.append(child.toXML(indent + " "));
        }
        stringBuilder.append("</department>\n");
        return stringBuilder.toString();
    }

}
