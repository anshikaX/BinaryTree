public class QueueList
{
    static Node head=null;
    static Node tail=null;

    //To insert a value
    public void enqueue(Nnode value)
    {
        Node temp = new Node();
        temp.data = value;
        if(head==null)
        {
            head=tail=temp;

        }
        else
        {
            tail.next=temp;
            tail=temp;
        }

    }

    //To delete and element
    public void dequeue()
    {
        if(head==null)
        {
            System.out.println("Queue is empty.");
        }
        else if(head==tail)
        {
            head=tail=null;
        }
        else
        {
            head=head.next;
        }
    }

    //To return the first element from the queue
    public Nnode peek()
    {
        return head.data;
    }




}
