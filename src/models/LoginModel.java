package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class LoginModel 
{
    private Statement st;    
    private ResultSet rs;
         
    public LoginModel() {
        
    }
    
    public LoginModel(Statement st, ResultSet rs)
    {
        this.st = st;
        this.rs = rs;        
    }
    
    public boolean login(String usuario, String clave) throws SQLException
    {
        PreparedStatement ps = null;
        boolean data = false;
        try{
            ps = ConexionPostgres.conectar().prepareStatement("SELECT * FROM usuario WHERE nombre=? AND clave=?;");
            ps.setString(1, usuario);
            ps.setString(2, clave);
            this.rs = ps.executeQuery();
            while(this.rs.next())
            {
                int user_id = rs.getInt("id");
                String user_nombre = rs.getString("nombre");
				String user_apellido = rs.getString("apellido");
                data = (this.rs.getRow()!=0) ? true : false;
            }
                       
        } catch (SQLException e){
            System.out.println(e.getSQLState());
        } finally {
            ps.close();
            ConexionPostgres.conectar().close();
            System.out.println("DB Closing");
        }       
        return data;
    }
}
