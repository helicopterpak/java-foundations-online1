package ru.itsjava.collections.lists.linkedlist;

public class MyLinkedList {
    private Node head;

    public int size() {
        int realSize;
        if (head == null) {
            realSize = 0;
        } else {
            Node curNode = head;
            realSize = 1; //ПРАВИЛЬНО ДОБАВИЛА?? умничка
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
                realSize++;
            }
        }
        return realSize;
    }

    public boolean isEmpty() {
//        if (head != null) {
//        rez = false;}
//        равнозначны ли эти два варианта?
//        boolean rez = false;
//        if (head == null) {
//            rez = true;
//        }
        return head == null;
    }

    public boolean contains(Object o) {
        Node curNode = head;
        boolean rez = false;
        while (curNode != null) {
            if (curNode.getValue().equals(o)) {
                rez = true;
            }
            curNode = curNode.getNext();
        }
        return rez;
    }

    public boolean add(Object o) {
        Node rezNode = new Node(o, null);
        if (head == null) {
            head = rezNode;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(rezNode);
        }
        return true;
    }

    public boolean remove(Object o) {
        if (head == null) return false;
        if (head.getValue().equals(o)) {
            head = head.getNext();
            return true;
        }
        if (head.getNext() == null) return false;
        Node curNode = head;
        Node prevNode = head;
        while ((curNode = curNode.getNext()) != null) {
        if (curNode.getValue().equals(o)) {
            break;
        }
        prevNode = prevNode.getNext();
        }
        if (curNode == null) return false;
        prevNode.setNext(curNode.getNext());
        curNode.setNext(null);

        return true;
    }

    public void clear() {
        Node prevNode = head; //присваеваем переменной предыдущего значения первый элемент
        Node curNode = head; //присваеваем переменной текущего значения первый элемент

        while ((curNode = curNode.getNext()) != null) { //пробегаемся по листу до предпоследнего элемента
            prevNode.setValue(null);
            prevNode.setNext(null);
            prevNode = curNode; //присваиваем предыдущему значению стоящий после него элемент
        }
        head = null;
    }

    public Object get(int index) {
        checkIndex(index);
        int count = 0;
        Node curNode = head;
        while (curNode.getNext() != null) {
            if (count++ == index) {
                break;
            }
            curNode = curNode.getNext();
        }

        return curNode.getValue();
    }

    public Object set(int index, Object element) {
        checkIndex(index);
        Object resValue = null;
        int count = 0;
        Node curNode = head;
        while (curNode.getNext() != null) {
            if (count++ == index) {
                resValue = curNode.getValue();
                curNode.setValue(element);
            }
            curNode = curNode.getNext();
        }
        return resValue;
    }

    public void add(int index, Object element) {
        checkIndex(index); //проверяем корректность индекса
        Node resNode = new Node(element, null);
        Node curNode = head;// присваиваем переменной значение нулевого узла
        Node nextNode = head.getNext();// присваиваем переменной узел, следующий за нулевым
        for (int i = 0; i <= index; i++) {//пробегаемся по листу
            if (i == 0) {
                head = resNode;
                resNode.setNext(curNode);
                break;
            } else {
                if (i == index) {// если нашли искомый узел по индексу
                    curNode.setNext(resNode);
                    resNode.setNext(nextNode);
                    break;
                }
            }
            curNode = curNode.getNext();//присваиваем переменной следующий узел
            nextNode = nextNode.getNext();//присваиваем переменной следующий узел
        }
    }
    //}

    // O0-> 11-> 22-> "33->" 44-> 55
    // i=0 cur=1 i=1 [1]=22 NEXT=2
    //i=1 cur=2 i=2 [2] = 33 next=3
    //i=2 cur=3 i=3 [3]=44 next=3 cur=24

    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректен размер массива");
        }
    }

    private boolean isCorrectIndex(int index) {
        if ((index > -1) && (index < size())) {
            return true;
        }
        return false;
    }

    public Object remove(int index) {
        checkIndex(index); //проверка на существование индекса в листе
        if (index == 0) { //алгоритм удаления для первой позиции листа
            Object resValue = head.getValue(); //присвоение удаляемому значению значение с нулевым индексом (первый элемент)
            if (head.getNext() == null) { //проверяем, единственный ли это элемент в листе
                head = null; //если единственный, зануляем его
            } else { //если не единственный
                head = head.getNext(); //присваиваем нулевому элементу первый. ВОПРОС: ПРИСВОИТСЯ ЛИ ПО ЦЕПОЧКЕ ПЕРВОМУ ЭЛЕМЕНТУ ВТОРОЙ И Т.Д?
            }
            return resValue; //возвращаем удаляемый элемент
        }

        Node curNode = head; //присваеваем переменной текущего значения первый элемент
        Node prevNode = head; //присваеваем переменной предыдущего значения первый элемент

        int count = 0; //создаём счётчик
        while ((curNode = curNode.getNext()) != null) { //пробегаемся по листу до предпоследнего элемента
            count++; //увеличиваем счётчик на 1
            if (count == index) { //если счётчик равен искомому индексу, значит нашли нужный элемент
                break; //выходим из цикла
            }
            prevNode = prevNode.getNext(); //присваиваем предыдущему значению стоящий после него элемент
        }
        if (curNode == null) return false;


        Object resValue = curNode.getValue(); //присваиваем переменной значение текущего элемента

        if (curNode.getNext() == null) { //проверка, если текущий элемент последний
            prevNode.setNext(null); //зануляем элемент после предыдущего элемента
        } else { //если не последний
            prevNode.setNext(curNode.getNext()); //присваиваем элементу после предыдущего, значение следующего за текущим
            curNode.setNext(null); //зануляем элемент после текущего. ВОПРОС: ЗАЧЕМ? ЕСЛИ ПОСЛЕ НЕГО МОГУТ БЫТЬ ЕЩЁ ЭЛЕМЕНТЫ
        }
        return resValue; //возвращаем значение удаляемого элемента
    }

    public int indexOf(Object o) {
        int count = 0;
        int index = 0;
        checkObject(o);
        Node curNode = head;
        while (curNode.getNext() != null) {
            if (curNode.getValue().equals(o)) {
                index = count;
                break;
            }
            curNode = curNode.getNext();
            count++;
        }
        if (curNode.getNext() == null) {
            if (curNode.getValue().equals(o)) {
                index = (size() - 1);
            }
        }
        return index;
    }

    private void checkObject(Object o) {
        if (!isCorrectObject(o)) {
            throw new ArrayIndexOutOfBoundsException("В листе нет данного элемента");
        }
    }

    private boolean isCorrectObject(Object o) {
        if (contains(o)) {
            return true;
        }
        return false;
    }

    public int lastIndexOf(Object o) {
        int count = 0;
        int index = 0;
        checkObject(o);
        Node curNode = head;
        while (curNode.getNext() != null) {
            if (curNode.getValue().equals(o)) {
                index = count;
            }
            curNode = curNode.getNext();
            count++;
        }
        if (curNode.getNext() == null) {
            if (curNode.getValue().equals(o)) {
                index = (size() - 1);
            }
        }
        return index;
    }

    @Override
    public String toString() {
        return "MyLinkedList{ " + "head = " + head + " }";
    }
}
