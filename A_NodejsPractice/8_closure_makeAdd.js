var  make_adder = function () {
	var counter = 0;

		return function(count){
			return counter+=count;
		}
		
	
};

add5=make_adder(5);
add5();
add5()
console.log(add5())
