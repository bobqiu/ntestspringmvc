<%@ include file="/common/taglibs.jsp"%>

<menu:useMenuDisplayer name="Velocity" config="navbarMenu.vm" permissions="rolesAdapter">
<div class="navbar-collapse collapse">
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
    <%-- <menu:displayMenu name="MainMenu"/> --%>
    <menu:displayMenu name="AdminMenu"/>
 <%--    <menu:displayMenu name="ArticleMenu"/> --%>
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
</div>
</menu:useMenuDisplayer>
