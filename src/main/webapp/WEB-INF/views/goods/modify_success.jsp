<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var='root' value="${pageContext.request.contextPath }/" />

<script>
	alert('상품페이지 수정이 완료되었습니다')
	location.href = '${root}goods/goods_detail?goods_idx=${goods_idx}'
</script>