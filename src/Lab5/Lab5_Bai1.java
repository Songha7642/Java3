package Lab5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Lab5_Bai1 {
    private static String userName = "root";
    private static String pass = "Ha766442.";
    private static String url = "jdbc:mysql://localhost:3306/qlsv";

    public static void main(String[] args) {
        try {
            Connection conn = getConnection(url, userName, pass);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM qlsv.SinhVien;");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getInt(2) + " " + rs.getInt(3));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(String url, String userName, String pass) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, pass);
            System.out.println("Connect successfully");
        } catch (Exception e) {
            System.err.println("KHONG KET NOI DUOC");
            e.printStackTrace();
        }
        return conn;
    }


}