import hashtables.Employee;
import hashtables.simpleHashtables.SimpleHashtables;


public class Main {
    public static void main(String[] args) {

        Employee janejones = new Employee("jane", "jones", 40);
        Employee johnDoe = new Employee("John", "Doe", 7);
        Employee marySmith = new Employee("Mary", "Smith", 80);
        Employee MikeWilson = new Employee("Mike", "Wilson", 47);
        Employee billEnd = new Employee("bill", "End", 20000);

        SimpleHashtables ht = new SimpleHashtables();
        ht.put("jones", janejones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", marySmith);
        ht.put("Smith", marySmith);

        ht.printHashtable();
        System.out.println("Retrieve key Wilson" + ht.get("Wilson"));
    }
}