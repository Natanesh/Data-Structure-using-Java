class Node
{
int data;
Node next;
}
class Single_LinkedList_Traverse
{
public static void traverse(Node n)
{
while(n!=null)
{
System.out.println(n.data);
n=n.next;
}
}
public static void main(String str[])
{
Node n1=new Node();
Node n2=new Node();
Node n3=new Node();
Node n4=new Node();
Node n5=new Node();
n1.data=10;
n2.data=20;
n3.data=30;
n4.data=40;
n5.data=50;
n1.next=n2;
n2.next=n3;
n3.next=n4;
n4.next=n5;
n5.next=null;
traverse(n1);
}
}