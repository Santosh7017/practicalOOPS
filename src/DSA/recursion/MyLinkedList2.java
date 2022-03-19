package DSA.recursion;

public class  MyLinkedList2<E>{

//    public static void printNumb(int n) {
//        if(n==0) {
//            return;
//        }
//        System.out.println(n);
//        printNumb(n-1);
//    }
public Node<E> head;
    private int size;
    MyLinkedList2(){
        this.size = 0;
    }
    //	@SuppressWarnings("hiding")
    class Node<E>{

        E data;
        Node<E> next;
        Node<E> prev;


        Node(E data){
            this.data = data;
            //			this.next = null;
            size++;
        }
    }
    // add -first
    public void addFirst(E data) {
        Node<E> newNode = new Node<E>(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;


    }
    //	add last
    public void addLast(E data) {
        Node<E> newNode = new Node<E>(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node<E> currentNode = head;
        while(currentNode.next!= null) {
            currentNode = currentNode.next;

        }
        currentNode.next = newNode;
    }

    // deleter first
    public void deleteFirst() {
        if(head == null) {
            System.out.println("The list is Empty");
            return;
        }
        size--;
        head = head.next;

    }
    // delete last
    public void deleteLast() {
        if(head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
        Node<E> secondLast = head;
        Node<E> lastNode = head.next;
        while(lastNode.next !=null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;

        }
        secondLast.next = null;
    }


    public void DeleteNode(int position) {

        if(position==0){
            head=head.next;
            return;
        }

        Node<E> p=head;
        while(--position>0){
            p=p.next;
        }
        p.next=p.next.next;

    }

    public void deleteFromPos(int pos) {


        Node temp = head;
        for(int i = 0;i<pos-2;i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

    }





    // Reverse linked List

    public void Iterativereverse(){
        if(head == null || head.next == null ) {
            return;
        }

        Node<E> prev = head;
        Node<E> currentNode = head.next;



        while(currentNode != null) {
            Node<E> nextNode = currentNode.next;
            currentNode.next = prev;

            //update
            prev = currentNode;
            currentNode  = nextNode;

        }
        head.next = null;
        head = prev;


    }
    public Node<E> reverseRecursive( Node<E> head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node<E> newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next= null;

        return newHead;
    }

    int countNodes(Node current){
        if(current == null){
           return 0;
        }
        return 1+countNodes(current.next);

    }




    // merge two linkedlist
    public Node<E> merge(Node<E> l1, Node<E> l2) {
        if(head == null) {
            return null;
        }
        Node<E> list1 = l1;
        Node<E> list2 = l2;

        while(list1.next != null){
            list1 = list1.next;
        }
        list1.next = list2;

        //		Node<E> current = head;
        //		Node<E> index = null;
        //		E temp;
        //		while(current !=null) {
        //			index = current.next;
        //			while(index != null) {
        //				if(current.data > index.data ) {
        //				temp = (E) current.data;
        //				current.data = index.data;
        //				index.data = temp;
        //				}
        //				index = index.next;
        //			}
        //			current = current.next;
        //		}
        //
        return list1;
    }


    //print the List
    public void print() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node<E> currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.data + "-> ");
            currentNode = currentNode.next;

        }
        System.out.println("Null");
    }
    public int getSize() {
        return size;
    }





    public static void main(String[] args) {

        MyLinkedList2 ll = new MyLinkedList2();
//        MyLinkedList2 l2 = new MyLinkedList2();


        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);

//        l2.addLast(4);
//        l2.addLast(5);
//        l2.addFirst(6);

        //		ll.merge(ll.head,l2.head);
        //	ll.reverseRecursive(ll.head);
        //		ll.print();
        //
        //		ll.head = ll.reverseRecursive(ll.head);
        //		ll.print();
        //		l2.print();
        //		ll.DeleteNode(1);
        //		ll.print();
        //		System.out.println(ll.getSize());

//        ll.print();
//
//        ll.deleteFromPos(2);
//
//
//
//        System.out.println();
//        ll.print();
//
//        //	ll.Iterativereverse();
//        ll.head = ll.reverseRecursive(ll.head);
//
//
//
//        ll.print();

    }
}
