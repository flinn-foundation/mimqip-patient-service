<%@ page import="flinn.rcopia.model.RcExtResponseType"%>
<%@ page import="flinn.rcopia.service.RcopiaService"%>
<%@ page import="flinn.rcopia.service.RcopiaTransformationService"%>

<%
	RcopiaService service = new RcopiaService();
	RcopiaTransformationService transformation = new RcopiaTransformationService();

	RcExtResponseType rcResponse = service.updateMedications(1);
	String xml = transformation.convertRcopiaResponseToXml(rcResponse);
%>

<html>

<head>
</head>

<body>
	<div style="width: 100%; height: 100%;">
		<textarea rows="100%" cols="100%"><%=xml%></textarea>
	</div>
</body>

</html>
