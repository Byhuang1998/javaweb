<%@ page import="com.byhuang.pojo.Brand" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello jsp!</title>
</head>
<body>

    <h1>hello jsp~</h1>


    <table border="1" cellspacing="0" width="800">
        <tr>
            <th>品牌名称</th>
            <th>企业名称</th>
            <th>排序</th>
            <th>描述</th>
            <th>状态</th>
            <th>操作</th>
        </tr>

        <%
            List<Brand> brands = new ArrayList<>();
            out.println("hello jsp~");
            brands.add(new Brand("三只松鼠", "三只松鼠", 100, "三只松鼠，好吃不上火", 1));
            brands.add(new Brand("优衣库", "优衣库", 10, "优衣库，舒服", 0));
            brands.add(new Brand("小米", "小米", 1000, "小米", 1));

            for (int i = 0; i < brands.size(); i++) {
                Brand brand = brands.get(i);
        %>

            <tr align="center">
                <td><%=brand.getName()%></td>
                <td><%=brand.getEntName()%></td>
                <td><%=brand.getOrder()%></td>
                <td><%=brand.getRemark()%></td>

                <%
                    if (brand.getStatus() == 1) {
                %>
                <td><%="启用"%></td>
                <%
                } else {
                %>
                <td><%="禁用"%></td>
                <%
                    }
                %>
                <td><a href="#">修改</a><a href="#">删除</a></td>
            </tr>

        <%
            }
        %>
    </table>

</body>
</html>
