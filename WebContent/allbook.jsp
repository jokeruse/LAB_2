<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>library</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
	
	
</head>
<body background = 1.jpg>
     
           <ul>
                    <li><a href="allbook">全部藏书</a></li>
                    <li><a href="S_author.jsp">查找作者</a></li>
                    <li><a href="Add_book.jsp">添加书籍</a></li>
                </ul>
      	
      	<div >
            <h2 align="center">全部书籍</h2>
        </div>
        
                        <div >
                        	
							  <table width="100%"  border="0" cellpadding="0" cellspacing="0" >
							  <tr align="center" >
							    <td width="22%" >ISBN</td>  
							    <td width="26%" >TITLE</td>
							    <td width="10%" >修改</td>
							    <td width="10%" >删除</td>
							  </tr>
							  <s:iterator value = "Books">
							  <tr>
							    <td align="center" style="padding:5px;"><s:property value="ISBN" /></td>  
							    <td align="center"><a href ="<s:url action="show"><s:param name="ISBN" value="getISBN()" /></s:url>"><s:property value="title" /></a></td>
							    <td align="center"><a href ="<s:url action="update"><s:param name="ISBN" value="getISBN()" /></s:url>">修改</a></td>
							    <td align="center"><a href ="<s:url action="remove"><s:param name="ISBN" value="getISBN()" /></s:url>">删除</a></td>
							  </tr>
							  </s:iterator>
                        	</table>
                        </div>
                
	</body>
</html>