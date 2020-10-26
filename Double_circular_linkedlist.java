package double_circular_linkedlsit;
import java.util.Scanner;

public class Double_circular_linkedlsit 
{
    
    public static void main(String[] args) 
    {
        
        Scanner scan = new Scanner(System.in);

        /* Creating object of linkedList */
        linkedlist list = new linkedlist();
        System.out.println("Circular Doubly Linked List Test\n");        
        char ch;
        /*  Perform list operations  */
        do  
        {
            System.out.println("\nCircular Doubly Linked List Operations\n");
            System.out.println("1. insert at begining");
            System.out.println("2. insert at end");
            System.out.println("3. insert at position");
            System.out.println("4. delete at position");
            System.out.println("5. check empty");
            System.out.println("6. get size");
            int choice = scan.nextInt();          
            switch (choice)
            {
            case 1 :
                System.out.println("Enter integer element to insert");
                list.insertAtstart( scan.nextInt() );                    
                break;                        
            case 2 :
                System.out.println("Enter integer element to insert");
                list.insertAtEnd( scan.nextInt() );                    
                break;                        
            case 3 :
                System.out.println("Enter integer element to insert");
                int num = scan.nextInt() ;
                System.out.println("Enter position");
                int pos = scan.nextInt() ;
                if (pos < 1 || pos > list.getsize() )
                    System.out.println("Invalid position\n");
                else
                    list.insertAtPos(num, pos);
                break;                                        
            case 4 :
                System.out.println("Enter position");
                int p = scan.nextInt() ;
                if (p < 1 || p > list.getsize() )
                    System.out.println("Invalid position\n");
                else
                    list.deleteAtPos(p);
                break;    
            case 5 :
                System.out.println("Empty status = "+ list.isempty());
                break;          
            case 6 :
                System.out.println("Size = "+ list.getsize() +" \n");
                break;                        
            default :
                System.out.println("Wrong Entry \n ");
                break;  
            }
            list.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                      
        } 
        while (ch == 'Y'|| ch == 'y'); 
    }
    
}
