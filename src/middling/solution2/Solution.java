package middling.solution2;

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode mainNode = l1.next != null ? l1 : l2;
		ListNode otherNode = l1.next == null ? l1 : l2;
		ListNode headerNode = new ListNode(l1.val + l2.val);
		ListNode currentNode = headerNode;
		while (mainNode.next != null) {
			mainNode = mainNode.next;
			ListNode nextNode;
			if (otherNode.next != null) {
				otherNode = otherNode.next;
				nextNode = new ListNode(mainNode.val + otherNode.val);
			} else {
				nextNode = new ListNode(mainNode.val);
			}
			currentNode.next = nextNode;
			currentNode = nextNode;
			if (mainNode.next == null) {
				ListNode temp = mainNode;
				mainNode = otherNode;
				otherNode = temp;
			}
		}
		ListNode carryNode = headerNode;//处理进位
		while (carryNode != null) {
			if (carryNode.val >= 10) {
				carryNode.val = carryNode.val - 10;
				if (carryNode.next != null) {
					carryNode.next.val = carryNode.next.val + 1;
				} else {
					carryNode.next = new ListNode(1);
				}
			}
			carryNode = carryNode.next;
		}
		return headerNode;
	}

	public static void main(String[] args) {
		ListNode listNode1_1 = new ListNode(2);
		ListNode listNode1_2 = new ListNode(4);
		ListNode listNode1_3 = new ListNode(3);
		listNode1_1.next = listNode1_2;
		listNode1_2.next = listNode1_3;

		ListNode listNode2_1 = new ListNode(5);
		ListNode listNode2_2 = new ListNode(6);
		ListNode listNode2_3 = new ListNode(4);
		listNode2_1.next = listNode2_2;
		listNode2_2.next = listNode2_3;

		ListNode resultNode = new Solution().addTwoNumbers(listNode1_1, listNode2_1);
		ListNode temp = resultNode;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
}
