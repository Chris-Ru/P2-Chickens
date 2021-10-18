package com.example.sping_portfolio.functions;

//imports
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class database {

    public static void main(String[] args) throws SQLException {
        String jdbcURL = "jdbc:sqlite:/newsrating.db";
        Connection connection = DriverManager.getConnection(jdbcURL);

        //create table
        String sql = "create table users (id varchar(4), username varchar(15), password varchar(20))";
        Statement statement = connection.createStatement();
        statement.execute(sql);

        System.out.println("Table Created");
    }

}
