<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<t:navbar>

	<jsp:attribute name="css">
		<title>Player Character Overview</title>
		<!-- <link rel="stylesheet" type="text/css" href="resources/css/pcOverview.css"> -->
	</jsp:attribute>

	<jsp:attribute name="html">
	<div class="container-fluid">
		<form id="createCharacter" name="createCharacter" action="/QuestLog/createCharacter" method="POST" accept-charset="utf-8">
<%-- 		<s:form action="/QuestLog/createCharacter" method="POST" accept-charset="utf-8" > --%>
		<div class="container-fluid">
			
			<div id="ddicon" class="row">
				<div class="col-md-4">
					<img alt="placeholder" class="center-block img-responsive"
								src="http://via.placeholder.com/350x150" />
				</div>
				
				<div class="col-md-8">
					<div class="well">
						<div class="row">
							<div class="col-md-4">
								<div class="form-group">
									<label for="class">Fill Class</label> <!--<input type="text"
										class="form-control" id="class" placeholder="Class & Level"> -->
										<!-- <s:textfield id="class" class="form-control"
												name="pc.Class" placeholder="Class" /> -->
												<s:textfield id="pc_class" class="form-control"
												name="pc.ClassName" placeholder="Class" />
								</div>
								<div class="form-group">
									<label for="race">Fill in Race</label>
											<!-- input type="text"
												class="form-control" id="race" placeholder="Race"> -->
												<s:textfield id="race" class="form-control"
												name="pc.Race" placeholder="Race" />
								</div>
							</div>
							<div class="col-md-4">
								<div class="form-group">
									<label for="background">Fill in Background</label> <!--  <input
												type="text" class="form-control" id="background"
												placeholder="Background"> -->
												<s:textfield id="background" class="form-control"
												name="pc.Backstory" placeholder="Background" /> <!-- ?? -->
								</div>
								<div class="form-group">
									<label for="alignment">Fill in Alignment</label> <!-- <input
												type="text" class="form-control" id="alignment"
												placeholder="Alignment"> -->
												<s:textfield id="alignment" class="form-control"
												name="pc.Alignment" placeholder="Alignment" />
								</div>
							</div>
							<div class="col-md-4">
								<div class="form-group">
								<div id="TEST"></div>
								 <!-- <s:textfield class="form-control" name="pc.Name" /> -->
								
									<label for="playername">Fill in Player Name</label> <!-- <input
												type="text" class="form-control" id="playername"
												placeholder="Player Name"> -->
										 <s:textfield id="name" class="form-control"
												name="pc.Name" placeholder="Player Name" />
										 
										 
								</div>
								<div class="form-group">
									<label for="xp">Fill in XP</label> <!--  <input type="number" min="0"
												max="999999" class="form-control" id="xp"
												placeholder="Experience Points"> -->
												<s:textfield type="number" max="9999999" min="0" id="xp"
												class="form-control" name="pc.Level" />
										<br>
										<div class="pull-right">
								<!-- <button type="button" class="btn btn-primary">Save</button> -->
								<!-- <s:submit type="button" class="btn btn-primary" value="Save" /> -->
								<button type="submit" id="createCharacter_0" value="Save" class="btn btn-primary">Save</button>
								<button type="button" class="btn btn-danger">Close</button>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			</div>
			</div>
			
	
			<div id="primarymodifiers" class="row">
	
				<div class="col-md-2">
					<div class="well">
						<div class="panel panel-default text-center">
							<div class="panel-heading">Strength</div>
							<div class="panel-body">
								<div class="form-group">
									<!-- <input type="text" class="form-control" id="Strength"
											placeholder="Strength"> -->
											<s:textfield type="number" name="pc.Strength"
											class="form-control" placeholder="Strength" />
								</div>
							</div>
						</div>
						<div class="panel panel-default text-center">
							<div class="panel-heading">Dexterity</div>
							<div class="panel-body">
								<div class="form-group">
									<!-- <input type="text" class="form-control" id="Dexterity"
											placeholder="Dexterity"> -->
											<s:textfield type="number" name="pc.Dexterity"
											class="form-control" placeholder="Dexterity" />
								</div>
							</div>
						</div>
						<div class="panel panel-default text-center">
							<div class="panel-heading">Constitution</div>
							<div class="panel-body">
								<div class="form-group">
									<!--  <input type="text" class="form-control" id="Constitution"
											placeholder="Constitution"> -->
											<s:textfield type="number" name="pc.Constitution"
											class="form-control" placeholder="Constitution" />
								</div>
							</div>
						</div>
						<div class="panel panel-default text-center">
							<div class="panel-heading">Intelligence</div>
							<div class="panel-body">
								<div class="form-group">
									<!-- <input type="text" class="form-control" id="Intelligence"
											placeholder="Intelligence"> -->
											<s:textfield type="number" name="pc.Intelligence"
											class="form-control" placeholder="Intelligence" />
								</div>
							</div>
						</div>
						<div class="panel panel-default text-center">
							<div class="panel-heading">Wisdom</div>
							<div class="panel-body">
								<div class="form-group">
									<!-- <input type="text" class="form-control" id="Wisdom"
											placeholder="Wisdom"> -->
											<s:textfield type="number" name="pc.Wisdom" class="form-control"
											placeholder="Wisdom" />
								</div>
							</div>
						</div>
						<div class="panel panel-default text-center">
							<div class="panel-heading">Charisma</div>
							<div class="panel-body">
								<div class="form-group">
									<!--  <input type="text" class="form-control" id="Charisma"
											placeholder="Charisma"> -->
											<s:textfield type="number" name="pc.Charisma"
											class="form-control" placeholder="Charisma" />
								</div>
							</div>
						</div>
					</div>
				</div>
	
				<div class="col-md-2">
					<div class="well pcoverview-inputform">
						<div class="form-group input-group">
							<span class="input-group-addon" id="Acrobatics-addon"><input
									type="checkbox" value=""></span> <!-- <input type="text"
									class="form-control" id="inspiration" placeholder="Acrobatics"> -->
									<s:textfield type="number" name="pc.Acrobatics"
									class="form-control" placeholder="Acrobatics" id="inspiration" />
						</div>
						<div class="form-group input-group">
						<span class="input-group-addon" id="ArmourClass-addon"><input
									type="checkbox" value=""></span>
