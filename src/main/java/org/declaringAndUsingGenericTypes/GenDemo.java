package org.declaringAndUsingGenericTypes;

/**
 * Compile Listing 1 (javac GenDemo.java). The (E[]) cast causes the compiler to output a warning about
 * the cast being unchecked. It flags the possibility that downcasting from Object[] to E[] might violate
 * type safety because Object[] can store any type of object.
 *
 * Note, however, that there is no way to violate type safety in this example. It’s simply not possible to store
 * a non-E object in the internal array. Prefixing the Container(int size) constructor with
 * @SuppressWarnings("unchecked") would suppress this warning message.
 * */
public class GenDemo {
    public static void main(String[] args) {
        Container<String> con = new Container<String>(5);
        con.add("North");
        con.add("South");
        con.add("East");
        con.add("West");
        for(int i = 0; i < con.size(); i++){
            System.out.println(con.get(i));
        }
    }
}
