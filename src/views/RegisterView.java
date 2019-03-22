package views;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;


public class RegisterView extends JFrame
{
    private static RegisterView _instance; 
    private JPanel contentPrincipal, contentSexo, contents[];
    private JLabel tagNombre, tagApellido, tagCedula, tagEmail, tagSexoM, tagSexoF, tagFechaNac, tagFechaIng, tagTelefono, tagMovil, tagNickname, tagClave;
    private JTextField fieldNombre, fieldApellido, fieldCedula, fieldEmail, fieldFechaNac, fieldFechaIng, fieldTelfono, fieldMovil, fieldNickname, fieldClave;
    private JRadioButton rdSexo;
    private JButton btnGuardar, btnLimpiar;

    private RegisterView()
    {
        _instance=null;
        this.initComponent();
    }
        
    public static RegisterView getInstance()
    {
        if(_instance==null){
            _instance = new RegisterView();
        }
        return _instance;
    }
    
    private void initComponent()
    {
        //Contenedor Principal
        this.contentPrincipal = new JPanel();
        this.setContentPrincipal(contentPrincipal);
        
        //Contenedor Sexo
        this.contentSexo = new JPanel();
        this.setContentSexo(contentSexo);
        
        //Contenedores
        this.contents = new JPanel[2];
        this.setContents(contents);
        
        //etiquetas del proyecto
                
        
        
        
        
        this.tagEmail = new JLabel();
        this.setTagEmail(tagEmail);
        
        this.tagSexoM = new JLabel("Masculino: ", SwingConstants.LEFT);
        this.setTagSexoM(tagSexoM);
        
        this.tagSexoF = new JLabel("Femenino: ", SwingConstants.LEFT);
        this.setTagSexoF(tagSexoF);
        
        this.tagFechaNac = new JLabel();
        this.setTagFechaNac(tagFechaNac);
        
        this.tagFechaIng = new JLabel();
        this.setTagFechaIng(tagFechaNac);
        
        this.tagTelefono = new JLabel();
        this.setTagTelefono(tagTelefono);
        
        this.tagMovil = new JLabel();
        this.setTagMovil(tagMovil);
        
        this.tagNickname = new JLabel();
        this.setTagNickname(tagNickname);
        
        this.tagClave = new JLabel();
        this.setTagClave(tagClave);
                
        //componentes JFrame
        this.setIconImage(new ImageIcon(this.getClass().getResource("../img/register_icon.png")).getImage());
        this.setTitle("REGISTRO DE USUARIO");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,600);
        this.setLayout(null);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.ORANGE);
        this.getContentPane().add(this.getContentPrincipal());
        this.getContentPane().add(this.getContents()[1]);
        this.setVisible(true);
    }
    
    public JPanel getContentPrincipal() {
        return contentPrincipal;
    }

    public void setContentPrincipal(JPanel contentPrincipal) 
    {
        contentPrincipal.setBounds(0,0,500,600);
        contentPrincipal.setLayout(null);
        contentPrincipal.setBackground(Color.WHITE);
        contentPrincipal.setOpaque(true);
        
        this.tagNombre = new JLabel("Nombre: ", SwingConstants.LEFT);
        this.setTagNombre(tagNombre);
        
        this.tagApellido = new JLabel("Apellido: ",SwingConstants.LEFT);
        this.setTagApellido(tagApellido);
        
        this.tagCedula = new JLabel("Cédula: ",SwingConstants.LEFT);
        this.setTagCedula(tagCedula);
        
        this.tagEmail = new JLabel("Email: ",SwingConstants.LEFT);
        this.setTagEmail(tagEmail);
        
        this.contentSexo = new JPanel();
        this.setContentSexo(contentSexo);
        
        //Agregar elementos al panel
        
        contentPrincipal.add(this.getTagNombre());
        contentPrincipal.add(this.getTagApellido());
        contentPrincipal.add(this.getTagCedula());
        contentPrincipal.add(this.getTagEmail());
        contentPrincipal.add(this.getContentSexo());
        this.contentPrincipal = contentPrincipal;
    }

    public JPanel getContentSexo() {
        return contentSexo;
    }

    public void setContentSexo(JPanel contentSexo) {
        contentSexo.setBounds(95,180,270,50);
        contentSexo.setLayout(null);
        contentSexo.setBackground(Color.WHITE);
        TitledBorder tb = BorderFactory.createTitledBorder("Sexo");
        tb.setTitleJustification(TitledBorder.CENTER);
        tb.setTitleFont(new Font("Arial", Font.BOLD, 14));
        contentSexo.setBorder(tb);
             
        
        this.contentSexo = contentSexo;
    }

    public JPanel[] getContents() {
        return contents;
    }

    public void setContents(JPanel[] contents) 
    {
        contents[0]=this.getContentPrincipal();
        contents[1]=this.getContentSexo();
        this.contents = contents;
    }

    public JLabel getTagNombre() {
        return tagNombre;
    }

    public void setTagNombre(JLabel tagNombre) 
    {
        tagNombre.setBounds(100,40,65,15);
        tagNombre.setFont(new Font("Arial", Font.BOLD, 14));
        tagNombre.setForeground(Color.DARK_GRAY);
        tagNombre.setLayout(null);
        this.tagNombre = tagNombre;
    }

    public JLabel getTagApellido() {
        return tagApellido;
    }

    public void setTagApellido(JLabel tagApellido) 
    {
        tagApellido.setBounds(300,40,65,15);
        tagApellido.setFont(new Font("Arial", Font.BOLD, 14));
        tagApellido.setForeground(Color.DARK_GRAY);
        tagApellido.setLayout(null);
        this.tagApellido = tagApellido;
    }

    public JLabel getTagCedula() {
        return tagCedula;
    }

    public void setTagCedula(JLabel tagCedula) {
        tagCedula.setBounds(100,100,65,15);
        tagCedula.setFont(new Font("Arial", Font.BOLD, 14));
        tagCedula.setForeground(Color.DARK_GRAY);
        tagCedula.setLayout(null);
        this.tagCedula = tagCedula;
    }

    public JLabel getTagEmail() {
        return tagEmail;
    }

    public void setTagEmail(JLabel tagEmail) 
    {
        tagEmail.setBounds(300,100,65,15);
        tagEmail.setFont(new Font("Arial", Font.BOLD, 14));
        tagEmail.setForeground(Color.DARK_GRAY);
        tagEmail.setLayout(null);
        this.tagEmail = tagEmail;
    }

    public JLabel getTagSexoM() {
        return tagSexoM;
    }

    public void setTagSexoM(JLabel tagSexoM) {
        
        
        this.tagSexoM = tagSexoM;
    }
    
    public JLabel getTagSexoF() {
        return tagSexoF;
    }

    public void setTagSexoF(JLabel tagSexoF) 
    {
        this.tagSexoM = tagSexoF;
    }

    public JLabel getTagFechaNac() {
        return tagFechaNac;
    }

    public void setTagFechaNac(JLabel tagFechaNac) {
        this.tagFechaNac = tagFechaNac;
    }

    public JLabel getTagFechaIng() {
        return tagFechaIng;
    }

    public void setTagFechaIng(JLabel tagFechaIng) {
        this.tagFechaIng = tagFechaIng;
    }

    public JLabel getTagTelfono() {
        return tagTelefono;
    }

    public void setTagTelefono(JLabel tagTelefono) {
        this.tagTelefono = tagTelefono;
    }

    public JLabel getTagMovil() {
        return tagMovil;
    }

    public void setTagMovil(JLabel tagMovil) {
        this.tagMovil = tagMovil;
    }

    public JLabel getTagNickname() {
        return tagNickname;
    }

    public void setTagNickname(JLabel tagNickname) {
        this.tagNickname = tagNickname;
    }

    public JLabel getTagClave() {
        return tagClave;
    }

    public void setTagClave(JLabel tagClave) {
        this.tagClave = tagClave;
    }

    public JTextField getFieldNombre() {
        return fieldNombre;
    }

    public void setFieldNombre(JTextField fieldNombre) {
        this.fieldNombre = fieldNombre;
    }

    public JTextField getFieldApellido() {
        return fieldApellido;
    }

    public void setFieldApellido(JTextField fieldApellido) {
        this.fieldApellido = fieldApellido;
    }

    public JTextField getFieldCedula() {
        return fieldCedula;
    }

    public void setFieldCedula(JTextField fieldCedula) {
        this.fieldCedula = fieldCedula;
    }

    public JTextField getFieldEmail() {
        return fieldEmail;
    }

    public void setFieldEmail(JTextField fieldEmail) {
        this.fieldEmail = fieldEmail;
    }

    public JTextField getFieldFechaNac() {
        return fieldFechaNac;
    }

    public void setFieldFechaNac(JTextField fieldFechaNac) {
        this.fieldFechaNac = fieldFechaNac;
    }

    public JTextField getFieldFechaIng() {
        return fieldFechaIng;
    }

    public void setFieldFechaIng(JTextField fieldFechaIng) {
        this.fieldFechaIng = fieldFechaIng;
    }

    public JTextField getFieldTelfono() {
        return fieldTelfono;
    }

    public void setFieldTelfono(JTextField fieldTelfono) {
        this.fieldTelfono = fieldTelfono;
    }

    public JTextField getFieldMovil() {
        return fieldMovil;
    }

    public void setFieldMovil(JTextField fieldMovil) {
        this.fieldMovil = fieldMovil;
    }

    public JTextField getFieldNickname() {
        return fieldNickname;
    }

    public void setFieldNickname(JTextField fieldNickname) {
        this.fieldNickname = fieldNickname;
    }

    public JTextField getFieldClave() {
        return fieldClave;
    }

    public void setFieldClave(JTextField fieldClave) {
        this.fieldClave = fieldClave;
    }

    public JRadioButton getRdSexo() {
        return rdSexo;
    }

    public void setRdSexo(JRadioButton rdSexo) {
        this.rdSexo = rdSexo;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public void setBtnLimpiar(JButton btnLimpiar) {
        this.btnLimpiar = btnLimpiar;
    }
  
}
