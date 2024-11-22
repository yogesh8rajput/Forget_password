<%-- 
    Document   : forget
    Created on : 22-Nov-2024, 10:42:52 pm
    Author     : yoges
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>Forget</title>
  <style>
    * {
    box-sizing: border-box;
    margin: 0;
    padding: 0;
    text-decoration: none;
}

body {
    font-family: 'Arial', sans-serif;
    background-color:rgba(0, 0, 0, 0.734);
    color: white;
/*    display: flex;
    justify-content: center;
    align-items: center;*/
    height: 100vh;
}

.container {
    background: black;
    padding: 2rem;
    border-radius: 8px;
    box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
    width: 300px;
}

.forgot-form h2 {
    margin-bottom: 1rem;
    text-align: center;
}

.input-group {
    margin-bottom: 1.5rem;
}

.input-group label {
    display: block;
    margin-bottom: 0.5rem;
}

.input-group input {
    width: 100%;
    padding: 0.5rem;
    border: 1px solid #ccc;
    border-radius: 4px;
}

.input-group input:focus {
    border-color: #007bff;
    outline: none;
}

.remember-me {
    display: flex;
    align-items: center;
    margin-bottom: 1.5rem;
}

.remember-me input {
    margin-right: 0.5rem;
}

.submit-btn {
    width: 100%;
    padding: 0.7rem;
    background-color: #007bff;
    color: white;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

.submit-btn:hover {
    background-color: #0056b3;
}

 .main{
                 display: flex;
                justify-content: center;
                align-items: center;
                margin-top: 10rem;
            }

        </style>
    </head>
    <body>
       
       
        <div class="main">
            
    <div class="container">
        <form action="forget" method="post" class="forgot-form">
            <h2>Forgot Email</h2>
            <div class="input-group">
                <label for="email"  >Email</label>
                <input type="email" id="email" name="gmail" placeholder="Enter Email" required>
            </div>
            <div class="remember-me">
                <input type="checkbox" id="remember" name="remember">
                <label for="remember">Remember Me</label>
            </div>
            <button type="submit" class="submit-btn">Submit</button>
            <br><br>
             <div class="footer">
                 <p>Don't have an account? <a href="index.html">Login up</a></p>
                  
                  
                </div>
        </form>
    </div>
        </div>
</body>
</html>
