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
class Single_LinkedList_Merge
{
static void merge(Node h1,Node h2)
{
while(h1.next!=null)
{
h1=h1.next;
}
h1.next=h2;
}
static void traverse(Node h)
{
while(h!=null)
{
System.out.println(h.data);
h=h.next;
}
}
public static void main(String str[])
{
int n1,n2;
Node h1=null,h2=null,t1=null,t2=null;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of elements 1:");
n1=sc.nextInt();
System.out.print("Enter the number of elements 2:");
n2=sc.nextInt();
System.out.println("Enter the elements 1:");
for(int i=0;i<n1;i++)
{
Node nn=new Node(sc.nextInt(),null);
if(h1==null)
{
h1=nn;
t1=h1;
}
else
{
t1.next=nn;
t1=t1.next;
}
}
System.out.println("Enter the elements 2:");
for(int i=0;i<n2;i++)
{
Node nn=new Node(sc.nextInt(),null);
if(h2==null)
{
h2=nn;
t2=h2;
}
else
{
t2.next=nn;
t2=t2.next;
}
}
merge(h1,h2);
traverse(h1);
}
}