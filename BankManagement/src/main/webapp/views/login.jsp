<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #6dd5ed, #2193b0);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .form-container {
            background: #fff;
            padding: 30px 40px;
            border-radius: 15px;
            box-shadow: 0px 8px 20px rgba(0,0,0,0.2);
            width: 350px;
            text-align: center;
        }
        .form-container h2 {
            margin-bottom: 20px;
            color: #333;
        }
        .form-container input {
            width: 100%;
            padding: 12px;
            margin: 10px 0;
            border-radius: 8px;
            border: 1px solid #ccc;
            font-size: 14px;
        }
        .form-container input:focus {
            border-color: #2193b0;
            outline: none;
            box-shadow: 0px 0px 8px rgba(33,147,176,0.3);
        }
        .form-container button {
            background: #2193b0;
            color: white;
            padding: 12px;
            border: none;
            border-radius: 8px;
            cursor: pointer;
            font-size: 15px;
            transition: 0.3s;
            width: 100%;
        }
        .form-container button:hover {
            background: #176d83;
        }
    </style>


<body>
 <div class="form-container">
        <h2>User Login</h2>
        <form action="login" method="get">
            
            <input type="number" name="id" placeholder="Enter Your Id" required>
            <input type="password" name="password" placeholder="Enter Your Password" required>
            <button type="submit">Login</button>
            
            
        </form>
        <a href="/reg"><button type="submit">Register</button></a>
    </div>

</body>
</html>