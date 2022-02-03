public class Book {
    /*
    Bog
    Skriv en klasse kaldet Bog, der indeholder ISBN-nummer,titel og udgivelsesår.
    Skriv flg. metoder:

    •Constructor

    •Getters og setters

    •toString

     */

    //Attributes

    private int iSBNNumber;
    private String titel;
    private int yearOfPublishing;

    //Constructor

    public Book(int iSBNNumber, String titel, int yearOfPublishing) {
        this.iSBNNumber = iSBNNumber;
        this.titel = titel;
        this.yearOfPublishing = yearOfPublishing;
    }

    //getters and setters

    public int getiSBNNumber() {
        return iSBNNumber;
    }

    public void setiSBNNumber(int iSBNNumber) {
        this.iSBNNumber = iSBNNumber;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public boolean equals(Object other){                    //this is a method
        Book otherBook = (Book) other;                      // we make another book and from the Book class and call it other
        if(this.iSBNNumber == otherBook.iSBNNumber){        //if the book that we have is the same as the one we want
            return true;                                    // it will return true
        } else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "iSBNNumber=" + iSBNNumber +
                ", titel='" + titel + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                '}';
    }
}
