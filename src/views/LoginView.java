package views;

import com.placeholder.PlaceHolder;
import controllers.LoginController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.JOptionPane;


public class LoginView extends JFrame 
{
    //Atributos
    private JPanel contentImg, contentTag, contenedores[];
    private JLabel tagImg, tagUsuario, tagClave;
    private JTextField campoUsuario;
    private JPasswordField campoClave;
    private ImageIcon iconoLogin, iconoPaisaje;
    private JButton btnIngresar, btnRegistrar;
    private PlaceHolder placeHolder;
    private String usuario;
    private String clave;
    private int x,y,xx,yy;

        
    //Constructores
    public LoginView() 
    {       
        this.initComponent();
    }

    public LoginView(JPanel contentImg, JPanel contentTag, JPanel[] contenedores, JLabel tagImg, JLabel tagUsuario, JLabel tagClave, JTextField campoUsuario, JPasswordField campoClave, ImageIcon iconoLogin, ImageIcon iconoPaisaje, JButton btnIngresar, JButton btnRegistrar) 
    {
        this.contentImg = contentImg;
        this.contentTag = contentTag;
        this.contenedores = contenedores;
        this.tagImg = tagImg;
        this.tagUsuario = tagUsuario;
        this.tagClave = tagClave;
        this.campoUsuario = campoUsuario;
        this.campoClave = campoClave;
        this.iconoLogin = iconoLogin;
        this.iconoPaisaje = iconoPaisaje;
        this.btnIngresar = btnIngresar;
        this.btnRegistrar = btnRegistrar;
    }

    //metodos get y set
    private void initComponent() 
    {
        //Icono Frame
        this.iconoLogin = new ImageIcon(this.getClass().getResource("../img/iconLogin.png"));
        this.setIconoLogin(iconoLogin);
        this.iconoPaisaje = new ImageIcon(new ImageIcon(this.getClass().getResource("../img/meganFox1.jpg")).getImage().getScaledInstance(400, 200, 4));
        this.setIconoPaisaje(iconoPaisaje);
        //creacion de paneles del login
        this.contentImg = new JPanel();
        this.setContentImg(contentImg);
        
        this.contentTag = new JPanel();
        this.setContentTag(contentTag);

        this.contenedores = new JPanel[2];
        this.setContenedores(contenedores);
        // JFrame metodos
        this.setTitle("LOGIN");
        this.setIconImage(this.getIconoLogin().getImage());
        this.setSize(new Dimension(400, 430));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.getContentPane().add(this.getContenedores()[0]);
        this.getContentPane().add(this.getContenedores()[1]);
        this.setVisible(true);
    }

    public JPanel getContentImg() 
    {
        return contentImg;
    }

    public void setContentImg(JPanel contentImg) 
    {
        contentImg.setBounds(0, 0, 400, 200);
        contentImg.setLayout(null);
        contentImg.setBorder(BorderFactory.createLineBorder(Color.orange));
        this.tagImg = new JLabel();
        this.setTagImg(tagImg);
        contentImg.add(this.getTagImg());
        this.contentImg = contentImg;
    }

    public JPanel getContentTag() 
    {
        return contentTag;
    }

    public void setContentTag(JPanel contentTag) 
    {
        contentTag.setBounds(0, 200, 398, 190);
        contentTag.setLayout(null);
        contentTag.setBackground(Color.WHITE);
        contentTag.setBorder(BorderFactory.createLineBorder(Color.orange));
        //etiqueta usuario
        this.tagUsuario = new JLabel("Usuario:", SwingConstants.LEFT);
        this.setTagUsuario(tagUsuario);
        //campo usuario        
        this.campoUsuario = new JTextField();
        this.setCampoUsuario(campoUsuario);
        //etiqueta clave        
        this.tagClave = new JLabel("Clave:", SwingConstants.LEFT);
        this.setTagClave(tagClave);
        //campo clave
        this.campoClave = new JPasswordField();
        this.setCampoClave(campoClave);
        //boton Ingresar        
        this.btnIngresar = new JButton();
        this.setBtnIngresar(btnIngresar);
        //boton Registrar
        this.btnRegistrar = new JButton();
        this.setBtnRegistrar(btnRegistrar);
        //Agregar componentes antes mencionados        
        contentTag.add(this.getTagUsuario());
        contentTag.add(this.getCampoUsuario());
        contentTag.add(this.getTagClave());
        contentTag.add(this.getCampoClave());
        contentTag.add(this.getBtnIngresar());
        contentTag.add(this.getBtnRegistrar());
        this.contentTag = contentTag;
    }

