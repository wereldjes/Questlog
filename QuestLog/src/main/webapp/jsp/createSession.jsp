<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<t:navbar>
	<jsp:attribute name="html">
			<head>
				<title>Create a session</title>
			</head>
			<body>
				<h1 class="text-center">${currentAdventure.adventureName}</h1>
				<div class="container">
					<button id="createSessionButton" type="button" class="btn btn-info float-left" data-toggle="modal" data-target="#sessionModal">
						<i class="fa fa-plus" aria-hidden="true"></i> Create Session</button>
					<table class="table table-hover">
						<thead>
							<tr>
			    				<th>Session name</th>
			    				<th>Created on</th>
			    				<th></th>
			    			</tr>
			    		</thead>
			    		<tbody>
				    		<s:iterator value="allSessions">
				    			<tr>
				    				<td><s:property value="sessionName" /></td>
				    				<td><s:property value="sessionDate.substring(0,11)" /></td>
				    				<td align="right">
				    					<button data-toggle="modal" data-id="${sessionID}" data-name="${sessionName}" data-target="#sessionUpdateModal" class="btn btn-warning editSessionButton"><i class="fa fa-pencil-square-o" aria-hidden="true"></i></button>
				    					<a href="deleteSession?sessionID=${sessionID}" class="btn btn-danger"><i class="fa fa-trash-o" aria-hidden="true"></i></a>
				    				</td>
				    			</tr>
				   			 </s:iterator>
						</tbody>
					</table>
				</div>
			</body>
			
			<div id="sessionModal" class="modal fade" role="dialog">
 				<div class="modal-dialog">
  					<div class="modal-content">
				      <div class="modal-header">
				        <button type="button" class="close" data-dismiss="modal">&times;</button>
				        <h4 class="modal-title text-center ">Maak een Session aan</h4>
				      </div>
				      <div class="modal-body">
						<form action="createSession" method="post" data-parsley-validate>
							<s:bean name="nl.delphinity.questlog.models.PlayerSession" var="PlayerSession">
								<div class="form-group">
									<label>Naam van je session</label>
									<s:textfield id="sessionName" name="PlayerSession.sessionName"
									class="form-control" placeholder="session name"
									data-parsley-required="true" autocomplete="off" />
								</div>
								<div class="modal-footer">
									<button type="submit" class="btn btn-success">Submit</button>
									<button type="button" class="btn btn-default"
									data-dismiss="modal">Close</button>
								</div>
							</s:bean>
						</form>
				      </div>
    				</div>
 				</div>
 			</div>
 				
 				<div id="sessionUpdateModal" class="modal fade" role="dialog">
 					<div class="modal-dialog">
	  					<div class="modal-content">
					      <div class="modal-header">
					        <button type="button" class="close" data-dismiss="modal">&times;</button>
					        <h4 class="modal-title text-center ">Pas je session aan</h4>
					      </div>
					      <div class="modal-body">
							<form action="updateSession" method="post" data-parsley-validate>
								<s:bean name="nl.delphinity.questlog.models.PlayerSession" var="PlayerSession">
									<div class="form-group">
										<label>Naam van je session</label>
										<s:textfield id="sessionName" name="PlayerSession.sessionName"
										class="form-control getSessionName" placeholder="session name"
										data-parsley-required="true"/>
									</div>
									<s:hidden class="getSesID" name="PlayerSession.sessionID" value="" />
									<div class="modal-footer">
										<button type="submit" class="btn btn-success">Submit</button>
										<button type="button" class="btn btn-default"
										data-dismiss="modal">Close</button>
									</div>
								</s:bean>
							</form>
					      </div>
	    				</div>
 					</div>
 				</div>
	</jsp:attribute>
	<jsp:attribute name="javascript">
		<script src="<s:url value="resources/javascript/createSession.js"/>"></script>
	</jsp:attribute>
</t:navbar>