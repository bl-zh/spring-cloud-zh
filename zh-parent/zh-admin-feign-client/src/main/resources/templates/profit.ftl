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
        <h4 class="pull-left page-title">经营业绩计算器</h4>
        <ol class="breadcrumb pull-right">
            <li><a href="#">I百联 - 后台管理系统</a></li>
            <li class="active">经营业绩计算器</li>
        </ol>
    </div>
</div>

<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h4 class="panel-title">经营业绩计算器</h4>
            </div>
            <div class="panel-body">
                <table class="table table-bordered">
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>主档ID</th>
                        <th>主档名称</th>
                        <th>成本价</th>
                        <th>销售价</th>
                        <th>销售数量</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
                        <td>444</td>
                        <td>商品A</td>
                        <td>10</td>
                        <td class="w200"><input type="text" class="form-control w150"></td>
                        <td class="w200"><input type="text" class="form-control w150"></td>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>444</td>
                        <td>商品A</td>
                        <td>10</td>
                        <td class="w200"><input type="text" class="form-control w150"></td>
                        <td class="w200"><input type="text" class="form-control w150"></td>
                    </tr>
                    </tbody>
                    <tfoot>
                    <tr>
                        <td colspan="3"></td>
                        <td>成本价：10</td>
                        <td>销售总价：20</td>
                        <td>利润：10</td>
                    </tr>
                    <tr>
                        <td colspan="6" class="text-center">
                            <button class="btn btn-purple waves-effect waves-light">计算</button>
                        </td>
                    </tr>
                    </tfoot>
                </table>
            </div>
        </div>
    </div>
</div>



<#include "include/layout/bottom.ftl">
<#include "include/footer.ftl">

</body>
</html>