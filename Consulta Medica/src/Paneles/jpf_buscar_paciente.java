/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;
import Formularios.frm_principal;
import clases.consultas;
import clases.clase_auxiliar;
import com.placeholder.PlaceHolder;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian
 */
public class jpf_buscar_paciente extends javax.swing.JPanel {

    consultas co= new consultas();
    clase_auxiliar ca;
    PlaceHolder mensajeayuda;
    /**
     * Creates new form jpf_agendar
     */
    
    public void limpiar(){
    ca =new clase_auxiliar();
    ca.limpiar_texto(jPanel2);
    }
    public void bloquear(){
    ca =new clase_auxiliar();
    ca.bloquear_text(jPanel2);
    }   
    public void desbloquear(){
    ca =new clase_auxiliar();
    ca.desbloquear_text(jPanel2);
    }
    
    public jpf_buscar_paciente() {
        initComponents();
        bloquear();
        mensajeayuda = new PlaceHolder(txt_rut, "Ingresar SIN puntos");
        mensajeayuda = new PlaceHolder(txt_fono, "+569XXXXXXXX");
        mensajeayuda = new PlaceHolder(txt_fono2, "+569XXXXXXXX");
        this.bt_agregar.setEnabled(false);
        ca =new clase_auxiliar();
        this.txt_rut.setEditable(true);
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        bt_buscar = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        txt_ape_paterno = new javax.swing.JTextField();
        txt_ape_materno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_fec_nacimiento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        txt_fono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_fono2 = new javax.swing.JTextField();
        bt_agregar = new javax.swing.JButton();
        bt_limpiar = new javax.swing.JButton();
        txt_rut = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Agenda");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/009.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Rut Paciente:");

        bt_buscar.setText("Buscar");
        bt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscarActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre Paciente:");

        jLabel5.setText("Apellido Paterno:");

        jLabel6.setText("Apellido Materno:");

        jLabel7.setText("Fecha Nacimiento:");

        txt_fec_nacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fec_nacimientoActionPerformed(evt);
            }
        });

        jLabel8.setText("Dirección:");

        jLabel9.setText("Telefono:");

        jLabel10.setText("Telefono:");

        bt_agregar.setText("Agregar/Agendar");
        bt_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agregarActionPerformed(evt);
            }
        });

        bt_limpiar.setText("Limpiar");
        bt_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limpiarActionPerformed(evt);
            }
        });

        txt_rut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_rutKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_fono, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_fec_nacimiento, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ape_materno, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_rut, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_buscar))
                    .addComponent(txt_ape_paterno, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_fono2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_limpiar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(bt_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bt_buscar)
                    .addComponent(bt_limpiar)
                    .addComponent(txt_rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_ape_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_ape_materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_fec_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_fono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_fono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addComponent(bt_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscarActionPerformed
        
if(this.txt_rut.getText().equals("Ingresar SIN puntos")){
    JOptionPane.showMessageDialog(this, "Debes ingresar el Rut del Paciente");
    }else if(this.txt_rut.getText().equals("")){
      JOptionPane.showMessageDialog(this, "Debes ingresar el Rut del Paciente");      
            
}else{
    ca = new clase_auxiliar(this.txt_rut.getText());
    ca.validacionRut();
        if(ca.validacionRut()== true){
          co.buscar_paciente(txt_rut.getText());
            if (co.getValidador().equals(1)) {
                 //mostrar datos de paciente
                bloquear();
                this.bt_agregar.setEnabled(true);
                this.txt_nombre.setText(co.getNombre_paciente());
                this.txt_ape_paterno.setText(co.getApe_paterno_paciente());
                this.txt_ape_materno.setText(co.getApe_materno_paciente());
                this.txt_direccion.setText(co.getDireccion_participante());
                this.txt_fec_nacimiento.setText(co.getFec_naciemiento_paciente());
                this.txt_fono.setText(co.getFono_paciente());
                this.txt_fono2.setText(co.getFono2_paciente());
            }else {
                 //habilitar campos para guardar nuevo paciente
                 JOptionPane.showMessageDialog(this, "Paciente no registrado, Porfavor ingrese los datos");
                 desbloquear();
                 this.txt_rut.setEditable(false);
                 this.bt_agregar.setEnabled(true);
            }
        }else if(ca.validacionRut()== false){
        this.txt_rut.setText("");
        JOptionPane.showMessageDialog(this, "Rut ingresado no valido \n Verifica el formato (XXXXXXXX-X)");
        }
    }//GEN-LAST:event_bt_buscarActionPerformed
}
    private void txt_fec_nacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fec_nacimientoActionPerformed
        
    }//GEN-LAST:event_txt_fec_nacimientoActionPerformed

    private void bt_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_agregarActionPerformed
   

        switch (co.getValidador()) {
            case 1:// paciente Antiguo
                //abrir agenda
                new clases.CambiaPanel(frm_principal.jp_box,new jpf_agenda());
                jpf_agenda.txt_rut_paciente.setText(this.txt_rut.getText());
                break;
            case 2:// nuevo paciente
                //guardar nuevo paciente
                co.guardar_paciente(txt_rut.getText(), txt_nombre.getText(), txt_ape_paterno.getText(),
                txt_ape_materno.getText(), txt_direccion.getText(), txt_fec_nacimiento.getText(),
                txt_fono.getText(), txt_fono2.getText());
                //abrir agenda
                new clases.CambiaPanel(frm_principal.jp_box,new jpf_agenda());
                jpf_agenda.txt_rut_paciente.setText(this.txt_rut.getText());
                break;
            default:
                JOptionPane.showMessageDialog(this, "Error al acceder a la agenda,/n Si El Problema persiste comuniquese con el administrador");
                break;
        }
        
    }//GEN-LAST:event_bt_agregarActionPerformed

    private void bt_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limpiarActionPerformed
        limpiar();
         mensajeayuda = new PlaceHolder(txt_rut, "Ingresar SIN puntos");
         mensajeayuda = new PlaceHolder(txt_fono, "+569XXXXXXXX");
         mensajeayuda = new PlaceHolder(txt_fono2, "+569XXXXXXXX");
    }//GEN-LAST:event_bt_limpiarActionPerformed

    private void txt_rutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rutKeyTyped
         if(txt_rut.getText().length()==10){
         evt.consume();
         }
         
    }//GEN-LAST:event_txt_rutKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_agregar;
    private javax.swing.JButton bt_buscar;
    private javax.swing.JButton bt_limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txt_ape_materno;
    private javax.swing.JTextField txt_ape_paterno;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_fec_nacimiento;
    private javax.swing.JTextField txt_fono;
    private javax.swing.JTextField txt_fono2;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_rut;
    // End of variables declaration//GEN-END:variables
}
