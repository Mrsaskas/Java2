package com.example.dbviewjavafx;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionDB {


    String namedatabase = "new_schema";
    String databaseUser = "root";
    String databasePassword = "1234567890";
    String url = "jdbc:mysql://localhost/" + namedatabase;


    public Connection fileconnection(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connectdata = DriverManager.getConnection(url,databaseUser,databasePassword);
            System.out.println("Succes");
            return connectdata;
        }
        catch (ClassNotFoundException ex){
            return null;



        } catch (SQLException e) {

            return null;
        }


    }











}