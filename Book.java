/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pageTotal)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = pageTotal;
    }

    //Accessor Methods
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    //Print Methods
    public void printAuthor()
    {
        System.out.println("The author is: "+author);
    }
    
    public void printTitle()
    {
        System.out.println("The title is: "+title);
    }
    
    public void printDetails()
    {
        System.out.println("********");
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Pages: "+pages);
        System.out.println("********");
    }
}
