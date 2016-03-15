<%@ include file="/common/taglibs.jsp"%>
<div class="navbar navbar-default navbar-fixed-top">
            <div class="container">
                <%-- For smartphones and smaller screens --%>
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                <a class="navbar-brand" href="<c:url value='/'/>"><fmt:message key="webapp.name"/></a>
                </div>
                <%@ include file="/common/menu.jsp" %>
                <%-- <c:if test="${pageContext.request.locale.language ne 'en'}">
                    <div id="switchLocale"><a href="<c:url value='/?locale=en'/>">
                        <fmt:message key="webapp.name"/> in English</a>
                    </div>
                </c:if> --%>
            </div>
    </div>
<%-- <c:if test="${pageContext.request.locale.language ne 'en'}">
    <div id="switchLocale"><a href="<c:url value='/?locale=en'/>"><fmt:message key="webapp.name"/> in English</a></div>
</c:if>

<div id="branding">
    <h1><a href="<c:url value='/'/>"><fmt:message key="webapp.name"/></a></h1>
    <p><fmt:message key="webapp.tagline"/></p>
</div> --%>
<!-- <hr /> -->

<%-- Put constants into request scope --%>
<appfuse:constants scope="request"/>