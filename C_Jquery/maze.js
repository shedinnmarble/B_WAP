$(document).ready(function(){
	var start=false;
	$(".boundary").mouseover(function(){
		$(this).addClass("youlose")
		$("#status").text("you Lose!!");
	})
	$("#start").click(function(){
		// alert("start")
		$(".boundary").removeClass("youlose");
		$("#status").text("")
		start=true;
	})
	$("#end").mouseover(function(){
		var loser=$(".youlose").size();
		// alert(loser);
		if(loser>=1){
			$("#status").text("You still lose")
		}else{
			$("#status").text("You Win");
		}
		// $("#end").
	})
	$("#maze").mouseout(function(){
		if(start){
			$("#status").text("You Lose！out of area")
			$(".boundary").addClass("youlose")
		}
	})
})