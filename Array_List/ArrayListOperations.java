import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {

    private ArrayList<Integer> list;

    // Constructor to initialize the ArrayList
    public ArrayListOperations() {
        list = new ArrayList<>();
    }

    // Add an element to the ArrayList
    public void addElement(Integer element) {
        list.add(element);
    }

    // Add an element at a specific index
    public void addElementAt(int index, Integer element) {
        list.add(index, element);
    }

    // Add all elements from another ArrayList
    public void addAllElements(ArrayList<Integer> anotherList) {
        list.addAll(anotherList);
    }

    // Get an element by index
    public Integer getElement(int index) {
        return list.get(index);
    }

    // Update an element at a specific index
    public void updateElement(int index, Integer newElement) {
        list.set(index, newElement);
    }

    // Remove an element by index
    public void removeElementAt(int index) {
        list.remove(index);
    }

    // Remove an element by value
    public void removeElement(Integer element) {
        list.remove(element);
    }

    // Get the index of an element
    public int getIndexOf(Integer element) {
        return list.indexOf(element);
    }

    // Check if the ArrayList contains a specific element
    public boolean containsElement(Integer element) {
        return list.contains(element);
    }

    // Get the size of the ArrayList
    public int getSize() {
        return list.size();
    }

    // Clear all elements from the ArrayList
    public void clearList() {
        list.clear();
    }

    // Sort the ArrayList
    public void sortList() {
        Collections.sort(list);
    }

    // Print all elements in the ArrayList
    public void printList() {
        System.out.println(list);
    }

    // Get the entire list
    public ArrayList<Integer> getList() {
        return list;
    }

    // Example usage of the class
    public static void main(String[] args) {
        ArrayListOperations arrayListOps = new ArrayListOperations();

        // Adding elements
        arrayListOps.addElement(10);
        arrayListOps.addElement(20);
        arrayListOps.addElement(30);

        // Adding element at specific index
        arrayListOps.addElementAt(1, 15);

        // Printing the list
        System.out.println("List after adding elements:");
        arrayListOps.printList();

        // Updating an element
        arrayListOps.updateElement(2, 25);

        // Printing the list after update
        System.out.println("\nList after updating element at index 2:");
        arrayListOps.printList();

        // Removing an element by index
        arrayListOps.removeElementAt(1);

        // Printing the list after removal
        System.out.println("\nList after removing element at index 1:");
        arrayListOps.printList();

        // Sorting the list
        arrayListOps.sortList();

        // Printing the sorted list
        System.out.println("\nList after sorting:");
        arrayListOps.printList();

        // Checking if the list contains a specific element
        System.out.println("\nContains 10? " + arrayListOps.containsElement(10));

        // Printing the size of the list
        System.out.println("Size of the list: " + arrayListOps.getSize());

        // Clearing the list
        arrayListOps.clearList();

        // Printing the list after clearing
        System.out.println("\nList after clearing:");
        arrayListOps.printList();
    }
}
