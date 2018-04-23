<!DOCTYPE html>
<html>
<head>
<#include "include/header.ftl">

    <!--venobox lightbox-->
    <link rel="stylesheet" href="theme/green/plugins/magnific-popup/dist/magnific-popup.css">

</head>
<body>
<#include "include/layout/top.ftl">

<!-- Page-Title -->
<div class="row">
    <div class="col-sm-12">
        <h4 class="pull-left page-title">购物车</h4>
        <ol class="breadcrumb pull-right">
            <li><a href="#">I百联 - 前台购物系统</a></li>
            <li class="active">购物车</li>
        </ol>
    </div>
</div>

<div class="row ">
    <div class="col-sm-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">购物车</h3>
            </div>
            <div class="panel-body">
                <table class="table table-bordered m-b-15">
                    <thead>
                    <tr>
                        <th class="wp2">#</th>
                        <th>产品名称</th>
                        <th>单价</th>
                        <th class="w150">数量</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
                        <td>苹果</td>
                        <td>10</td>
                        <td><input id="demo3" type="text" value="" name="demo3" class="input-TouchSpin"
                                   data-bts-button-down-class="btn btn-primary"
                                   data-bts-button-up-class="btn btn-primary"></td>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>苹果</td>
                        <td>10</td>
                        <td><input id="demo3" type="text" value="" name="demo3" class="input-TouchSpin"
                                   data-bts-button-down-class="btn btn-primary"
                                   data-bts-button-up-class="btn btn-primary"></td>
                    </tr>
                    </tbody>
                </table>
                <div class="text-right">
                    <button type="submit" class="btn btn-success waves-effect waves-light m-l-10">结算</button>
                </div>
            </div>
        </div>
    </div>
</div>

<#include "include/layout/bottom.ftl">
<#include "include/footer.ftl">
<script type="text/javascript" src="theme/green/plugins/isotope/dist/isotope.pkgd.min.js"></script>
<script type="text/javascript" src="theme/green/plugins/magnific-popup/dist/jquery.magnific-popup.min.js"></script>

<link href="theme/green/plugins/bootstrap-touchspin/dist/jquery.bootstrap-touchspin.min.css" rel="stylesheet"/>
<script src="theme/green/plugins/bootstrap-touchspin/dist/jquery.bootstrap-touchspin.min.js"
        type="text/javascript"></script>
<script>
    $(function () {
        $(".input-TouchSpin").TouchSpin();
    });
</script>


</body>
</html>