<%-- 									<s:textfield type="number" name="pc.ArmorClass" class="form-control" placeholder="Armour Class" />			 --%>
										<s:textfield type="number" name="pc.AnimalHandling" class="form-control" placeholder="Animal Handling" />
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Arcana-addon"><input
									type="checkbox" value=""></span>
									<s:textfield type="number" name="pc.Arcana" class="form-control" placeholder="Arcana" />
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Athletics-addon"><input
									type="checkbox" value=""></span>
									<s:textfield type="number" name="pc.Athletics" class="form-control" placeholder="Athletics" />
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Deception-addon"><input
									type="checkbox" value=""></span>
									<s:textfield type="number" name="pc.Deception" class="form-control" placeholder="Deception" />

						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="History-addon"><input
									type="checkbox" value=""></span>
									<s:textfield type="number" name="pc.History" class="form-control" placeholder="History" />
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Insight-addon"><input
									type="checkbox" value=""></span>
									<s:textfield type="number" name="pc.Insight" class="form-control" placeholder="Insight" />
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Intimidation-addon"><input
									type="checkbox" value=""></span>
									<s:textfield type="number" name="pc.Intimidation" class="form-control" placeholder="Intimidation" />
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Investigation-addon"><input
									type="checkbox" value=""></span>
									<s:textfield type="number" name="pc.Investigation" class="form-control" placeholder="Investigation" />
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Medicine-addon"><input
									type="checkbox" value=""></span>
									<s:textfield type="number" name="pc.Medicine" class="form-control" placeholder="Medicine" />
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Nature-addon"><input
									type="checkbox" value=""></span>
									<s:textfield type="number" name="pc.Nature" class="form-control" placeholder="Nature" />
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Perception-addon"><input
									type="checkbox" value=""></span>
									<s:textfield type="number" name="pc.Perception" class="form-control" placeholder="Perception" />
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Performance-addon"><input
									type="checkbox" value=""></span>
									<s:textfield type="number" name="pc.Performance" class="form-control" placeholder="Performance" />
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Persuasion-addon"><input
									type="checkbox" value=""></span>
									<s:textfield type="number" name="pc.Persuasion" class="form-control" placeholder="Persuasion" />
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Religion-addon"><input
									type="checkbox" value=""></span>
									<s:textfield type="number" name="pc.Religion" class="form-control" placeholder="Religion" />
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="SleightOfHand-addon"><input
									type="checkbox" value=""></span>
									<s:textfield type="number" name="pc.Sleightofhand" class="form-control" placeholder="Sleight of Hand" />
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Stealth-addon"><input
									type="checkbox" value=""></span>
									<s:textfield type="number" name="pc.Stealth" class="form-control" placeholder="Stealth" />
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Survival-addon"><input
									type="checkbox" value=""></span>
									<s:textfield type="number" name="pc.Survival" class="form-control" placeholder="Survival" />
						</div>
					</div>
				</div>
	
				<div class="col-md-4">
					<div class="well">
						<div class="row">
							<div class="col-md-4">
								<div class="form-group">
