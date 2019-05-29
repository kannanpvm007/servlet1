import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.mysql.jdbc.Statement;

public class servlet1 extends HttpServlet {
    public static final String fl = "Db.Properties";

    @Override
    public void init() throws ServletException {
        System.out.println("init() called:");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Properties prop = new Properties();
        // InputStream input = null;
        // input = servlet1.class.getResourceAsStream(fl);
        // prop.load(input);
        // String url = prop.getProperty("jdbc.url");
        // String username = prop.getProperty("jdbc.username");
        // String password = prop.getProperty("jdbc.password");

        // Connection con;
        try {
          //  con = DriverManager.getConnection(url, username, password);
          Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","");  
            Statement stmr = con1.createStatement();
            ResultSet rs = stmr.executeQuery("Select * from login");
 String h;
            while (rs.next()) {
                System.out.println("\n" + rs.getString(1) +" " + rs.getInt(2) + " " + rs.getDate(3)+ " "
                        + rs.getString(4)  );
                        h=rs.getString(4);
                        // from db
                        String user =rs.getString(1);
                        int age=rs.getInt(2);
                        Date date=rs.getDate(3);
                        String psw=rs.getString(4);
                        // from local
                        String name = req.getParameter("name");
                        String pw= req.getParameter("password");   
                        
                        if(user.equals(name) && psw.equals(pw)){
                            req.setAttribute("name", name);
                RequestDispatcher rd1= req.getRequestDispatcher("stack.jsp");
                rd1.forward(req, resp);
                System.out.println("in db: "+user+"  " +psw);
                        }
                       else {       
                      //  String name = req.getParameter("name");
                        //String pw= req.getParameter("password");
                        req.setAttribute("name", name +" invalid login");
                     RequestDispatcher rd= req.getRequestDispatcher("in.jsp");
                     rd.forward(req, resp);
                       }
            }
            


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }}
        
    
        
        
        
    //     String name = req.getParameter("name");
    //     String pw= req.getParameter("password");
    //     req.setAttribute("name", name+"  "+pw+"");
    //  RequestDispatcher rd= req.getRequestDispatcher("in.jsp");
    //  rd.forward(req, resp);







    
    
//     @Override
//     public void destroy() {
//         super.destroy();
//     }

// }



// import java.io.IOException;
// import java.io.PrintWriter;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.Iterator;
// import java.util.List;
// import java.util.Map;
// import java.util.Set;
// import java.util.Map.Entry;
// import java.util.stream.Collectors;

// import javax.lang.model.element.Element;
// import javax.servlet.RequestDispatcher;
// import javax.servlet.ServletException;
// import javax.servlet.ServletResponse;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

        // String age = req.getParameter("age");
        // String date = req.getParameter("date");
        // String checkbox = req.getParameter("checkbox");
        // String mmrg = req.getParameter("married-unmarried");
        // String skil = req.getParameter("skil");
        // String work = req.getParameter("work");
        // get all in one collion_______>

        // List<String> login = Collections.list(req.getParameterNames());
        // /// login.forEach(System.out::println);
        // login.forEach(System.out::println);







      /*  Map<String, String[]> allMap = req.getParameterMap();

         List<String[]> xx = allMap.entrySet().stream().map(x -> x.getValue()).collect(Collectors.toList());

        allMap.forEach((k,v)-> System.out.println(k+", "+Arrays.toString(v)));

        // Arrays.toString(xx.toArray())

        req.setAttribute("name",v );
        RequestDispatcher dispatcher1 = req.getRequestDispatcher("in.jsp");
        dispatcher1.include(req, resp); */


    //     PrintWriter pw = ((ServletResponse) req).getWriter();
    //    resp.setContentType("text/html");

    //    Map m=req.getParameterMap();
    //    Set s = m.entrySet();
    //    Iterator it = s.iterator();

    //        while(it.hasNext()){

    //            Map.Entry<String,String[]> entry = (Map.Entry<String,String[]>)it.next();

    //            String key     = entry.getKey();
    //            String[] value = entry.getValue();

    //            pw.println("Key is "+key+"<br>");

    //                if(value.length>1){    
    //                    for (int i = 0; i < value.length; i++) {
    //                        pw.println("<li>" + value[i].toString() + "</li><br>");
    //                    }
    //                }else
    //                        pw.println("Value is "+value[0].toString()+"<br>");

    //                pw.println("-------------------<br>");
    //        }


