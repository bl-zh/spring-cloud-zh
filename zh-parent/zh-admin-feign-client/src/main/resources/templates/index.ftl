<!DOCTYPE html>
<html>
<head>
<#include "include/header.ftl">
</head>
<body>

<div class="wrapper-page">
    <div class="panel panel-color panel-primary panel-pages">
        <div class="panel-heading bg-img">
            <div class="bg-overlay"></div>
            <h3 class="text-center m-t-10 text-white">登入<strong>I百联后台管理系统</strong> </h3>
        </div>


        <div class="panel-body">
            <form class="form-horizontal m-t-20" action="index.html">

                <div class="form-group">
                    <div class="col-xs-12">
                        <input class="form-control input-lg" type="text" required="" placeholder="用户名">
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-xs-12">
                        <input class="form-control input-lg" type="password" required="" placeholder="密码">
                    </div>
                </div>

                <div class="form-group text-center m-t-40">
                    <div class="col-xs-12">
                        <button class="btn btn-primary btn-lg w-lg waves-effect waves-light" type="submit">登入</button>
                    </div>
                </div>

            </form>
        </div>

    </div>
</div>

<#include "include/footer.ftl">

</body>
</html>