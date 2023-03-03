/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conectionBD;

/**
 *
 * @author engenheiro
 */
public class Conection {
    public void updateTables(String qry){
        try{
            Class.forName("org.postgresql.Driver");
            Connection con;
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/NOMEDOBANCO", "NOMEUSUARIO", "SENHA");
            Statement stm = con.createStatement();
        } catch(Exception e) {
        }
}
