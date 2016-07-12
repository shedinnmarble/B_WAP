/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var Dict=(function(){
	var click=function(){
		$("#lookUp").click(function(){
			var word=$("#word").val();
			// alert(word)
			$.post("dictServlet",{"word":word})
			.done(function(data){
				var jsonData=JSON.parse(data);
				var content="";
				$("#difinition").empty();
				$.each(jsonData,function(index,value){
					content+="<p>"+index+"("+value.wordtype+")::"+value.definition+"</p>";
				})
				$("#difinition").append(content)
			})

			
		})
	};
	return{
		click:click
	}

})();

$(document).ready(function(){
	Dict.click()
})

