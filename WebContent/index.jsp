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
           
      <div align="center">
                <h1>Welcome</h1>
                <div >
                    <p>欢迎使用本网站</p><br>
                    <p>请点击<a href = "allbook">这里</a>开始使用</p>
                </div>
            </div>
        
       



	<s:form action="fileUpload" method="post" enctype="multipart/form-data">
　　
  username: <input type="text" name="username"><br>
  file: <input type="file" name="file"><br>
   
  <input type="submit" value="submit">
	</s:form>


</body>
</html>