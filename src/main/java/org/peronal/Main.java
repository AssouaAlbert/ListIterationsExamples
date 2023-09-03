package org.peronal;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void Iterators1() {
        List<String> list = new ArrayList<>();
        list.add("Apples");
        list.add("Banana");
        list.add("Avocado");
        list.add("Oranges");
        list.add("Pineapples");
        ListIterator<String> it = list.listIterator();
        System.out.println("Start iterator:" + it);
        System.out.println("Start iterator hasNext:" + it.hasNext());
        System.out.println("Start iterator Next:" + it.next());
        System.out.println("Start iterator Next:" + it.next());
        System.out.println("Start iterator Next:" + it.next());
        System.out.println("Start iterator hasPrevious:" + it.hasPrevious());
        System.out.println("Start iterator Previous:" + it.previous());
        System.out.println("Start iterator Next:" + it.next());
        System.out.println("Start iterator Next:" + it.next());
        System.out.println("Start iterator Next:" + it.next());
        // NoSuchElementException thrown when it.next() and it.previous points to null
    }

    public static void Iterators2() {
        List<String> list = new ArrayList<>();
        list.add("Apples");
        list.add("Banana");
        list.add("Banana");
        list.add("Avocado");
        list.add("Oranges");
        list.add(null);
        list.add("Pineapples");
        ListIterator<String> it = list.listIterator();
        System.out.println("Start iterator previousIndex():" + it.previousIndex());
        System.out.println("Start iterator hasNext:" + it.hasNext());
        System.out.println("Start iterator nextIndex:" + it.nextIndex());
        System.out.println("Start iterator Next:" + it.next());
        System.out.println("Start iterator hasNext:" + it.hasNext());
        System.out.println("Start iterator nextIndex:" + it.nextIndex());
        System.out.println("Start iterator Next:" + it.next());
        System.out.println("Start iterator hasNext:" + it.hasNext());
        System.out.println("Start iterator nextIndex:" + it.nextIndex());
        System.out.println("Start iterator Next:" + it.next());
        System.out.println("Start iterator hasNext:" + it.hasNext());
        System.out.println("Start iterator nextIndex:" + it.nextIndex());
        System.out.println("Start iterator Next:" + it.next());
        System.out.println("Start iterator hasNext:" + it.hasNext());
        System.out.println("Start iterator nextIndex:" + it.nextIndex());
        System.out.println("Start iterator Next:" + it.next());
        System.out.println("Start iterator hasNext:" + it.hasNext());
        System.out.println("Start iterator nextIndex:" + it.nextIndex());
        //    NoSuchElementException thrown when it.next() and it.previous points to null
//        System.out.println("Start iterator Next:" + it.next());
        System.out.println("Before Replaced: " + list.get(4));
        replace(list, "Oranges", "WaterMelon");
        System.out.println("After Replaced: " + list.get(4));
        System.out.println("1 Before Replaced: " + list.get(1));
        System.out.println("2 Before Replaced: " + list.get(2));
        replace(list, "Banana", "Mangos");
        System.out.println("1 After Replaced: " + list.get(1));
        System.out.println("2 After Replaced: " + list.get(1));
        System.out.println("2 Before Replaced: " + list.get(5));
        replace(list, null, "Papaya");
        System.out.println("1 After Replaced: " + list.get(5));


    }

    static <E> void replace(List<E> list, E val, E newVal) {
        for (ListIterator<E> it = list.listIterator(); it.hasNext(); )
            if (val == null ? it.next() == null : val.equals(it.next()))
                // it.set replaces the value of the collection in that position with the newVal
                it.set(newVal);
    }

    public static void Iterators3() {
        List<String> list = new ArrayList<>();
        list.add("Apples");
        list.add("Banana");
        list.add("Avocado");
        list.add("Oranges");
        list.add("Pineapples");
        List<String> newList = new ArrayList<>();
        newList.add("Artichoke");
        newList.add("Eggplant");
        newList.add("Asparagus");
        newList.add("Broccoflower");
        newList.add("Broccoli ");
        add(list, list.get(3), newList);
        for (String s : list) {
            System.out.println(s + " ");
        }
    }

    static <E> void add(List<E> list, E val, List<? extends E> newVals) {
        for (ListIterator<E> it = list.listIterator(); it.hasNext(); ) {
            if (val == null ? it.next() == null : val.equals(it.next())) {
                it.remove();
                for (E e : newVals)
                    it.add(e);
            }
        }
    }

    public static void main(String[] args) {
//      Iterators1();
//        Iterators2();
        Iterators3();
    }
}