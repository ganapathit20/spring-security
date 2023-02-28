/**
 * 
 */
$(document).ready(function(){
	
	$("#b1").click(function(){
		
		alert("hello user!!!")
		
		var info={
			name: $("#t1").val(), pass : $("#t2").val()
			
		};
		alert(info.name);
		alert(info.pass);
		
		
		$.ajax({
			type : "POST",
			dataType:"json",
			data: {A : JSON.stringify(info)},
			contentType: "application/json",
			url :"/welcome"

		});
		
		
		
		alert("done!!!!")
		
		
	});
	
	
	
	
	
});
