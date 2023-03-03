
package com.mycompany.conectionBD;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class Conection {
  public static void main(String[] args) {
    // strings de conexão
    String databaseURL = "jdbc:postgresql://localhost/SysLib";
    String usuario = "postgres";
    String senha = "1234";
    String driverName = "org.postgresql.Driver";
     
    try {
      Class.forName(driverName).newInstance();
      Connection conn = DriverManager.getConnection(databaseURL, usuario, senha);
      System.out.println("Conexão obtida com sucesso.");
    }
    catch (SQLException ex) {
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("VendorError: " + ex.getErrorCode());
    }
    catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
    }      
  }
}