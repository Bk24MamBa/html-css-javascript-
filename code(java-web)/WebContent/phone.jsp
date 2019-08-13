<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="jquery-3.4.1.js" type="text/javascript"></script>
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function zc(){
		alert(phone);
		$.ajax({
			url:"PhoneServlet",
			type:"get",
			data:"phone="+phone,
			success:function(result,testStatus){
				if(result=="true"){
					alert("该号码已存在，注册失败！");
				}else{
					alert("注册成功！");
				}
			},
			error:function(xhr,errorMessage,e){
				alert("系统异常！");
			},
		});
	}
</script>
<body>
	<input id="phone">
	<input type="button" value="注册" onclick="zc()">
</body>
</html>