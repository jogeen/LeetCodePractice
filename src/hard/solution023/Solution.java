package hard.solution023;

public class Solution {
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists.length == 0) {
			return null;
		}
		if (!isAllEnd(lists)) {
			return null;
		}
		ListNode head = new ListNode(0);
		ListNode tail = head;
		head.next = tail;
		while (isAllEnd(lists)) {
			int select = 0;
			ListNode result = new ListNode(Integer.MIN_VALUE);
			for (int i = 0; i < lists.length; i++) {
				ListNode listNode = lists[i];
				if (listNode != null) {
					if (result.val == Integer.MIN_VALUE || listNode.val < result.val) {
						result.val = listNode.val;
						select = i;
					}
				}
			}
			tail.next = result;
			tail = tail.next;
			lists[select] = lists[select].next;
		}
		return head.next;
	}

	private boolean isAllEnd(ListNode[] lists) {
		for (ListNode listNode : lists) {
			if (listNode != null) {
				return true;
			}
		}
		return false;
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
		ListNode resultNode = new Solution().mergeKLists(lists);
		ListNode temp = resultNode;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
}
