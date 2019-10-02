<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> <!-- a태그 url에서 .jsp가 사라졌다. -->
<a href="./createDB" target="main">테이블 생성</a><br>
<a href="./allsetDB" target="main">데이터 입력</a><br>
<a href="./dropDB" target="main">테이블 삭제</a><br>
<a href="./allviewDB" target="main">데이터 보기</a><br>
<!-- <a href="createDB.jsp" target="main">테이블 생성</a><br> -->
<!-- <a href="allsetDB.jsp" target="main">데이터 생성</a><br>	 -->
<!-- <a href="dropDB.jsp" target="main">테이블 삭제</a><br>	 -->
<!-- <a href="allviewDB.jsp" target="main">전체 데이터</a><br>	 -->
</body>
</html>