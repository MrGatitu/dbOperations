package com.example.dbOperations;
import java.sql.*;

public class dbConnection {

    String url;
    String username;
    String password;
    Connection connection;

    public dbConnection(String url, String username, String password /*Connection connection*/){

        this.url= url;
        this.username =username;
        this.password = password;
        //this.connection = connection;

        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected");
        } catch (SQLException e) {
            System.out.println("Not Connected");
        }

    }

    public static void main(String[] args) {

        dbConnection makeConnection = new dbConnection("jdbc:postgresql://localhost:5432/postgres",
         "postgres","@");
 
    }


}
