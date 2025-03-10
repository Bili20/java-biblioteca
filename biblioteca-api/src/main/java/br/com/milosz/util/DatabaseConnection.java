package br.com.milosz.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final Dotenv dotenv = Dotenv.load();

    private static final String URL = dotenv.get("URL_DB");
    private static final String USER = dotenv.get("DB_PG_USERNAME");
    private static final String PASSWORD = dotenv.get("DB_PG_PASSWORD");

    public static Connection getConnection(){
        try{
            return DriverManager.getConnection(URL, USER, PASSWORD)
        }catch(SQLException e){
            System.out.println("Erro ao conectar no banco: " + e.getMessage());
            return null;
        }
    }

}