<!-- 									<input type="text" class="form-control" id="ac" -->
<!-- 											placeholder="AC"> -->
 											<s:textfield type="number" name="pc.ArmorClass"
 											class="form-control" placeholder="Armour Class" />
								</div>
							</div>
							<div class="col-md-4">
								<div class="form-group">
									<!-- <input type="text" class="form-control" id="Initiative"
											placeholder="Initiative"> -->
											<s:textfield name="pc.Initiative"
											class="form-control" placeholder="Initiative" />
								</div>
							</div>
							<div class="col-md-4">
								<div class="form-group">
									 <!-- <input type="text" class="form-control" id="speed"
											placeholder="Speed"> -->
											<s:textfield type="number" name="pc.Speed" class="form-control"
											placeholder="Speed" />
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<div class="well text-center"><span>Current HP</span><s:textfield
											type="number" name="pc.HitPoints" class="form-control"
											placeholder="Current Hit Points" />
									</div>
								
							</div>
							<div class="col-md-12">
								<div class="well text-center">
								<span>Temporary HP</span>
								<s:textfield type="number" name="pc.TemporaryHitPoints"
											class="form-control" placeholder="Temporary Hit Points" />
							</div>
							</div>
							<div class="row">
								<div class="col-md-6  text-center">
									<button type="button" class="btn btn-default">Roll Dice</button>
								</div>
								<div class="col-md-6  text-center">
									<button type="button" class="btn btn-default">Death
										Saves</button>
								</div>
							</div>
						</div>
					</div>
	
					<div class="well">
						<h4>
							Attacks &amp; Spells
							<div class="pull-right">
								<button type="button" class="btn btn-sm btn-primary">Add</button>
							</div>
						</h4>
						<table class="table table-striped">
							<thead>
								<tr>
									<th></th>
									<th>Dmg</th>
									<th>Dmg/Type</th>
									<th>Options</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>Melee</td>
									<td>FI</td>
									<td><span class="label label-default">Physical</span></td>
									<td>
										<button class="btn btn-warning">
										<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
									</button>
										<button class="btn btn-danger">
										<i class="fa fa-trash" aria-hidden="true"></i>
									</button>
									</td>
								</tr>
								<tr>
									<td>Staff Bash</td>
									<td>FI</td>
									<td><span class="label label-default">Physical</span></td>
									<td>
										<button class="btn btn-warning">
										<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
									</button>
										<button class="btn btn-danger">
										<i class="fa fa-trash" aria-hidden="true"></i>
									</button>
									</td>
								</tr>
								<tr>
									<td>Ranged</td>
									<td>FI</td>
									<td><span class="label label-default">Magic</span></td>
									<td>
										<button class="btn btn-warning">
										<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
									</button>
										<button class="btn btn-danger">
										<i class="fa fa-trash" aria-hidden="true"></i>
									</button>
									</td>
								</tr>
								<tr>
									<td>Magic Missile</td>
									<td>FI</td>
									<td><span class="label label-info">Magic</span></td>
									<td>
										<button class="btn btn-warning">
										<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
									</button>
									<button class="btn btn-danger">
										<i class="fa fa-trash" aria-hidden="true"></i>
									</button>
									</td>
								</tr>
								<tr>
									<td>EXPLOSION</td>
									<td>FI</td>
									<td><span class="label label-danger">Fire</span></td>
									<td>
										<button class="btn btn-warning">
										<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
									</button>
										<button class="btn btn-danger">
										<i class="fa fa-trash" aria-hidden="true"></i>
									</button>
									</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
	
				<div class="col-md-4">
					<div class="well">
						<div class="form-group">
							<label for="traits">Personality Traits</label> <!-- <input type="text"
									class="form-control" id="traits"
									placeholder="Personality Traits"> -->
									<s:textfield name="pc.Personality"
									class="form-control" placeholder="Personality Traits" />
									
									
						</div>
						<div class="form-group">
							<label for="ideals">Ideals</label> <!-- <input type="text"
									class="form-control" id="ideals" placeholder="Ideals"> -->
									<s:textfield name="pc.Ideals" class="form-control"
									placeholder="Ideals" />
						</div>
						<div class="form-group">
							<label for="bonds">Bonds</label> <!-- <input type="text"
									class="form-control" id="bonds" placeholder="Bonds"> -->
									<s:textfield name="pc.Bonds" class="form-control"
									placeholder="Bonds" />
						</div>
						<div class="form-group">
							<label for="flaws">Flaws</label> <!--<input type="text"
									class="form-control" id="flaws" placeholder="Flaws"> -->
									<s:textfield name="pc.Flaws" class="form-control"
									placeholder="Flaws" />
						</div>
					</div>
	
					<div class="well">
						<h4>
							Traits
							<div class="pull-right">
								<button type="button" class="btn btn-sm btn-primary">Add</button>
							</div>
						</h4>
						<table class="table table-striped">
							<thead>
								<tr>
									<th></th>
									<th>Options</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>Trait 1</td>
									<td>
										<button class="btn btn-warning">
										<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
									</button>
									<button class="btn btn-danger">
										<i class="fa fa-trash" aria-hidden="true"></i>
									</button>
									</td>
								</tr>
								<tr>
									<td>Trait 2</td>
									<td>
										<button class="btn btn-warning">
										<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
									</button>
										<button class="btn btn-danger">
										<i class="fa fa-trash" aria-hidden="true"></i>
									</button>
									</td>
								</tr>
								<tr>
									<td>Trait 3</td>
									<td>
										<button class="btn btn-warning">
										<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
									</button>
										<button class="btn btn-danger">
										<i class="fa fa-trash" aria-hidden="true"></i>
									</button>
									</td>
								</tr>
								<tr>
									<td>Trait 4</td>
									<td>
										<button class="btn btn-warning">
										<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
									</button>
										<button class="btn btn-danger">
										<i class="fa fa-trash" aria-hidden="true"></i>
									</button>
									</td>
								</tr>
							</tbody>
						</table>
	
					</div>
	
				</div>
			</div>
			
		
		
		
		</form>
<%-- 		</s:form> --%>
		</div>

			
	         	</jsp:attribute>
	<jsp:attribute name="javascript">
			</jsp:attribute>


</t:navbar>
