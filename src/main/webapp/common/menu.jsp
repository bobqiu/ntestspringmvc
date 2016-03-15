<%@ include file="/common/taglibs.jsp"%>
<menu:useMenuDisplayer name="Velocity" config="navbarMenu.vm" permissions="rolesAdapter">
    <div class="aw-top-menu-wrap">
        <div class="container">
            <!-- logo -->
            <div class="aw-logo hidden-xs">
                <a href="${ctx}"></a>
            </div>
            <!-- end logo -->
            <!-- 搜索框 -->
            <div class="aw-search-box  hidden-xs hidden-sm">
                <form class="navbar-search" action="${ctx}/search/" id="global_search_form" method="post">
                    <input class="form-control search-query" type="text" placeholder="搜索问题、话题或人" autocomplete="off" name="q" id="aw-search-query" />
                    <span title="搜索" id="global_search_btns" onClick="$('#global_search_form').submit();"><i class="icon icon-search"></i></span>
                    <div class="aw-dropdown">
                        <div class="mod-body">
                            <p class="title">输入关键字进行搜索</p>
                            <ul class="aw-dropdown-list hide"></ul>
                            <p class="search"><span>搜索:</span><a onClick="$('#global_search_form').submit();"></a></p>
                        </div>
                        <div class="mod-footer">
                            <a href="javascript:;" onClick="$('#header_publish').click();" class="pull-right btn btn-mini btn-success publish">发起问题</a>
                        </div>
                    </div>
                </form>
            </div>
            <!-- end 搜索框 -->
            <!-- 导航 -->
            <div class="aw-top-nav navbar">
                <div class="navbar-header">
                    <button  class="navbar-toggle pull-left">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div>
                <nav role="navigation" class="collapse navbar-collapse bs-navbar-collapse">
                    <ul class="nav navbar-nav">


                        <li><a href="${ctx}/home/"><i class="icon icon-home"></i> 动态</a></li>
                        <li><a href=""
                                <% if(request.getServletPath().indexOf("topic")!=-1||request.getServletPath().indexOf("home")!=-1||request.getServletPath().indexOf("project")!=-1||request.getServletPath().indexOf("notifications")!=-1){%>
                                class=""
                               <% }else %>
                                class="active"
                                ><i class="icon icon-list"></i> 发现</a></li>

                        <!-- <li><a href="${ctx}/question/" class="">问题</a></li>

                        <li><a href="${ctx}/article/" class="">文章</a></li> -->

                        <li><a href="${ctx}/topic/"
                                <% if(request.getServletPath().indexOf("topic")!=-1)%>  class="active"
                                ><i class="icon icon-topic"></i> 话题</a></li>
                        <li>
                            <a href="${ctx}/notifications/"
                                    <% if(request.getServletPath().indexOf("notifications")!=-1)%>  class="active"
                                    ><i class="icon icon-bell"></i> 通知</a>
                            <span class="badge badge-important" style="display:none" id="notifications_unread">0</span>
                            <div class="aw-dropdown pull-right hidden-xs">
                                <div class="mod-body">
                                    <ul id="header_notification_list"></ul>
                                </div>
                                <div class="mod-footer">
                                    <a href="${ctx}/notifications/">查看全部</a>
                                </div>
                            </div>
                        </li>
                      <%--  <li><a href="${ctx}/help/"><i class="icon icon-bulb"></i> 帮助</a></li>	--%>
                        <li><a href="${ctx}/project/"
                                <% if(request.getServletPath().indexOf("project")!=-1)%>  class="active"
                                ><i class="icon icon-order"></i> 活动</a></li>
                    </ul>
                </nav>
            </div>
            <!-- end 导航 -->
            <!-- 用户栏 -->
            <div class="aw-user-nav">
                <!-- 登陆&注册栏 -->
                <c:if test="${empty pageContext.request.remoteUser}">
                  <%--  <li class="active">
                        <a href="<c:url value="/login"/>"><fmt:message key="login.title"/></a>
                    </li>--%>
                    <a class="login btn btn-normal btn-primary" href="${ctx}/login">登录</a>
                    <a class="register btn btn-normal btn-success" href="${ctx}/signup">注册</a>
                </c:if>



                    <c:if test="${pageContext.request.remoteUser != null}">
                        <a href="${ctx}/people/xiaoqiu369" class="aw-user-nav-dropdown">
                            <img alt="xiaoqiu369" src="${ctx}/static/common/avatar-mid-img.png" />

                        </a>
                        <div class="aw-dropdown dropdown-list pull-right">
                            <ul class="aw-dropdown-list">

                                <li><a href="${ctx}/inbox/"><i class="icon icon-inbox"></i> 私信<span class="badge badge-important hide" id="inbox_unread">0</span></a></li>
                                <li class="hidden-xs"><a href="${ctx}/account/setting/profile/"><i class="icon icon-setting"></i> 设置</a></li>
                                <li><a href="${ctx}/logout"><i class="icon icon-logout"></i>退出</a></li>
                            </ul>
                        </div>
                    </c:if>
               
                <!-- end 登陆&注册栏 -->
            </div>
            <!-- end 用户栏 -->
            <!-- 发起 -->
            <c:if test="${pageContext.request.remoteUser != null}">
            <div class="aw-publish-btn">
                <a id="header_publish" href="${ctx}/publish/" class="btn-primary" onclick="AWS.dialog('publish', {'category_enable':'0', 'category_id':'0', 'topic_title':''}); return false;"><i class="icon icon-ask"></i>发起</a>
                <div class="dropdown-list pull-right">
                    <ul>
                        <li>
                            <form method="post" action="${ctx}/question">
                                <a onclick="$(this).parents('form').submit();">问题</a>
                            </form>

                        </li>
                        <li>
                            <form method="post" action="${ctx}/publish/article">
                                <a onclick="$(this).parents('form').submit();">文章</a>
                            </form>
                        </li>
                    </ul>
                </div>
            </div>
            </c:if>
            <!-- end 发起 -->
        </div>
    </div>
<%--<div class="navbar-collapse collapse">
<ul class="nav navbar-nav navbar-left">
    <menu:displayMenu name="NYMODEN"/>
    <menu:displayMenu name="NYTECH"/>
    <menu:displayMenu name="NYPEOPLE"/>
    <menu:displayMenu name="GONGQIU"/>
    <menu:displayMenu name="WENDA"/>
</ul>
<ul class="nav navbar-nav navbar-right">
    <c:if test="${empty pageContext.request.remoteUser}">
        <li class="active">
            <a href="<c:url value="/login"/>"><fmt:message key="login.title"/></a>
        </li>
    </c:if>
    &lt;%&ndash; <menu:displayMenu name="MainMenu"/> &ndash;%&gt;
    <menu:displayMenu name="AdminMenu"/>
 &lt;%&ndash;    <menu:displayMenu name="ArticleMenu"/> &ndash;%&gt;
    <li class="dropdown">
        <c:if test="${pageContext.request.remoteUser != null}">
            <a href="#" title="个人设置" class="dropdown-toggle" data-toggle="dropdown">${pageContext.request.remoteUser}</a>
        </c:if>
        <ul class="dropdown-menu">
            <menu:displayMenu name="UserMenu"/>
        </ul>
     </li>
    <menu:displayMenu name="Logout"/>
</ul>
</div>--%>
</menu:useMenuDisplayer>
