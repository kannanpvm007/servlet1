<!DOCTYPE html>
<html lang="en">

<head>
    <!-- <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title> -->
        <%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    

</head>
<center>

    <body>
        <h1> <br>

            <body background="analytics-app-2-animated.gif">
                <font color="white"> successly </font>
                <marquee behavior="" direction=""> .........</marquee>

                <font color="yellow "> Time:

                    <body onload="startTime()">

                        <div id="txt"></div>




        </h1>
        </title>



        <!--  <img src="4EBs.gif" height="50" width="50"> </right> -->
        <p>
            <br>

            <table border="2">
                <tr class="row">
                    <td class="col">TradeID : </td>
                    <td class="col"><%= request.getParameter("tradeid")   
                               %></td>
                </tr>
                <tr class="row">
                    <td class="col">ucccode : </td>
                    <td class="col"><%=request.getParameter("ucccode") 
                            %></td>
                </tr>
                <tr class="row">
                    <td class="col">scrip : </td>
                    <td class="col"><%=request.getParameter("scrip") %></td>
                </tr>
                <tr class="row">
                    <td class="col">tradedate : </td>
                    <td class="col"><%=request.getParameter("tradedate") %></td>
                </tr>
                <tr class="row">
                    <td class="col">tradetype : </td>
                    <td class="col">
                        <!-- <select name="tradetype">
                                        <option value="buy">buy</option>
                                        <option value="sell">sell</option>                                
                                      </select> -->
                        <%=request.getParameter("tradetype") %>
                    </td>
                </tr>
                <tr class="row">
                    <td class="col">quantity : </td>
                    <td class="col"><%=request.getParameter("quantity") %></td>
                </tr>
                <tr class="row">
                    <td class="col">price : </td>
                    <td class="col"><%=request.getParameter("price") %></td>
                </tr>
                <!-- <tr class="row">
                            <td class="col"></td>
                            <td class="col">
                            <input type="reset" value="Reset">
                            <input type="hidden" value ="hidden">
                            </td>
                        </tr> -->
            </table>



            <script>
                function startTime() {
                    var today = new Date();
                    var h = today.getHours();
                    var m = today.getMinutes();
                    var s = today.getSeconds();
                    var day = today.getDate();
                    var mon = today.getMonth();
                    var yer = today.getFullYear();
                    m = checkTime(m);
                    s = checkTime(s);
                    document.getElementById('txt').innerHTML =
                        h + ":" + m + ":" + s + "  " + "DATE" + " " + day + ":" + mon + ":" + yer;
                    var t = setTimeout(startTime, 500);
                }
                function checkTime(i) {
                    if (i < 10) { i = "0" + i };  // add zero in front of numbers < 10
                    return i;
                }
            </script>

            <body onload="startTime()">

                <div id="txt"></div>







                <!-- <a target="_blank" data-track="L1S3" data-orefid="p1_4" href="/sensex-nifty-live-today-2019-05-22/liveblog/69438351.cms" itemprop="url"><meta content="Live: Sensex rises 100 points, Nifty nears 11,750" itemprop="name"><font color="#C00">Live: Sensex rises 100 points, Nifty nears 11,750</font></a></li></ul><h2 itemprop="itemListElement" itemscope="itemscope" itemtype="http://schema.org/ListItem"><meta itemprop="position" content="5"><a target="_blank" data-track="L2" data-orefid="p1_5" href="/news/elections/lok-sabha/india/inside-modis-playbook-to-winning-elections/articleshow/69439462.cms" itemprop="url"><meta content="Inside Modi's playbook to winning elections" itemprop="name">Inside Modi's playbook to winning elections</a></h2><time class="date-format" data-time="22 May 2019, 10:46"></time><p> -->








                <!--news  -->
                <!-- https://news.google.com/news/feeds?um=1&ned=us&hl=en&q=rick+perry&output=rss -->

                <!--imge  -->

<!-- 
                <svg xmlns:xlink="http://www.w3.org/1999/xlink"
                xmlns="http://www.w3.org/2000/svg" 
                viewBox="0 0 200 100"
                width="200px" height="100px">
                <circle cx="50" cy="50" r="30"
                        style="stroke:#0000ff; stroke-width: 5px; fill:#ff0000;"/>
                <rect x = "100"
                      y = "0"
                      height = "50"
                      width = "50"
                      stroke-width = "2px"
                      stroke = "#ffff00"
                      fill = "#00ff00" />
                </svg> -->






                <!--  -->









            </body>
















            <!-- <%=
     request.getParameter("name")   
    %> -->
            <p>
                <!-- <%=request.getParameter("password") %> -->

            </p>
        </p>
        </font>

    </body>
</center>

</html>