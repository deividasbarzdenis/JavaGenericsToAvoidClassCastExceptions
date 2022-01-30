package org.consideringWildcards;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *     For a given subtype x of type y, and given G as a raw type declaration, G<x> is not a subtype of G<y>.
 *
 * According to this rule, although String and java.lang.Integer are subtypes of java.lang.Object,
 * it’s not true that List<String> and List<Integer> are subtypes of List<Object>.
 *
 * I use a wildcard (the ? symbol) in place of Object in the parameter list and body of printList().
 * Because this symbol stands for any type, it’s legal to pass List<String> and List<Integer> to this method.
 * */
public class GenDemo {
    public static void main(String[] args) {
        List<String> directions = new ArrayList<>();
        directions.add("north");
        directions.add("south");
        directions.add("east");
        directions.add("west");
        printList(directions);
        List<Integer> grades = new ArrayList<>();
        grades.add(98);
        grades.add(63);
        grades.add(87);
        printList(grades);
    }
    static void printList(List<?> list){
        Iterator<?> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
