package com.tukku.arraylist;

import java.util.Arrays;

public class MyArrayList<T> {
    private static int DEFAULT_CAPACITY = 10;
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
    T[] elementData;
    int size = 10;
    int modCount = 0;

    public void add(T data) {
        ensureCapacity(size+1);
    }

    private void ensureCapacity(int size) {
        int minCapacity = calculateCapacity(size);
        modCount ++;
        if ( minCapacity - elementData.length > 0)
            grow(minCapacity);
    }

    private void grow(int minCapacity) {
        // overflow-conscious code
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        // minCapacity is usually close to size, so this is a win:
        elementData = Arrays.copyOf(elementData, newCapacity);
    }
    private static int hugeCapacity(int minCapacity) {
        if (minCapacity < 0) // overflow
            throw new OutOfMemoryError();
        return (minCapacity > MAX_ARRAY_SIZE) ?
                Integer.MAX_VALUE :
                MAX_ARRAY_SIZE;
    }
    private int calculateCapacity(int capacity) {
        if (Arrays.asList(elementData).isEmpty()){
            return Math.max(DEFAULT_CAPACITY,capacity);
        }
        return capacity;
    }
}
