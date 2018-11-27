package main.java.resources.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private Connection databaseConnection;

    public Database(String name){
        this.databaseConnection = connectDatabase(name);

        String sql = "CREATE TABLE IF NOT EXISTS movies (movie_id TEXT, name TEXT NOT NULL, description TEXT NOT NULL, " +
                "releaseDate TEXT NOT NULL, path TEXT NOT NULL, image TEXT );";
        try{
            Connection conn = getDatabaseConnection();
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            stmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private Connection connectDatabase(String name){
        String url = "jdbc:sqlite:" + name;
        try {
            Connection conn = DriverManager.getConnection(url);
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
                return conn;
            }
            else return null;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Connection getDatabaseConnection(){
        return this.databaseConnection;
    }

    public boolean doesExist(Connection conn, Movie movie){

        return true;
    }

}
