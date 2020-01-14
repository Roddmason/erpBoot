<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>ERP</title>
	<link rel="icon" href="img/favicon.ico" type="image/x-icon">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/loginStyle.css">
	<script type="text/javascript" src="js/jQuery.min.js"></script>
	<script type="text/javascript" src="js/jQuery.security.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.bundle.min.js"></script>
	<script type="text/javascript" src="js/functions.js"></script>
</head>
<body>
	<div class="container-fluid">
		<div class="row no-gutter">
			<div class="d-none d-md-flex col-md-4 col-lg-6 bg-image"></div>
			<div class="col-md-8 col-lg-6">
				<div class="login d-flex align-items-center py-5">
					<div class="container">
						<div class="row">
							<div class="col-md-9 col-lg-8 mx-auto">
								<h3 class="login-heading mb-4">Bienvenido ${inicio}</h3>
								<form method="post" class="needs-validation" novalidate>
									<div class="form-group">
										<label for="inputEmail">Correo:</label> 
										<input name="email" type="email" id="inputEmail" class="form-control" placeholder="Correo" required>
										<div class="invalid-feedback">
											Error en formato, favor validar correo
										</div>
									</div>
									<div class="form-group">
										<label for="inputPassword">Contrase&ntilde;a:</label> 
										<input name="password" type="password" id="inputPassword" class="form-control" placeholder="Contrase&ntilde;a" required>
										<div class="invalid-feedback">
											Error en contrase&ntilde;a
										</div>
									</div>
									<div class="custom-control checkbox mb-3">
										<input name="checkbox" type="checkbox" class="custom-control-input" id="customCheck1"> 
										<label class="custom-control-label" for="customCheck1">
											Recordar Contrase&ntilde;a
										</label>
									</div>
									<button id="submitButton" class="btn btn-lg btn-primary btn-block btn-login text-uppercase font-weight-bold mb-2"
										type="button">Iniciar Sesi&oacute;n</button>
									<div class="text-center">
										<a class="small" href="#">¿Olvidaste la Contrase&ntilde;a?</a>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- The Modal -->
	<div class="modal fade" id="loader" data-keyboard="false"
		data-backdrop="static">
		<div class="modal-dialog modal-dialog-centered">
			<div class="modal-content panel-transparent">
				<button  style="display:none" type="button" id="close" class="close" data-dismiss="modal">&times;</button>
				<!-- Modal body -->
				<div class="modal-body">
					<div class="row">
						<div class="col-1"></div>
						<div class="col-10 spiners">
							<div class="spinner-grow text-muted"></div>
							<div class="spinner-grow text-primary"></div>
							<div class="spinner-grow text-success"></div>
							<div class="spinner-grow text-info"></div>
							<div class="spinner-grow text-warning"></div>
							<div class="spinner-grow text-danger"></div>
							<div class="spinner-grow text-secondary"></div>
							<div class="spinner-grow text-dark"></div>
							<div class="spinner-grow text-light"></div>
						</div>
						<div class="col-1"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>