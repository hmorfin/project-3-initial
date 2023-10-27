package com.example.iterable;


import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bag<T> implements Container<T> {
    List<T> container;

    public Bag() {
        this.container = new ArrayList<T>();
    }


    @Override
    public boolean isEmpty() {
        return container.isEmpty();
    }

    @Override
    public int size() {
        return container.size();
    }

    @Override
    public void add(T item) {
        container.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return container.iterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Container.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Container.super.spliterator();
    }
}


