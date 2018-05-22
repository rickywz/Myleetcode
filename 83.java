// 版本1:2.09%
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;
        ListNode temp = head;
        Set<Integer> set = new HashSet<>();
        set.add(head.val);
        while (temp != null && temp.next != null){
            if (!set.contains(temp.next.val)){
                set.add(temp.next.val);
            }
            else {
                temp.next = temp.next.next;
                continue;
            }
            temp = temp.next;
        }
        return head;
    }
}