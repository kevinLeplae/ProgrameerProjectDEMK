/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrameerProjectDominion;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JdbcTemplate {
    /**
     * @throws java.sql.SQLException
     */
    public static void main(String[] args)throws SQLException {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded!");
 
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException("Driver niet gevonden, toevoegen via de properties");
        }
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("gebruikersnaam");
        dataSource.setPassword("gebruikerww");
        dataSource.setServerName("servernaam");
        dataSource.setDatabaseName("databasenaam");
        
        try{
           java.sql.Connection conn = dataSource.getConnection();
           System.out.println("We are connected");
           java.sql.Statement stmt = conn.createStatement();
           ResultSet rs = stmt.executeQuery("SELECT * FROM Fotos");
           rs.close();
           stmt.close();
           System.out.println("Yes we can"); 
        }
        catch(Exception ex) {
            System.out.println("HOUSTON, WE HAVE A PROBLEM:"+ ex.getMessage());
        }
    }
    
}