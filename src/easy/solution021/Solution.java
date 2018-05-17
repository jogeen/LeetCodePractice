package easy.solution021;

public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode header = new ListNode(0);
		ListNode tail = new ListNode(0);
		header.next = tail;
		while (l1 != null || l2 != null) {
			ListNode temp = new ListNode(Integer.MIN_VALUE);
			boolean isL1 = false;
			if (l1 != null && l2 != null) {
				if (l1.val < l2.val) {
					temp.val = l1.val;
					isL1 = true;
				} else {
					temp.val = l2.val;
					isL1 = false;
				}
			} else if (l1 != null && l2 == null) {
				temp.val = l1.val;
				isL1 = true;
			} else if (l2 != null && l1 == null) {
				temp.val = l2.val;
				isL1 = false;
			}
			if (isL1) {
				l1 = l1.next;
			} else {
				l2 = l2.next;
			}
			tail.next = temp;
			tail = tail.next;
		}
		return header.next.next;
	}

	public static void main(String[] args) {
		ListNode listNode1_1 = new ListNode(1);
		ListNode listNode1_2 = new ListNode(4);
		ListNode listNode1_3 = new ListNode(5);
		listNode1_1.next = listNode1_2;
		listNode1_2.next = listNode1_3;

		ListNode listNode2_1 = new ListNode(1);
		ListNode listNode2_2 = new ListNode(3);
		ListNode listNode2_3 = new ListNode(4);
		listNode2_1.next = listNode2_2;
		listNode2_2.next = listNode2_3;

		ListNode listNode3_1 = new ListNode(4);
		ListNode listNode3_2 = new ListNode(6);
		listNode3_1.next = listNode3_2;

		ListNode[] lists = { listNode1_1, listNode2_1, listNode3_1 };
		ListNode resultNode = new Solution().mergeTwoLists(listNode1_1, listNode2_1);
		ListNode temp = resultNode;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
}
