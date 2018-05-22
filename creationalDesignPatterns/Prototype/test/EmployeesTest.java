package test;

import java.util.List;
import beans.Employees;

public class EmployeesTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        Employees empsNew1 = (Employees) emps.clone();
        Employees empsNew2 = (Employees) emps.clone();

        List<String> list1 = empsNew1.getEmpList();
        list1.add("Teng");
        List<String> list2 = empsNew2.getEmpList();
        list2.remove("Paul");

        System.out.println("emps List:" + emps.getEmpList());
        System.out.println("empsNew1 List:" + list1);
        System.out.println("empsNew2 List:" + list2);
    }
}