    public JPanel[] getContenedores() 
    {
        return contenedores;
    }

    public void setContenedores(JPanel[] contenedores) 
    {
        contenedores[0] = this.getContentImg();
        contenedores[1] = this.getContentTag();
        this.contenedores = contenedores;
    }

    public JLabel getTagImg() 
    {
        return tagImg;
    }

    public void setTagImg(JLabel tagImg) 
    {
        tagImg.setBounds(0, 0, 400, 200);
        tagImg.setIcon(this.getIconoPaisaje());
    }

    public JLabel getTagUsuario() 
    {
        return tagUsuario;
    }

    public void setTagUsuario(JLabel tagUsuario) 
    {
        tagUsuario.setBounds(80, 20, 100, 15);
        tagUsuario.setOpaque(true);
        tagUsuario.setIcon(new ImageIcon(new ImageIcon(this.getClass().getResource("../img/user_id.png")).getImage().getScaledInstance(25, 25, 4)));
        tagUsuario.setBackground(Color.WHITE);
        tagUsuario.setFont(new Font("Arial", Font.BOLD, 14));
        this.tagUsuario = tagUsuario;
    }

    public JLabel getTagClave() 
    {
        return tagClave;
    }

    public void setTagClave(JLabel tagClave) 
    {
        tagClave.setBounds(80, 70, 100, 15);
        tagClave.setOpaque(true);
        tagClave.setIcon(new ImageIcon(new ImageIcon(this.getClass().getResource("../img/candado.png")).getImage().getScaledInstance(15, 15, 4)));
        tagClave.setBackground(Color.WHITE);
        tagClave.setFont(new Font("Arial", Font.BOLD, 14));
        this.tagClave = tagClave;
    }

    public JTextField getCampoUsuario() 
    {
        return campoUsuario;
    }

    public void setCampoUsuario(JTextField campoUsuario) 
    {
        campoUsuario.setBounds(80, 40, 230, 20);
        campoUsuario.setFont(new Font("Arial", Font.PLAIN, 14));
        this.placeHolder = new PlaceHolder(this.getCampoUsuario(),"  Ingrese su usuario");
        this.campoUsuario = campoUsuario;
    }

    public JPasswordField getCampoClave() 
    {
        return campoClave;
    }

    public void setCampoClave(JPasswordField campoClave) 
    {
        campoClave.setBounds(80, 90, 230, 20);
        campoClave.setFont(new Font("Arial", Font.PLAIN, 14));
        this.campoClave = campoClave;
    }

    public ImageIcon getIconoLogin() 
    {
        return iconoLogin;
    }

    public void setIconoLogin(ImageIcon iconoLogin) 
    {
        this.iconoLogin = iconoLogin;
    }

    public ImageIcon getIconoPaisaje() 
    {
        return iconoPaisaje;
    }

    public void setIconoPaisaje(ImageIcon iconoPaisaje) 
    {
        this.iconoPaisaje = iconoPaisaje;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
            Pattern p = Pattern.compile("^[A-Z0-9ÑÁÉÍÓÚ_-]{3,30}");
            Matcher m = p.matcher(usuario.toUpperCase());
            if(m.matches()){
               this.usuario = usuario;
            }else{
                this.usuario = "ERROR";
            }
               
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        Pattern p = Pattern.compile("[\\w-]{8,8}");
            Matcher m = p.matcher(clave.toUpperCase());
            if(m.matches()){
               this.clave = clave;
            }else{
                this.clave = "ERROR";
            }         
    }
    
