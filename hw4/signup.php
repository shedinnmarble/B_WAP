<?php include "top.html";?>
<div class="form">
	<form action="signup-submit.php" method="get">
		<fieldset>
			<legend>New User Signup:</legend>
		
		<div class="inputName">
			<label class="column">Name:</label>
			<input type="text" name="name" maxlength="16" size="16">
		</div>
		<div class="inputName">
			<label class="column">Gender:</label>
			<label><input type="radio" name="gender" value="M">Male</label>
			<label><input type="radio" name="gender" value="F">Female</label>
		</div>
		<div class="inputName">
			<label class="column">Age:</label>
			<input type="text" name="age" maxlength="2" size="6" />
		</div>
		<div class="inputName">
			<label class="column">Personality type:</label>
			<input type="text" name="personalityType" maxlength="6"  size="6" />
			<span>(<a href="http://www.humanmetrics.com/cgi-win/JTypes2.asp">Don't know your type?</a>)</span>
		</div>
		<div class="inputName">
			<label class="column">Favorite OS:</label>
			<select name="favorateOS">
				<option selected>Windows</option>
				<option>MacOS</option>
			</select>
		</div>
		<div class="inputName">
			<label class="column">Seeking age:</label>
			<input type="text" name="ageFrom"  maxlength="2"  size="6" >
			<span>to</span>
			<input type="text" name="ageTo"  maxlength="2"  size="6"  >
		</div>
		<div class="submit">
			<input type="submit" value="Sign Up">
		</div>
		</fieldset>

	</form>
	
</div>
	
<?php include "bottom.html";?>