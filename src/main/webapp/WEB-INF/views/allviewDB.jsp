<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*,javax.sql.*,java.io.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="kopo.exam.hibernate.service.*, kopo.exam.hibernate.dto.*" %><!-- kopo.domain.*, kopo.dao.*를 import하여 만들어놓은 것들을 사용 -->
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>전체 데이터</h3>
	<hr>	
	<table cellspacing=1 width=600 border=1>
	<tr>
		<td width=50><p align=center>이름</p></td>
		<td width=50><p align=center>학번</p></td>
		<td width=50><p align=center>국어</p></td>		
		<td width=50><p align=center>영어</p></td>		
		<td width=50><p align=center>수학</p></td>
	</tr>
	<c:choose>
		<c:when test="${empty list}">
			<tr>
				<td colspan=5>
					<spring:message code="common.listEmpty"/>
				</td>
			</tr>
		</c:when>
		<c:otherwise>
			<c:forEach items="${list }" var="e">
			<tr>
				<td width=50><p align=center><a href="./oneviewDB/${e.studentid}">${e.name}</a></p></td>
				<td width=50><p align=center><a href="./oneviewDB/${e.studentid}">${e.studentid}</a></p></td>
				<td width=50><p align=center>${e.kor}</p></td>		
				<td width=50><p align=center>${e.eng}</p></td>		
				<td width=50><p align=center>${e.mat}</p></td>
			</tr>
			</c:forEach>
		</c:otherwise>				
	</c:choose>
	</table>
</body>
</html>


