package Exercice1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("computer");
        list.add("laptop");
        list.add("screen");
        list.add("mouse");
        list.add("keyboard");
        list.add("desktop");
        list.add("development");

        System.out.println("----Q1----");
        list.stream().filter(mot-> mot.contains("a")).forEach(mot-> System.out.println(mot));

        System.out.println("----Q2----");
        list.stream().filter(mot-> mot.length() > 3).map(mot-> new StringBuilder(mot).reverse().toString()).toList().forEach(System.out::println);

        System.out.println("----Q3----");
        list.stream().filter(mot-> mot.contains("e")).flatMap(mot-> mot.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("----Q4----");
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("----Q5----");
        list.stream().map(String::length).forEach(System.out::println);

        System.out.println("----Q6----");
        list.stream().flatMap(mot -> mot.chars().mapToObj(c -> (char) c)).toList().forEach(System.out::println);

        System.out.println("----Q7----");
        List<String > newList = IntStream.range(0, list.size()).mapToObj(i -> list.get(i) + " - " + i).toList();
        newList.forEach(System.out::println);
    }
}