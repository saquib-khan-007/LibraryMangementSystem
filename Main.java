import java.util.* ;
public class Main{
    public static void main(String args[])
    {

        IBookService bookService = new BookService();
    do{
        System.out.println("\n\n *******************Library Management System**********************");
        System.out.println("Press 1 to Add Book");
        System.out.println("Press 2 to ShowAll Books");
        System.out.println("Press 3 to ShowAvailable books");
        System.out.println("Press 4 to Borrow Book");
        System.out.println("Press 5 to return Book");
        System.out.println("Press 6 to Exit the Application");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
    

    switch (choice)
    {
        case 1:
        {
            bookService.addBook();
            break;
        }
        case 2:
        {
            bookService.ShowBooks();
        }
        case 3:
        {
            bookService.ShowAvailableBooks();
            break;
        }
        case 4:
        {
            bookService.BorrowBooks();
            break;
        }
        case 5:
        {
            bookService.returnBook();
            break;
        }
        case 6:
        {
            System.out.println("Thank you for Using Application !!");
            System.exit(0);
        }
        default:
        {
            System.out.println("Invalid Option");
        }
    }
   }while(true);
}
}






