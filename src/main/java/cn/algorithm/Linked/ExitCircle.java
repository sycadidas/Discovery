package cn.algorithm.Linked;

public class ExitCircle {
	 static int id = 1;

	    public static void main(String[] args) {
	        //测试
	        Node head=new Node(3);
	        Node node1=new Node(6);
	        Node node2=new Node(8);
	        Node node3=new Node(5);
	        Node node4=new Node(2);
	        Node node5=new Node(7);
	        head.next=node1;
	        node1.next=node2;
	        node2.next=node3;
	        node3.next=node4;
	        node4.next=node5;
	        node5.next=node3;
	        new ExitCircle().exitCircle(head);

	        Node port = new ExitCircle().findLoopPort(head);
	        System.out.println("环入口为第" + id + "个节点:" + port.data);

	    }
	    //环入口节点
	    //环的入口节点到快慢指针相遇的距离 与 链表头节点到环入口节点的距离相等
	    public Node findLoopPort(Node head){
	        Node slow = head, fast = head;
	        while(fast != null && fast.next != null){
	            slow = slow.next;
	            fast = fast.next.next;
	            if(slow == fast){
	                fast = head;
	                while(head != slow){
	                    id++;
	                    head = head.next;
	                    slow = slow.next;
	                }
	                return slow;
	            }
	        }
	        System.out.print("NoLoop !");
	        return null;
	    }

	    public boolean exitCircle(Node head){
	        Node fast = head;
	        Node slow = head;
	        while(fast != null && fast.next != null){//判断是否由环，注意fast.next = null的情况
	            fast = fast.next.next;
	            slow = slow.next;
	            if(fast == slow){//存在环
	                int count = 0;
	                while(true){
	                    count ++;
	                    fast = fast.next.next;
	                    slow = slow.next;

	                    if(fast == slow){//快慢指针在第二次相遇，这个点肯定是第一次相遇的点 
	                        System.out.println("环的长度：" + count);
	                        return true;
	                    }
	                }
	            }
	        }
	        System.out.println("false!");
	        return false;
	    }

}
