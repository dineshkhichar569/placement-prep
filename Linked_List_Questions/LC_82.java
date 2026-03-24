package Linked_List_Questions;

public class LC_82 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    ListNode head;

    // Add element at end
    public void addLast(int val) {
        ListNode newNode = new ListNode(val);

        if (head == null) {
            head = newNode;
            return;
        }

        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Print linked list
    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;

        dummy.next = head;
        ListNode curr = head;

        while (curr != null) {
            boolean duplicate = false;

            // check duplicates
            while (curr.next != null && curr.val == curr.next.val) {
                duplicate = true;
                curr = curr.next;
            }

            if (duplicate) {
                prev.next = curr.next; // skip all duplicates
            } else {
                prev = prev.next; // keep unique node
            }

            curr = curr.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        LC_82 obj = new LC_82();

        // Add elements
        obj.addLast(1);
        obj.addLast(2);
        obj.addLast(3);
        obj.addLast(3);
        obj.addLast(4);
        obj.addLast(4);
        obj.addLast(5);

        System.out.print("Original List: ");
        obj.printList(obj.head);

        // Remove duplicates
        ListNode result = obj.deleteDuplicates(obj.head);

        System.out.print("After Removing Duplicates: ");
        obj.printList(result);
    }
}