/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andriawan.kasir.view;

import andriawan.kasir.controller.UserController;
import andriawan.kasir.controller.UserLoginController;
import andriawan.kasir.model.User;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author andriawan
 */
public class EditorUserForm extends javax.swing.JFrame {

    /**
     * Creates new form EditorUserForm
     */
    public EditorUserForm() {
        initComponents();
        txtIdUser.setVisible(false);
        txtPassword.setEnabled(false);
        
        // SET ICON RESOURCE
        ImageIcon iconBtnUpdateUser = new ImageIcon(
                new ImageIcon("resources/insert.png").getImage().
        getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH));
        btnUpdateUser.setIcon(iconBtnUpdateUser);
        
        ImageIcon iconBtnTambahUser = new ImageIcon(
                new ImageIcon("resources/check.png").getImage().
        getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH));
        btnTambahUser.setIcon(iconBtnTambahUser);
        
        ImageIcon iconBatal = new ImageIcon(
                new ImageIcon("resources/delete.png").getImage().
        getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH));
        btnBatalUser.setIcon(iconBatal);
    }
    
    public void setEnablePassField(Boolean bl){
        txtPassword.setEnabled(bl);
    }
    
    public void setVisibilityCombo(Boolean bl){
        activatePassField.setVisible(bl);
    }
    
    public void setVisibilityBtnTambah(Boolean bl){
        btnTambahUser.setVisible(bl);
    }
    
    public void setLabelHeader(String str){
        labelHeader.setText(str);
    }
    
    public void setVisibilityBtnUpdate(Boolean bl){
        btnUpdateUser.setVisible(bl);
    }
    
    public void setTxtUsername(String set){
        txtFieldNamaUsername.setText(set);
    }
    
    public void setTxtPassword(String set){
        txtPassword.setText(set);
    }
    
    public void setTxtNama(String set){
        txtFieldNama.setText(set);
    }
    
    public void setTxtId(String set){
        txtIdUser.setText(set);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTambahBarangFrame = new javax.swing.JPanel();
        txtFieldNama = new javax.swing.JTextField();
        labelNama = new javax.swing.JLabel();
        btnBatalUser = new javax.swing.JButton();
        btnTambahUser = new javax.swing.JButton();
        labelPassword = new javax.swing.JLabel();
        txtFieldNamaUsername = new javax.swing.JTextField();
        labelUsename = new javax.swing.JLabel();
        labelHeader = new javax.swing.JLabel();
        btnUpdateUser = new javax.swing.JButton();
        txtIdUser = new javax.swing.JTextField();
        jComboBoxJabatan = new javax.swing.JComboBox<>();
        labelJabatan = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        activatePassField = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editor User");
        setUndecorated(true);

        panelTambahBarangFrame.setBackground(new java.awt.Color(255, 255, 255));
        panelTambahBarangFrame.setForeground(new java.awt.Color(255, 255, 255));

        txtFieldNama.setMargin(new java.awt.Insets(0, 5, 0, 0));

        labelNama.setText("Nama Lengkap");

        btnBatalUser.setBackground(new java.awt.Color(255, 51, 51));
        btnBatalUser.setForeground(new java.awt.Color(255, 255, 255));
        btnBatalUser.setText("Batal");
        btnBatalUser.setBorderPainted(false);
        btnBatalUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalUserActionPerformed(evt);
            }
        });

        btnTambahUser.setBackground(new java.awt.Color(0, 153, 255));
        btnTambahUser.setForeground(new java.awt.Color(255, 255, 255));
        btnTambahUser.setText("Tambah");
        btnTambahUser.setBorderPainted(false);
        btnTambahUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahUserActionPerformed(evt);
            }
        });

        labelPassword.setText("Password");

        txtFieldNamaUsername.setMargin(new java.awt.Insets(0, 5, 0, 0));

        labelUsename.setText("Username");

        labelHeader.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelHeader.setText("Tambah Pengguna");

        btnUpdateUser.setBackground(new java.awt.Color(0, 255, 0));
        btnUpdateUser.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateUser.setText("Update");
        btnUpdateUser.setBorderPainted(false);
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });

        txtIdUser.setEditable(false);

        jComboBoxJabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kasir", "admin" }));

        labelJabatan.setText("Jabatan");

        activatePassField.setBackground(new java.awt.Color(255, 255, 255));
        activatePassField.setText("<html>Centang jika ingin mengubah password<html>");
        activatePassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activatePassFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTambahBarangFrameLayout = new javax.swing.GroupLayout(panelTambahBarangFrame);
        panelTambahBarangFrame.setLayout(panelTambahBarangFrameLayout);
        panelTambahBarangFrameLayout.setHorizontalGroup(
            panelTambahBarangFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTambahBarangFrameLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelTambahBarangFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxJabatan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelUsename, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFieldNama, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTambahBarangFrameLayout.createSequentialGroup()
                        .addComponent(labelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addGap(174, 174, 174))
                    .addGroup(panelTambahBarangFrameLayout.createSequentialGroup()
                        .addComponent(activatePassField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelTambahBarangFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdateUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTambahUser, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(btnBatalUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTambahBarangFrameLayout.createSequentialGroup()
                        .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(labelNama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelJabatan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldNamaUsername, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(22, 22, 22))
        );
        panelTambahBarangFrameLayout.setVerticalGroup(
            panelTambahBarangFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTambahBarangFrameLayout.createSequentialGroup()
                .addGroup(panelTambahBarangFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTambahBarangFrameLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelHeader)
                        .addGap(38, 38, 38)
                        .addComponent(labelUsename)
                        .addGap(12, 12, 12)
                        .addComponent(txtFieldNamaUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNama)
                        .addGap(12, 12, 12)
                        .addComponent(txtFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelJabatan)
                        .addGap(12, 12, 12)
                        .addComponent(jComboBoxJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(btnUpdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTambahBarangFrameLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(activatePassField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnTambahUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBatalUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(panelTambahBarangFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(panelTambahBarangFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBatalUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalUserActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnBatalUserActionPerformed

    private void btnTambahUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahUserActionPerformed
        UserController uc = new UserController();
        String nama = txtFieldNamaUsername.getText();
        String password = new String(txtPassword.getPassword());
        String namaL = txtFieldNama.getText();
        String status = jComboBoxJabatan.getSelectedItem().toString();
        
        uc.insertUser(new User(nama, password, namaL, status));
        JOptionPane.showMessageDialog(null, "Pengguna berhasil ditambahkan");
        
        try {
            UserLoginController.getMainFormInstance().reloadUserLive(evt);
        } catch (SQLException ex) {
            Logger.getLogger(EditorUserForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        txtFieldNama.setText("");
        txtFieldNamaUsername.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnTambahUserActionPerformed

    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
        UserController uc = new UserController();
        String namaAsli = txtFieldNama.getText();
        String username = txtFieldNamaUsername.getText();
        String password = new String(txtPassword.getPassword());
        String status = jComboBoxJabatan.getSelectedItem().toString();
        int id = new Integer(txtIdUser.getText());
        
        if(password.isEmpty() || password.equals(""))
            uc.updateUserNoPassword(new User(id, username, namaAsli, status));
        else {
            uc.updateUser(new User(id, username, password, namaAsli, status));
        }
        
        JOptionPane.showMessageDialog(null, "Pengguna berhasil diupdate");
        
        try {
            UserLoginController.getMainFormInstance().reloadUserLive(evt);
        } catch (SQLException ex) {
            Logger.getLogger(EditorUserForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        txtFieldNama.setText("");
        txtFieldNamaUsername.setText("");
        txtPassword.setText("");
        
        this.setVisible(false);
    }//GEN-LAST:event_btnUpdateUserActionPerformed

    private void activatePassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activatePassFieldActionPerformed
        if (activatePassField.isSelected()){
            txtPassword.setEnabled(true);
        } else{
            txtPassword.setEnabled(false);
        }
    }//GEN-LAST:event_activatePassFieldActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox activatePassField;
    private javax.swing.JButton btnBatalUser;
    private javax.swing.JButton btnTambahUser;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JComboBox<String> jComboBoxJabatan;
    private javax.swing.JLabel labelHeader;
    private javax.swing.JLabel labelJabatan;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUsename;
    private javax.swing.JPanel panelTambahBarangFrame;
    private javax.swing.JTextField txtFieldNama;
    private javax.swing.JTextField txtFieldNamaUsername;
    private javax.swing.JTextField txtIdUser;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}