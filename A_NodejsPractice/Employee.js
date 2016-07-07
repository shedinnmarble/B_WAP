var Employee=(function(){
	var name;
	var age=0;
	var salary=0;
	function getAge(){
		return this.age;
	}
	function getSalary(){
		return this.salary;
	}
	function getName(){
		return this.name;
	}
	var setAge=function(newAge){
		this.age=newAge;
		console.log(this.age+":::age")
	}
	var setName=function(newName){
		this.name=newName;
		console.log(this.name)
	}
	var setSalary=function(newSalary){
		this.salary=newSalary;
	}
	var increaseSalary=function(percentage){
		
		 setSalary(this.salary+this.salary*percentage)
		 return getSalary()
	}
	var incremeentAge=function(){
		
	}
	return {
		setAge:setAge,
		setSalary:setSalary,
		setName:setName,
		getName:getName,
		incremeentAge:incremeentAge,
		increaseSalary:increaseSalary
	}
})();

Employee.setName("dewei");
Employee.setSalary(10000000);
Employee.setAge(18);
console.log(Employee.increaseSalary(0.05)+", "+Employee.incremeentAge())