package com.ds;

public class MyLinkedList<T> {
    Node head;
    Node tail;

    public T add(T data) {
        Node<T> node = new Node(data);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            tail.next = node;
            tail = node;
        }
        return data;
    }

    public void delete(T data) {
        Node<T> current = head;
        Node<T> previous = current;
        while (current != null) {
            if (current.data.equals(data)) {
                if (current == head){
                    head = current.next;
                    break;
                }
                previous.next = current.next;
                break;
            }
            else{
                previous = current;
                current = current.next;
            }
        }
    }

    @Override
    public String toString() {
        Node<T> current = head;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        while (current!=null){
            stringBuilder.append(current.toString());
            if (current.next==null) {
                stringBuilder.append(']');
                return stringBuilder.toString();
            }
            stringBuilder.append(',').append(' ');
            current = current.next;
        }
        return stringBuilder.append(']').toString();
    }

    class Node<T> {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

}
