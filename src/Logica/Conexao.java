/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Leandro Marques
 */
public class Conexao {
    
    
    
    
    
    
    
    
    
    
    
    
    
   public String db="bancoreserva";
   public String url="jdbc:mysql://192.168.0.31/" +db;
   public String user="leandro";
   public String pass="leandro";
   
   
   public Conexao() {
       
   }
   
   public Connection conectar() {
       Connection link = null;
       
       try {
           
           Class.forName("org.gjt.mm.mysql.Driver");
           link = DriverManager.getConnection(this.url, this.user, this.pass);
       } catch (ClassNotFoundException | SQLException e) {
           JOptionPane.showConfirmDialog(null, e);
       }
       return link;
   }
    
}
