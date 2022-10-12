package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 员工类
 * @date 2022/10/8 17:49
 */
public class Employee {
    private String name;//姓名
    private String dept;//部门
    private int salary;//收入
    private ArrayList<Employee> subordinate;//当前员工的下属

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        //用于维护当前员工是否由下属的一个属性
        this.subordinate = new ArrayList<>();
    }

    public void add(Employee employee){
        this.subordinate.add(employee);
    }

    public void remove(Employee employee){
        this.subordinate.remove(employee);
    }

    public List<Employee> getSubordinate(){
        return this.subordinate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", subordinate=" + subordinate +
                '}';
    }
}
