<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.sql.*,javax.sql.*,java.io.*" %>
<%@ page import="kopo.exam.hibernate.service.*, kopo.exam.hibernate.dto.*" %><!-- kopo.domain.*, kopo.dao.*를 import하여 만들어놓은 것들을 사용 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>테이블 삭제.</h3>
	${msg }
	
</body>
</html>


