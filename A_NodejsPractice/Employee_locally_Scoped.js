var Employee=(function(){
	var name;
	var age=0;
	var salary=0;
	var myObject={};
	var getAge=function (){
		return age;
	}
	var getSalary=function (){
		return salary;
	}
	var getName=function (){
		return name;
	}
	myObject.setAge=function(newAge){
		age=newAge;
		// console.log(age+":::age")
	}
	myObject.setName=function(newName){
		name=newName;
		// console.log(name)
	}
	myObject.setSalary=function(newSalary){
		salary=newSalary;
	}
	myObject.increaseSalary=function(percentage){		
		 salary=(salary+salary*percentage)
		 return getSalary()
	}
	myObject.incremeentAge=function(){
		age=(getAge()+1)
		return getAge();
	}
	return myObject;
})();

Employee.setName("dewei");
Employee.setSalary(100);
Employee.setAge(18);
console.log(Employee.increaseSalary(0.05)+", "+Employee.incremeentAge())