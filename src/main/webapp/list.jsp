<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-11
  Time: 오후 8:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <%=
   for(WiFI WifI : WiFiList)
   %>



    <a href="detail.jsp?x=<%=Wifi.getX()%>&y=<%=Wifi.getY()%>">
        Wifi.getDistance();
        Wifi.getNumber();
        Wifi.getGu();
        Wifi.getWifi();
        Wifi.getDor_adress();
        Wifi.getAddress();
        Wifi.getLocation();
        Wifi.getType();
        Wifi.getAgency();
        Wifi.getService();
        Wifi.getNet();
        Wifi.getYear();
        Wifi.getIn_out();
        Wifi.getX();
        Wifi.getY();
        Wifi.getDate();

    </a>

</body>
</html>
