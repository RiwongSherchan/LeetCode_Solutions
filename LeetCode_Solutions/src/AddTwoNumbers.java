//Question no 2

//Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
 
//test case
public class AddTwoNumbers {
	public static void main(String[] args) {

		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		ListNode result = addTwoNumbers(l1, l2);

		while (result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}

	}

	// main solution function
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode current = dummyHead;
		int carry = 0;

		while (l1 != null || l2 != null) {
			int x, y;
			if (l1 != null) {
				x = l1.val;
				l1 = l1.next;
			} else {
				x = 0;
			}

			if (l2 != null) {
				y = l2.val;
				l2 = l2.next;
			} else {
				y = 0;
			}

			int sum = x + y + carry;

			if (sum >= 10) {
				carry = 1;
				sum %= 10;
			} else {
				carry = 0;
			}

			current.next = new ListNode(sum);
			current = current.next;
		}

		if (carry > 0) {
			current.next = new ListNode(carry);
		}
		return dummyHead.next;
	}

}
