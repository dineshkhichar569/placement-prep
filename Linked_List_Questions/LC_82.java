package Linked_List_Questions;

public class LC_82 {

    public static _ListNode deleteDuplicates(_ListNode head) {
        _ListNode dummy = new _ListNode(0);
        dummy.next = head;

        _ListNode prev = dummy;
        _ListNode curr = head;

        while (curr != null) {
            boolean duplicate = false;

            while (curr.next != null && curr.val == curr.next.val) {
                duplicate = true;
                curr = curr.next;
            }

            if (duplicate) {
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }

            curr = curr.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        _linked_list_root list = new _linked_list_root();

        int[] arr = {1, 2, 3, 3, 4, 4, 5};
        list.buildFromArray(arr);

        System.out.print("Original List: ");
        list.printList(list.getHead());

        _ListNode result = deleteDuplicates(list.getHead());

        System.out.print("After Removing Duplicates: ");
        list.printList(result);
    }
}