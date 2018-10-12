/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.*;


public class Bdd {
    private static Connection connection;
    Statement statement;
    String sql;
    String url;
    String username;
    String password;
    String host;
    public static boolean ISCONNECT = true;
    private ConnectorMXJObjectTestExample mConnectorMXJObjectTestExample;
    
    public Bdd(){
        try{
            if(Bdd.ISCONNECT){
                mConnectorMXJObjectTestExample = new ConnectorMXJObjectTestExample();
                Bdd.connection = ConnectorMXJObjectTestExample.mConnection;
                System.out.println("Connected");
                System.out.println(Bdd.connection);
                new DBTables(connection.createStatement());
                Bdd.ISCONNECT = false;
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        
    }
    
    public Connection connexionDataBase(){
        
        return Bdd.connection;
    }
    
    public Connection closeConnection(){
        try{
            mConnectorMXJObjectTestExample.getMysqldResource().shutdown();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        return Bdd.connection;
    }
    
    public ResultSet executeQuery(String sql){
        connexionDataBase();
        ResultSet resultset = null;
        try{
            statement = Bdd.connection.createStatement();
            resultset = statement.executeQuery(sql);
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
        return resultset;
    }
    
    public String executeUpdate(String sql){
        connexionDataBase();
        String result = "";
        try{
            statement = Bdd.connection.createStatement();
            statement.executeQuery(sql);
            result = sql;
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
        return result;
    }
    
    public ResultSet querySelectAll(String table){
        connexionDataBase();
        sql = "SELECT * FROM " + table;
        System.out.println(sql);
        return this.executeQuery(sql);
    }
    
    public ResultSet querySelectAll(String table, String etat){
        connexionDataBase();
        sql = "SELECT * FROM " + table + " WHERE " +etat;
        System.out.println(sql);
        return this.executeQuery(sql);
    }
    
    public ResultSet querySelectAllMinID(String table, String etat){
        connexionDataBase();
        sql = "SELECT * FROM " + table + " WHERE " +etat+" ORDER BY id_transaction DESC";
        System.out.println(sql);
        return this.executeQuery(sql);
    }
    
    public ResultSet querySelectAuthentication(String table, String etat){
        connexionDataBase();
        sql = "SELECT *, SUM( id_authentification  ) FROM " + table + " WHERE " +etat;
        System.out.println(sql);
        return this.executeQuery(sql);
    }
    
    public ResultSet querySelectStock(String table, String etat){
        connexionDataBase();
        sql = "SELECT *, SUM( quantite_tot_stock ) AS Sum_quantite_tot_stock, MONTH( date_entry_stock ) AS monthStock, "
              + "YEAR( date_entry_stock ) AS yearStock FROM " + table + " WHERE " +etat;
        System.out.println(sql);
        return this.executeQuery(sql);
    }
    
        public ResultSet querySelectRapportOrder(String table){
        connexionDataBase();
        sql = "SELECT * FROM " + table + " GROUP BY medicament_rapport ORDER BY id_rapport DESC";
        System.out.println(sql);
        return this.executeQuery(sql);
    }
    
    public ResultSet querySelectLeftJoinRapport(String table, String etat){
        connexionDataBase();
        sql = "SELECT *, SUM(quantite_transaction) AS Sum_quantite_transaction FROM " + table + " LEFT JOIN "
        + "transaction_tbl AS T ON stock.code_stock = T.code_transaction "
        + "LEFT JOIN rapport AS R ON stock.code_stock = R.code_rapport WHERE " + etat + " GROUP BY "+ table +".medicament_stock ";
        System.out.println(sql);
        return this.executeQuery(sql);
    }
    
    public ResultSet querySelectTransaction(String table, String etat){
        connexionDataBase();
        sql = "SELECT *, SUM( quantite_transaction ) AS Sum_quantite_transaction  FROM " + table + " WHERE " +etat;
        System.out.println(sql);
        return this.executeQuery(sql);
    }
    
    public ResultSet querySelectTransactionPeriode(String table, String etat){
        connexionDataBase();
        sql = "SELECT * FROM " + table + " WHERE " + etat + " GROUP BY medicament_transaction";
        System.out.println(sql);
        return this.executeQuery(sql);
    }
    
    public ResultSet querySelectParttion(String table, String partition){
        connexionDataBase();
        sql = "SELECT " + partition + " FROM " + table;
        System.out.println(sql);
        return this.executeQuery(sql);
    }
    
    public String queryInsert(String monTable, String contenuTableau[]) {
    connexionDataBase();
    int i;
    
    sql = "INSERT INTO " + monTable + " VALUES(";
    for(i = 0; i <= contenuTableau.length-1; i++){
    sql += contenuTableau[i];
    if(i < contenuTableau.length-1){
    sql += ",";
    }
    }
    sql +=")";
    return this.exécutionUpdate(sql);    
    }
    
    public String queryInsert(String monTable, String[] columnName, String contenuTableau[]) {
    connexionDataBase();
    int i;
    
    sql = "INSERT INTO " + monTable + "(";
    for(i = 0; i <= columnName.length-1; i++){
        sql += columnName[i];
        if(i < columnName.length-1){
            sql += ",";
        }
    }
    sql += ") VALUES(";
    
    for(i = 0; i <= contenuTableau.length-1; i++){
        sql += "'" + contenuTableau[i] + "'";
        if(i < contenuTableau.length-1){
            sql += ",";
        }
    }
     sql += ")";
    
    return this.exécutionUpdate(sql);    
    }
    
    
    private String exécutionUpdate(String sql) {
    connexionDataBase();
    String result = "";
    try{
        statement = Bdd.connection.createStatement();
        statement.executeUpdate(sql);
        result = sql;
    }catch(Exception ex){
        result = ex.toString();
    }
   return result;
    
    }
    
    public String queryUpdate(String monTable, String [] nameColumn, String [] contenuTable, String etat){
        connexionDataBase();
        int i;
        sql = "UPDATE " + monTable + " SET ";
        for(i = 0; i <= nameColumn.length-1; i++){
            sql += nameColumn[i] + "='" + contenuTable[i] + "'";
            if(i < nameColumn.length-1){
                sql += ",";
            }
        }
        sql +=" WHERE " + etat;
        return this.exécutionUpdate(sql);    
    }
    
    public String queryDeleteRow(String table, String etat){
        sql = "DELETE FROM " + table + " WHERE "+etat;
        return this.exécutionUpdate(sql);
    }

    public boolean queryDelete(String category, String[] tbl, String[] tbl_nom) {
        
        return true;
    }

}