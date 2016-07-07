var add = (function () {
	var counter = 0;
	return{add: function () {
		return counter += 1;
	},
	reset:function(){
		return counter=0;
	}
}
})();
console.log(add.add())
console.log(add.add())
console.log(add.reset())
console.log(add.add())