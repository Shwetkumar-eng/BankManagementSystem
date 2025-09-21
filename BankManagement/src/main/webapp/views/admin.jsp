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
            background: linear-gradient(120deg, #89f7fe, #66a6ff);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            background: white;
            padding: 30px;
            border-radius: 15px;
            box-shadow: 0 4px 15px rgba(0,0,0,0.2);
            text-align: center;
        }
        h2 {
            color: #333;
            margin-bottom: 20px;
        }
        select {
            padding: 10px;
            width: 250px;
            border-radius: 8px;
            border: 1px solid #888;
            font-size: 16px;
        }
        button {
            margin-top: 20px;
            padding: 10px 20px;
            border: none;
            background: #66a6ff;
            color: white;
            border-radius: 8px;
            cursor: pointer;
            font-size: 16px;
        }
        button:hover {
            background: #4a90e2;
        }
    </style>

</head>
<body>
 <div class="container">
        <h2>Select Bank Option</h2>
        <form action="adminAction" method="get">
            <select name="option">
                <option value="widraller">Widraller List</option>
                <option value="depositor">Depositor List</option>
                <option value="customer">Customer List</option>
                <option value="entries">Entries</option>
            </select>
            <br>
            <button type="submit">Submit</button>
        </form>
    </div>
</body>
</html>