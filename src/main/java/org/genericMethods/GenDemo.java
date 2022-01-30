package org.genericMethods;

import java.util.ArrayList;
import java.util.List;

public class GenDemo {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<Integer>();
        Integer[] gradeValues = new Integer[]{96, 95, 27, 100, 43, 68};
        for (int i = 0; i < gradeValues.length; i++){
            grades.add(gradeValues[i]);
        }
        List<Integer> failedGrades = new ArrayList<>();
        copy(grades, failedGrades, new Filter<Integer>() {
            @Override
            public boolean accept(Integer grade){
                return grade <= 50;
            }
        });
    }

    /**
     * declared a <T> void copy(List<T> src, List<T> dest, Filter<T> filter) generic method.
     * The compiler notes that the type of each of the src, dest, and filter parameters includes the type parameter T.
     * This means that the same actual type argument must be passed during a method invocation,
     * and the compiler infers this argument by examining the invocation.
     * */
    static <T> void copy(List<T> src, List<T> dest, Filter<T> filter){
        for(int i = 0; i < src.size(); i++){
            if(filter.accept(src.get(i))){
                dest.add(src.get(i));
            }
        }
    }
}
/**
 * You can provide an upper bound for a wildcard by specifying extends followed by a type name. Similarly,
 * you can supply a lower bound for a wildcard by specifying super followed by a type name.
 * These bounds limit the types that can be passed as actual type arguments.
 *
 * In the example, you can interpret ? extends String as any actual type argument that happens
 * to be String or a subclass. Similarly, you can interpret ? super String as any actual type argument
 * that happens to be String or a superclass. Because String is final, which means that it cannot be extended,
 * only source lists of String objects and destination lists of String or Object objects can be passed,
 * which isn’t very useful.
 *
 * You can fully solve this problem by using a generic method, which is a class or instance method with
 * a type-generalized implementation. A generic method declaration adheres to the following syntax:
 *
 * <formalTypeParameterList> returnType identifier(parameterList)
 *
 * A generic method’s formal type parameter list precedes its return type. It consists of type parameters
 * and optional upper bounds. A type parameter can be used as the return type and can appear in the parameter list.
 * */
