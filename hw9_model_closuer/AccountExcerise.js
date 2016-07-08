//create a module used to the button click event
//some plcace to store the account list
var accountList=[];

var AccountModule=(function(){
	var create=function(){
		var name=document.getElementById("name").value;
		var deposit=document.getElementById("deposit").value;
		accountList.push({name:name,deposit:deposit});
		display();
	};
	var display=function(){
		//display this object to textarea
		var content="";
		if(accountlist.length>0){
			for(var key in accountList){
				content+="Account Name: "+accountList[key].name+" Balance "+accountList[key].deposit+"\r\n";
			}
			document.getElementById("accountlist").value=content;
		}
	};
	return {
		create:create;
	}
})();
window.onload=function(){
	document.getElementById("createAccount").onclick=AccountModule.create;
}