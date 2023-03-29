

class Result {
  static void deleteNode(Node n1) {
    // Write your code here
    if(n1==null||n1.next==null){

  return;}

    Node n=n1.next;

    n1.data=n.data;

    n1.next=n.next;

    n.next=null;

  



  }
}
