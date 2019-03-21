package controllers;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import models.LoginModel;
import org.apache.commons.codec.binary.Hex;


public class LoginController 
{
    private String usuario;
    private String clave;
    
    //constructores
    public LoginController() { }

    public LoginController(String usuario, String clave) 
    {
        this.usuario = usuario;
        this.clave = clave;
    }
    
    //geters y setters
    public String getUsuario() 
    {
        return usuario;
    }

    public void setUsuario(String usuario) 
    {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) 
    {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
            md.update(clave.concat("tv35").getBytes());
            byte[] mb1 = md.digest();
            char[] clavetomd5 = Hex.encodeHex(mb1);
            StringBuffer clavea = new StringBuffer();
            for(int i=0; i<clavetomd5.length;i++ )
            {
                clavea = clavea.append(clavetomd5[i]);
            }
            md = MessageDigest.getInstance("SHA-256");
            md.update(clavea.toString().getBytes());
            byte[] mb = md.digest();
            char[] clavetostring = Hex.encodeHex(mb);
            StringBuffer claveb = new StringBuffer(); 
            for(int i = 0; i < clavetostring.length; i++)
            {
                claveb = claveb.append(clavetostring[i]); 
            }
            this.clave=claveb.toString();
        } catch (NoSuchAlgorithmException ex) { }
                
    }
    
    public boolean loguearse()
    {
        LoginModel lm = new LoginModel();
        boolean log_in = false;
        try {
            log_in=lm.login(this.getUsuario(), this.getClave());
            
            if(log_in)
            {
               log_in = true;
            } else {
                log_in = false;
            }           
        } catch (SQLException ex) {
            System.out.println(ex.getSQLState());
        }
        
        return log_in;
    }
        
}
