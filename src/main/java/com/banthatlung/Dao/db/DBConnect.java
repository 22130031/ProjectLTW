package com.banthatlung.Dao.db;

import java.sql.*;

public class DBConnect {
    public Connection getConnection() throws SQLException {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/webthatlung", "root", "");
    }
//    public static void main(String arg[]) throws SQLException, ClassNotFoundException {
//         DBConnect db = new DBConnect();
//            Connection connection = db.getConnection();
//
//            PreparedStatement statement = connection.prepareStatement("select * from categories where id =1");
//            ResultSet resultSet = statement.executeQuery();
//
//            int code;
//            String title;
//            while (resultSet.next()) {
//                code = resultSet.getInt("id");
//                title = resultSet.getString("name").trim();
//                System.out.println("Code : " + code
//                        + " Title : " + title);
//            }
//            resultSet.close();
//            statement.close();
//            connection.close();
//
//    } // function ends
}
