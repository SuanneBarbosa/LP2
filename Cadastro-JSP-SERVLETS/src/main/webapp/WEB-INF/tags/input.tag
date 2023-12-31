<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ attribute name="id" required="true"%>
<%@ attribute name="text" required="false"%>
<%@ attribute name="type" required="false"%>

<label for="${id}">${text}</label>
<c:choose>
    <c:when test="${type != null}">
        <input type="${type}" id="${id}" name="${id}" />
    </c:when>
    <c:otherwise>
        <input type="text" id="${id}" name="${id}" />
    </c:otherwise>
</c:choose>