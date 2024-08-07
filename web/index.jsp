<%-- 
    Document   : index
    Created on : 3 ago. 2024, 12:09:48
    Author     : nicolas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style/estilos.css"/>
        <link rel="shortcut icon" href="icon/icon.jpg" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
        <title>Inicio de sesion | VetDog</title>
    </head>
    <body>
         <div class="container glass-effect d-flex justify-content-center align-items-center">
            <h1>Inicio de sesion</h1>
            <div>
                <img src="image/cat.png"  class="image" alt="alt"/>
            </div>
            <div>
                <form class="form-group" method="POST">
                    <div>
                        <label class="form-label">Usuario</label>
                        <input type="text" name="user" class="form-input-sb form-control" placeholder="usuario" required>
                    </div>
                    <div>
                        <label class="form-label">Correo</label>
                        <input type="email" name="correo" class="form-input-sb form-control" placeholder="correo electronico" required="ingrese su correo electronico">
                    </div>
                    
                    <div>
                        <label class="form-label">Contraseña</label>
                        <input type="password" name="password"  class="form-input-sb form-control input-group" placeholder="contraseña" required="por favor, ingresar la contraseña">
                    </div>
                    <input type="submit" class="btn btn-dark btn-block active m-2" action="action" value="Ingresar" name="boton-login">
                    <div class="social-icons d-flex justify-content-center p-3">
                        <a href="https://www.google.com/intl/es/account/about/" class="google"><i class="bi bi-google"></i></a>
                        <a href="https://www.facebook.com/"><i class="bi bi-facebook"></i></a>
                        <a href="https://www.instagram.com/" class="instagram"><i class="bi bi-instagram"></i></a>
                        <a href="https://pe.linkedin.com/"><i class="bi bi-linkedin"></i></a>
                           
                    </div>
                </form>
            </div>
        </div>
       
    </body>
</html>
