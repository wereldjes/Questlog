<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="s" uri="/struts-tags"%>


<t:navbar>
	<jsp:attribute name="css">
		<link rel="stylesheet" href="<s:url value="resources/css/adventure.css"/>"/>
	</jsp:attribute>
	<jsp:attribute name="html">
		<head>
			<title>Create an adventure</title>
		</head>
	<body>
		<div class="container">
				<button id="createAventureButton" type="button" class="btn btn-info float-left" data-toggle="modal" data-target="#adventureModal">
					<i class="fa fa-plus" aria-hidden="true"></i> Create Adventure</button>
			<table class="table tableFixed table-hover">
				<thead>
					<tr>
			    		<th class="col-md-6" scope="col">Adventure name</th>
			    		<th class="col-md-2" scope="col">Min level</th>
			    		<th class="col-md-2" scope="col">Max level</th>
			    		<th></th>
		    		</tr>
	    		</thead> 
	    		<tbody>
		    		<s:iterator value="allAdventures">
			    		<tr>
			    			<td class="wordBreak"><a href="loadSession?adventureID=${adventureID} "><s:property value="adventureName" /></a></td>
			    			<td><s:property value="minLevel" /></td>
			    			<td><s:property value="maxLevel" /></td>
			    			<td align="right"><button 	data-toggle="modal" 
			    										data-id="${adventureID}" 
			    										data-name="${adventureName}"
			    										data-minLevel="${minLevel}"
			    										data-maxLevel="${maxLevel}"
			    										data-target="#adventureUpdateModal" class="btn btn-warning editButton"><i class="fa fa-pencil-square-o" aria-hidden="true"></i></button>
			    			<a href="deleteAdventure?adventureID=${adventureID}" class="btn btn-danger"><i class="fa fa-trash-o" aria-hidden="true"></i></a>
			    			</td>
			    		</tr>
		   			 </s:iterator>
				</tbody>
			</table>
		</div>
	</body>		
		<div id="adventureModal" class="modal fade" role="dialog">
			<div class="modal-dialog">
 				<div class="modal-content">
			      <div class="modal-header">
			        <button type="button" class="close" data-dismiss="modal">&times;</button>
			        <h4 class="modal-title text-center ">Maak een adventure aan</h4>
			      </div>
			      <div class="modal-body">
					<form action="createAdventure" method="post" data-parsley-validate>
						<s:bean name="nl.delphinity.questlog.models.Adventure" var="adventure">
							<div class="form-group">
								<label>Naam van je adventure</label>
								<s:textfield id="adventureName" name="adventure.adventureName"
								class="form-control" placeholder="adventure name"
								data-parsley-required="true" autocomplete="off"/>
							</div>
							<div class="form-group">
								<label>Minimum level van je adventure</label>
								<s:textfield id="adventureMinLevel" name="adventure.minLevel"
								class="form-control" placeholder="minimum level"
								data-parsley-type="number" value=""  maxlength="5" autocomplete="off"/>
							</div>
							<div class="form-group">
								<label>Maximum level van je adventure</label>
								<s:textfield id="adventureMaxLevel" name="adventure.maxLevel"
								class="form-control" placeholder="maximum level"
								data-parsley-type="number" value=""  maxlength="5" autocomplete="off"/>
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
		
		<div id="adventureUpdateModal" class="modal fade" role="dialog">
			<div class="modal-dialog">
 				<div class="modal-content">
			      <div class="modal-header">
			        <button type="button" class="close" data-dismiss="modal">&times;</button>
			        <h4 class="modal-title text-center ">Update je adventure</h4>
			      </div>
			      <div class="modal-body">
					<form action="updateAdventure" method="post" data-parsley-validate>
						<s:bean name="nl.delphinity.questlog.models.Adventure" var="adventure">
							<div class="form-group">
								<label>Naam van je adventure</label>
								<s:textfield id="adventureName" name="adventure.adventureName"
								class="form-control getAdvName" placeholder="adventure name"
								data-parsley-required="true" value=""/>
							</div>
							<div class="form-group">
								<label>Minimum level van je adventure</label>
								<s:textfield id="adventureMinLevel" name="adventure.minLevel"
								class="form-control getMinLevel" placeholder="minimum level"
								data-parsley-type="number" value=""  maxlength="5"/>
							</div>
							<div class="form-group">
								<label>Maximum level van je adventure</label>
								<s:textfield id="adventureMaxLevel" name="adventure.maxLevel"
								value="" class="form-control getMaxLevel" placeholder="maximum level"
								data-parsley-type="number"  maxlength="5"/>
							</div>
							<s:hidden class="getAdvID" name="adventure.adventureID" value=""/>	
							<div class="modal-footer">
								<button type="submit" class="btn btn-success">Submit</button>
								<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
							</div>
						</s:bean>
					</form>
			      </div>
   				</div>
			</div>
		</div>
	</jsp:attribute>
	<jsp:attribute name="javascript">
		<script src="<s:url value="resources/javascript/createAdventure.js"/>"></script>
	</jsp:attribute>
</t:navbar>