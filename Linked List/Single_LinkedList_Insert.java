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
class Single_LinkedList_Insert
{
static void insert(Node n,int ne,int p)
{
Node pt=n;
int i,f=0;
if(p==0)
{
int a=n.data;
Node nn=new Node(a,null);
n.data=ne;
nn.next=n.next;
n.next=nn;
f=1;
}
else
{
for(i=0;i<p-1;i++)
{
if(pt!=null && pt.next.next!=null)
{
pt=pt.next;
}
else
{
System.out.println("Index out of range");
f=1;
break;
}
}
if(f==0)
{
Node nn=new Node(ne,null);
nn.next=pt.next;
pt.next=nn;
System.out.println("Data insert at position "+p+" successfully!");
}
}
}
static void traverse(Node n)
{
Node pt=n;
System.out.println("Elements are:");
while(pt!=null)
{
System.out.println(pt.data);
pt=pt.next;
}
}
public static void main(String str[])
{
int l;
Node n=null;
Node t=null;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the no.of elements:");
l=sc.nextInt();
System.out.println("Enter elements:");
for(int i=0;i<l;i++)
{
int data=sc.nextInt();
Node nn=new Node(data,null);
if(n==null)
{
n=nn;
t=n;
}
else
{
t.next=nn;
t=t.next;
}
}
System.out.println("Data Added Successfully!");
System.out.print("Enter the new element to insert:");
int ne=sc.nextInt();
System.out.print("Enter the position to be insert:");
int p=sc.nextInt();
insert(n,ne,p);
traverse(n);
}
}