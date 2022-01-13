package ru.itsjava.collections.lists.arraylist;

public class MyArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private int realSize;
    private Object[] array;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        boolean rez = true;
        for (int i = 0; i < realSize; i++) {
            if (array[i] != null) {
                rez = false;
            }
        }
        if (rez == true){
            System.out.println("список пуст");
        } else {
            System.out.println("в списке есть объекты");
        }
        return rez;
    }

    public boolean contains(Object o) {
        boolean rez = false;
        for (int i = 0; i < realSize; i++) {
            if (array[i] == o) {
                rez = true;
            }
        }
        if (rez == true){
            System.out.println("список содержит " + o);
        } else {
            System.out.println("список не содержит " + o);
        }
        return rez;
    }

    public boolean add(Object o) {
        if (realSize == array.length) {
            Object[] resArray = new Object[array.length * 3 / 2 + 1];
            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;
            }
        array[realSize++] = o;
        return true;
    }

    public void clear() {
        for (int i = 0; i < realSize; i++) {
            array[i] = null;
        }

    }

    @Override
    public String toString() {
        //  return "MyArrayList{" + Arrays.toString(array) + '}';
        StringBuilder stringBuilder = new StringBuilder("MyArrayList{");
        for (int i = 0; i < realSize; i++) {
            stringBuilder.append(array[i]).append(' ');
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
