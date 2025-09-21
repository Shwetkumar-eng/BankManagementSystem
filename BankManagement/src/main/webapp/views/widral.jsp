<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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

</head>
<body>
<div class="form-container">
        <h2>Widral Form</h2>
        <form action="widral" method="get">
            <input type="text" name="name" placeholder="Enter Your Name" required>
            <input type="email" name="email" placeholder="Enter Your Email" required>
            <input type="number" name="accountNumber" placeholder="Enter Your Account Number" required>
            <input type="number" name="widral" placeholder="Enter Widral Amount" required>
            <input type="text" name="pass" placeholder="Enter Your Password" required>
            
            <button type="submit">Widral</button>
        </form>
    </div>

</body>
</html>