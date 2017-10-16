package Do;

import java.util.Collection;
import java.util.concurrent.ConcurrentMap;

import action.book;
import sql.library;

public class bookDo {
	private static bookDo instance = new bookDo();
	static library database = new library(); 
	private static ConcurrentMap<String, book> data = database.booklist();
	
	 public static bookDo getbookDo() {
		 return instance;
	 }
	    
	 public Collection<book> getBooks() {
		 return data.values();
	 }
	//git

	 public book getBook(String ISBN) {
		 return data.get(ISBN);
	 }
	 
	 public void store(book Book){
		 database.store(Book);
		 data.putIfAbsent(Book.getISBN(), Book);
	 }
	 
	 public void remove(String ISBN){
		 database.del(ISBN);
		 data.remove(ISBN);
	 }
	 
	
}
