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
        <h4 class="pull-left page-title">商品列表</h4>
        <ol class="breadcrumb pull-right">
            <li><a href="#">I百联 - 前台购物系统</a></li>
            <li class="active">商品列表</li>
        </ol>
    </div>
</div>

<div class="row ">
    <div class="col-sm-10">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">商品列表</h3>
            </div>
            <div class="panel-body">
                <table class="table table-bordered m-b-15">
                    <thead>
                    <tr>
                        <td colspan="4" class="text-center"><strong>商品列表</strong></td>
                    </tr>
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
                    <button type="submit" class="btn btn-success waves-effect waves-light m-l-10">加入购物车</button>
                </div>
            </div>
        </div>
    </div>

    <div class="col-sm-2">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">根据用户最后一次下单情况推荐数据</h3>
            </div>
            <div class="panel-body">
                <table class="table table-bordered ">
                    <thead>
                    <tr>
                        <th>产品名称</th>
                        <th>单价</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
                        <td>苹果</td>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>苹果</td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>

        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">根据用户最后一次加入购物车的商品推荐数据</h3>
            </div>
            <div class="panel-body">
                <table class="table table-bordered ">
                    <thead>
                    <tr>
                        <th>产品名称</th>
                        <th>单价</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
                        <td>苹果</td>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>苹果</td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>

    </div>

</div>

<#include "include/layout/bottom.ftl">
<#include "include/footer.ftl">
<script type="text/javascript" src="theme/green/plugins/isotope/dist/isotope.pkgd.min.js"></script>
<script type="text/javascript" src="theme/green/plugins/magnific-popup/dist/jquery.magnific-popup.min.js"></script>

<link href="theme/green/plugins/bootstrap-touchspin/dist/jquery.bootstrap-touchspin.min.css" rel="stylesheet" />
<script src="theme/green/plugins/bootstrap-touchspin/dist/jquery.bootstrap-touchspin.min.js" type="text/javascript"></script>


<script type="text/javascript">
    $(window).load(function(){
        var $container = $('.portfolioContainer');
        $container.isotope({
            filter: '*',
            animationOptions: {
                duration: 750,
                easing: 'linear',
                queue: false
            }
        });

        $('.portfolioFilter a').click(function(){
            $('.portfolioFilter .current').removeClass('current');
            $(this).addClass('current');

            var selector = $(this).attr('data-filter');
            $container.isotope({
                filter: selector,
                animationOptions: {
                    duration: 750,
                    easing: 'linear',
                    queue: false
                }
            });
            return false;
        });

        $(".input-TouchSpin").TouchSpin();
    });
    $(document).ready(function() {
        $('.image-popup').magnificPopup({
            type: 'image',
            closeOnContentClick: true,
            mainClass: 'mfp-fade',
            gallery: {
                enabled: true,
                navigateByImgClick: true,
                preload: [0,1] // Will preload 0 - before current, and 1 after the current image
            }
        });
    });
</script>
</body>
</html>