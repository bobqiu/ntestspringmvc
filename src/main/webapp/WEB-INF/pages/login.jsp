<%@ include file="/common/taglibs.jsp"%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<!DOCTYPE html>
<html>
<head>
  <meta content="text/html;charset=utf-8" http-equiv="Content-Type" />
  <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" name="viewport" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1" />
  <meta name="renderer" content="webkit" />
  <title>登录 - WeCenter 社交化问答社区程序</title>
  <meta name="keywords" content="wecenter,知识社区,企业社区,社交问答,问答社区,企业社交,开源社区程序,社交社区程序,开源问答程序,问答网站,social question,微信,微信公众平台,微信开发,微信开发社区,微信应用" />
  <meta name="description" content="WeCenter 是一款知识型的社交化问答社区程序，专注于社区内容的整理、归类和检索，并通过连接微信公众平台，移动APP进行内容分发。"  />
  <base href="${ctx}/" /><!--[if IE]></base><![endif]-->
  <link href="${ctx}/static/css/default/img/favicon.ico?v=20141226" rel="shortcut icon" type="image/x-icon" />

  <link rel="stylesheet" type="text/css" href="${ctx}/static/css/bootstrap.css" />
  <link rel="stylesheet" type="text/css" href="${ctx}/static/css/icon.css" />

  <link href="${ctx}/static/css/default/common.css?v=20141226" rel="stylesheet" type="text/css" />
  <link href="${ctx}/static/css/default/link.css?v=20141226" rel="stylesheet" type="text/css" />
  <link href="${ctx}/static/js/plug_module/style.css?v=20141226" rel="stylesheet" type="text/css" />
  <link href="${ctx}/static/css/default/login.css?v=20141226" rel="stylesheet" type="text/css" />


  <script type="text/javascript">
    var _D528CF2AD82DFFDA0121FF229D1D29E6="";
    var G_POST_HASH=_D528CF2AD82DFFDA0121FF229D1D29E6;
    var G_INDEX_SCRIPT = "";
    var G_SITE_NAME = "WeCenter 社交化问答社区程序";
    var G_BASE_URL = "${ctx}";
    var G_STATIC_URL = "${ctx}/static";
    var G_UPLOAD_URL = "${ctx}/uploads";
    var G_USER_ID = "";
    var G_USER_NAME = "";
    var G_UPLOAD_ENABLE = "N";
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
  <script src="${ctx}/static/js/md5.js?v=20141226" type="text/javascript"></script>
  <script type="text/javascript" src="${ctx}/static/js/compatibility.js"></script>
  <!--[if lte IE 8]>
  <script type="text/javascript" src="${ctx}/static/js/respond.js"></script>
  <![endif]-->
</head>
<noscript unselectable="on" id="noscript">
  <div class="aw-404 aw-404-wrap container">
    <img src="${ctx}/static/common/no-js.jpg">
    <p>你的浏览器禁用了JavaScript, 请开启后刷新浏览器获得更好的体验!</p>
  </div>
