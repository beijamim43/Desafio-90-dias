<%@ taglib prefix="liferay-util" uri="http://liferay.com/tld/util" %>
<%@ include file="/init.jsp" %>

<%-- Esta tag do Liferay cria a navegação por abas --%>
<liferay-ui:tabs
        names="cadastro-quartos,quartos-disponiveis,quartos-reservados"
        refresh="false"
>
    <%-- Seção da primeira aba --%>
    <liferay-ui:section>
        <%-- Inclui o conteúdo de outro arquivo JSP aqui --%>
        <liferay-util:include page="/cadastro_quartos.jsp" servletContext="<%= application %>" />
    </liferay-ui:section>

    <%-- Seção da segunda aba --%>
    <liferay-ui:section>
        <liferay-util:include page="/quartos_disponiveis.jsp" servletContext="<%= application %>" />
    </liferay-ui:section>

    <%-- Seção da terceira aba --%>
    <liferay-ui:section>
        <liferay-util:include page="/quartos_reservados.jsp" servletContext="<%= application %>" />
    </liferay-ui:section>
</liferay-ui:tabs>