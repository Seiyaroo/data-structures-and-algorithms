package D07;

import D06.ListNode;

import java.util.List;

public class KthElement {
    private ListNode root;

    public static void main(String[] args) {
    }


    public ListNode kthElementFromEnd(int k) {
        ListNode current = this.root;
// Get the total of the elements in the list
        int total = this.size();
// Declare a new Index
        int newIndex = (total - k) - 1;
// Get the element of newIndex from the List
        this.get(newIndex);
        return current;
    }

    private void get(int newIndex) {
    }

    private int size() {
        return 0;
    }
}