package org.example.ConstructorInjection;

public class Department {
    private int dept_id;
    private String Dept_name;

    public Department(int dept_id, String dept_name) {
        this.dept_id = dept_id;
        Dept_name = dept_name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dept_id=" + dept_id +
                ", Dept_name='" + Dept_name + '\'' +
                '}';
    }
}
