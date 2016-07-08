var  make_adder = function (count) {
	var counter = 0;
	return function(){
		return counter+=count;
	}	
};
//initialize the function
add5=make_adder(5);//at this time return a function, then we can call the funciton
add5();
add5()
console.log(add5())

add7=make_adder(7);
add7();
add7();
// add7();
console.log(add7())