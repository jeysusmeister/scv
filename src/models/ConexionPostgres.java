package models;

import java.sql.*;
import javax.swing.JOptionPane;
import org.postgresql.util.PSQLException;


public class ConexionPostgres 
{
    private final static String DB;
    private final static String URL;
    private final static String USER;
    private final static String PASS;
    private static Connection link;
    
    public ConexionPostgres(){}
    
    public static Connection conectar()
    {        
        Connection link = null;
        try {
            Class.forName("org.postgresql.Driver");
            link = DriverManager.getConnection(URL + DB, USER, PASS);
        } catch (SQLException e) {
        }
        System.out.println("Opened database successfully");
        return link;
    
    }
    
    static
    {
        DB = "login";
        URL = "jdbc:postgresql://127.0.0.1:5432/";
        USER = "postgres";
        PASS = "503503";
    }
}
