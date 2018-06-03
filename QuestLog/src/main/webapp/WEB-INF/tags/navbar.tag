<%@ tag description="Navbar" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%@ attribute name="css" fragment="true" %>
<%@ attribute name="html" fragment="true" %>
<%@ attribute name="javascript" fragment="true" %>

<html>
	<link rel="icon" href="<s:url value="resources/images/D&D icon.png"/>"/>
	<link rel="stylesheet" href="<s:url value="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>"/>
	<link rel="stylesheet" href="<s:url value="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>"/>
	<link rel="stylesheet" href="<s:url value="resources/css/navbar.css"/>"/>
	<link rel="stylesheet" href="<s:url value="resources/css/parsley.css"/>"/>

	<!-- Hier komt alle CSS -->
	<jsp:invoke fragment="css"/>
	<body style="background-color:#E8E8E8">
		<nav class="navbar navbar-inverse navbar-static-top yes">
			<div class="navbar-header">
				<span><img src="/QuestLog/resources/images/D&D icon.png" width="48px"></span>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="loadAdventure">Adventures</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown">
					<s:if test="#session.loggedOnUser != null">
						<a class="dropdown-toggle" data-toggle="dropdown" href="#"><s:property value="#session.loggedOnUser.userName"/> <span class="caret"></span></a>
					</s:if>
						<ul class="dropdown-menu">
							<li><a href="logOut"><i class="fa fa-sign-out" aria-hidden="true"></i> Log out</a></li>
						</ul>
				</li>
			</ul>
		</nav>
	</body>
	<!-- Hier komt alle html -->
	<jsp:invoke fragment="html"/>
		<script src="<s:url value="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"/>"></script>
  		<script src="<s:url value="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"/>"></script>
  		<script src="<s:url value="resources/plugins/parsley.min.js"/>"></script>
	<!-- Hier komt alle javascript -->
	<jsp:invoke fragment="javascript"/>

</html>
