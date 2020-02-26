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
	function add(){
		var a=$("form").serialize();
		$.post("add.do",a,function(flag){
			if(flag){
				alert("添加成功");
				location.href="/select";
			}else{
				alert("添加失败")
			}
		},"json")
	}
</script>
</head>
<body>
	<form>
		<table>
			<tr>
				<td>商品名称</td>
				<td>
					
				</td>
			</tr>
			<tr>
				<td>英文名称</td>
				<td>
					
				</td>
			</tr>
			<tr>
				<td>商品品牌</td>
				<td>
					<input type="text" name="type_name">
				</td>
			</tr>
			<tr>
				<td>商品种类</td>
				<td>
					<input type="text" name="type_types">
				</td>
			</tr>
			<tr>
				<td>尺寸</td>
				<td>
					<input type="text" name="type_size">
				</td>
			</tr>
			<tr>
				<td>单价</td>
				<td>
					<input type="text" name="type_price">
				</td>
			</tr>
			<tr>
				<td>数量</td>
				<td>
					<input type="text" name="type_now">
				</td>
			</tr>
			<tr>
				<td>图片</td>
				<td>
					<input type="file" name="myFile">
				</td>
			</tr>
			<tr>
				<td colspan="100">
					<button onclick="add()">提交</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>