/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Employee;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        boolean isExist = validateEmployer(name);
        if(!isExist){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
        }
        else
            return null;
    }
    
    public boolean validateEmployer(String name){
        for(Employee emp : this.employeeList)
            if(emp.getName().equals(name))
                return true;
        return false;
    }
}