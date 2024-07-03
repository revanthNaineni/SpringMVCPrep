<!-- error.jsp -->
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Error Page</title>
    
    <!-- Add inline CSS styles -->
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }
        
        div {
            text-align: center;
            background-color: #fff;
            border: 1px solid #ddd;
            border-radius: 5px;
            padding: 20px;
            margin: 50px auto;
            max-width: 400px;
        }
        
        h1 {
            color: #e74c3c;
        }
        
        p {
            font-size: 18px;
            color: #333;
        }
    </style>
</head>
<body>
    <div>
        <h1>Error</h1>
        <p>${errorMessage}</p>
    </div>
</body>
</html>
