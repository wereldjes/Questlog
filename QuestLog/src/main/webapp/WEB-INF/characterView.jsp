<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>


<t:navbar>

	<jsp:attribute name="css">
		<title>Player Character Overview</title>
		<link rel="stylesheet" type="text/css" href="/css/pcOverviewCss">
	</jsp:attribute>

	<jsp:attribute name="html">
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
									<label for="class">Fill Class</label> <input type="text"
										class="form-control" id="class" placeholder="Class & Level">
								</div>
								<div class="form-group">
									<label for="race">Fill in Race</label> <input type="text"
										class="form-control" id="race" placeholder="Race">
								</div>
							</div>
							<div class="col-md-4">
								<div class="form-group">
									<label for="background">Fill in Background</label> <input
										type="text" class="form-control" id="background"
										placeholder="Background">
								</div>
								<div class="form-group">
									<label for="alignment">Fill in Alignment</label> <input
										type="text" class="form-control" id="alignment"
										placeholder="Alignment">
								</div>
							</div>
							<div class="col-md-4">
								<div class="form-group">
									<label for="playername">Fill in Player Name</label> <input
										type="text" class="form-control" id="playername"
										placeholder="Player Name">
								</div>
								<div class="form-group">
									<label for="xp">Fill in XP</label> <input type="number" min="0"
										max="999999" class="form-control" id="xp"
										placeholder="Experience Points">
										<br>
										<div class="pull-right">
								<button type="button" class="btn btn-primary">Save</button>
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
									<input type="text" class="form-control" id="Strength"
									placeholder="Strength">
								</div>
							</div>
						</div>
						<div class="panel panel-default text-center">
							<div class="panel-heading">Dexterity</div>
							<div class="panel-body">
								<div class="form-group">
									<input type="text" class="form-control" id="Dexterity"
									placeholder="Dexterity">
								</div>
							</div>
						</div>
						<div class="panel panel-default text-center">
							<div class="panel-heading">Constitution</div>
							<div class="panel-body">
								<div class="form-group">
									<input type="text" class="form-control" id="Constitution"
									placeholder="Constitution">
								</div>
							</div>
						</div>
						<div class="panel panel-default text-center">
							<div class="panel-heading">Intelligence</div>
							<div class="panel-body">
								<div class="form-group">
									<input type="text" class="form-control" id="Intelligence"
									placeholder="Intelligence">
								</div>
							</div>
						</div>
						<div class="panel panel-default text-center">
							<div class="panel-heading">Wisdom</div>
							<div class="panel-body">
								<div class="form-group">
									<input type="text" class="form-control" id="Wisdom"
									placeholder="Wisdom">
								</div>
							</div>
						</div>
						<div class="panel panel-default text-center">
							<div class="panel-heading">Charisma</div>
							<div class="panel-body">
								<div class="form-group">
									<input type="text" class="form-control" id="Charisma"
									placeholder="Charisma">
								</div>
							</div>
						</div>
					</div>
				</div>
	
				<div class="col-md-2">
					<div class="well">
						<div class="form-group input-group">
							<span class="input-group-addon" id="Acrobatics-addon"><input
							type="checkbox" value=""></span> <input type="text"
							class="form-control" id="inspiration" placeholder="Acrobatics">
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="AnimalHandling-addon"><input
							type="checkbox" value=""></span> <input type="text"
							class="form-control" id="proficiency"
							placeholder="Animal handling">
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Arcana-addon"><input
							type="checkbox" value=""></span> <input type="text"
							class="form-control" id="strength" placeholder="Arcana">
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Athletics-addon"><input
							type="checkbox" value=""></span> <input type="text"
							class="form-control" id="strength" placeholder="Athletics">
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Deception-addon"><input
							type="checkbox" value=""></span> <input type="text"
							class="form-control" id="strength" placeholder="Deception">
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="History-addon"><input
							type="checkbox" value=""></span> <input type="text"
							class="form-control" id="strength" placeholder="History">
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Insight-addon"><input
							type="checkbox" value=""></span> <input type="text"
							class="form-control" id="strength" placeholder="Insight">
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Intimidation-addon"><input
							type="checkbox" value=""></span> <input type="text"
							class="form-control" id="strength" placeholder="Intimidation">
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Investigation-addon"><input
							type="checkbox" value=""></span> <input type="text"
							class="form-control" id="strength" placeholder="Investigation">
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Medicine-addon"><input
							type="checkbox" value=""></span> <input type="text"
							class="form-control" id="strength" placeholder="Medicine">
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Nature-addon"><input
							type="checkbox" value=""></span> <input type="text"
							class="form-control" id="strength" placeholder="Nature">
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Perception-addon"><input
							type="checkbox" value=""></span> <input type="text"
							class="form-control" id="strength" placeholder="Perception">
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Performance-addon"><input
							type="checkbox" value=""></span> <input type="text"
							class="form-control" id="strength" placeholder="Performance">
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Persuasion-addon"><input
							type="checkbox" value=""></span> <input type="text"
							class="form-control" id="strength" placeholder="Persuasion">
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Religion-addon"><input
							type="checkbox" value=""></span> <input type="text"
							class="form-control" id="strength" placeholder="Religion">
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="SleightOfHand-addon"><input
							type="checkbox" value=""></span> <input type="text"
							class="form-control" id="strength" placeholder="Sleight of hand">
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Stealth-addon"><input
							type="checkbox" value=""></span> <input type="text"
							class="form-control" id="strength" placeholder="Stealth">
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" id="Survival-addon"><input
							type="checkbox" value=""></span> <input type="text"
							class="form-control" id="strength" placeholder="Survival">
						</div>
					</div>
				</div>
	
				<div class="col-md-4">
					<div class="well">
						<div class="row">
							<div class="col-md-4">
								<div class="form-group">
									<input type="text" class="form-control" id="ac"
									placeholder="AC">
								</div>
							</div>
							<div class="col-md-4">
								<div class="form-group">
									<input type="text" class="form-control" id="Initiative"
									placeholder="Initiative">
								</div>
							</div>
							<div class="col-md-4">
								<div class="form-group">
									<input type="text" class="form-control" id="speed"
									placeholder="Speed">
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<div class="well text-center">Current HP</div>
							</div>
							<div class="col-md-12">
								<div class="well text-center">Temp HP</div>
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
							<label for="traits">Personality Traits</label> <input type="text"
							class="form-control" id="traits" placeholder="Personality Traits">
						</div>
						<div class="form-group">
							<label for="ideals">Ideals</label> <input type="text"
							class="form-control" id="ideals" placeholder="Ideals">
						</div>
						<div class="form-group">
							<label for="bonds">Bonds</label> <input type="text"
							class="form-control" id="bonds" placeholder="Bonds">
						</div>
						<div class="form-group">
							<label for="flaws">Flaws</label> <input type="text"
							class="form-control" id="flaws" placeholder="Flaws">
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
	         	</jsp:attribute>
	<jsp:attribute name="javascript">
			</jsp:attribute>


</t:navbar>