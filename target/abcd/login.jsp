<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录页-淘宝</title>
    <link rel="shortcut icon" href="<%=path%>/favicon.ico">
    <link rel="stylesheet" href="<%=path%>/css/reset.css">
    <link rel="stylesheet" href="<%=path%>/css/base1.css">
    <link rel="stylesheet" href="<%=path%>/css/login.css">
    <!-- 视图窗口，移动端特属的标签。 -->
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,minimum-scale=1,user-scalable=no" />
    <link media="screen and (min-width: 992px) and (max-width:1200px)" rel="stylesheet" href="<%=path%>/css/base1-small.css">
    <link media="screen and (min-width: 992px) and (max-width:1200px)" rel="stylesheet" href="<%=path%>/css/login-small.css">
    <link media="screen and (min-width: 768px) and (max-width:991px)" rel="stylesheet" href="<%=path%>/css/base1-pad.css">
    <link media="screen and (min-width: 768px) and (max-width:991px)" rel="stylesheet" href="<%=path%>/css/login-pad.css">
</head>
<body>
<!-- 顶部 -->
<header>
    <!-- 搜索和logo -->
    <div class="logoAndSearch textWarp w1190 clearfix">
        <div class="logo">
            <a href="<%=path%>/showgoodslist?page=1" target="_self">淘宝网</a>
        </div>
        <div class="LAStxt">
            欢迎登录
        </div>
        <div class="search">
            <div class="txt">
                <input id="searchByName" type="text" placeholder="Swisse/澳洲">
                <em></em>
            </div>
            <a href="#" class="btn" href="javascript:void(0)" onclick="searchByName()">
                搜索
            </a>
            <script>
                function searchByName(){
                    window.location.href = "selectgoodsbyname?name=" +
                        document.getElementById("searchByName").value;
                }
            </script>
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
<!-- 中间内容 -->
<div class="mainArea">
    <div class="mainAreaW textWarp w1190">
        <div class="mainContent boxS">
            <div class="MCup clearfix">

                <form id="frm" action="loginusers" method="post">

                    <div class="MCright W310">
                        <h3 class="clearfix">
                            <span>登录</span>
                            <a target="_self" href="<%=path%>/register.jsp">免费注册</a>
                        </h3>

                        <p class="userName">
                            <em></em>
                            <input name="userName_userPhone" class="W310" placeholder="请输入您的手机号/邮箱" type="text">
                        </p>
                        <p class="passWord">
                            <em></em>
                            <input name="userPass" class="W310" placeholder="请输入密码" type="password">
                        </p>
                        <p class="clearfix yzm">
                            <input name="verifyCode" type="text" placeholder="验证码"> <span class="Ypic">
								<img style="width: 69px;height: 40px" id="imgrandom" alt="" src="getverificationcode">
                        <a 0href="javascript:void(0)" onclick="upimg()">换一张</a>
                        <script type="text/javascript">
									function upimg() {
                                        document.getElementById("imgrandom").src = "getverificationcode?a="
                                            + new Date().getTime();
                                    }
								</script>
							</span>
                        </p>
                        <p class="clearfix Jzmm">
                            <span class="checkbox checked"></span>
                            <span>记住密码</span>
                            <a target="_blank" href="#">忘记密码？</a>
                        </p>
                        <a class="loGin W310" href="javascript:void(0)" onclick="document.getElementById('frm').submit()">登录</a>
                    </div>

                </form>

                <div class="MCleft W115">
                    <img src="<%=path%>/images/AppEr.png" alt="二维码">
                    <p>扫码下载客户端</p>
                    <div class="pL">
                        <span>手机可直接访问</span>
                        <strong>m.aumalls.com</strong>
                    </div>
                </div>
            </div>

            <div class="MCdown">
                <p>使用其他账户登录</p>
                <ul>
                    <li class="clearfix">
                        <em></em>
                        <a href="#">QQ登录</a>
                    </li>
                    <li class="clearfix">
                        <em></em>
                        <a href="#">微博登录</a>
                    </li>
                    <li class="clearfix">
                        <em></em>
                        <a href="#">腾讯微博</a>
                    </li>
                    <li class="clearfix">
                        <em></em>
                        <a href="#">微信登录</a>
                    </li>
                    <li class="clearfix BN">
                        <em></em>
                        <a href="#">百度登录</a>
                    </li>
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
            澳大利亚Health more - 河南康多多贸易有限公司 - 河南澳蜜电子商务有限公司 版权所有<br>
            Copyright © 20015-2018  淘宝aumalls.com 版权所有, 豫ICP备15030837号-1
        </p>
        <div class="ALLN"></div>
    </div>
</footer>
<script src="<%=path%>/js/jquery-1.7.2.min.js"></script>
<script src="<%=path%>/js/jquery.lazyload.min.js"></script>
<script src="<%=path%>/js/login.js"></script>
</body>
</html>
