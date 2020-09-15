<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>便宜汇 城市选择</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;"/>
    <meta content="yes" name="apple-mobile-web-app-capable"/>
    <meta content="black" name="apple-mobile-web-app-status-bar-style"/>
    <meta content="telephone=no" name="format-detection"/>
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/zepto.js"></script>


    <script type="text/javascript" src="static/jquery-1.7.2.js"></script>
    <script src="https://unpkg.com/axios/dist/axios.min.js"></script>
</head>

<body>
<script type="text/javascript">
    $(function () {
        axios.post('showCity').then(function (response) {
            /*这里的data 就相当于后端控制器的return返回值*/
            var data = response.data;
            for (var i = 0; i < data.length; i++) {
               // if (data[i].cityName == '恩施') {
                    $("#hotcity").append("<a data-id='420100' href='turnIndexLogin0?cityId=" + data[i].cityId + "'>" + data[i].cityName + "</a>");
                // }
            }
        })
    });
</script>

<div id="header" class="header_main">城市选择<a href="javascript:history.back();" class="back"></a><a
        class="cd-popup-trigger button2"></a></div>
<div class="h60"></div>


<div class="container">
    <div class="hotcity" id="hotcity">
        <span>热门城市</span>
        <%--  <c:forEach items="${list}" var="list1" varStatus="status">
      <a data-id="420100" href="turnIndexLogin0.action?cityId=${list1.cityId}">${list1.cityName}</a>

  </c:forEach> --%>
    </div>

    <div class="letter">
        <ul id="ul0">

        </ul>
    </div>
</div>
</body>
</html>
