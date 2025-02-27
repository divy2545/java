

import LinkedList.LinkedList;

public class main {
    public static void main(String[] args) {
       LinkedList list = new LinkedList();
       list.insertFirst(3);
       list.insertFirst(2);
       list.insertFirst(10);
       list.insertFirst(27);
       list.insertLast(99);
       list.insert(12,3);
       System.out.println(list.deleteFirst());
       System.out.println(list.deleteLast());
       System.out.println(list.delete(1));
       list.display();



    

    }
}
