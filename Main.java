import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        int ch;
        do
        {
            System.out.println("\n1.Create \n2.Insert \n3.PreOrderTraversal \n4.LevelOrderTraversal \n5.Search for an element \n6.InOrderTraversal \n7.PostOrderTraversal \n8.Delete an element \n9.Delete the Binary Tree \n10.Exit");
            ch=s.nextInt();
            switch(ch)
            {
                case 1:
                    bt.create();
                    break;

                case 2:
                    System.out.println("Enter the value");
                    int value = s.nextInt();
                    bt.insert(BinaryTree.root,value);
                    break;

                case 3:
                    bt.preOrderTraversal(BinaryTree.root);
                    break;

                case 4:
                    bt.levelOrderTraversal(BinaryTree.root);
                    break;

                case 5:
                    System.out.println("Enter the value to search");
                    int search_value=s.nextInt();
                    bt.search(BinaryTree.root,search_value);
                    break;

                case 6:
                   bt.inOrderTraversal(BinaryTree.root);
                    break;

                case 7:
                    bt.postOrderTraversal(BinaryTree.root);
                    break;

                case 8:
                    System.out.println("Enter the key element we want to delete");
                    int key=s.nextInt();
                    bt.delete(BinaryTree.root,key);
                    break;

                case 9:
                    bt.deleteBinaryTree(BinaryTree.root);
                    break;

                case 10:
                    System.out.println("Exit");
                    break;

            }
        }
        while(ch!=10);

    }
}
