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
        <h4 class="pull-left page-title">历史销售数据</h4>
        <ol class="breadcrumb pull-right">
            <li><a href="#">I百联 - 后台管理系统</a></li>
            <li class="active">历史销售数据</li>
        </ol>
    </div>
</div>

<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h4 class="panel-title">历史销售数据</h4>
            </div>
            <div class="panel-body">
                <form class="form-inline m-b-15" role="form">
                    <div class="form-group">
                        <label class="sr-only" >日期</label>
                        <input type="text" class="form-control"  placeholder="日期">
                    </div>
                    <button type="submit" class="btn btn-success waves-effect waves-light m-l-10">查询</button>
                </form>
                <table class="table table-bordered">
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>订单编号</th>
                        <th class="w100">盈利</th>
                        <th class="w150">创建时间</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
                        <td>20180423</td>
                        <td>10</td>
                        <td>2018-04-23 10:25</td>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>20180423</td>
                        <td>10</td>
                        <td>2018-04-23 10:25</td>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>20180423</td>
                        <td>10</td>
                        <td>2018-04-23 10:25</td>
                    </tr>
                    </tbody>
                    <tfoot>
                    <tr>
                        <td colspan="2"></td>
                        <td colspan="2">总盈利：20</td>
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