    public JButton getBtnIngresar() 
    {
        return btnIngresar;
    }

    public void setBtnIngresar(JButton btnIngresar) 
    {
        btnIngresar.setBounds(80, 125, 110, 25);
        btnIngresar.setText("Ingresar");
        btnIngresar.setFont(new Font("Arial",Font.BOLD,12));
        ImageIcon btnIC = new ImageIcon(this.getClass().getResource("../img/iconEntrar.png"));
        btnIngresar.setIcon(new ImageIcon(btnIC.getImage().getScaledInstance(15, 15, 4)));
        btnIngresar.addActionListener((ActionEvent e) -> {
            if(e.getSource()==btnIngresar){
                if(getCampoUsuario().getText().equals("  Ingrese su usuario"))
                {
                    JOptionPane.showMessageDialog(rootPane, "El campo Usuario se encuentra vacio.","[ERROR]", JOptionPane.ERROR_MESSAGE);
                } else if(String.valueOf(getCampoClave().getPassword()).equals("") || String.valueOf(getCampoClave().getPassword()) == null ) 
                {
                    JOptionPane.showMessageDialog(rootPane, "El campo Clave se encuentra vacio.","[ERROR]", JOptionPane.ERROR_MESSAGE);
                } else {
                    
                    setUsuario(getCampoUsuario().getText().toUpperCase());
                    
                    setClave(String.valueOf(getCampoClave().getPassword()));
                           
                    if(this.getUsuario().equals("ERROR") || this.getClave().equals("ERROR"))
                    {
                        JOptionPane.showMessageDialog(rootPane, "Por favor, ingrese un usuario o un email valido.", "[ERROR]", JOptionPane.ERROR_MESSAGE);
                    } else {
                        System.out.println("Usuario: "+this.getUsuario());
                        System.out.println("Clave: "+this.getClave());
                        LoginController lc = new LoginController(this.getUsuario(),this.getClave());
                        lc.setClave(this.getClave());
                        if(lc.loguearse()){
                            JOptionPane.showMessageDialog(rootPane, "El usuario y clave son correctos.", "[EXITO]", JOptionPane.INFORMATION_MESSAGE,
                            new ImageIcon(new ImageIcon(this.getClass().getResource("../img/candado.png")).getImage().getScaledInstance(32, 32, 4)));
                            this.setVisible(false);
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "El usuario o clave son erroneos.", "[ERROR]", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    
                }
                
            }
        });
        
        this.btnIngresar = btnIngresar;
    
    }

    public JButton getBtnRegistrar() 
    {
        return btnRegistrar;
    }

    public void setBtnRegistrar(JButton btnRegistrar) 
    {
        btnRegistrar.setBounds(200, 125, 110, 25);
        btnRegistrar.setText("Registrar");
        btnRegistrar.setFont(new Font("Arial",Font.BOLD,12));
        ImageIcon btnIC = new ImageIcon(this.getClass().getResource("../img/registroUser.png"));
        btnRegistrar.setIcon(new ImageIcon(btnIC.getImage().getScaledInstance(15, 15, 4)));
        btnRegistrar.addActionListener((ActionEvent e)-> {
            if(e.getSource()==btnRegistrar)
            {
                this.setVisible(false);
                this.dispose();
                this.repaint();
                RegisterView rv = RegisterView.getInstance();                
            }
        
        });
                
        this.btnRegistrar = btnRegistrar;     
    }   
    
     public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getXx() {
        return xx;
    }

    public void setXx(int xx) {
        this.xx = xx;
    }

    public int getYy() {
        return yy;
    }

    public void setYy(int yy) {
        this.yy = yy;
    }
           
}
