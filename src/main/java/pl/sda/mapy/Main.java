package pl.sda.mapy;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Generyka<String> generyka = new Generyka<String>("Test");

        System.out.println(generyka.getField());


        Generyka<Integer> generyka2 = new Generyka<Integer>(23222);

        System.out.println(generyka2.getField());



    }

}
