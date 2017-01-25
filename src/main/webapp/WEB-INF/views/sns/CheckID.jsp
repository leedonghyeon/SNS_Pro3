<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>중복검사</title>
      <script type="text/javascript">
	       window.onload = function(){
    	   var msg = '${msg3}';
    	   
    	   if ( msg != '')	   alert('${msg3}');
       }
	       </script>
</head>
<body>
<form name="form1" method="post" action="CheckID">
<input type="text" name="member_id" id="member_id" value="${joinmember.member_id}">
<input type="submit" value="중복확인">
</form>
</body>
</html>