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
	var myObject={
		setAge:function(newAge){
			age=newAge;
		// console.log(age+":::age")
	},
	setName:function(newName){
		name=newName;
		// console.log(name)
	},
	setSalary:function(newSalary){
		salary=newSalary;
	},
	increaseSalary:function(percentage){		
		salary=(salary+salary*percentage)
		return getSalary()
	},
	incremeentAge:function(){
		age=(getAge()+1)
		return getAge();
	}
};

return myObject;
})();
Employee.address=null;
Employee.setAddress=function(addr){
	this.address=addr;
}
Employee.getAddress=function(){
	return this.address;
}
Employee.setName("dewei");
Employee.setSalary(100);
Employee.setAge(18);
Employee.setAddress("Fairfield, IA, USA")

console.log("Salary "+Employee.increaseSalary(0.05)+
	", Age "+Employee.incremeentAge()
	+" Address "+Employee.getAddress())