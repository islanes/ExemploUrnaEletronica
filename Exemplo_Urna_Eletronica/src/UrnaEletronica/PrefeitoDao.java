package UrnaEletronica;

import java.sql.*;

/**
 * @author Islane dos S. Silva
 * @date   12/11/2016
 */
public class PrefeitoDao {
    
    public void insert (Votacao v){
        Connection con= null;
        PreparedStatement ps = null;
        
        try {
            
            
            String sql = "INSERT INTO Votacao (vereador, deputado, prefeito)VALUES (?,?,?)"; 
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/urna", "root", "senha");
            ps = con.prepareStatement(sql);
         
            
            ps.setString(1,v.getVereador());
            ps.setString(2, v.getDeputado());
            ps.setString(3, v.getPrefeito());
          
            ps.execute();
            
            System.out.println("Está tudo OK");
         
        } catch (Exception e) {
            System.out.println("Erro: "+e);
        }
        
         finally{    
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                //Logger.getLogger(ContatoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
               
        }
        
    
    }
}
