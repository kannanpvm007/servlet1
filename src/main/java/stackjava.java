import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.fabric.xmlrpc.base.Value;
// import com.mysql.jdbc.PreparedStatement;

/**
 * stackjava
 */
public class stackjava extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // super.doPost(req, resp);

        try {
            String creat = " CREATE TABLE IF NOT EXISTS Teade(TradeID INTEGER (15),ucccode VARCHAR(12),scrip VARCHAR(10),tradedate  VARCHAR(15),tradetype CHAR(1), quantity INTEGER (8),price INTEGER (8))  ";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock", "root", "");
            Statement st = con.createStatement();
            boolean rs = st.execute(creat);
            System.out.println("table create");

            String TradeIDi = req.getParameter("tradeid");

            String ucccode = req.getParameter("ucccode");
            String scrip = req.getParameter("scrip");
            String tradedated = req.getParameter("tradedate");
            String tradetypeC = req.getParameter("tradetype");
            String quantityI = req.getParameter("quantity");
            String priceI = req.getParameter("price");
            // convation

            int TradeID = Integer.parseInt(TradeIDi);
            System.out.println(TradeID);
            // Date tradedate= (Date) new SimpleDateFormat("dd-MM-yyyy").parse(tradedated);
            // Date tradedate =new SimpleDateFormat("dd/mm/yyy").parse(tradedated);
            char tradetype = tradetypeC.charAt(0);
            int quantity = Integer.parseInt(quantityI);
            int price = Integer.parseInt(priceI);

            /*
            System.out.println(TradeID + "," + ucccode + "," + scrip + "," + tradedated + "," + tradetype + ","
                    + quantity + "," + price);



                    String ins="INSERT INTO Teade( TradeID ,  ucccode ,  scrip ,  tradedate ,  tradetype ,  quantity ,  price ) "+"Value(?,?,?,?,?,?,?)";


                    Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","" );
                     //Statement st= con.createStatement();
                     //boolean rs=st.execute(ins);
                     PreparedStatement ps= con3.prepareStatement(ins);
            
                     ps.setInt(1, TradeID);
                     ps.setString(2, ucccode);
                     ps.setString(3, scrip);
                     ps.setString(4, tradedated);
                     //ps.setString(1,c+" "));
                     ps.setString(5, (Character)tradetype);
                    
                     ps.setInt(6, quantity);
                     ps.setInt(7, price);
                     ps.executeUpdate();
                    
                     
                     System.out.println("table INSERTed ");
                     */





                    //String in1= "INSERT INTO  teams (  TradeID  ,ucccode  ,   scrip  ,   tradedate  ,   tradetype  ,   quantity  ,   price  ) VALUES   (TradeID + "," + ucccode + "," + scrip + "," + "," + tradedated + "," + tradetype + "," + quantity + "," + price + "," + quantity + "," + price )";
                    String insertQuery = "INSERT INTO Teade(TradeID, Ucccode, Scrip, tradedate, tradetype, quantity, price) VALUES ("
                    + TradeID + ",'" + ucccode + "'" + ",'" + scrip + "'" + ",'" + tradedated + "'" + ",'" + tradetype + "',"
                    + quantity + "," + price + ")";

            String creat1 = "INSERT INTO `teams`(`TradeID`, `ucccode`, `scrip`, `tradedate`, `tradetype`, `quantity`, `price`) VALUES ([value-1],[value-2],[value-3],[value-4],[value-5],[value-6],[value-7])  ";
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock", "root", "");
            Statement st1 = con1.createStatement();

            boolean rs1 = st1.execute(insertQuery);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public static void INSERT() throws SQLException {
        

    }

    
}