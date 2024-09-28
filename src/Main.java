import hashtables.Employee;
import hashtables.StoredEmployee;
import hashtables.chainedHashtable.ChainedHashtable;
import hashtables.simpleHashtables.SimpleHashtables;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Employee janejones = new Employee("jane", "jones", 40);
        Employee johnDoe = new Employee("John", "Doe", 7);
        Employee marySmith = new Employee("Mary", "Smith", 80);
        Employee MikeWilson = new Employee("Mike", "Wilson", 47);

        System.out.println("SimpledHashtable");

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

        System.out.println("JDKHashTable");
        Map<String,Employee> hashMap = new HashMap<String,Employee>();
        hashMap.put("jones", janejones);
        hashMap.put("Doe", johnDoe);
        hashMap.put("Wilson", MikeWilson);
        hashMap.put("Smith", marySmith);

        Employee employee = hashMap.putIfAbsent("Doe", MikeWilson);
        System.out.println(employee);

        System.out.println(hashMap.getOrDefault("Smit",MikeWilson));

        System.out.println(hashMap.remove("jones"));

        System.out.println(hashMap.containsKey("Doe"));
        System.out.println(hashMap.containsValue(janejones));

        hashMap.forEach((k, v) -> System.out.println("Key = " + k + " Employee " + v));
    }
}