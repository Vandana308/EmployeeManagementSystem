<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<style>
body{
    background-image:  linear-gradient(rgba(0,0,0,0.6),rgba(0,0,0,0.6)),url(image.jpg);
    height: 100vh;
    background-size: cover;
    background-position: center;
         
}

.login-page{
    width: 300px;
    padding: 10% 0 0;
    margin: auto;

}

.form{
    position: relative;
    z-index: 1;
    background: rgba(7, 40, 195, 0.8);
    max-width: 360px;
    margin: 0 auto 100px;
    padding: 45px;
    text-align: center;

}


.form input{
    font-family: "Roboto", sans-serif;
    outline: 1;
    background: #11e3ffa2;
    width: 100%;
    border: 0;
    margin: 0 0 15px;
    padding: 15px;
    box-sizing: border-box;
    font-size: 14px;

}

.form button{
    font-family: "Roboto", sans-serif;
    text-transfrom: uppercase;
    outline: 0;
    background: #4caf50;
    width: 100%;
    border: 0;
    padding: 15px;
    color: #00000000;
    font-size: 14px;
    cursor: pointer;

}

.form button:hover,.form button:active{
    background: #43A047;
}

.form .message{
    margin: 15px 0 0;
    color: aliceblue;
    font-size: 16px;
}


.form .message a{

    color: red;
    text-decoration: none;

}

.form .register-form{
    display: none;
}
</style>
    <head>
        <title>Login and Registration Form</title>
        <link rel="stylesheet" href="file1.css">
        
    </head>
    <body>
        
        <div class="login-page">
            <div class="form">
                
                

                <form action="LoginServlet" method="post">
                    <input type="text" placeholder="UserName" name="UserName"/>
                    <input type="password" placeholder="UserPassword" name="UserPassword"/>
                    <button>Login</button>
                   
                </form>
            </div>
        </div>
<script src='https://code.jquery.com/jquery-3.4.1.min.js'>
    </script>

    <script>
    $('.message a').click(function(){

    $('form').animate({height: "toggle", opacity: "toggle"}, "slow");
    });
    </script>


    </body>
</html>