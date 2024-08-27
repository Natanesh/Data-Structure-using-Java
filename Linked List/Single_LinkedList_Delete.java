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
class Single_LinkedList_Delete
{
static void delete(Node h,int p)
{
if(p==0)
{
if(h.next!=null)
{
h.data=h.next.data;
h.next=h.next.next;
}
else
{
h.data=0;
}
return;
}
for(int i=0;i<p-1;i++)
{
h=h.next;
}
if(h.next.next!=null)
{
h.next=h.next.next;
}
else
{
h.next=null;
}
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
Node h=null,t=null;
int n,p;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the total number of elements :");
n=sc.nextInt();
System.out.println("Enter the elements :");
for(int i=0;i<n;i++)
{
Node nn=new Node(sc.nextInt(),null);
if(h==null)
{
h=nn;
t=h;
}
else
{
t.next=nn;
t=t.next;
}
}
System.out.print("Enter the position of number to delete :");
p=sc.nextInt();
delete(h,p);
traverse(h);
}
}