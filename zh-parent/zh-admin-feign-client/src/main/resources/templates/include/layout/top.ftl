<div id="wrapper">

    <!-- Top Bar Start -->
    <div class="topbar">
        <!-- LOGO -->
        <div class="topbar-left">
            <div class="text-center">
                <a href="index.html" class="logo"> <span>I百联 - 后台管理系统 </span></a>
            </div>
        </div>
        <!-- Button mobile view to collapse sidebar menu -->
        <div class="navbar navbar-default" role="navigation">
            <div class="container">
                <div class="">
                    <ul class="nav navbar-nav navbar-right pull-right">
                        <li class="dropdown">
                            <a href="" class="dropdown-toggle profile" data-toggle="dropdown" aria-expanded="true"><i class="fa fa-user"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="javascript:void(0)"><i class="md md-settings-power"></i> 退出登入</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
                <!--/.nav-collapse -->
            </div>
        </div>
    </div>
    <!-- Top Bar End -->


    <!-- ========== Left Sidebar Start ========== -->

    <div class="left side-menu">
        <div class="sidebar-inner slimscrollleft">
            <!--- Divider -->
            <div id="sidebar-menu">
                <ul>
                    <li>
                        <a href="backend.html" class="waves-effect waves-light ${(active == 'backend')?string('active','')?html}   "><i class="fa fa-dashboard"></i><span> 管理控制台 </span></a>
                    </li>
                    <li>
                        <a href="product.html" class="waves-effect waves-light ${(active == 'product')?string('active','')?html}"><i class="fa fa-database"></i><span> 商品主档数据 </span></a>
                    </li>
                    <li>
                        <a href="order.html" class="waves-effect waves-light ${(active == 'order')?string('active','')?html}"><i class="md md-trending-up"></i><span> 历史销售数据 </span></a>
                    </li>
                    <li>
                        <a href="profit.html" class="waves-effect waves-light ${(active == 'profit')?string('active','')?html}"><i class="fa fa-money"></i><span> 经营业绩计算器 </span></a>
                    </li>
                    <li>
                        <a href="simulator.html" class="waves-effect waves-light ${(active == 'simulator')?string('active','')?html}"><i class="fa fa-thumbs-up"></i><span> 商品推荐模拟器 </span></a>
                    </li>
                </ul>
                <div class="clearfix"></div>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
    <!-- Left Sidebar End -->



    <!-- ============================================================== -->
    <!-- Start right Content here -->
    <!-- ============================================================== -->
    <div class="content-page">
        <!-- Start content -->
        <div class="content">
            <div class="container">