import assistance.ListNode;
import java.util.Scanner;
import java.util.ArrayList;
public class printListFromTailToHead {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ListNode head = new ListNode(sc.nextInt());
		ListNode pre = head;
		while(sc.hasNextInt()) {
			ListNode p = new ListNode(sc.nextInt());
			pre.next = p;
			pre = p;
		}
//		ArrayList<Integer> res = solution(head);
//		for(int i=0;i<res.size();i++) {
//			System.out.println(res.get(i));
//		}
		solution_recurse(head);
	}
	// 从头遍历，放入栈中
	public static ArrayList<Integer> solution(ListNode listNode) {
		ArrayList<Integer> res = new ArrayList<>();
		while(listNode!=null) {
			res.add(listNode.val);
			listNode = listNode.next;
		}
		ArrayList<Integer> out = new ArrayList<>();
		for(int i=res.size()-1;i>=0;i--) {
			out.add(res.get(i));
		}
		return out;
	}
	// 递归
	public static void solution_recurse(ListNode listNode){
		if(listNode!=null) {
			if(listNode.next!=null) {
				solution_recurse(listNode.next);
			}
			System.out.println(listNode.val);
		}
	}
}
