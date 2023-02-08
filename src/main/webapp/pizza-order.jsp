<%--
  Created by IntelliJ IDEA.
  User: herbertholder
  Date: 1/30/23
  Time: 4:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pizza Order</title>
</head>
<body style="
display:flex;
flex-direction:column;
justify-content: center;
align-items: center;
">

<form action="pizza-order.jsp" style="width:200px;
     height:300px;
     display:flex;
     flex-direction:column;
     justify-content: center;
     align-items: flex-start;
     gap: .4rem;border-radius: 1rem;border: solid 1px black; padding: 1rem;">
    <h3 for="choose">Choose Your Order</h3>
    <label for="crust">Type of crust: </label>
    <select name="crust" id="crust" required>
        <option value="crispy">Crispy</option>
        <option value="flaky">Flaky</option>
        <option value="cheesy">Cheesy</option>
    </select>
    <label for="sauce">Sauce: </label>
    <select name="sauce" id="sauce" required>
        <option value="tomato-basil">Tomato Basil</option>
        <option value="marinara">Marinara</option>
        <option value="garlic">Garlic</option>
    </select>
    <label for="size-select">Size: </label>
    <select name="size" id="size-select" required>
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select>
    <label for="toppings">Toppings</label>
    <input type="checkbox" name="toppings" id="toppings">
    <button type="submit">Order</button>
</form>



</body>
</html>