 <%@ page language="java" contentType="text/html; charset=utf-8" 
 pageEncoding="utf-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>library</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
	<style type="text/css">
body
{
background-image:url(2.jpg) ;
background-repeat:no-repeat;
background-size:100%;
margin:0px;
padding:0px;
}
</style>
     
</head>
<body>
     <ul>
                    <li><a href="allbook">全部藏书</a></li>
                    <li><a href="S_author.jsp">查找作者</a></li>
                    <li><a href="Add_book.jsp">添加书籍</a></li>
                </ul>
        <div  class="row text-center">
            <h2 align="center">图书详情</h2>
         </div>
         <div class="row">
                
                        	
							 <table width="98%" align="center" border="0" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#F6B83B" bordercolorlight="#FFFFFF">
							 
			
							 <tr >
							    <td align="center"  width= "49%">ISBN</td>  							    							    							    
							    <td align="center" width= "49%"><s:property value="Book.getISBN()" /></td>  
							 </tr>
							 
							 <tr>
							    <td align="center">Title</td>  							    							    							    
							    <td align="center"><s:property value="Book.gettitle()" /></td>  
							 </tr>
							 
							 <tr>
							    <td align="center">Author</td>  							    							    							    
							    <td align="center"><s:property value="Author.getName()" /></td>  
							 </tr>
								
							 <tr>
							    <td align="center">AuthorID</td>  							    							    							    
							    <td align="center"><s:property value="Book.getAuthorID()" /></td>  
							 </tr>
							 
							 <tr>
							    <td align="center">Publisher</td>  							    							    							    
							    <td align="center"><s:property value="Book.getpublisher()" /></td>  
							 </tr>
							 
							 <tr>
							    <td align="center">PublishDate</td>  							    							    							    
							    <td align="center"><s:property value="Book.getPublishDate()" /></td>  
							 </tr>
							 
							 <tr>
							    <td align="center">price</td>  							    							    							    
							    <td align="center"><s:property value="Book.getprice()" /></td>  
							 </tr>
							 
							 <tr>
							    <td align="center">Author's age</td>  							    							    							    
							    <td align="center"><s:property value="Author.getage()" /></td>  
							 </tr>
							
							<tr>
							    <td align="center">Author's country</td>  							    							    							    
							    <td align="center"><s:property value="Author.getCountry()" /></td>  
							 </tr>
							
                        	</table>
                        </div>
                    </div>
                </div>
            </div>

         </div>
        
</body>
</html>