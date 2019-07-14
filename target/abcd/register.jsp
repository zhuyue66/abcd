<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>注册页-淘宝</title>
	<link rel="shortcut icon" href="<%=path%>/favicon.ico">
	<link rel="stylesheet" href="<%=path%>/css/reset.css">
	<link rel="stylesheet" href="<%=path%>/css/base1.css">
	<link rel="stylesheet" href="<%=path%>/css/login.css">
	<!-- 视图窗口，移动端特属的标签。 -->
	<meta name="viewport"
		  content="width=device-width,initial-scale=1,maximum-scale=1,minimum-scale=1,user-scalable=no" />
	<link media="screen and (min-width: 992px) and (max-width:1200px)"
		  rel="stylesheet" href="<%=path%>/css/base1-small.css">
	<link media="screen and (min-width: 992px) and (max-width:1200px)"
		  rel="stylesheet" href="<%=path%>/css/login-small.css">
	<link media="screen and (min-width: 768px) and (max-width:991px)"
		  rel="stylesheet" href="<%=path%>/css/base1-pad.css">
	<link media="screen and (min-width: 768px) and (max-width:991px)"
		  rel="stylesheet" href="<%=path%>/css/login-pad.css">
</head>
<body>
<!-- 顶部 -->
<header>
	<!-- 搜索和logo -->
	<div class="logoAndSearch
	textWarp w1190 clearfix">
		<div class="logo">
			<a href="<%=path%>/showgoodslist?page=1">淘宝网</a>
		</div>
		<div class="LAStxt">欢迎注册</div>
		<div class="search">
			<div class="txt">
				<input id="searchByName" type="text" placeholder="Swisse/澳洲"> <em></em>
			</div>
			<a href="#" class="btn" href="javascript:void(0)" onclick="searchByName()"> 搜索 </a>
			<ul>
				<li><a target="_blank" href="#">胶原蛋白</a></li>
				<li><a target="_blank" href="#">叶绿素</a></li>
				<li><a target="_blank" href="#">睡眠片</a></li>
				<li><a target="_blank" href="#">儿童维生素</a></li>
				<li><a target="_blank" href="#">鱼肝油</a></li>
				<li><a target="_blank" href="#">保健品</a></li>
				<li><a target="_blank" href="#">美容</a></li>
				<li class="BN"><a target="_blank" href="#">运动保健</a></li>
			</ul>
		</div>
	</div>
</header>

<script>
	function searchByName(){
		window.location.href = "selectgoodsbyname?name=" +
				document.getElementById("searchByName").value;
	}
</script>
<!-- 中间内容 -->
<div class="mainArea">
	<div class="mainAreaW textWarp w1190">
		<div class="mainContent boxS">
			<div class="MCup clearfix">

				<form id="frm" action="addusers" method="post">

					<div class="MCright W310">
						<h3 class="clearfix">
							<span>注册淘宝</span> <a target="_self" href="<%=path%>/login.jsp">登陆</a>
						</h3>
						<p class="userName">
							<em></em> <input name="userName" class="W310" placeholder="请注册您的用户名\邮箱" type="text">
						</p>
						<p class="passWord">
							<em></em> <input name="userPass" class="W310" placeholder="请输入密码" type="password">
						</p>
						<p class="clearfix yzm">
							<span>
								<input name="userPhone" type="text" id="telnum" placeholder="手机号">
							</span>
							<span class="Ypic">
								<button style="background-color: #e50065;width: 120px;height: 40px;border: none;color: white;" id="getyzm" onclick="sendmessage()" type="button" >获取验证码</button>
							</span>
						</p>
						<p class="clearfix yzm">
							<input name="verifyCode" type="text" placeholder="验证码">
						</p>
						<%--<p class="clearfix Jzmm">
							<span class="checkbox checked"></span> <span>记住密码</span> <a
								target="_blank" href="#">忘记密码？</a>
						</p>--%>
						<a class="loGin W310" href="javascript:void(0)" onclick="document.getElementById('frm').submit()">注&nbsp;&nbsp;&nbsp;&nbsp;册</a>
					</div>
					<div class="MCleft W115">
						<img src="images/AppEr.png" alt="二维码">
						<p>扫码下载客户端</p>
						<div class="pL">
							<span>手机可直接访问</span> <strong>m.aumalls.com</strong>
						</div>
					</div>

				</form>

			</div>
			<div class="MCdown">
				<p>使用其他账户登录</p>
				<ul>
					<li class="clearfix"><em></em> <a href="#">QQ登录</a></li>
					<li class="clearfix"><em></em> <a href="#">微博登录</a></li>
					<li class="clearfix"><em></em> <a href="#">腾讯微博</a></li>
					<li class="clearfix"><em></em> <a href="#">微信登录</a></li>
					<li class="clearfix BN"><em></em> <a href="#">百度登录</a></li>
				</ul>
			</div>
		</div>
	</div>
</div>
<!-- 底部 -->
<footer>
	<div class="txt textWarp w1190">
		<ul>
			<li><a href="#">关于淘宝海淘</a></li>
			<li><a href="#">商家入驻</a></li>
			<li><a href="#">网站合作</a></li>
			<li><a href="#">友情链接</a></li>
			<li><a href="#">淘宝公益</a></li>
			<li><a href="#">法律声明</a></li>
			<li><a href="#">诚聘英才</a></li>
			<li><a href="#">联系我们</a></li>
			<li><a href="#">网站地图</a></li>
		</ul>
		<p>
			澳大利亚Health more - 河南康多多贸易有限公司 - 河南澳蜜电子商务有限公司 版权所有<br> Copyright
			© 20015-2018 淘宝aumalls.com 版权所有, 豫ICP备15030837号-1
		</p>
		<div class="ALLN"></div>
	</div>
</footer>
<script src="<%=path%>/js/jquery-1.7.2.min.js"></script>
<script src="<%=path%>/js/jquery.lazyload.min.js"></script>
<script src="<%=path%>/js/login.js"></script>



<script type="text/javascript">
	$(function() {
		//alert("验证jquery导入是否成功");
	});

	var time=60;
	//发送验证码
	function sendmessage() {
		//验证手机号码的长度
		var telnum = document.getElementById("telnum").value;//获取手机号码
		if (telnum.length != 11) {
			alert("手机号码不正确");
			return;
		}

		//用jquery的ajax函数提交到后台的controller
		$.get("sendmessagebyph?telnum="
				+ document.getElementById("telnum").value, function(data) {
			if (data == 1) {
				alert("短信发送成功");
			}

		});

		/////////////////////设置获取验证码按钮不可操作及内容
		var intime=time;

		//setInterval启动一个定时器，每隔1000毫秒执行一次里面的这个functio函数
		var sp=window.setInterval(function() {
			$("#getyzm").html(--intime);
			if(intime==1){
				$("#getyzm").removeAttr("disabled");//让获取验证码按钮再次可以单击
				window.clearInterval(sp);//停止定时器
				$("#getyzm").html("获取验证码");

			}

		}, 1000);

		$("#getyzm").attr("disabled","disabled");//让获取验证码按钮不可以单击

	}
</script>
</body>
</html>