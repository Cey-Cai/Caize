package Sql;

import java.sql.*;

public class SqlCon {
    String url = "jdbc:mysql://localhost:3306/library";
    String user = "root";
    String password = "Caiyong1600";
    Connection conn;

    public ResultSet SelectCon(String str) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(str);
            return rs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void InsertCon(String str) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            int rs = stmt.executeUpdate(str);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void UpdateCon(String str) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            int rs = stmt.executeUpdate(str);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void DeleteCon(String str) {

    }
    public ResultSet SelPrepare(String s) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            conn = DriverManager.getConnection(url, user, password);
            PreparedStatement statement = conn.prepareStatement(s);
            ResultSet resultSet = statement.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

}
