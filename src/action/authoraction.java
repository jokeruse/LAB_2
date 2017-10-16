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
	   
	 //ע�⣬file������ָǰ��jsp�ϴ��������ļ����������ļ��ϴ������������ʱ�ļ���������ļ�
	  private File file;
	   
	  //�ύ������file������
	  private String fileFileName;
	   
	  //�ύ������file��MIME����
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
	 
	// ��Ϊfile�Ǵ������ʱ�ļ��е��ļ������ǿ��Խ����ļ������ļ�·����ӡ����������֮ǰ��fileFileName�Ƿ���ͬ
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
