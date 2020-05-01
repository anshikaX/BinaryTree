import javax.swing.*;
import java.util.Scanner;
public class BinaryTree
{
    static Nnode root=null;
    Scanner sc = new Scanner(System.in);

    //To create a root node
    public void create()
    {
        System.out.println("Enter the value");
        int value=sc.nextInt();
        Nnode newNode = new Nnode();
        newNode.data=value;
        root=newNode;
    }

    //To insert a new node
    public void insert(Nnode root,int value)
    {
        Nnode temp = root;
        QueueList obj = new QueueList();
        obj.enqueue(temp);
        if(temp==null)
        {
            System.out.println("Tree doesn't exist");
        }
        else
        {
            Nnode newNode = new Nnode();
            newNode.data=value;
            while(QueueList.head!=null)
            {
                temp=obj.peek();
                if(temp.left==null)
                {
                    temp.left=newNode;
                    break;
                }
                else
                {
                    obj.enqueue(temp.left);
                }
                if(temp.right==null)
                {
                    temp.right=newNode;
                    break;
                }
                else
                {
                    obj.enqueue(temp.right);
                }
                obj.dequeue();
            }

            while(QueueList.head!=null)
            {
                obj.dequeue();
            }
        }
    }

    //Level Order Traversal
    public void levelOrderTraversal(Nnode root)
    {
        Nnode temp = root;
        QueueList obj = new QueueList();
        obj.enqueue(temp);
        if(temp==null)
        {
            System.out.println("Tree doesn't exist");

        }
        else
        {
            while(QueueList.head!=null)
            {
                temp=obj.peek();
                if(temp.left!=null)
                {
                    obj.enqueue(temp.left);
                }
                if(temp.right!=null)
                {
                    obj.enqueue(temp.right);
                }
                System.out.print(temp.data + " ");
                obj.dequeue();

            }
        }


    }

    //PreOrder Traversal
    public void preOrderTraversal(Nnode root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    //Inorder Traversal
    public void inOrderTraversal(Nnode root)
    {
        if(root!=null)
        {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }

    }

    //PostOrder Traversal
    public void postOrderTraversal(Nnode root)
    {
        if(root!=null)
        {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data+ " ");

        }

    }

    //Search the value
    public void search(Nnode root,int value)
    {
        boolean flag=false;
        Nnode temp = root;
        QueueList obj = new QueueList();
        obj.enqueue(temp);
        if(temp==null)
        {
            System.out.println("Tree doesn't exist");

        }
        else
        {
            while(QueueList.head!=null)
            {
                temp=obj.peek();
                if(temp.left!=null)
                {
                    obj.enqueue(temp.left);
                }
                if(temp.right!=null)
                {
                    obj.enqueue(temp.right);
                }
                if(temp.data==value)
                {
                    flag=true;
                    break;
                }
                obj.dequeue();

            }
        }
        if(flag)
        {
            System.out.println("Value found");
        }
        else
        {
            System.out.println("Value doesn't exist");
        }
        while(QueueList.head!=null)
        {
            obj.dequeue();
        }

    }

    //Deletion of a value from a Binary Tree
    public void delete(Nnode root,int key)
    {
        Nnode temp = root;
        Nnode keyNode = null;
        QueueList obj = new QueueList();
        obj.enqueue(temp);
        while(QueueList.head!=null)
        {
            temp=obj.peek();
            obj.dequeue();
            if(temp.data==key)
            {
                keyNode=temp;
            }
            if(temp.left!=null)
            {
                obj.enqueue(temp.left);
            }
            if(temp.right!=null)
            {
                obj.enqueue(temp.right);
            }
        }
        if(keyNode!=null)
        {
            keyNode.data=temp.data;
            Nnode newTemp=root;
            obj.enqueue(newTemp);
            while(QueueList.head!=null)
            {
                newTemp=obj.peek();
                obj.dequeue();
                if(newTemp.left!=null)
                {
                    if(newTemp.left==temp)
                    {
                        newTemp.left=null;
                    }
                    else
                    {
                        obj.enqueue(newTemp.left);
                    }
                }
                if(newTemp.right!=null)
                {
                    if(newTemp.right==temp)
                    {
                        newTemp.right=null;
                    }
                    else
                    {
                        obj.enqueue(newTemp.right);
                    }
                }
            }
        }
        else
        {
            System.out.println("The element doesn't exist.");
        }


    }

    //Delete the Binary Tree
    public void deleteBinaryTree(Nnode root)
    {
        root=null;
    }







}
