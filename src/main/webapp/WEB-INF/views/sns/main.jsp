<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Main Page </title>
</head>
	<body>
		<form action="main">
		    <h2>ȸ�� ���� ������</h2>
		    ${member_id}������ �α��� �ϼ̽��ϴ�.<br>
		    ${member_name}�� ȯ���մϴ�<br>
	  
		    <input type="button" value="�α׾ƿ�" onclick="location.href='logout.do'">  
		    <input type="button" value="���ȸ������" onclick="location.href='memberList.do'">
		    <input type="button" value="ȸ������������" onclick="location.href='memberUpdateForm.do'"> 
	    </form> 
	</body>
</html>
