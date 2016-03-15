<%@ include file="/common/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta content="text/html;charset=utf-8" http-equiv="Content-Type" />
    <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" name="viewport" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1" />
    <meta name="renderer" content="webkit" />
    <title>发现 - WeCenter 社交化问答社区程序</title>
    <meta name="keywords" content="wecenter,知识社区,企业社区,社交问答,问答社区,企业社交,开源社区程序,社交社区程序,开源问答程序,问答网站,social question,微信,微信公众平台,微信开发,微信开发社区,微信应用" />
    <meta name="description" content="WeCenter 是一款知识型的社交化问答社区程序，专注于社区内容的整理、归类和检索，并通过连接微信公众平台，移动APP进行内容分发。"  />
    <base href="${ctx}/" /><!--[if IE]></base><![endif]-->
    <link href="${ctx}/static/css/default/img/favicon.ico?v=20141226" rel="shortcut icon" type="image/x-icon" />

    <link rel="stylesheet" type="text/css" href="${ctx}/static/css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="${ctx}/static/css/icon.css" />

    <link href="${ctx}/static/css/default/common.css?v=20141226" rel="stylesheet" type="text/css" />
    <link href="${ctx}/static/css/default/link.css?v=20141226" rel="stylesheet" type="text/css" />
    <link href="${ctx}/static/js/plug_module/style.css?v=20141226" rel="stylesheet" type="text/css" />


    <script type="text/javascript">
        var _5BA9DBC163EF85D0A31FB113A87BE6A7="0539BEAEB6C47B94";
        var G_POST_HASH=_5BA9DBC163EF85D0A31FB113A87BE6A7;
        var G_INDEX_SCRIPT = "";
        var G_SITE_NAME = "WeCenter 社交化问答社区程序";
        var G_BASE_URL = "${ctx}";
        var G_STATIC_URL = "${ctx}/static";
        var G_UPLOAD_URL = "${ctx}/uploads";
        var G_USER_ID = "15221";
        var G_USER_NAME = "xiaoqiu369";
        var G_UPLOAD_ENABLE = "Y";
        var G_UNREAD_NOTIFICATION = 0;
        var G_NOTIFICATION_INTERVAL = 100000;
        var G_CAN_CREATE_TOPIC = "";
    </script>
    <script src="${ctx}/static/js/jquery.2.js?v=20141226" type="text/javascript"></script>
    <script src="${ctx}/static/js/jquery.form.js?v=20141226" type="text/javascript"></script>
    <script src="${ctx}/static/js/plug_module/plug-in_module.js?v=20141226" type="text/javascript"></script>
    <script src="${ctx}/static/js/aws.js?v=20141226" type="text/javascript"></script>
    <script src="${ctx}/static/js/aw_template.js?v=20141226" type="text/javascript"></script>
    <script src="${ctx}/static/js/app.js?v=20141226" type="text/javascript"></script>
    <script type="text/javascript" src="${ctx}/static/js/compatibility.js"></script>
    <!--[if lte IE 8]>
    <script type="text/javascript" src="${ctx}/static/js/respond.js"></script>
    <![endif]-->
    <style type="text/css">
        .errors {
            background-color:#FFCCCC;
            border:1px solid #CC0000;
            width:400px;
            margin-bottom:8px;
        }
        .errors li{
            list-style: none;
        }
    </style>
</head>
<noscript unselectable="on" id="noscript">
    <div class="aw-404 aw-404-wrap container">
        <img src="${ctx}/static/common/no-js.jpg">
        <p>你的浏览器禁用了JavaScript, 请开启后刷新浏览器获得更好的体验!</p>
    </div>
</noscript>
<body>
<%@ include file="/common/menu.jsp" %>
<%--<s:if test="hasActionErrors()">
<div class="errors">
    <s:actionerror/>
</div>
</s:if>--%>
<%--
<%@ include file="/common/taglibs.jsp"%>
<div class="navbar navbar-default navbar-fixed-top">
            <div class="container">
                &lt;%&ndash; For smartphones and smaller screens &ndash;%&gt;
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                <a class="navbar-brand" href="<c:url value='/'/>"><fmt:message key="webapp.name"/></a>
                </div>
                <%@ include file="/common/menu.jsp" %>
                &lt;%&ndash; <c:if test="${pageContext.request.locale.language ne 'en'}">
                    <div id="switchLocale"><a href="<c:url value='/?locale=en'/>">
                        <fmt:message key="webapp.name"/> in English</a>
                    </div>
                </c:if> &ndash;%&gt;
            </div>
    </div>
&lt;%&ndash; <c:if test="${pageContext.request.locale.language ne 'en'}">
    <div id="switchLocale"><a href="<c:url value='/?locale=en'/>"><fmt:message key="webapp.name"/> in English</a></div>
</c:if>

<div id="branding">
    <h1><a href="<c:url value='/'/>"><fmt:message key="webapp.name"/></a></h1>
    <p><fmt:message key="webapp.tagline"/></p>
</div> &ndash;%&gt;
<!-- <hr /> -->

&lt;%&ndash; Put constants into request scope &ndash;%&gt;
<appfuse:constants scope="request"/>--%>