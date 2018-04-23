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
        <h4 class="pull-left page-title">商品主档数据</h4>
        <ol class="breadcrumb pull-right">
            <li><a href="#">I百联 - 后台管理系统</a></li>
            <li class="active">商品主档数据</li>
        </ol>
    </div>
</div>

<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h4 class="panel-title">商品主档数据</h4>
            </div>
            <div class="panel-body">
                <table class="table table-bordered m-b-15">
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>主档ID</th>
                        <th>主档名称</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
                        <td>1</td>
                        <td>水果ID</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>2</td>
                        <td>苹果</td>
                    </tr>
                    </tbody>
                </table>
                <form role="form">
                    <div class="form-group">
                        <label>主档名称</label>
                        <input type="text" class="form-control" >
                    </div>
                    <button type="submit" class="btn btn-purple waves-effect waves-light">提交</button>
                </form>
            </div>
        </div>
    </div>
</div>



<#include "include/layout/bottom.ftl">
<#include "include/footer.ftl">

</body>
</html>