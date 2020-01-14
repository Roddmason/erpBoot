$(document).ready(function() {
	$("#submitButton").click(function() {
		$("#loader").modal("show")
		var dataJson = {
			user : $("#inputEmail").val(),
			pass : $.md5($("#password").val())
		}
		$.ajax({
			method : "POST",
			url : "loginValidations",
			headers : {
				"Content-type" : "application/json"
			},
			data : JSON.stringify(dataJson),
			success : function(result) {
				console.log("Cantidad de logins: " + result);
				window.setTimeout(function(){
					submitForm(result);
                  }, 2000);
			},
			error : function(jqXHR, textStatus, errorThrown) {
			}
		});
	});
});

function submitForm() {
	// Get the forms we want to add validation styles to
	var forms = document.getElementsByClassName('needs-validation');
	// Loop over them and prevent submission
	var validation = Array.prototype.filter.call(forms, function(form) {
		if (form.checkValidity() === false) {
			form.classList.add('was-validated');
			$("#close").trigger( "click" );
		}else{
			$("#close").trigger( "click" );
			$(form).attr('action', 'loginValidated');
			$(form).submit();
		}
	});
}