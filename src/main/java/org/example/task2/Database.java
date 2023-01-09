package org.example.task2;

import lombok.Data;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Database {
    private static Database database;
    private Connection connection;

    @SneakyThrows
    private Database(){
        connection = DriverManager.getConnection("jdbc:sqlite:db.sqlite3");
    }

    @SneakyThrows
    public void executeQuery(String query){
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(query);
        stmt.close();
    }

    @SneakyThrows
    public String searchQuery(String query){
        PreparedStatement p;
        ResultSet rs;
        p = connection.prepareStatement(query);
        rs = p.executeQuery();
        if(rs!=null){
            return rs.getString("gcsPath");
        }
        return null;
    }

    public static Database getInstance(){
        if(database==null){
            database = new Database();
        }
        return database;
    }
}
