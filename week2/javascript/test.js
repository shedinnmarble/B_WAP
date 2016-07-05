// var x=1;
// function f(){
// 	var y=2;
// 	var summ=function(){
// 		var z=3;
// 		console.log(x+y+z)
// 	};
// 	y=10;
// 	return summ;
// }
// var g=f();
// g();
//clouse

var makeCounter=(function(){
	var privateCounter=0;
	function changeBy(val){
		privateCounter+=val;
	}
	return {
		increment:function(){
			changeBy(1)
		},
		decrement:function(){
			changeBy(-1)
		},
		value:function(){
			return privateCounter;
		}
	}
})();
var counter1=makeCounter;
var counter2=makeCounter;
counter1.increment();
counter1.increment();
counter1.increment();
alert(counter1.privateCounter)
alert(counter2.value())
