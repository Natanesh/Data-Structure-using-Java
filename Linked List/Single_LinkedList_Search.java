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
class Single_LinkedList_Search
{
static void search(Node h,int e)
{
int f=0,i=0;
while(h!=null)
{
if(h.data==e)
{
System.out.println("Element found at index "+i);
f=1;
break;
}
i++;
h=h.next;
}
if(f==0)
{
System.out.println("Element not found");
}
}
public static void main(String str[])
{
int n,e;
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
System.out.print("Enter the search element :");
e=sc.nextInt();
search(h,e);
}
}