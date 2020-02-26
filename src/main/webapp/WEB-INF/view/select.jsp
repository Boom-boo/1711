<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>周考</title>
<link href="css/index3.css" rel="stylesheet" >
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	function fenye(pageNum){
		$("[name=pageNum]").val(pageNum);
		$("form").submit();
	}
	function add(){
		location.href="add.jsp";
	}
</script>
</head>
<body>
	<form action="/select" method="post">
			<input type="hidden" name="pageNum">
		种类<input type="text" name="type_types" value="${vo.type_types}">
		品牌<input type="text" name="brand_name" value="${vo.brand_name}">
		单价范围<input type="text" name="p1" value="${vo.p1}">到<input type="text" name="p2" value="${vo.p2}">
		商品名称:<input type="text" name="type_name" value="${vo.type_name}">
		英文名称:<input type="text" name="brand_english" value="${vo.brand_english}">
		标签:<input type="text" name="type_title" value="${vo.type_title}">
		<button>查询</button>
	</form>
	<table>
		<tr>
			<td>商品名称</td>
			<td>英文名称</td>
			<td>商品品牌</td>
			<td>商品种类</td>
			<td>尺寸</td>
			<td>单价(元)</td>
			<td>数量</td>
			<td>标签</td>
			<td>样式</td>
			<td>图片</td>
			<td><button onclick="add()">添加</button></td>
		</tr>
		<c:forEach items="${page.list}" var="type">
			<tr>
				<td>${type.type_id}</td>
				<td>
					<c:forEach items="${type.brands}" var="brand">
						${brand.brand_english}
					</c:forEach>
				</td>
				<td>
					<c:forEach items="${type.brands}" var="brand">
						${brand.brand_name}
					</c:forEach>
				</td>
				<td>${type.type_name}</td>
				<td>${type.type_types}</td>
				<td>${type.type_size}</td>
				<td>${type.type_price}</td>
				<td>${type.type_now}</td>
				<td>${type.type_title}</td>
				<td>
					<img alt="显示" src="<%-- file/${type.type_pic} --%>">
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="100">
				<button onclick="fenye(1)">首页</button>
				<button onclick="fenye(${page.prePage==0?1:page.prePage})">上一页</button>
				<button onclick="fenye(${page.prePage==0?page.pages:page.nextPage})">下一页</button>
				<button onclick="fenye(${page.pages})">尾页</button>
				一共${pageNum}/${page.pages}页,一共${page.total}条
			</td>
		</tr>
	</table>
</body>
</html>