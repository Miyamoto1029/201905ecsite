<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<title>BuyItem画面</title>

	<style type="text/css">
		body{
			margin:0;
			padding:0;
			line-height:1.6;
			letter-spacing:1px;
			font-family:Verdana, Helvetica, sans-serif;
			font-size:12px;
			color:#333;
			background:#fff;
		}

		table{
			text-aligin: center;
			margin: 0 auto;
		}

		#top{
			width:780px;
			margin:30px auto;
			border:1px solid #333;
		}

		#header{
			width: 100%;
			height: 80px;
			background-color: black;
		}

		#main{
			width: 100%;
			height: 500px;
			text-align: center;
		}

		#footer{
			width: 100%;
			height: 80px;
			background-color: black;
			clear:both;
		}
	</style>
</head>
<body>

<div id="main">
	<div id="top">
		<p>BuyItem</p>
	</div>
	<div>
		<s:form action="BuyItemAction">
		<table>
			<tr>
				<td>
					<span>商品名</span>
				</td>
				<td>
					<s:property value="session.buyItem_name" /><br>
				</td>
			</tr>
			<tr>
				<td>
					<span>値段</span>
				</td>
				<td>
					<s:property value="session.buyItem_price" /><span>円</span>
				</td>
			</tr>
			<tr>
				<td>
					<span>購入個数</span>
				</td>
				<td>
					<select name="count">
						<option value="1" selected="selected">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
					</select>
			</tr>
			<tr>
				<td>
					<span>支払い方法</span>
				</td>
				<td>
					<input type="radio" name="pay" value="1" checked="checked">現金払い
					<input type="radio" name="pay" value="2">クレジットカード
				</td>
			</tr>
			<tr>
				<td>
					<s:submit value="購入" />
				</td>
			</tr>
		</table>
	</s:form>
		<div>
			<p>前画面に戻る場合は<a href='<s:url action="GoHomeAction" />'>>こちら</a></p>
			<p>マイページは<a href='<s:url action="MyPageAction" />'>こちら</a></p>
		</div>
	</div>
</div>

<div id="footer">
	<div id="pr">	</div>
</div>


</body>
</html>



↓佐藤さんに教わったコード
<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> --%>
<%-- <%@ taglib prefix="s" uri="/struts-tags" %> --%>
<!-- <!DOCTYPE html> -->
<!-- <html> -->
<!-- <head> -->
<!-- 	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" /> -->
<!-- 	<meta http-equiv="Content-Style-Type" content="text/css" /> -->
<!-- 	<meta http-equiv="Content-Script-Type" content="text/javascript" /> -->
<!-- 	<meta http-equiv="imagetoolbar" content="no" /> -->
<!-- 	<meta name="description" content="" /> -->
<!-- 	<meta name="keywords" content="" /> -->
<!-- 	<title>BuyItem画面</title> -->

<%-- 	<style type="text/css"> --%>
/* 		body{ */
/* 			margin:0; */
/* 			padding:0; */
/* 			line-height:1.6; */
/* 			letter-spacing:1px; */
/* 			font-family:Verdana, Helvetica, sans-serif; */
/* 			font-size:12px; */
/* 			color:#333; */
/* 			background:#fff; */
/* 		} */

/* 		table{ */
/* 			text-aligin: center; */
/* 			margin: 0 auto; */
/* 		} */

/* 		#top{ */
/* 			width:780px; */
/* 			margin:30px auto; */
/* 			border:1px solid #333; */
/* 		} */

/* 		#header{ */
/* 			width: 100%; */
/* 			height: 80px; */
/* 			background-color: black; */
/* 		} */

/* 		#main{ */
/* 			width: 100%; */
/* 			height: 420px; */
/* 			text-align: center; */

/* 		} */

/* 		footer{ */
/* 			width: 100%; */
/* 			height: 80px; */
/* 			background-color: black; */
/* 			text-align: center; */
/* 		} */
<%-- 	</style> --%>
<!-- </head> -->
<!-- <body> -->

<!-- <div id="header"> -->
<!-- 	<div id="pr"></div> -->
<!-- </div> -->

<!-- <div id="main"> -->
<!-- 	<div id="top"> -->
<!-- 		<p>BuyItem</p> -->
<!-- 	</div> -->
<!-- <div> -->
<%-- <s:iterator value="buyitemlist"> --%>
<!-- <div style="margin: auto 200px; "> -->
<!-- 	<div style="float: left; margin: 10px 10px;"> -->
<%-- 		<s:form action="BuyItemAction" > --%>
<!-- 		<table style="background-color: yellow;"> -->
<!-- 			<tr> -->
<!-- 				<td> -->
<%-- 					<span>商品名</span> --%>
<!-- 				</td> -->
<!-- 				<td> -->
<%-- 					<s:property value = "itemName" /><br> --%>
<!-- 				</td> -->
<!-- 			</tr> -->
<!-- 			<tr> -->
<!-- 				<td> -->
<%-- 					<span>値段</span> --%>
<!-- 				</td> -->
<!-- 				<td> -->
<%-- 					<s:property value="itemPrice" /><span>円</span> --%>
<!-- 				</td> -->
<!-- 			</tr> -->
<!-- 			<tr> -->
<!-- 				<td> -->
<%-- 					<span>購入個数</span> --%>
<!-- 				</td> -->
<!-- 				<td> -->
<%-- 					<select name="count"> --%>
<!-- 						<option value="1" selected="selected">1</option> -->
<!-- 						<option value="2">2</option> -->
<!-- 						<option value="3">3</option> -->
<!-- 						<option value="4">4</option> -->
<!-- 						<option value="5">5</option> -->
<!-- 						<option value="6">6</option> -->
<!-- 						<option value="7">7</option> -->
<!-- 						<option value="8">8</option> -->
<!-- 						<option value="9">9</option> -->
<%-- 					</select> --%>
<!-- 			</tr> -->
<!-- 			<tr> -->
<!-- 				<td> -->
<%-- 					<span>支払い方法</span> --%>
<!-- 				</td> -->
<!-- 				<td> -->
<!-- 					<input type="radio" name="pay" value="1" checked="checked">現金払い -->
<!-- 					<input type="radio" name="pay" value="2">クレジットカード -->
<!-- 				</td> -->
<!-- 			</tr> -->
<!-- 			<tr> -->
<!-- 				<td> -->
<%-- 					<s:submit value="購入" /> --%>
<!-- 				</td> -->
<!-- 			</tr> -->
<!-- 		</table> -->
<%-- 	</s:form> --%>
<!-- 	<br> -->
<!-- 	</div> -->
<!-- </div> -->
<%-- </s:iterator> --%>
<!-- </div> -->
<!-- </div> -->

<!-- 		<div style="text-align: center;"> -->
<%-- 			<p>前画面に戻る場合は<a href='<s:url action="GoHomeAction" />'>こちら</a></p> --%>
<%-- 			<p>マイページは<a href='<s:url action="MyPageAction" />'>こちら</a></p> --%>
<!-- 		</div> -->

<!-- <footer> -->
<!-- 	<div id="pr">	</div> -->
<!-- </footer> -->


<!-- </body> -->
<!-- </html> -->