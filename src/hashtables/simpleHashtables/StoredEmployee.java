package hashtables.simpleHashtables;

import hashtables.Employee;

public class StoredEmployee {  // Added 'class' keyword
    public String key;
    public Employee employee;

    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }
}

