/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author edmae
 */
public class DBTables {
    private static String EMPLOYEE = "CREATE TABLE IF NOT EXISTS EMPLOYEE (" 
                                   + "   ID INTEGER UNSIGNED NOT NULL AUTO_INCREMENT, "
                                   + "   FNAME VARCHAR(40) NOT NULL,"
                                   + "   LNAME VARCHAR(40) NOT NULL,"
                                   + "   SEX VARCHAR(5) NOT NULL,"
                                   + "   WITHDRAWAL INTEGER NOT NULL,"
                                   + "   PASSWORD VARCHAR(40),"
                                   + "   PRIMARY KEY (ID) )";
    
    private static String LOGS = "CREATE TABLE IF NOT EXISTS LOGS(" 
                                   + "   ID INTEGER UNSIGNED NOT NULL AUTO_INCREMENT, "
                                   + "   DATE VARCHAR(40) NOT NULL,"
                                   + "   HEURE VARCHAR(40) NOT NULL,"
                                   + "   INFORMATION VARCHAR(800) NOT NULL,"
                                   + "   PRIMARY KEY (ID) )";
    
    
    private static String PETTYCASH = "CREATE TABLE IF NOT EXISTS PETTYCASH(" 
                                   + "   ID INTEGER UNSIGNED NOT NULL AUTO_INCREMENT, "
                                   + "   DATE VARCHAR(40) NOT NULL,"
                                   + "   DEBIT INTEGER NOT NULL,"
                                   + "   CREDIT INTEGER NOT NULL,"
                                   + "   PRIMARY KEY (ID) )";
    
    private static String TRANSACTIONS = "CREATE TABLE IF NOT EXISTS TRANSACTIONS(" 
                                   + "   ID INTEGER UNSIGNED NOT NULL AUTO_INCREMENT, "
                                   + "   DATE VARCHAR(40) NOT NULL,"
                                   + "   FNAME VARCHAR(40) NOT NULL,"
                                   + "   LNAME VARCHAR(5) NOT NULL,"
                                   + "   WITHDRAWAL INTEGER NOT NULL,"
                                   + "   HEURE VARCHAR(40),"
                                   + "   PRIMARY KEY (ID) )";
    
    
    public DBTables(Statement stmt) throws SQLException{
        createTable(stmt,EMPLOYEE);
        createTable(stmt,LOGS);
        createTable(stmt,PETTYCASH);
        createTable(stmt,TRANSACTIONS);
        
    }
    
    private void createTable(Statement stmt, String sql) throws SQLException{
        try {
            System.out.println(stmt.executeUpdate(sql));
        }catch (SQLException e) {
            if(!e.getSQLState().equals("X0Y32")) {
                throw e;
            }
        } 
    }
    
}
