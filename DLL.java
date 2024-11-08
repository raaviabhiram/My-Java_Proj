package com.properties.abhiram.linkedlist;

public class DLL {

    Node head ;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head ;
        node.prev = null ;
        if(head !=null) {
            head.prev = node;
        }
        head = node ;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head ;
        if(head==null) {
            node.prev = null;
            node = head ;
            return;
        }
        while(last.next != null){
            last = last.next ;
        }
        last.next = node ;
        node.prev = last ;

    }

    public void insert(int after , int val){
        Node p = find(after) ;
        Node node = new Node(val);
        node.next = p.next ;
        p.next = node ;
        node.prev = p ;
        if(node.next !=null){
            node.next.prev = node ;
        }

    }

    public void deleteFirst(){
        int val = head.val ;
        head.next.prev = null ;
        head = head.next ;
    }
    public void deleteLast(){
        Node last = head ;
        while(last.next != null){
            last = last.next ;
        }
        last.prev.next = null ;
        last = last.prev ;
    }

    public void delete(int after){
        Node p = find(after);
        p.next.next.prev = p ;
        p.next = p.next.next ;
    }

    private Node find(int position){
        Node temp = head ;
        while(temp!=null){
            if(temp.val == position){
                return temp ;
            }
            temp = temp.next;
        }
        return null ;
    }

    public void display(){
        Node node = head ;
        Node last = null ;
        while(node!=null){
            System.out.print(node.val + " -> ");
            last = node ;
            node = node.next ;
        }
        System.out.println("END");

        System.out.println("Printing in reverse order");
        while(last!=null){
            System.out.print(last.val + " -> ");
            last = last.prev ;
        }
        System.out.println("START");
    }

    private class Node{
        int val ;
        Node next ;
        Node prev ;
        public Node(int val){
            this.val = val ;
        }
        public Node(int val , Node next , Node prev){
            this.val = val;
            this.next = next ;
            this.prev = prev ;
        }


    }
}
