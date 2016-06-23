<?php include "top.html"?>

<?php 
$name=$_GET["name"];
$gender=$_GET["gender"];
$age=$_GET["age"];
$personalityType=$_GET["personalityType"];
$favorateOS =$_GET["favorateOS"];
$ageFrom=$_GET["ageFrom"];
$ageTo=$_GET["ageTo"];
echo "<h1>Thank you!</h1>";
echo "<p>Welcome to NerdLuv11, $name,$gender,$age,$personalityType,$favorateOS,$ageFrom,$ageTo</p>";
$newSingle="\r\n$name,$gender,$age,$personalityType,$favorateOS,$ageFrom,$ageTo";
try
{
$myfile = fopen("singles.txt", "w"); //or die("Unable to open file!");
}catch(Exception $e){
	print_r($e);die();
}
fwrite($myfile, $newSingle);
fclose($myfile);
echo $newSingle;
?>


<?php include "bottom.html"?>