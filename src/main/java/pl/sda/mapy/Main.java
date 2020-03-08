package pl.sda.mapy;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Generyka<String> generyka = new Generyka<String>("Test");
//        System.out.println(generyka.getField());
        Generyka<Integer> generyka2 = new Generyka<Integer>(23222);
//        System.out.println(generyka2.getField());

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Jan");
        map.put(2, "Maciej");
        map.put(3, "Barbara");
        map.put(4, "Kamila");

        for (Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println("Klucz: " + entry.getKey() + " / Wartość: " + entry.getValue());
        }

    }

}
