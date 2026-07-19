package sql;

import java.sql.*;

public class SqlDemo {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/practice";
        String username = "root";
        String password = "rebi@0206";

        Connection con = DriverManager.getConnection(url,username,password);

        System.out.println("Connection Established...");

        Statement st = con.createStatement();

        String q1 = "Select * from emp";

        ResultSet rs = st.executeQuery(q1);

        //rs.next(); // Skip the header

//        System.out.println(rs.getInt("emp_id") + " " + rs.getString("ename") + " " + rs.getString("job") + " " + rs.getInt("salary"));

        while(rs.next()){
            System.out.println(
                    rs.getInt(1) + " " +
                            rs.getString(2) + " " +
                            rs.getString(3) + " " +
                            rs.getInt(4)
            );
        }

        con.close();

    }
}