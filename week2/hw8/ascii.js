
window.onload=function(){
	var timer;
	var index=0;
	var speed=250;
	var animationData=ANIMATIONS["Dive"];
	var text=document.getElementById("text");
	var array=animationData.split("=====\n")
	function setText(){
		timer=setInterval(function(){
				text.value=array[index];
				index++;
				if(index>=array.length){
					index=0;
				}
			},speed)
	}	
	function doAnimation(speed){
		if(timer==null){
			setText();
		}else{
			stop();
			setText();
		}
	}
	function stop(){
		clearInterval(timer);
		index=0;
	}
	document.getElementById("start").onclick=function(){
		doAnimation(speed);
		
	}
	document.getElementById("stop").onclick=function(){
		stop();
	}
	document.getElementById("animation").onchange=function(){
		var anmi=document.getElementById("animation");
		var anmiText=anmi.options[anmi.selectedIndex].text;
		animationData=ANIMATIONS[anmiText];
		array=animationData.split("=====\n")
		stop();
		doAnimation(speed);
	}
	document.getElementById("size").onchange=function(){
		var e = document.getElementById("size");
		var fontSize = e.options[e.selectedIndex].value;
		text.style.fontSize=fontSize;
	}
	document.getElementById("turbo").onclick=function(){
		var checkbox=document.getElementById("turbo");
		if(checkbox.checked){
			speed=50;
			stop();
			doAnimation(speed);
		}else{
			speed=250;
			stop();
			doAnimation(speed);
		}
	}
}