<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>EL-demo</title>
</head>
<body>
    ${brands}

    <c:if test="true">
        true
    </c:if>

    <table border="1" cellspacing="0" width="800">
        <tr>
            <th>序号</th>
            <th>品牌名称</th>
            <th>企业名称</th>
            <th>排序</th>
            <th>描述</th>
            <th>状态</th>
        </tr>
        <c:forEach items="${brands}" var="brand" varStatus="status">
            <tr>
                <td>${status.count}</td>
                <td>${brand.name}</td>
                <td>${brand.entName}</td>
                <td>${brand.order}</td>
                <td>${brand.remark}</td>
                <c:if test="${brand.status == 1}">
                    <td>启用</td>
                </c:if>
                <c:if test="${brand.status == 0}">
                    <td>禁用</td>
                </c:if>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
