package Linked_List_Questions;

public class _linked_list_root {

    private _ListNode head;

    public _ListNode getHead() {
        return head;
    }

    public void buildFromArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            head = null;
            return;
        }

        head = new _ListNode(arr[0]);
        _ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new _ListNode(arr[i]);
            current = current.next;
        }
    }

    public void printList(_ListNode head) {
        _ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }

        System.out.println(" -> null");
    }
}