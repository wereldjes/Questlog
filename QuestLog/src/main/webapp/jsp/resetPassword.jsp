<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<head>
	<title>Reset wachtwoord</title>
	<link rel="icon" href="<s:url value="resources/images/D&D icon.png"/>"/>
	<link rel="stylesheet" href="<s:url value="resources/css/parsley.css"/>"/>
	<link rel="stylesheet" href="<s:url value="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>"/>
	<link rel="stylesheet" href="<s:url value="resources/css/resetpassword.css"/>"/>
	<link rel="stylesheet" href="<s:url value="resources/css/login.css"/>"/>
</head>
<body>
	<div class="background">
		<h1 class="text-center title-margin" style="color: white">Wachtwoord reset</h1>
		<div class="col-md-4 col-md-offset-4">
			<form action="resetPassword?id=${id}&accountToken=${accountToken}" method="post" data-parsley-validate>
				<s:bean name="nl.delphinity.questlog.models.Account" var="account">
					<input class="form-control un-margin-bot-5" id="password-reset" type="password" placeholder="Enter password" name="account.password" required/>
					<input class="form-control" type="password" data-parsley-equalto="#password-reset" placeholder="Enter password again" required/>
					<div class="text-center button-div">
						<button type="submit" class="btn btn-success">Bevestig</button>
						<a class="btn btn-danger" href="loadLogin">Terug</a>
					</div>
				</s:bean>
			</form>
		</div>
	</div>
</body>

<script src="<s:url value="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"/>"></script>
<script src="<s:url value="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"/>"></script>
<script src="<s:url value="resources/plugins/parsley.min.js"/>"></script>