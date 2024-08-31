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
class Single_LinkedList_Sort
{
static void sort(Node h)
{
while(h!=null)
{
Node t=h.next;
while(t!=null)
{
if(t.data<h.data)
{
int temp=h.data;
h.data=t.data;
t.data=temp;
}
t=t.next;
}
h=h.next;
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
int n;
Node h=null,t=null;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of elements :");
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
sort(h);
traverse(h);
}
}