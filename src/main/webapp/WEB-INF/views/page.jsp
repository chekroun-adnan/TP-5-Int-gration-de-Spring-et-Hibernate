<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Products List</title></head>
<body>
<h2>Product List</h2>
<table border="1">
    <tr>
        <th>ID</th><th>Name</th><th>Price</th><th>Category</th>
    </tr>
    <c:forEach var="p" items="${products}">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${p.price}</td>
            <td>${p.category.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
