package TOP100_Liked_Problem.easy;

import bean.ListNode;

/**
 * Given a linked list, determine if it has a cycle in it.
Follow up:
Can you solve it without using extra space?
 * @author Administrator
 *
 */
public class NO141LinkedListCycle {

	public static void main(String[] args) {
		ListNode listNode=new ListNode(0);
		System.out.println(hasCycle(listNode));
	}

	/**
	 *判环方法，直接用两个指针，一个是使用单倍步速，另一个使用双倍步速
	*如果一个有环则必有一个时刻两个指针相遇
	 *2018年5月6日 下午12:19:57
	 * beats:98.80%
	 * 复杂度：
	 */
	public static  boolean hasCycle(ListNode head) {
		if(head==null) return false;
		ListNode l1=head;
		ListNode l2=head;
		while(l2.next!=null&&l2.next.next!=null){
			l1=l1.next;
			l2=l2.next.next;
			if(l1==l2){
				return true;
			}
		}
		return false;
	}

	/*
	*
	 * @Date 下午12:35 2019/4/13
	 * 复杂度：o(n)
	 * beats：100%
	 **/
	public boolean hasCycle2(ListNode head) {
		ListNode p1=head;
		ListNode p2=head;
		while(p1!=null&&p1.next!=null&&p2!=null&&p2.next!=null&&p2.next.next!=null){
			p1=p1.next;
			p2=p2.next.next;
			if(p1==p2)
				return true;
		}
		return false;
	}

}

