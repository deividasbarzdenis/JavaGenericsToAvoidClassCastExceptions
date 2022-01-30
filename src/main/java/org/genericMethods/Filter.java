package org.genericMethods;

public interface Filter<T> {
    boolean accept(T o);
}
