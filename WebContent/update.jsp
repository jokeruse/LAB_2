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
<body>
    <ul>
                    <li><a href="allbook">全部藏书</a></li>
                    <li><a href="S_author.jsp">查找作者</a></li>
                    <li><a href="Add_book.jsp">添加书籍</a></li>
                </ul>
      

       <div >
            <h2 align="center">更改书籍</h2>
        </div>
        <s:form action = "updatabook">
        <div align="center">
            <label for="firstname" class="col-md-2">
                ISBN:
            </label>
            <div class="col-md-9">
                <input name = "ISBN" type="text" class="form-control" id="firstname" value=<s:property value="Book.getISBN()"/> readonly >
                
            </div>
            
        </div>        
        <div align="center">
            <label for="lastname" class="col-md-2">
                Title:<br>
                
            </label>
            <div class="col-md-9">
                <input  name = "title"  type="text"  value=<s:property value="Book.gettitle()"/> readonly>
            </div>
             </div>
        <div align="center">
            <label for="emailaddress" class="col-md-2">
                Author Name:
            </label>
            <div class="col-md-9">
                <input name = "name" type="text"  value=<s:property value="Author.getName()"/> required="required">
            </div>
            
        </div>
        <div align="center">
            <label for="password" class="col-md-2">
                Publisher:
            </label>
            <div class="col-md-9">
                <input name = "publisher" type="text"  value=<s:property value="Book.getpublisher()"/> required="required">
            </div>
             
        </div>
        <div align="center">
            <label for="password" class="col-md-2">
            PublishDate:
            </label>
            <div class="col-md-9">
                <input name = "PublishDate" type="text" value=<s:property value="Book.getPublishDate()"/> required="required">
                
            </div>
            
        </div>
        <div align="center">
            <label for="password" class="col-md-2">
                Price:
            </label>
            <div class="col-md-9">
                <input name = "price" type="text" value=<s:property value="Book.getprice()"/> required="required">
                
            </div>
             
        </div>
        <div align ="center">
            
            <div class="col-md-10">
                <button type="submit" class="btn btn-info">
                    Register
                </button>
        	</div>
   		</div>
   		</s:form>
</body>
</html>