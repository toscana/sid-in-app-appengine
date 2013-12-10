<%@page import="be.ehb.iwt.sidin.appengine.core.SubscriptionList"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.google.appengine.api.users.User" %>
<%@ page import="com.google.appengine.api.users.UserService" %>
<%@ page import="com.google.appengine.api.users.UserServiceFactory" %>
<%@ page import="be.ehb.iwt.sidin.appengine.TeachersServerResource" %>
<%@ page import="be.ehb.iwt.sidin.appengine.core.Teacher" %>
<%@ page import="be.ehb.iwt.sidin.appengine.core.TeacherList" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


  
  
  <table border="1">
  <tr>
  <td>Naam</td>
  <td>Academiejaar</td>
  </tr>

<%
TeachersServerResource r = new TeachersServerResource();
TeacherList list = r.retrieve();
List<Teacher> subs = list.getTeachers();
for(Teacher s: subs){
	
%>

<tr>

<td><%=s.getName()%></td>
<td><%=s.getAcadyear()%></td>



</tr>
<%
}
%>

</table>
