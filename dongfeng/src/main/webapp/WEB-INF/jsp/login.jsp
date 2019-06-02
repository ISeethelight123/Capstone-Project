<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<style>
	
	html{height: 100%;}
body.signin {
    background: #18c8f6;
    height: auto;
    background:url("../static/pictrue/denglu.jpg") no-repeat center fixed;
    -webkit-background-size: cover;
    -moz-background-size: cover;
    -o-background-size: cover;
    background-size: cover;
    color: rgba(255,255,255,.95);
}

.signinpanel {
    width: 320px;
    margin: 10% auto 0 auto;
}

.signinpanel .logopanel {
    float: none;
    width: auto;
    padding: 0;
    background: none;
}

.signinpanel .signin-info ul {
    list-style: none;
    padding: 0;
    margin: 20px 0;
}

.signinpanel .form-control {
    display: block;
    margin-top: 15px;
}

.signinpanel .uname {
    background: #fff url(../img/user.png) no-repeat 95% center;color:#333;
}

.signinpanel .pword {
    background: #fff url(../img/locked.png) no-repeat 95% center;color:#333;
}

.signinpanel .btn {
    margin-top: 15px;
}

.signinpanel form {
    background: rgba(255, 255, 255, 0.2);
    border: 1px solid rgba(255,255,255,.3);
    -moz-box-shadow: 0 3px 0 rgba(12, 12, 12, 0.03);
    -webkit-box-shadow: 0 3px 0 rgba(12, 12, 12, 0.03);
    box-shadow: 0 3px 0 rgba(12, 12, 12, 0.03);
    -moz-border-radius: 3px;
    -webkit-border-radius: 3px;
    border-radius: 3px;
    padding: 30px;
}

.signup-footer{border-top: solid 1px rgba(255,255,255,.3);margin:20px 0;padding-top: 15px;}

@media screen and (max-width: 768px) {
    .signinpanel,
    .signuppanel {
        margin: 0 auto;
        width: 420px!important;
        padding: 20px;
    }
    .signinpanel form {
        margin-top: 20px;
    }
    .signup-footer {
        margin-bottom: 10px;
    }
    .signuppanel .form-control {
        margin-bottom: 10px;
    }
    .signup-footer .pull-left,
    .signup-footer .pull-right {
        float: none !important;
        text-align: center;
    }
    .signinpanel .signin-info ul {
        display: none;
    }
}
@media screen and (max-width: 320px) {
    .signinpanel,
    .signuppanel {
        margin:0 20px;
        width:auto;
    }
}

</style>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">

    <title> - 登录</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <link href="css/login.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->
    <script>
        if (window.top !== window.self) {
            window.top.location = window.location;
        }
    </script>

</head>

<body class="signin">
    <div class="signinpanel" >
        <div class="row">
            <div class="col-sm-12">

            <form class="m-t" role="form" method="post" action="${pageContext.request.contextPath }/tologin">
                <h4 class="no-margins">登录：</h4>
                    <p class="m-t-md">东风物流后台管理系统</p>
                <div class="form-group">
                    <input type="text" class="form-control" name="name"  placeholder="用户名" required="">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" name="password" placeholder="密码" required="">
                </div>
                <button type="submit" class="btn btn-primary block full-width m-b">登 录</button>


                <p class="text-muted text-center"> <a href="login.html#"><small></small></a> | <a href="register.html"></a>
                </p>

            </form>
            </div>
        </div>
        <div class="signup-footer">
            <div class="pull-left">
                &copy; lty
            </div>
        </div>
    </div>
</body>

</html>
