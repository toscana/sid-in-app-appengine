<%@page import="be.ehb.iwt.sidin.appengine.core.SubscriptionList"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="com.google.appengine.api.users.User" %>
<%@ page import="com.google.appengine.api.users.UserService" %>
<%@ page import="com.google.appengine.api.users.UserServiceFactory" %>
<%@ page import="be.ehb.iwt.sidin.appengine.SubscriptionsServerResource" %>
<%@ page import="be.ehb.iwt.sidin.appengine.core.Subscription" %>
<%@ page import="be.ehb.iwt.sidin.appengine.core.SubscriptionList" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>

  <body>
  
  
  <table border="1">
  <tr>
  <td>Voornaam</td>
  <td>Familienaam</td>
  <td>Straat</td>
  <td>Nummer</td>
  <td>Postcode</td>
  <td>Gemeente</td>
  <td>E-mail</td>
  <td>Dig-X</td>
  <td>Multec</td>
  <td>Werkstudent</td>
  <td>Tijdstip contact</td>
  <td>Event</td>
  <td>Docent</td>  
  </tr>

<%
SubscriptionsServerResource r = new SubscriptionsServerResource();
SubscriptionList list = r.retrieve();
List<Subscription> subs = list.getSubscriptions();
for(Subscription s: subs){
	
%>

<tr>

<td><%=s.getFirstName()%></td>
<td><%=s.getLastName()%></td>
<td><%=s.getStreet()%></td>
<td><%=s.getStreetNumber()%></td>
<td><%=s.getZip()%></td>
<td><%=s.getCity()%></td>
<td><%=s.getEmail()%></td>
<%
String digx = s.getInterests().get("digx");
String multec = s.getInterests().get("multec");
String werkstud = s.getInterests().get("werkstudent");

if(digx.equalsIgnoreCase("false"))
	digx = "nee";
else
	digx = "ja";


if(multec.equalsIgnoreCase("false"))
	multec = "nee";
else
	multec = "ja";


if(werkstud.equalsIgnoreCase("false"))
	werkstud = "nee";
else
	werkstud = "ja";

%>


<td><%=digx%></td>
<td><%=multec%></td>
<td><%=werkstud%></td>

<%
Date d = s.getTimestamp();
SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
String dateString = sd.format(d);
%>
<td><%=dateString%></td>
<td><%=s.getEvent().getName()%></td>
<td><%=s.getTeacher().getName()%></td>


</tr>
<%
}
%>

</table>

  </body>
</html>