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
									<label for="class">Fill Challenge</label> <input type="text" 
										class="form-control" id="class" placeholder="Challenge">
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
									<label for="playername">Fill in NPC name</label> <input
										type="text" class="form-control" id="playername"
										placeholder="NPC Name">
								</div>
								<div class="form-group">
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
	
				<div class="col-md-4">
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
								<button type="button" class="btn btn-sm btn-primary"
								data-toggle="modal" data-target="#addAttackSpellModal">Add</button>
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
								<button type="button" class="btn btn-sm btn-primary"
								data-toggle="modal" data-target="#addTraitsModal">Add</button>
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
			<!--  Modal addattack&spell -->
<div id="addAttackSpellModal" class="modal fade" role="dialog">
  <div class="modal-dialog">
    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Add attack or spell</h4>
      </div>
      <div class="modal-body">
      <div>    <label>Attack Style: </label><input>
						</div>
		<div>
		<label>Damage:</label><input>
		</div>
		<div>
		<label>Damage Type:</label>
		<select>
			<option value="1" >Physical</option>
			<option value="3" >Magic</option>
			<option value="4" >Fire</option>
		</select>
		</div>
        
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default"
							data-dismiss="modal">Close</button>
							      <button type="button" class="btn btn-sm btn-primary">Add attack or spell</button>
      </div>
    </div>

  </div>
</div>
<!-- Modal -->
<div id="addTraitsModal" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Add trait</h4>
      </div>
      <div class="modal-body">
        <div>
        <textarea rows="5" cols="" style="width: 350px;"></textarea>
        </div>        
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default"
							data-dismiss="modal">Close</button>
							      <button type="button" class="btn btn-sm btn-primary">Add trait</button>
      </div>
    </div>

  </div>
</div>
			
	         	</jsp:attribute>
	<jsp:attribute name="javascript">
			</jsp:attribute>


</t:navbar>