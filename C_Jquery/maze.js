"use strict";
$(document).ready(function(){
	var start=false;
	var win=false;
	$(".boundary").mouseover(function(){
		if(start){
			$(this).addClass("youlose");
			$("#status").text("you Lose!!");
		}
	});
	$("#start").mouseover(function(){
		// alert("start")
		$(".boundary").removeClass("youlose");
		$("#status").text("Game start!");
		start=true;
		win=false;
	});
	$("#end").mouseover(function(){
		var loser=$(".youlose").size();
		// alert(loser);
		if(start){
			if(loser>=1){
				$("#status").text("You still lose");
			}else{
				$("#status").text("You Win");
				win=true;
			}
		}
		// $("#end").
	});
	$("#maze").mouseleave(function(){
		if(start){
			if(!win){
				$("#status").text("You Lose! out of area");
				$(".boundary").addClass("youlose");
			}
		}
	});
});