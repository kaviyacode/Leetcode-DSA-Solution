/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
…                cur.next = list1;
                list1 =  list1.next;
            }
            cur = cur.next;
        }
        cur.next = (list1 != null)? list1: list2;
        return dummy.next;
        
    }
}