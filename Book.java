/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book {
    // The fields.
    private String author;
    private String title;
    private int page;
    private String  refNumber = ("");
    private int borrowed;


    public Book(String bookAuthor, String bookTitle, int numPages,int numBorrowed) {
        author = bookAuthor;
        title = bookTitle;
        page = numPages;
        borrowed= numBorrowed;


    }


    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getBorrowed() {
        return borrowed;
    }

    public void printAuthor() {
        System.out.println(author);
    }

    public void printTitle() {
        System.out.println(title);
    }


    public int getPage() {
        return page;
    }


    public void printDetaisls() {

    if (refNumber.length()==0){
       System.out.println("ZZZ");

    }
    else {
        System.out.println("Title: " + title + ", " + " Author: "+author + ", " + " Pages: " + page+", "+ " Reference number: " + refNumber+ " Borrowed: " +borrowed  );

    }

    }



    public void setRefNumber(String ref){

        if ( ref.length()< 3){
            System.out.println("Erro");

        }
        else {
            refNumber=ref;

        }

    }


    public String getRefNumber(){
        return refNumber;
    }




}


