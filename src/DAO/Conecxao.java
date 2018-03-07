package DAO;

import java.sql.*;
import javax.swing.*;

public class Conecxao {
    
    public static Connection AbrirConexao(){
    
        Connection con = null;
        
        try {
        
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/hotel";
            con = DriverManager.getConnection(url,"root","");
        
        }
        catch (Exception e) {
        
            JOptionPane.showMessageDialog(null, "Erro na Connexão Com o Banco de Dados",
                    "hotel", JOptionPane.ERROR_MESSAGE);
            e.getMessage();
            
        }
        return con;
        
    }
    
    public static void FecharConexao (Connection con){

        try {
            
            con.close();
        
        }
        catch (Exception e){
        
            JOptionPane.showMessageDialog(null,e.getMessage());
        
        }
        
    }
    
}

