package Do;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import action.author;
import action.book;
import sql.library;
//git
//saasa
public class authorDo {
	private static authorDo instance = new authorDo();
	static library database = new library();
	
	private authorDo(){
		
	}
	
	public static authorDo getauthorDo(){
		return instance;
	}
	
	public Collection<book> listBooks(String name) {
	    ConcurrentMap<String, book> data = new ConcurrentHashMap<String, book>();
	    data = database.authorlist(name); 
    	return data.values();
    }
    
    public static author getAuthor(int authorID) {
    	author Author = new author();
    	Author = database.findauthor(authorID);
    	return Author;
    }
    
    public static author getAuthor(String name) {
    	
    	author Author = new author();
    	if(database.findID(name)==0){
    		return null;
    	}
    	Author = database.findauthor(database.findID(name));
    	return Author;
    }
    
    public void store(author Author){
		 database.store(Author);
	 }

    
}
