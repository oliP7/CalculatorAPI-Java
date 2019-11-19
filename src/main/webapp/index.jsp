<%--
  Created by IntelliJ IDEA.
  User: oli
  Date: 11/18/19
  Time: 1:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="css/main.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>Calculator</title>
</head>
<body>
<header class="text-center py-5 mb-4">
  <div class="container">
    <h3 class="font-weight-light text-white">Calculator API</h3>
  </div>
</header>
<div class="container">
  <div class="row">
    <div class="col-xl-6 col-md-8 mb-4">
      <div class="card border-1 shadow">
        <div class="card-header" style="background-color: #69b798">Simple Calculator API</div>
        <div class="card-block text-center" style="padding: 5px;">
          <a href="/CalculatorApi/add?num1=2&num2=3" class="btn btn-outline-secondary">Addition</a>
          <a href="/CalculatorApi/subtract?num1=2&num2=3" class="btn btn-outline-secondary">Subtraction</a>
          <a href="/CalculatorApi/multiply?num1=2&num2=3" class="btn btn-outline-secondary">Multiplication</a>
          <a href="/CalculatorApi/divide?num1=2&num2=3" class="btn btn-outline-secondary">Division</a>
          <br/><br>
          <p style="color: #110165; font-size: 10px"><b>Instead of num1=2 and num2 = 3 in the path we can insert other numbers.</b></p>
         <%-- <label for="expression">Insert an expression to be evaluated</label>
          <input type="text" name="expression" id="expression">
          <button onclick='window.location.href="/CalculatorApi/calc?exp=" + document.getElementById("expression").value;'
                  class="btn btn-outline-secondary" style="margin-top: 5px;">Evaluate expression</button>--%>
        </div>
      </div>
    </div>
    <div class="col-xl-6 col-md-8 mb-4">
      <div class="card border-1 shadow">
        <div class="card-header" style="background-color: #69b798">Extended Calculator API</div>
        <div class="card-block text-center" style="padding: 5px;">
          <a href="/CalculatorApi/square/3" class="btn btn-outline-secondary">Square</a>
          <a href="/CalculatorApi/square/3/3" class="btn btn-outline-secondary">Power n^m</a>
          <a href="/CalculatorApi/factorial/3" class="btn btn-outline-secondary">Factorial</a>
          <a href="/CalculatorApi/prime/3" class="btn btn-outline-secondary">Prime</a>
          <br/><br>
          <p style="color: #110165; font-size: 10px"><b>Instead of the number in the path we can insert other numbers.</b></p>
        </div>
      </div>
    </div>
  </div>
</div>
</body>
</html>
