package hashtables.simpleHashtables;

import hashtables.Employee;

public class SimpleHashtables {
    private StoredEmployee[] hashtable;  // Corrected name

    public SimpleHashtables() {
        hashtable = new StoredEmployee[10];  // Corrected name
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if (occupied(hashedKey)) {
            int stopIndex = hashedKey;
            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }
            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }
        if (occupied(hashedKey)) {
            System.out.println("Key " + hashedKey + " already exists");
        } else {
            hashtable[hashedKey] = new StoredEmployee(key, employee);  // Create StoredEmployee instance
        }
    }

    public Employee get(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        }
        return hashtable[hashedKey].employee;
    }

    public Employee remove(String key){
        int hashedKey = findKey(key);
        if (hashedKey == - 1){
            return null;
        }
        Employee employee = hashtable[hashedKey].employee;
        hashtable[hashedKey]= null;
        return employee;
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }
        int stopIndex = hashedKey;
        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }
        while (hashtable[hashedKey] != null &&
                hashedKey != stopIndex &&
                !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }
        if (hashtable[hashedKey] != null &&
                hashtable[hashedKey].key.equals(key)){
                return hashedKey;
        }else {
            return -1;
        }
    }

    private boolean occupied(int index) {
        return hashtable[index] != null;
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] != null) {
                System.out.println("Index " + i + ": " + hashtable[i].employee);
            } else {
                System.out.println("Index " + i + ": null");
            }
        }
    }

}
