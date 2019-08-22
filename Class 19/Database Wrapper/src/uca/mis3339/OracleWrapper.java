package uca.mis3339;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleWrapper {
    private static PreparedStatement stmt;
    private static Connection conn;
        static {
            try {
            	Class.forName("oracle.jdbc.OracleDriver");
            	conn = DriverManager.getConnection("jdbc:oracle:thin:@161.31.3.67:1521:xe","MIS3339","MIS3339");
            	conn.setAutoCommit(true);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } // end catch
        } // end static
        
    public static void updateDB() throws SQLException {
        try {
            stmt.execute();
        } catch (Exception e) {
            throw e;
        } // end catch
    } // end method queryDB
    
    public static ResultSet queryDB() throws SQLException {
        try {
            ResultSet rs = stmt.executeQuery();
            return rs;
        } catch (Exception e) {
            throw e;
        } // end catch
    } // end method queryDB

    public static void prepareStatement(String incSQL, Object... values) throws SQLException {
        stmt = conn.prepareStatement(incSQL);
        for (int i = 0; i < values.length; i++) {
            stmt.setObject(i + 1, values[i]);
        } // end for
    } // end prepareStatement
} // end OracleWrapper