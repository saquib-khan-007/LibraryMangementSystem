import java.util.*;
public class BookService implements IBookService
 {
    public static Scanner sc = new Scanner(System.in);
    List<Books> booklist = new ArrayList<>();

@Override    
public void addBook()
{
    String BookId;
    String title;
    String author;
    String status="Available";
    System.out.println("Enter Id : ");
    BookId = sc.nextLine();
    System.out.println("Enter Title : ");
    title = sc.nextLine();
    System.out.println("Enter Author : ");
    author = sc.nextLine();
    Books books = new Books(BookId, title, author, status);
    booklist.add(books);
    System.out.println("BOOK ADDED SUCCESSFULLY :)");
}

@Override
public void ShowAvailableBooks()
{
    System.out.println("\n----------------------------------------------------------------------------------------------");
    System.out.format("%s%15s%15s%15s","ID","TITLE","AUTHOR","STATUS");
    System.out.println("\n----------------------------------------------------------------------------------------------");
    if(booklist.size()>0)
    {
        for(Books books:booklist)
        {
            if(books.getStatus() == "Available")
            {
                System.out.format("%s%15s%15s%15s",books.getId(),books.getTitle(),books.getAuthor(),books.getStatus());
                System.out.println("\n----------------------------------------------------------------------------------------------");

            }
            else
            {
                System.out.println("Books Unavailable");
            }
        }
    }
    else
    {
        System.out.println("There are no Books Present in Library");
    }
}
@Override
public void ShowBooks()
{
     System.out.println("\n----------------------------------------------------------------------------------------------");
    System.out.format("%s%15s%15s%15s","ID","TITLE","AUTHOR","STATUS");
    System.out.println("\n----------------------------------------------------------------------------------------------");
    if(booklist.size()>0)
    {
        for(Books books:booklist)
        {
            
                System.out.format("%s%15s%15s%15s",books.getId(),books.getTitle(),books.getAuthor(),books.getStatus());
                System.out.println("\n----------------------------------------------------------------------------------------------");

        }
    }
    else
    {
        System.out.println("There are no Books Present in Library");
    }
}

@Override

public void BorrowBooks()
{
    System.out.print("Enter the Book ID :");
    String id;
    id= sc.nextLine();
    if(booklist.size()>0)
    {
    for(Books books:booklist)
    {
        if(books.getId()==id && books.getStatus()=="Available")
        {
            System.out.println("Book Borrowed Successfully");
            books.setStatus("Not Available");
        }
        else
    {
        System.out.printf("Book with Id %s is UnAvailble Now!!",id);
    }

    }
}
else
{
    System.out.println("There are No Books Present in Library");
}
    
}
}


