<%--
  Created by IntelliJ IDEA.
  User: Murphy
  Date: 2017/12/13
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="<%=basePath%>">
    <title>登录</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <%@include file="/jsp/base/style.jsp"%>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->


</head>
<body class="hold-transition login-page">
<div class="login-box">
    <div class="login-logo">
        <a href="#"><b>Murphy</b></a>
    </div>
    <!-- /.login-logo -->
    <div class="login-box-body">
        <p class="login-box-msg">请登录</p>

        <form action="/user/login" method="post">
            <div class="form-group has-feedback">
                <input type="text" class="form-control" placeholder="text" name="loginname">
                <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input type="password" class="form-control" placeholder="Password" name="password">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
            <div class="row">
                <div class="col-xs-8">
                    <div class="checkbox icheck">
                        <label>
                            <input type="checkbox">记住我
                        </label>
                    </div>
                </div>
                <!-- /.col -->
                <div class="col-xs-4">
                    <button type="submit" class="btn btn-primary btn-block btn-flat">登录</button>
                </div>
                <!-- /.col -->
            </div>
        </form>

        <div class="social-auth-links text-center">
            <p>- OR -</p>
            <a href="#" class="btn btn-block btn-social btn-facebook btn-flat"><i class="fa fa-facebook"></i> Sign in
                using
                Facebook</a>
            <a href="#" class="btn btn-block btn-social btn-google btn-flat"><i class="fa fa-google-plus"></i> Sign in
                using
                Google+</a>
        </div>
        <!-- /.social-auth-links -->

        <a href="#">忘记密码</a><br>
        <a href="register.html" class="text-center">注册用户</a>

    </div>
    <!-- /.login-box-body -->
</div>
<!-- /.login-box -->

<%--<!-- jQuery 3 -->--%>
<%--<script src="/AdminLTE/bower_components/jquery/dist/jquery.min.js"></script>--%>
<%--<!-- Bootstrap 3.3.7 -->--%>
<%--<script src="/AdminLTE/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>--%>
<%--<!-- iCheck -->--%>
<%--<script src="/AdminLTE/plugins/iCheck/icheck.min.js"></script>--%>
<%--<script>--%>
    <%--$(function () {--%>
        <%--$('input').iCheck({--%>
            <%--checkboxClass: 'icheckbox_square-blue',--%>
            <%--radioClass: 'iradio_square-blue',--%>
            <%--increaseArea: '20%' // optional--%>
        <%--});--%>
    <%--});--%>
<%--</script>--%>
</body>
</html>
