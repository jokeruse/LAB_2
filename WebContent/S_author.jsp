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
<body>
    <ul>
        <li><a href="allbook">全部藏书</a></li>
       	<li><a href="S_author.jsp">查找作者</a></li>
        <li><a href="Add_book.jsp">添加书籍</a></li>
	</ul>
                
                
   <div class="row text-center">
        <h2 align="center">查找作者</h2>
    </div>
	<div align="center">
		<s:form action="search">
			<div>
				<label > Name: </label>
				<div>
					<input name="name" type="text" placeholder="输入 作者名字" required="required">
				</div>
			</div>
			<div align="center">
				<div>
					<button type="submit">Register</button>
				</div>
			</div>
		</s:form>
	</div>
        
</body>
</html>