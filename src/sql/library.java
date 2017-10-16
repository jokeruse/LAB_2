package sql;

import java.sql.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import action.book;
import action.author;

public class library {

	public static Connection connect;  
	public static void drive() {
			}
	
	public static Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   
			//Class.forName("org.gjt.mm.mysql.Driver");
		}
		catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
		    connect = DriverManager.getConnection("jdbc:mysql://locahost:3306/app_ligouhai?useUnicode=true&characterEncoding=utf-8&useSSL=false","root","wuzipeng");

	           //连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码
		}
		catch (Exception e) {
		      System.out.print("get data error!");
		      e.printStackTrace();
		}
		return connect;
	}
	
	public ConcurrentMap<String,book> booklist(){

	    ConcurrentMap<String, book> message = new ConcurrentHashMap<String, book>();
		try{
			Statement statement =getConnection().createStatement();
			ResultSet rs = statement.executeQuery("select * from Book");
			while(rs.next()){
				book bookmessage = new book(rs.getString("ISBN"),rs.getString("Title"),
	    	    							rs.getInt("AuthorID"),rs.getString("Publisher"),
	    	    							rs.getString("PublishDate"),rs.getDouble("Price"));
				message.put(rs.getString("ISBN"), bookmessage);
			}
			rs.close();
			statement.close();
			connect.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return message;
	}
	
	
	public void store(book Book){
		try{
			PreparedStatement ps =(PreparedStatement) getConnection().prepareStatement("insert into Book(ISBN,Title,AuthorID,"
																					+ "Publisher,PublishDate,Price) values(?,?,?,?,?,?)");
			ps.setString(1, Book.getISBN());
			ps.setString(2, Book.gettitle());
			ps.setInt(3, Book.getAuthorID());
			ps.setString(4, Book.getpublisher());
			ps.setString(5, Book.getPublishDate());
			ps.setDouble(6, Book.getprice());
			ps.executeUpdate();
			ps.close();
			connect.close();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	public void store(author Author){
		try{
			PreparedStatement ps =(PreparedStatement) getConnection().prepareStatement("insert into Author(AuthorID,Name,Age,Country) values(?,?,?,?)");
			ps.setInt(1, Author.getauthorID());
			ps.setString(2, Author.getName());
			ps.setInt(3, Author.getage());
			ps.setString(4,Author.getCountry());
			ps.executeUpdate();
			ps.close();
			connect.close();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}

	
	public void del(String isbn){
		try {
			PreparedStatement ps = (PreparedStatement) getConnection().prepareStatement("delete from Book where ISBN= '" 
																					+ isbn + "'");
			ps.executeUpdate();
			ps.close();
            connect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int findID(String authorname){
		int ID = 0;
		try {
			Statement statement = getConnection().createStatement();
	        ResultSet rs = statement.executeQuery("select AuthorID,Name,Age,Country from Author");
	        while(rs.next()) {
	        	if(rs.getString("Name").equals(authorname)){
	        		ID = rs.getInt("AuthorID");
	    	        break;
	        	}
	        } 
	        rs.close(); 
	        statement.close();
	        connect.close();
	    } catch (SQLException e) {
			e.printStackTrace();
		}  
		return ID;
	}
	
	public ConcurrentMap<String, book> authorlist(String authorname) {
		
	    ConcurrentMap<String, book> data = new ConcurrentHashMap<String, book>();
        int authorid = findID(authorname);
        
		try {
			Statement statement = getConnection().createStatement();
	        String sql = "select ISBN,Title,AuthorID,Publisher,PublishDate,Price from Book";
	        ResultSet rs = statement.executeQuery(sql);
	        while(rs.next()) {
	        	if(rs.getInt("AuthorID")==authorid){
	    	        book bookmessage = new book(rs.getString("ISBN"),rs.getString("Title"),
	    	    		rs.getInt("AuthorID"),rs.getString("Publisher"),
	    	    		rs.getString("PublishDate"),rs.getDouble("Price"));    	
	    	        data.put(rs.getString("ISBN"), bookmessage);
	        	}
	        } 
	        rs.close(); 
	        statement.close();
	        connect.close();
	    } catch (SQLException e) {
			e.printStackTrace();
		}  
		return data;
	}
	
	public author findauthor(int authorID) {
		author Author = new author();
		try {
			Statement statement = getConnection().createStatement();
	        String sql = "select AuthorID,Name,Age,Country from Author";
	        ResultSet rs = statement.executeQuery(sql);
	        while(rs.next()) {
	        	if( rs.getInt("AuthorID")== authorID ){
	    	        Author.setauthorID(rs.getInt("AuthorID"));
	    	        Author.setName(rs.getString("Name"));
	    	        Author.setage(rs.getInt("Age"));
	    	        Author.setCountry(rs.getString("Country"));
	    	        break;
	        	}
	        } 
	        rs.close(); 
	        statement.close();
	        connect.close();
	    } catch (SQLException e) {
			e.printStackTrace();
		}  
		return Author;
    }
	
}

