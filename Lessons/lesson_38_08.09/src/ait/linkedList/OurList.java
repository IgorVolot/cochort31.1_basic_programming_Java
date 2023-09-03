package ait.linkedList;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public abstract class OurList<E> {


    void append(E o) {

    }

    E get(int index) {
        return null;
    }

    void set(E o, int index) {
    }

    int size() {
        return 0;
    }

    boolean contains(E o) {
        return false;
    }

    boolean remove(E o) {
        return false;
    }

    E removeById(int index) {
        return null;
    }

}
