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
background-image:url(7.jpg) ;
background-repeat:no-repeat;
background-size:100%;
margin:0px;
padding:0px;
}
</style>
</head>
</head>
<body >
     
      
                <ul>
                    <li><a href="allbook">全部藏书</a></li>
                    <li><a href="S_author.jsp">查找作者</a></li>
                    <li><a href="Add_book.jsp">添加书籍</a></li>
                </ul>
      

      	
      	<div class="row text-center">
            <h2 align ="center">添加书籍</h2>
        </div>
        <s:form action="addbook">
        <div align ="center">
            <label >
                ISBN:
            </label>
            <div>
                <input name = "ISBN" type="text" class="form-control" id="firstname" placeholder="输入ISBN" required="required">
            </div>
        </div>        
        <div align ="center">
            <label>
                Title:
            </label>
            <div>
                <input name = "title" type="text" class="form-control" id="lastname" placeholder="输入title" required="required">
           </div>
            
        </div>
        <div align ="center">
            <label>
                Author Name:
            </label>
            <div>
               <input name = "name" type="text" class="form-control" id="Author Name" placeholder="输入authorname" required="required">
          </div>
        </div>
        <div align ="center">
            <label>
                Publisher:
            </label>
           <div>
                <input name = "publisher" type="text" placeholder="输入Publisher" required="required">
         
           </div>
        </div>
        <div align ="center">
            <label >
                PublishDate:
            </label>
          <div>
                <input name = "PublishDate" type="text"  placeholder="输入PublishDate" required="required"> 
               </div>   
        </div>
        <div align ="center">
            <label >
                Price:
            </label>
           <div>
                <input name = "price" type="text" placeholder="输入price" required="required">
                </div>
     
            
        </div>
        <div align ="center">
            
                <button type="submit">
                    Register
                </button>
        	
   		</div>
   		</s:form>
   		
  </body>
</html> 		
   		
   		
