<!DOCTYPE html>
<html>
<head>
<#include "include/header.ftl">
</head>
<body>
<#include "include/layout/top.ftl">

<!-- Page-Title -->
<div class="row">
    <div class="col-sm-12">
        <h4 class="pull-left page-title">管理控制台</h4>
        <ol class="breadcrumb pull-right">
            <li><a href="#">I百联 - 后台管理系统</a></li>
            <li class="active">管理控制台</li>
        </ol>
    </div>
</div>

<div class="row">
    <div class="col-md-6 col-sm-6 col-lg-3">
        <div class="mini-stat clearfix bx-shadow bg-info">
            <span class="mini-stat-icon"><i class="fa fa-database"></i></span>
            <div class="mini-stat-info text-right">
                <span class="counter">15852</span>
                主档数据统计
            </div>
            <div class="tiles-progress">
                <div class="m-t-20">
                    <h5 class="text-uppercase text-white m-0">库存最多主档<span class="pull-right">衣服</span></h5>
                </div>
            </div>
        </div>
    </div>
    <div class="col-md-6 col-sm-6 col-lg-3">
        <div class="mini-stat clearfix bg-purple bx-shadow">
            <span class="mini-stat-icon"><i class="fa fa-book"></i></span>
            <div class="mini-stat-info text-right">
                <span class="counter">956</span>
                昨日订单数
            </div>
            <div class="tiles-progress">
                <div class="m-t-20">
                    <h5 class="text-uppercase text-white m-0">总的订单数量<span class="pull-right">59</span></h5>
                </div>
            </div>
        </div>
    </div>

    <div class="col-md-6 col-sm-6 col-lg-3">
        <div class="mini-stat clearfix bg-success bx-shadow">
            <span class="mini-stat-icon"><i class="md md-trending-up"></i></span>
            <div class="mini-stat-info text-right">
                <span class="counter">20544</span>
                昨日盈利金额
            </div>
            <div class="tiles-progress">
                <div class="m-t-20">
                    <h5 class="text-uppercase text-white m-0">总盈利<span class="pull-right">1026</span></h5>
                </div>
            </div>
        </div>
    </div>

    <div class="col-md-6 col-sm-6 col-lg-3">
        <div class="mini-stat clearfix bg-primary bx-shadow">
            <span class="mini-stat-icon"><i class="fa fa-money"></i></span>
            <div class="mini-stat-info text-right">
                <span class="counter">5210</span>
                库存商品总金额
            </div>
            <div class="tiles-progress">
                <div class="m-t-20">
                    <h5 class="text-uppercase text-white m-0">总收入-总成本<span class="pull-right">136</span></h5>
                </div>
            </div>
        </div>
    </div>
</div>



<#include "include/layout/bottom.ftl">
<#include "include/footer.ftl">

</body>
</html>