package tugas;

import java.util.Scanner;

public class linkedList {
    public static void main(String[] args) {

        Scanner inputan = new Scanner(System.in);
        int n = inputan.nextInt();
        Node head = null;
        for (int i = 0; i < n; i++) {

            int data = inputan.nextInt();

            head = insert(head, data);

        }
        int index = inputan.nextInt();
        int data = inputan.nextInt();
        head = insertAt(head, data, index);
        head = sort(head);
        display(head);

    }

    public static class Node {


        int data;

        Node next;

        Node(int d) {

            data = d;

            next = null;

        }

    }

    public static Node insert(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;

        } else {

            Node temp = head;

            while (temp.next != null) {

                temp = temp.next;

            }

            temp.next = newNode;

        }

        return head;

    }

    public static Node insertLast(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;

        } else {

            Node temp = head;

            while (temp.next != null) {

                temp = temp.next;

            }

            temp.next = newNode;

        }

        return head;

    }

    public static Node getAt(Node head, int index) {

        Node temp = head;

        int count = 0;

        while (temp != null) {

            if (count == index) {

                return temp;

            }

            count++;

            temp = temp.next;

        }

        return null;

    }

    public static Node insertAt(Node head, int data, int index) {

        Node newNode = new Node(data);

        if (index == 0) {

            newNode.next = head;

            return newNode;

        } else {

            Node temp = getAt(head, index - 1);

            if (temp == null) {

                return head;

            } else {

                newNode.next = temp.next;

                temp.next = newNode;

                return head;

            }

        }

    }

    public static void display(Node head) {

        Node start = head;

        while (start != null) {

            System.out.print(start.data + " ");

            start = start.next;

        }

    }

    public static Node sort(Node head) {

        Node temp = head;

        while (temp != null) {

            Node temp2 = temp.next;

            while (temp2 != null) {

                if (temp.data > temp2.data) {

                    int tempData = temp.data;

                    temp.data = temp2.data;

                    temp2.data = tempData;

                }

                temp2 = temp2.next;

            }

            temp = temp.next;

        }

        return head;

    }
}
