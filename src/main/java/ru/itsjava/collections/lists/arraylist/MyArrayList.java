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
//        for (int i = 0; i < realSize; i++) {
//            if (array[i] != null) {
//                rez = false;
//            }
//        }
        if (realSize != 0) {
            rez = false;
        }

        if (rez) {
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
        if (rez == true) {
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
        realSize = 0;
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

    public boolean remove(Object o) {
        int delIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(o)) {
                delIndex = i;
                break;
            }
        }
        for (int i = delIndex; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        if (delIndex == -1) {
            return false;
        } else {
            realSize--;
            return true;
        }
    }

    public Object remove(int index) {
        checkIndex(index);
        Object resElement = array[index];
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];

        }
        realSize--;
        return resElement;
    }

    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректен размер массива");
        }
    }

    private boolean isCorrectIndex(int index) {
        if ((index > -1) && (index < realSize)) {
            return true;
        }
        return false;
    }

    public Object get(int index) {
        checkIndex(index);
        Object gettingValue = array[index];
//        for (int i = 0; i < array.length; i++) {
//            if (i == index) {
//                gettingValue = array[i];
//            }
//        }
        return gettingValue;
    }

    public Object set(int index, Object element) {
        checkIndex(index);
//        for (int i = 0; i < array.length; i++) {
//            if (i == index) {
//                array[i] = element;
//            }
//        }
        array[index] = element;
        return element;
    }

    public void add(int index, Object element) {
        checkIndex(index);
        if (realSize == array.length) {
            Object[] resArray = new Object[array.length * 3 / 2 + 1];
            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;
        }
        realSize++;
        int insertIndex = index;
        for (int i = array.length - 2; i >= insertIndex; i--) {
            array[i + 1] = array[i];
        }
//        for (int i = 0; i < array.length; i++) {
//            if (i == index) {
//                array[i] = element;
//            }
//        }
        array[index] = element;

    }

    public int indexOf(Object o) {
        int myIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(o)) {
                myIndex = i;
                System.out.println(myIndex);
                break;
            }
        }
        return myIndex;
    }

    public int lastIndexOf(Object o) {
        int myIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(o)) {
                myIndex = i;
            }
        }
        return myIndex;
    }

    public int getSize() {
        return realSize;
    }

}
