
/* 
 *  class Node {
 *    int data;
 *    Node next;
 *  };
 *
 *  The above class defines the linked list node.
 */

static void forwardPrint(Node head) {
  if(head==null){
    return;}
  Node curr = head;
  while(curr!=null){
    System.out.print(curr.data+"-");
    curr = curr.next;}
}

static void backwardPrint(Node head) {
  if(head == null){
    return;}
  if(head.next==null){
    System.out.print(head.data+"-");
    return;}
  Node prev= head;
  Node curr = head.next;
  while(curr!=null){
    Node nextNode=curr.next;
    curr.next=prev;
    prev=curr;
    curr=nextNode;}
  head.next=null;
  head=prev;
  Node currNode= head;
  while(currNode!=null){
    System.out.print(currNode.data+"-");
    currNode=currNode.next;}

}
