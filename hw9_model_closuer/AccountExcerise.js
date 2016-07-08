//create a module used to the button click event
//some plcace to store the account list

var AccountModule=(function(){
	'use strict';
	var accountList=[];
	var display=function(){
		//display this object to textarea
		var content="";
		var key;
		if(accountList.length>0){
			for(key in accountList){
				content+="Account Name: "+accountList[key].name+" Balance "+accountList[key].deposit+"\r\n";
			}
			document.getElementById("accountlist").value=content;
		}
	};
	var create=function(){
		var name=document.getElementById("name").value;
		var deposit=document.getElementById("deposit").value;
		accountList.push({name:name,deposit:deposit});
		display();
	};
	
	return {
		create:create
	};
})();
window.onload=function(){
	'use strict';
	document.getElementById("createAccount").onclick=AccountModule.create;
};