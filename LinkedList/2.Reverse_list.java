class Result {
  // Return the new head of reversed list
  static Node reverseList(Node head) {
    if(head==null || head.next==null){
      return head;}
    Node prev =head;
    Node curr = head.next;
    while (curr!=null){
      Node nextNode = curr.next;
      curr.next=prev;
      prev = curr;
      curr = nextNode;}
    head.next=null;
    head=prev;
    return head;
  }
}
