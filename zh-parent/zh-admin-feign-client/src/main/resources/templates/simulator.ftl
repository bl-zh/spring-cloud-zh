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
        <h4 class="pull-left page-title">商品推荐模拟器</h4>
        <ol class="breadcrumb pull-right">
            <li><a href="#">I百联 - 后台管理系统</a></li>
            <li class="active">商品推荐模拟器</li>
        </ol>
    </div>
</div>

<div class="row">
    <div class="col-lg-6">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h4 class="panel-title">模拟：根据用户订单数据纬度推荐商品</h4>
            </div>
            <div class="panel-body">
                <form role="form" class=" m-b-15">
                    <div class="form-group">
                        <label>主档数据ID</label>
                        <input type="text" class="form-control" placeholder="主档数据ID">
                    </div>
                    <button type="submit" class="btn btn-purple waves-effect waves-light">模拟</button>
                </form>
                <table class="table table-bordered">
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>关联的商品数据</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
                        <td>商品A</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>商品A,商品B</td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

    <div class="col-lg-6">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h4 class="panel-title">模拟：根据商品主档关联数据进行推荐商品</h4>
            </div>
            <div class="panel-body">
                <form role="form" class=" m-b-15">
                    <div class="form-group">
                        <label>主档数据ID</label>
                        <input type="text" class="form-control" placeholder="主档数据ID">
                    </div>
                    <button type="submit" class="btn btn-purple waves-effect waves-light">模拟</button>
                </form>
                <table class="table table-bordered">
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>关联的商品数据</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
                        <td>商品A</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>商品A,商品B</td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>


</div>



<#include "include/layout/bottom.ftl">
<#include "include/footer.ftl">

</body>
</html>