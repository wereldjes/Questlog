<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="s" uri="/struts-tags"%>
	
	<head>
		<title>Login Questlog</title>
		<link rel="icon" href="<s:url value="resources/images/D&D icon.png"/>"/>
		<link rel="stylesheet" href="<s:url value="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>"/>
		<link rel="stylesheet" href="<s:url value="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>"/>
		<link rel="stylesheet" href="<s:url value="resources/css/login.css"/>"/>
		<link rel="stylesheet" href="<s:url value="resources/css/parsley.css"/>"/>
	</head>
		<body>
			<div class="background">
				<div>
					<s:if test="hasActionErrors()">
						<div class="alert alert-danger">
	      			 		<s:actionerror class="error-message"/>
 						</div>
					</s:if>
					<s:if test="hasActionMessages()">
						<div class="alert alert-success">
							<s:actionmessage class="error-message"/>
						</div>
					</s:if>
					<div class="container login-form">
						<form action="userLogin" class="form-group" method="POST">
							<s:bean name="nl.delphinity.questlog.models.Account" var="account">
								<s:textfield class="form-control un-margin-bot-5" type="text" placeholder="Username" name="account.userName" required=""/>
								<s:textfield class="form-control un-margin-bot-5" type="password" placeholder="Password" name="account.password" required=""/>
								<button type="submit" class="btn btn-block btn-success ">Login</button>
							</s:bean>
						</form>
						<p><a data-toggle="modal" href="#createAccountModal">Creëer een account</a></p>
						<p><a data-toggle="modal" href="#resetPasswordSetup">Wachtwoord vergeten</a></p>
						<p style="color: white;"><a class="btn" href="quickUser.action">Maak User</a>username: student password: test</p>
					</div>
				</div>
			</div>
		</body>
		
		<!-- Modals -->
		<div id="createAccountModal" class="modal fade" role="dialog">
			<div class="modal-dialog">
 				<div class="modal-content">
			      	<div class="modal-header">
			        	<button type="button" class="close" data-dismiss="modal">&times;</button>
			        	<h4 class="modal-title text-center ">Maak een account aan</h4>
			        	
			      	</div>
			      	<form action="createAccount" method="post" data-parsley-validate>
				      	<s:bean name="nl.delphinity.questlog.models.Account" var="account">
					      	<div class="modal-body">
								<div class="form-group">
									<label> Username </label>
									<s:textfield id="createAccountUsername" class="form-control" type="text" placeholder="Enter Username" name="account.userName" data-parsley-minlength="5" required=""/>
								</div>
								<div class="form-group">
									<label> Password </label>
									<s:textfield id="password-field-one" class="form-control" type="password" placeholder="Enter Password" name="account.password" required=""/>
								</div>
								<div class="form-group">
									<label> Confirm Password</label>
									<input class="form-control" type="password" placeholder="Enter Password" data-parsley-equalto="#password-field-one" required>
								</div>
								<div class="form-group">
									<label> Email </label>
									<s:textfield class="form-control" type="email" placeholder="Enter Email" name="account.email" required=""/>
								</div>
					      	</div>
					      	<div class="modal-footer">
					      		<button type="submit" class="btn btn-success">Submit</button>
					      		<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
					      	</div>
					    </s:bean>
			      	</form>
   				</div>
			</div>
		</div>
		
		<div id="resetPasswordSetup" class="modal fade" role="dialog">
			<div class="modal-dialog">
 				<div class="modal-content">
			      	<div class="modal-header">
			        	<button type="button" class="close" data-dismiss="modal">&times;</button>
			        	<h4 class="modal-title text-center ">Reset wachtwoord</h4>
			      	</div>
			      	<form action="resetPasswordSetup" method="post" data-parsley-validate>
				      	<s:bean name="nl.delphinity.questlog.models.Account" var="account">
					      	<div class="modal-body">
								<div class="form-group">
									<label> Email </label>
									<s:textfield id="deerzet" class="form-control" type="email" placeholder="Enter Email" name="account.email" required=""/>
								</div>
					      	</div>
					      	<div class="modal-footer">
					      		<button type="submit" class="btn btn-success">Submit</button>
					      		<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
					      	</div>
					    </s:bean>
			      	</form>
   				</div>
			</div>
		</div>
		
		<script src="<s:url value="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"/>"></script>
  		<script src="<s:url value="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"/>"></script>
  		<script src="<s:url value="resources/plugins/parsley.min.js"/>"></script>
  		<script src="<s:url value="resources/javascript/login.js"/>"></script>
		