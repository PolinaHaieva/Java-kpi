// This program demonstrates the implementation of a singly linked list in Java.
// It defines an interface SinglyLinkedListCollection with methods for basic operations on the list,
// such as adding an item, removing an item, checking if an item is present, getting the size, and clearing the list.
// The SinglyLinkedList class implements this interface and provides the implementation for each method.

// Interface defining operations for a singly linked list
interface SinglyLinkedListCollection<T> {
    void add(T item); // Add an item to the list
    void remove(T item); // Remove an item from the list
    boolean contains(T item); // Check if the list contains an item
    int size(); // Get the size of the list
    void clear(); // Clear all items from the list
}

// Node class representing an element in a singly linked list
class Node<T> {
    T data; // Data stored in the node
    Node<T> next; // Reference to the next node in the list

    Node(T data) {
        this.data = data;
    }
}

// Implementation of a singly linked list that adheres to the SinglyLinkedListCollection interface
class SinglyLinkedList<T> implements SinglyLinkedListCollection<T> {
    private Node<T> head; // Reference to the first node in the list
    private int size; // Size of the list

    // Constructor to initialize an empty singly linked list
    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    // Constructor to initialize a singly linked list with a single item
    public SinglyLinkedList(T item) {
        head = new Node<>(item);
        size = 1;
    }

    // Constructor to initialize a singly linked list with items from a collection
    public SinglyLinkedList(Iterable<T> collection) {
        head = null;
        size = 0;
        for (T item : collection) {
            add(item);
        }
    }

    // Method to add an item to the end of the list
    @Override
    public void add(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Method to remove an item from the list
    @Override
    public void remove(T item) {
        if (head == null) {
            return;
        }

        if (head.data.equals(item)) {
            head = head.next;
            size--;
            return;
        }

        Node<T> current = head;
        while (current.next != null) {
            if (current.next.data.equals(item)) {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }

    // Method to check if the list contains a given item
    @Override
    public boolean contains(T item) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(item)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Method to get the size of the list
    @Override
    public int size() {
        return size;
    }

    // Method to clear all items from the list
    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    // Method to convert the list to a string representation
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<T> current = head;
        while (current != null) {
            result.append(current.data);
            if (current.next != null) {
                result.append(", ");
            }
            current = current.next;
        }
        result.append("]");
        return result.toString();
    }
}

// Main class to test the SinglyLinkedList implementation
public class seventh {
    public static void main(String[] args) {
        // Testing the SinglyLinkedList class with different types of elements
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        System.out.println("list1: " + list1);

        SinglyLinkedList<String> list2 = new SinglyLinkedList<>("A");
        list2.add("B");
        list2.add("C");

        System.out.println("list2: " + list2);

        List<Double> values = Arrays.asList(1.1, 2.2, 3.3);
        SinglyLinkedList<Double> list3 = new SinglyLinkedList<>(values);

        System.out.println("list3: " + list3);
    }
}
