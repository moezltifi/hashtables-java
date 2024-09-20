package hashtables.simpleHashtables;

import hashtables.Employee;

public class SimpleHashtables {
    private Employee[] hashtable;
    public SimpleHashtables() {
        hashtable = new Employee[10];
    }
    public void put(String key,Employee employee) {
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null) {
            System.out.println("Key " + hashedKey + " already exists");
        }else {
            hashtable[hashedKey] = employee;
        }
    }
    public Employee get(String key) {
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }
    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }
}
