package org.example.ConstructorInjection;

public class Employee {

    private int id;
    private String name;
    private Department department;

    public Employee(int id, String name, Department department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department=" + department +
                '}';
    }
    public  void display(){
        System.out.println(id+" "+name);
        System.out.println(department.toString());
    }
}
