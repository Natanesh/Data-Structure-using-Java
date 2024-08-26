import java.util.*;
class Node
{
int data;
Node next;
Node(int data,Node next)
{
this.data=data;
this.next=next;
}
}
class Single_LinkedList_AddData
{
static void traverse(Node node)
{
while(node!=null)
{
System.out.println(node.data);
node=node.next;
}
}
public static void main(String str[])
{
int l;
Node node=null;
Node pt=null;
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of datas:");
l=sc.nextInt();
for(int i=0;i<l;i++)
{
Node n=new Node(sc.nextInt(),null);
if(node==null)
{
node=n;
pt=node;
}
else
{
pt.next=n;
pt=pt.next;
}
}
System.out.println("Data added Successfully!");
traverse(node);
}
}
