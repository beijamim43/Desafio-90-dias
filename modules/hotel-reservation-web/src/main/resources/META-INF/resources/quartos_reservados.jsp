<%@ include file="/init.jsp" %>
<%@ page import="java.util.List" %>
<%@ page import="com.hotel.reservation.model.Reservation" %>
<%@ page import="com.hotel.reservation.model.Room" %>
<%@ page import="com.hotel.reservation.service.RoomLocalServiceUtil" %>

<%-- Mensagens de sucesso --%>
<liferay-ui:success key="reserva-cancelada-com-sucesso" message="reserva-cancelada-com-sucesso" />

<%
    // Pega a lista de reservas que o Portlet nos enviou
    List<Reservation> reservations = (List<Reservation>) request.getAttribute("reservations");
%>

<%-- Search Container é uma tabela poderosa do Liferay com paginação e outras features --%>
<liferay-ui:search-container
        emptyResultsMessage="nenhuma-reserva-encontrada"
        total="<%= reservations.size() %>"
>
    <liferay-ui:search-container-results results="<%= reservations %>" />

    <liferay-ui:search-container-row
            className="com.hotel.reservation.model.Reservation"
            modelVar="reservation"
    >
        <%
            // Para cada reserva, buscamos o nome do quarto correspondente
            Room room = null;
            try {
                room = RoomLocalServiceUtil.getRoom(reservation.getRoomId());
            } catch (Exception e) {}
        %>
        <liferay-ui:search-container-column-text name="Quarto" value="<%= room != null ? room.getName() : "N/A" %>" />
        <liferay-ui:search-container-column-text name="Hóspede" property="guestName" />
        <liferay-ui:search-container-column-text name="Check-in" value='<%= new java.text.SimpleDateFormat("dd/MM/yyyy").format(reservation.getCheckInDate()) %>' />
        <liferay-ui:search-container-column-text name="Check-out" value='<%= new java.text.SimpleDateFormat("dd/MM/yyyy").format(reservation.getCheckOutDate()) %>' />
        <liferay-ui:search-container-column-text name="Valor Total" value='<%= "R$ " + reservation.getTotalAmount() %>' />

        <%-- Coluna de Ações --%>
        <liferay-ui:search-container-column-text>
            <portlet:actionURL name="cancelReservation" var="cancelReservationURL">
                <portlet:param name="reservationId" value="<%= String.valueOf(reservation.getReservationId()) %>" />
            </portlet:actionURL>
            <aui:button onClick="${cancelReservationURL}" value="Cancelar" cssClass="btn-danger btn-sm" />
        </liferay-ui:search-container-column-text>
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>