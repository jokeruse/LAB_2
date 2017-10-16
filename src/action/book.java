package action;
public class book {
	    
	public String ISBN;
	public String title;
	public int AuthorID;
	public String publisher;
	public String PublishDate;
	public double price;
	    	    
	    public book(){
	    	
	    }
	    
	    public book(String ISBN, String title, int AuthorID,String publisher, String PublishDate, double price) {
	        this.ISBN = ISBN;
	        this.title = title;
	        this.AuthorID = AuthorID;
	        this.publisher = publisher;
	        this.PublishDate = PublishDate;
	        this.price = price;
	        
	    }

	    public String getISBN() {
	        return ISBN;
	    }

	    public void setISBN(String ISBN) {
	        this.ISBN = ISBN;
	    }
	    
	    public String gettitle() {
	        return title;
	    }

	    public void settitle(String title) {
	        this.title = title;
	    }  
	    
	    public int getAuthorID() {
	    	return AuthorID;
	    }
	    
	    public void setAuthorID(int AuthorID) {
	        this.AuthorID = AuthorID;
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
	    
	   
}
