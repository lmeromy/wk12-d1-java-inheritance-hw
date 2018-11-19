package management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, int NInum, int salary, String deptName) {
        super(name, NInum, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
