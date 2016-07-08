var Employee=(function(){
	var name;
	var age=0;
	var salary=0;
	var getAge=function (){
		return age;
	}
	var getSalary=function (){
		return salary;
	}
	var getName=function (){
		return name;
	}
	
	return {
		setAge:function(newAge){
			age=newAge;
		// console.log(age+":::age")
	},
	setSalary:function(newSalary){
		salary=newSalary;
	},
	setName:function(newName){
		name=newName;
		// console.log(name)
	},
		// getName:getName,
		incremeentAge:function(){
			age=(getAge()+1)
			return getAge();
		},
		increaseSalary:function(percentage){		
			salary=(salary+salary*percentage)
			return getSalary()
		}
		
	}})();

	Employee.setName("dewei");
	Employee.setSalary(100);
	Employee.setAge(18);
	console.log(Employee.increaseSalary(0.05)+", "+Employee.incremeentAge())