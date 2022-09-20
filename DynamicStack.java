package DataStructure;
import java.util.Scanner;
class DynamicStack
{
    Node head;
    DynamicStack()
    {
        head=null;
    }

    void push(int n)
    {
        Node newNode=new Node();//new allots memory
        if(newNode==null)
            System.out.println("Memory is Over");
        else
        {
            newNode.num=n;
            newNode.next=null;
            if(head==null)
                head=newNode;
            else
            {
                newNode.next=head;
                head=newNode;
            }
        }
    }

    void pop()
    {
        if(head==null)
            System.out.println("Stack is Empty");
        else
        {
            Node ptr=head;
            head=head.next;
            System.out.println("Number popped is"+ptr.num);
            ptr=null;
        }
    }

    void peak()
    {
        if(head==null)
            System.out.println("Stack is Empty");
        else
            System.out.println("Peak element is"+head.num);
    }

    int count()
    {
        Node ptr=head;
        int c=0;
        while(ptr!=null)
        {
            c++;
            ptr=ptr.next;
        }
        return c;
    }

    void display()
    {
        if(head==null)
            System.out.println("Stack is Empty");
        else
        {
            Node ptr=head;
            while(ptr!=null)
            {
                System.out.println(ptr.num);
                ptr=ptr.next;
            }
        }
    }

    void mainMenu()
    {
        Scanner sc=new Scanner(System.in);
        int ch,n;
        do
        {
            System.out.println("                    Stack Menu");
            System.out.println("                    1.Push");
            System.out.println("                    2.Pop");
            System.out.println("                    3.Count");
            System.out.println("                    4.Peak");
            System.out.println("                    5.Display");
            System.out.println("                    6.Exit");
            System.out.print("                    ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter a number to be pushed");
                n=sc.nextInt();
                push(n);
                break;
                case 2:
                pop();
                break;
                case 3:
                System.out.println(" Count = "+count());
                break;
                case 4:
                peak();
                break;
                case 5:
                display();
                break;    
                case 6:
                System.out.println("Exiting.....");
                break;
                default:
                System.out.println("Invalid");
            }
        }while(ch!=6);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        DynamicStack obj=new DynamicStack();
        obj.mainMenu();
    }
}