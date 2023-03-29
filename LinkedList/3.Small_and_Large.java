
// Return the head of updated list
static Node shiftSmallLarge(Node head) {
  if(head==null || head.next==null){
    return head;}
  Node small = head;
  Node large = head;
  Node current = head.next;
  while(current!=null){
    if(current.data<small.data){
      small=current;}
    if(current.data>large.data){
      large=current;}
    current = current.next;}
  if(small!=head){
    Node temp= head;
    while(temp.next!=small){
      temp=temp.next;}
    temp.next=small.next;
    small.next=head;
    head=small;}
  if(large!=head){
    Node temp=head;
    while(temp.next!=large){
      temp=temp.next;}
    temp.next=large.next;
    large.next=null;
    Node last=head;
    while(last.next!=null){
      last=last.next;}
    last.next=large;}
  return head;
}
