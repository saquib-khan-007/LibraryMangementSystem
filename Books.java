public class Books
{
    String id;
    String title;
    String author;
    String status;

    // public Books() {
    // }

    public Books(String id, String title, String author, String status)
    {
        this.id = id;
        this.title = title;
        this.author = author;
        this.status = status;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

     public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    } 
    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

     public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    } 

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
   
}