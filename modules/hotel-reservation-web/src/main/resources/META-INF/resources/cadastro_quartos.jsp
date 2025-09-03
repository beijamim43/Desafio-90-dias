<%@ include file="/init.jsp" %>

<%-- Esta tag cria a URL que vai chamar a nossa ação "addRoom" no Portlet --%>
<portlet:actionURL name="addRoom" var="addRoomURL" />

<%--
A tag <aui:form> é um formulário superpoderoso do Liferay.
- action: Para onde o formulário envia os dados (nossa URL criada acima).
- name="fm": Um nome para o formulário.
- enctype: ESSENCIAL para permitir o upload de arquivos.
--%>
<aui:form action="${addRoomURL}" method="post" name="fm" enctype="multipart/form-data">

    <%-- A tag <aui:input> cria um campo de formulário com label, estilos e validações --%>
    <aui:input name="roomName" label="Nome do Quarto" />
    <aui:input name="roomDescription" type="textarea" label="Descrição" />
    <aui:input name="roomImage" type="file" label="Foto de Exibição" />
    <aui:input name="maxGuests" type="number" label="Capacidade de Hóspedes" />
    <aui:input name="amenities" label="Comodidades (separadas por vírgula)" />
    <aui:input name="dailyRate" label="Valor da Diária" />

    <%-- Botão de envio --%>
    <aui:button-row>
        <aui:button type="submit" value="salvar-quarto" />
    </aui:button-row>

</aui:form>