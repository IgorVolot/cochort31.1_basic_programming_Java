import ait.linkedList.OurLinkedList;
import ait.linkedList.Person;

import java.util.LinkedList;
import java.util.List;

import static ait.linkedList.OurLinkedList.printList;

public class Main {
    // LinkedList methods  методы отличающиеся от ArrayList
    /*
    addFirst() / offerFirst() -  добавляет элт в начало листа
    addLast() / offerLast()   добавляет последний
    removeFirst() / pollFirst() - удаляет первый элт из начала
    removeLast()  / pollLast() - удаляет полследний
    getFirst() /  peekFirst() -  получить первый
    getLast() /  peekLast() -  получить последний
     */
    public static void main(String[] args) {

        OurLinkedList <String> list = new OurLinkedList();
        Person p1 = new Person("Jack");
        list.append(String.valueOf(p1));

        list.append(new Person("John").toString());

        System.out.println(list.get(1));

        list.set(String.valueOf(new Person("Oleg")), 1);
        System.out.println(list.get(1));




//        List<String> strings = new LinkedList<>();
        LinkedList<String> names = new LinkedList<>();

        names.add("Jack");
        names.add("John");
        names.add("Bill");

        System.out.println(names);

        names.addFirst("Ann");

        System.out.println(names);

        names.removeFirst();
        System.out.println(names);
        System.out.println(names.peekFirst());

        System.out.println("====================  List to print ===========================");

        printList(names);

    }



}