<html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head> 
<body> 
    <br> <br>
    
     <center>
        <font color="green">

                <form action="stackout.jsp" method="get">
                    <table border="2">
                        <tr class="row">
        
                          
                                <td class="col">TradeID : </td>
                                <td class="col"><input type="number" name="tradeid" id="tradeid"></td>
                        </tr>
                        <tr class="row">
                            <td class="col">ucccode : </td>
                            <td class="col"><input type="text" name="ucccode" id="ucccode"></td>
                        </tr>
                        <tr class="row">
                            <td class="col">scrip : </td>
                            <td class="col"><input type="text" name="scrip" id="scrip"></td>
                        </tr>
                        <!-- <font color="yellow"> -->
                            <tr class="row">
                                <td class="col">tradedate : </td>
                                <td class="col"><input type="date" name="tradedate" id="tradedate"></td>
                            </tr>
                            <tr class="row">
                                <td class="col">tradetype : </td>
                                <td class="col">
                                    <select name="tradetype">
                                        <option value="buy">buy</option>
                                        <option value="sell">sell</option>
                                    </select>
                                </td>
                            </tr>
                            <tr class="row">
                                <td class="col">quantity : </td>
                                <td class="col"><input type="number" name="quantity" id="quantity"></td>
                            </tr>
                            <tr class="row">
                                <td class="col">price : </td>
                                <td class="col"><input type="number" name="price" id="price"></td>
                            </tr>
                            <tr class="row">
                                <td class="col"></td>
                                <td class="col"><input type="submit" value="Save">
                                    <input type="reset" value="Reset">
                                    <input type="hidden" value="hidden">
                                </td>
                            </tr>
                    </table>
                </form> 
              <!-- <body background="hexwave.gif"> -->
                    <font color="oran677">
        </center>
        



</body>
</html>

 