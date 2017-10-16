package action;

import java.util.Collection;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import action.book;
import Do.authorDo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class authoraction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String name;
	public author Author;
	public Collection<book> Book;

	
	
	
	
	
	
	
	
	
	private String username;
	   
	 //注意，file并不是指前端jsp上传过来的文件本身，而是文件上传过来存放在临时文件夹下面的文件
	  private File file;
	   
	  //提交过来的file的名字
	  private String fileFileName;
	   
	  //提交过来的file的MIME类型
	  private String fileContentType;
	 
	  public String getUsername()
	  {
	    return username;
	  }
	 
	  public void setUsername(String username)
	  {
	    this.username = username;
	  }
	 
	  public File getFile()
	  {
	    return file;
	  }
	 
	  public void setFile(File file)
	  {
	    this.file = file;
	  }
	 
	  public String getFileFileName()
	  {
	    return fileFileName;
	  }
	 
	  public void setFileFileName(String fileFileName)
	  {
	    this.fileFileName = fileFileName;
	  }
	 
	  public String getFileContentType()
	  {
	    return fileContentType;
	  }
	 
	  public void setFileContentType(String fileContentType)
	  {
	    this.fileContentType = fileContentType;
	  }
	   
	  @Override
	  public String execute() throws Exception
	  {
	    String root = ServletActionContext.getServletContext().getRealPath("/upload");
	     
	    InputStream is = new FileInputStream(file);
	     
	    OutputStream os = new FileOutputStream(new File(root, fileFileName));
	   
	    
	    BufferedReader reader = null;
	    reader = new BufferedReader(new FileReader(file)); 
	    
	    
	    System.out.println("fileFileName: " + fileFileName);
	 
	// 因为file是存放在临时文件夹的文件，我们可以将其文件名和文件路径打印出来，看和之前的fileFileName是否相同
	    System.out.println("file: " + file.getName());
	    System.out.println("file: " + file.getPath());
	     
	   // byte[] buffer = new byte[500];
	    //int length = 0;
	     
	    String te = null;
	    
	    while((te = reader.readLine()) != null)
	    {
	    	System.out.println(te);;
	      //os.write(buffer);
	    }
	     
	    os.close();
	    is.close();
	     
	    return SUCCESS;
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getName(){
		return name;
	}
	
	public void setName(String name) {
    	this.name = name;
    }
    	
    public author getAuthor() {
		return Author;
	}
    
    public void setAuthor(author Author) {
        this.Author = Author;
    }
	
	public Collection<book> getBook() {
		return Book;
	}

	public void setBook(Collection<book> Book) {
		this.Book = Book;
	}
	
	
	public String showbooks(){
		
		Book = authorDo.getauthorDo().listBooks(name);
		return SUCCESS;
	}
}
