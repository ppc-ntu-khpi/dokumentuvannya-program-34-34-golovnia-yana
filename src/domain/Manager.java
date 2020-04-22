package domain;
/**
 * Клас, який представляє менеджера
 * @author Asus
 */
public class Manager extends Employee {
/**
 * Ініціалізує змінні
 * @param employees
 * @param name
 * @param jobTitle
 * @param level
 * @param dept 
 */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }
/**
 * Вивід значень
 * @return String
 */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }
/**
 * Ініціалізує службовців
 * @param employees 
 */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
 /**
  * Ініціалізує
  */   
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;
/**
 * Метод, який отримує занчення зміннної
 * @return s
 */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }
/**
 * Метод, який встановдює змінну employees
 * @param employees 
 */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }
/**
 * Метод, що повертає змінну employees
 * @return employees
 */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
