import hashtables.Employee;
import hashtables.chainedHashtable.ChainedHashtable;
import hashtables.simpleHashtables.SimpleHashtables;

public class Main {
    public static void main(String[] args) {

        Employee janejones = new Employee("jane", "jones", 40);
        Employee johnDoe = new Employee("John", "Doe", 7);
        Employee marySmith = new Employee("Mary", "Smith", 80);
        Employee MikeWilson = new Employee("Mike", "Wilson", 47);

        SimpleHashtables ht = new SimpleHashtables();
        ht.put("jones", janejones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", MikeWilson);
        ht.put("Smith", marySmith);

        ht.printHashtable();
        System.out.println("Retrieve key Wilson" + ht.get("Wilson"));
        System.out.println("Retrieve key Smith" + ht.get("Smith"));

        ht.remove("jones");
        ht.remove("Wilson");
        ht.printHashtable();
        System.out.println("Retrieve key Smith" + ht.get("Smith"));
        System.out.println("ChainedHashtable");

        ChainedHashtable cht = new ChainedHashtable();
        cht.put("jones", janejones);
        cht.put("Doe", johnDoe);
        cht.put("Wilson", MikeWilson);
        cht.put("Smith", marySmith);

        cht.printHashtable();
        System.out.println("Retrieve key Wilson" + cht.get("Wilson"));
        System.out.println("Retrieve key Smith" + cht.get("Smith"));

        cht.remove("jones");
        cht.printHashtable();
        System.out.println("Retrieve key Smith" + cht.get("Smith"));

    }
}