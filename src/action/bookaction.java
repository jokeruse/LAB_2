package action;

import java.util.Collection;

import com.opensymphony.xwork2.ActionSupport;

import action.author;
import action.book;
import Do.authorDo;
import Do.bookDo;

public class bookaction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    public String title;
    public String publisher;
    public String PublishDate;
    public double price;
	
    
    public int authorID;
	public int age;
	public String country;
	
	public String ISBN;
	public String name;
	public book Book;
	public author Author;
    public Collection<book> Books;
    public bookDo bookdo =  bookDo.getbookDo();
    public authorDo authordo = authorDo.getauthorDo();
    
    
  
    public int getauthorID() {
		return authorID;
	}
	
	public void setauthorID(int authorID) {
		this.authorID = authorID;
	}
	

	public int getage() {
		return age;
	}
	
	public void setage(int age) {
		this.age = age;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
    
    
    
    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }  
    
    public String getpublisher() {
        return publisher;
    }

    public void setpublisher(String publisher) {
        this.publisher = publisher;
    }  
    
    public String getPublishDate() {
        return PublishDate;
    }
    
    public void setPublishDate(String PublishDate) {
        this.PublishDate = PublishDate;
    }  
    
    public double getprice() {
    	return price;
    }
    
    public void setprice(double price) {
        this.price = price;
    }
       
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    public String getName(){
		return name;
	}
	
	public void setName(String name) {
    	this.name = name;
    }
    	
    public book getBook() {
        return Book;
    }

    public void setBook(book Book) {
        this.Book = Book;
    }
    
    public author getAuthor() {
		return Author;
	}

	public void setAuthor(author Author) {
		this.Author = Author;
	}

	public Collection<book> getBooks() {
        return Books;
    }

    public void setBooks(Collection<book> Books) {
        this.Books = Books;
    }
    
    public String load() {
        Book = bookdo.getBook(ISBN);
        Author = authorDo.getAuthor(Book.getAuthorID());
        return SUCCESS;
    }
    
    public String list(){
    	Books =bookdo.getBooks();
    	return SUCCESS;
    }
    
   

    public String remove(){
    	
    	bookdo.remove(ISBN);
    	return SUCCESS;
    }
    
    public String addbook(){
    	Author = authorDo.getAuthor(name);
    	if(Author == null) return "Add_author";
    	Book = new book(ISBN,title,Author.getauthorID(),publisher,PublishDate,price);
       	bookdo.store(Book);
    	return SUCCESS;
    }
    
    public String updatabook(){
    	Author = authorDo.getAuthor(name);
    	if(Author == null) return "Add_author";
    	bookdo.remove(ISBN);
    	Book = new book(ISBN,title,Author.getauthorID(),publisher,PublishDate,price);
       	bookdo.store(Book);
    	return SUCCESS;
    }
    
    public String addauthor(){
    	Author = new author(authorID,name,age,country);
    	authordo.store(Author);
    	Book = new book(ISBN,title,Author.getauthorID(),publisher,PublishDate,price);
       	bookdo.store(Book);
    	return SUCCESS;
    }
    
    public String upauthor(){
    	Author = new author(authorID,name,age,country);
    	authordo.store(Author);
    	bookdo.remove(ISBN);
    	Book = new book(ISBN,title,Author.getauthorID(),publisher,PublishDate,price);
       	bookdo.store(Book);
    	return SUCCESS;
    }


}
