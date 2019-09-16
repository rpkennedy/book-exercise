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
    private String refNumber;
    private int borrow;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pageTotal, String refNumber, int borrow)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = pageTotal;
        refNumber = "";
        borrow = 0;
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
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public int getBorrow()
    {
        return borrow;
    }
    
    //Mutator Methods
    public void setRefNumber(String ref)
    {
        refNumber = ref;
    }
    
    public void borrow()
    {
        borrow += 1;
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
    
    public void printPages()
    {
        System.out.println("Total pages: "+pages);
    }
    
    public void printRefNumber()
    {
        System.out.println("The Reference Number is: "+refNumber);
    }
    
    public void printBorrow()
    {
        System.out.println("Times borrowed: "+borrow);
    }
    
    public void printDetails()
    {
        if (refNumber.length() == 0)
            refNumber = "ZZZ";
        System.out.println("********");
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Pages: "+pages);
        System.out.println("Reference #: "+refNumber);
        System.out.println("Number of times borrowed: "+borrow);
        System.out.println("********");
    }
}
