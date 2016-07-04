var x=1;
function f(){
	var y=2;
	var summ=function(){
		var z=3;
		console.log(x+y+z)
	};
	y=10;
	return summ;
}
var g=f();
g();