</noscript>
<div id="wrapper">
  <div class="aw-login-box">
    <div class="mod-body clearfix">
      <div class="content pull-left">
        <h1 class="logo"><a href=""></a></h1>
        <h2>WeCenter 社交化问答社区程序</h2>
        <form id="login_form" method="post" onsubmit="saveUsername(this);return validateForm(this)" action="<c:url value='/j_security_check'/>">
          <input type="hidden" name="return_url" value="${ctx}/" />
          <ul>
            <li>
             <%-- <input type="text" id="aw-login-user-name" class="form-control" placeholder="邮箱 / 用户名" name="j_username" />--%>
               <input type="text" id="j_username" class="form-control" placeholder="邮箱 / 用户名" name="j_username" />
            </li>
            <li>
              <%--<input type="password" id="aw-login-user-password" class="form-control" placeholder="密码" name="j_password" />--%>
              <input type="password" id="j_password" class="form-control" placeholder="密码" name="j_password" />
            </li>
            <c:if test="${param.error != null}">
              <li class="alert alert-danger error_message">
                <i class="icon icon-delete"></i> <em><fmt:message key="errors.password.mismatch"/></em>
              </li>
            </c:if>
            <li class="alert alert-danger hide error_message">
              <i class="icon icon-delete"></i> <em></em>
            </li>
            <li class="last">

              <button  id="login_submit" type="submit" class="pull-right btn btn-large btn-primary" name="login" tabindex="4">
                登录
              </button>
             <%-- <a href="javascript:;" onclick="AWS.ajax_post($('#login_form'), AWS.ajax_processer, 'error_message');" id="login_submit" class="pull-right btn btn-large btn-primary">登录</a>--%>
              <label>
                <input type="checkbox" value="1" name="_spring_security_remember_me" />
                记住我							</label>
              <a href="${ctx}/account/find_password/">&nbsp;&nbsp;忘记密码</a>
            </li>
          </ul>
        </form>
      </div>
      <div class="side-bar pull-left">


        <h3>第三方账号登录</h3>
        <a href="${ctx}/account/openid/weibo/bind/return_url-aHR0cDovL3dlbmRhLndlY2VudGVyLmNvbS8=" class="btn btn-block btn-weibo"><i class="icon icon-weibo"></i> 微博登录</a>

        <a href="${ctx}/account/openid/qq/bind/return_url-aHR0cDovL3dlbmRhLndlY2VudGVyLmNvbS8=" class="btn btn-block btn-qq"><i class="icon icon-qq"></i> QQ 登录</a>

        <a href="${ctx}/account/weixin_login/return_url-aHR0cDovL3dlbmRhLndlY2VudGVyLmNvbS8=" class="btn btn-block btn-wechat">
          <i class="icon icon-wechat"></i> 微信扫一扫登录
          <div class="img">
            <img src="${ctx}/weixin/login_qr_code/" />
          </div>
        </a>



      </div>
    </div>
    <div class="mod-footer">
      <span>还没有账号?</span>&nbsp;&nbsp;
      <a href="${ctx}/signup">立即注册</a>&nbsp;&nbsp;•&nbsp;&nbsp;
      <a href="">游客访问</a>&nbsp;&nbsp;•&nbsp;&nbsp;
      <a href="${ctx}/reader/">问答阅读</a>
    </div>
  </div>
</div>

<script type="text/javascript" src="${ctx}/static/js/app/login.js"></script>

<div class="aw-footer-wrap">
  <div class="aw-footer">
    Copyright © 2015<span class="hidden-xs"> - 粤ICP备14054802, All Rights Reserved</span>

    <span class="hidden-xs">Powered By <a href="http://www.wecenter.com/?copyright" target="blank">WeCenter 3.1.0</a></span>

  </div>
</div>

<a class="aw-back-top hidden-xs" href="javascript:;" onclick="$.scrollTo(1, 600, {queue:true});"><i class="icon icon-up"></i></a>

<%--<script type="text/javascript">
  var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
  document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3F6d30c149d6f00fa3f34dc482f264a080' type='text/javascript'%3E%3C/script%3E"));
</script>--%>

<!-- DO NOT REMOVE -->
<div id="aw-ajax-box" class="aw-ajax-box"></div>

<div style="display:none;" id="__crond">
  <script type="text/javascript">
    $(document).ready(function () {
      $('#__crond').html(unescape('%3Cimg%20src%3D%22' + G_BASE_URL + '/crond/run/1423019515%22%20width%3D%221%22%20height%3D%221%22%20/%3E'));
    });
  </script>
</div>

<!-- Escape time: 0.027039051055908 --><!-- / DO NOT REMOVE -->
<c:set var="scripts" scope="request">
  <%@ include file="/scripts/login.js"%>
</c:set>
</body>
</html>