    //    Iterator<String> itr = allMap.keySet().iterator();
    //    System.out.println("enter loop");
    //    while (itr.hasNext()) {
    //        System.out.println(itr.next());
    //        String e = itr.next();
    //        req.setAttribute("name", e); 
    //        RequestDispatcher dispatcher1 = req.getRequestDispatcher("in.jsp");
    //        dispatcher1.include(req, resp);}

        // Map map = req.getParameterMap();
        // for(Object key : map.keySet()){
        //     String keyStr = (String)key;
        //     Object value = map.get(keyStr);     
        //     System.out.println("Key " + (String)key + "     :    " + value);
        //     req.setAttribute("name", value); 
        //     RequestDispatcher dispatcher1 = req.getRequestDispatcher("in.jsp");
        //     dispatcher1.include(req, resp);
        // }

        
    //     Map<String, String[]> map = req.getParameterMap();
    //     PrintWriter out = resp.getWriter();
    //     resp.setContentType("text/html");
 
    //     out.print("<html><body>");
    //     out.print("<h1> Your Order...</h1>");
    //     out.println("<table border=\"1\" cellpadding = \"5\"" + 
    //             " cellspacing = \"5\">");
    //     out.println("<tr> <th>Parameter Name</th>" + 
    //             "<th>Parameter Value</th></tr>");
    //     Set set = map.entrySet();
    //     Iterator it = set.iterator();
    //     while (it.hasNext()) {
    //         Map.Entry<String, String[]> entry =  ( Entry<String, String[]>).it.next();
    //         String paramName = entry.getKey();
    //         out.print("<tr><td>" + paramName + "</td><td>");
    //         String[] paramValues = entry.getValue();
    //         if (paramValues.length == 1) {
    //             String paramValue = paramValues[0];
    //             if (paramValue.length() == 0)
    //                 out.println("<b>No Value</b>");
    //             else
    //                 out.println(paramValue);
    //         } else {
    //             out.println("<ul>");
    //             for (int i = 0; i < paramValues.length; i++) {
    //                 out.println("<li>" + paramValues[i] + "</li>");
    //             }
    //             out.println("</ul>");
    //         }
    //         out.print("</td></tr>");
    //     }
    //     out.println("</table></body></html>");
    // }

   
        // // req.setAttribute("name", key);
        // RequestDispatcher dispatcher1 = req.getRequestDispatcher("in.jsp");
        // dispatcher1.forward(req, resp);

// for (String key : allMap.keySet()) {
//     String[] strArr = (String[]) allMap.get(key);
//     for (String val : strArr) {

//         if (val instanceof String){
//             String n=val;
//             req.setAttribute("name", n);
//         RequestDispatcher dispatcher1 = req.getRequestDispatcher("in.jsp");
//         dispatcher1.include(req, resp);
//         }
//         // System.out.println(n);
//         // System.out.println("Str Array= " + val);
//         // req.setAttribute("name", val);
//         // RequestDispatcher dispatcher1 = req.getRequestDispatcher("in.jsp");
//         // dispatcher1.include(req, resp);
//     }
        // Iterator<String[]> itr = allMap.values().iterator();
        // System.out.println("enter loop");
		// while (itr.hasNext()) {
        //     System.out.println(itr.next());
        //     String[] e = itr.next();
        //     req.setAttribute("name", e); 
        //     RequestDispatcher dispatcher1 = req.getRequestDispatcher("in.jsp");
        //     dispatcher1.include(req, resp);
		// }

        
    

// req.setAttribute("name", val);
   


        // req.setAttribute("name", login);
        // RequestDispatcher dispatcher =req.getRequestDispatcher("index.jsp");
        // RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
       






        //// map
    //     Map<String, String[]> map = req.getParameterMap();
    //     PrintWriter pw = resp.getWriter();
    //     resp.setContentType("text/html");
    //    // Map m = req.getParameterMap();
    //     Set s = Map.entrySet();
    //     Iterator it = s.iterator();
    //     while (it.hasNext()) {
    //         Map.Entry<String, String[]> entry = (Map.Entry<String, String[]>) it.next();
    //         String key = entry.getKey();
    //         String[] value = entry.getValue();

    //         pw.print("key" + key + "value" + value);
    //         if (value.length > 1) {
    //             for (int i = 0; i < value.length; i++) {
    //                 pw.println("<li>" + value[i].toString() + "</li><br>");
    //             }
    //         } else
    //             pw.println("Value is " + value[0].toString() + "<br>");

    //         pw.println("-------------------<br>");

    //     }

        //////// map

        // req.getParameterMap()
       
    
