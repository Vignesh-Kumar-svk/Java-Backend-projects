
function validatePassword(){
			var password=document.getElementById("password"),
			confirmpassword=document.getElementById("confirmPassword");


	if(password!=confirmpassword){
		alert("Passwords doesn't match");
	}
	else{
		alert("Registered Successfully!!")
	}
}
