/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CR_05_Pemmawadu;

import static CR_05_Pemmawadu.Item_Search.jRadioButton1;
import static CR_05_Pemmawadu.Item_Search.jRadioButton2;
import static CR_05_Pemmawadu.Item_Search.jTable2;
import static CR_05_Pemmawadu.Item_Search.u_id;
import java.awt.Image;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Owner
 */
public class Customer_Search extends javax.swing.JFrame {

    /**
     * Creates new form PO_Search
     */
    public Customer_Search() {
        initComponents();
        search();
        ImageIcon imageicon = new ImageIcon(getClass().getResource("/images/logo.png"));
        Image image = imageicon.getImage();
        setIconImage(image);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        u_id = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Search By"));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Customer ID");
        jRadioButton1.setContentAreaFilled(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jRadioButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jRadioButton1KeyReleased(evt);
            }
        });

        u_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        u_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                u_idFocusGained(evt);
            }
        });
        u_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_idActionPerformed(evt);
            }
        });
        u_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                u_idKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                u_idKeyTyped(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Customer Name");
        jRadioButton2.setContentAreaFilled(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jRadioButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jRadioButton2KeyReleased(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Customer Contact No");
        jRadioButton3.setContentAreaFilled(false);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jRadioButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jRadioButton3KeyReleased(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Customer NIC");
        jRadioButton4.setContentAreaFilled(false);
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jRadioButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jRadioButton4KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton4))
                    .addComponent(u_id, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(u_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Custmer ID", "Customer Name", "NIC", "Contact No 1", "Contact No 2", "Address", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "Contact No", "Birthday", "Address", "NIC" }));

        jLabel1.setText("Sort By");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_UP, 0));
        jMenuItem1.setText("Change Search Option");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1KeyReleased

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton2KeyReleased

    }//GEN-LAST:event_jRadioButton2KeyReleased

    private void u_idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_u_idFocusGained
        u_id.setSelectionStart(0);
        u_id.setSelectionEnd(50);
    }//GEN-LAST:event_u_idFocusGained

    private void u_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_idActionPerformed
        DefaultTableModel df = (DefaultTableModel) jTable2.getModel();

        String x = (String) df.getValueAt(0, 0);
        Customer_Return.jTextField2.setText(x);
        this.dispose();
    }//GEN-LAST:event_u_idActionPerformed

    private void u_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_u_idKeyReleased
        DefaultTableModel df = (DefaultTableModel) jTable2.getModel();

        try {
            String query = "";
            if (jRadioButton1.isSelected()) {
                query = "SELECT * FROM customer where idcustomer like'" + u_id.getText() + "%'";

            } else if (jRadioButton2.isSelected()) {
                query = "SELECT * FROM customer where name like'" + u_id.getText() + "%'";

            } else if (jRadioButton3.isSelected()) {
                query = "SELECT * FROM customer where tp1 like'" + u_id.getText() + "%'";

            } else if (jRadioButton4.isSelected()) {
                query = "SELECT * FROM customer where nic like'" + u_id.getText() + "%'";

            }
            ResultSet rs = DB.MyDB.search(query);
            df.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("idcustomer"));
                v.add(rs.getString("name"));
                v.add(rs.getString("nic"));
                v.add(rs.getString("tp1"));
                v.add(rs.getString("tp2"));
                String add = rs.getString("address_1") + "," + rs.getString("address_2") + "," + rs.getString("address_3");
                v.add(add);
                v.add(rs.getString("status"));

                df.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_u_idKeyReleased

    private void u_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_u_idKeyTyped

    }//GEN-LAST:event_u_idKeyTyped

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3KeyReleased

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4KeyReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (jRadioButton1.isSelected()) {
            jRadioButton2.setSelected(true);
        } else if(jRadioButton2.isSelected()){
            jRadioButton3.setSelected(true);
        }else if(jRadioButton3.isSelected()){
            jRadioButton4.setSelected(true);
        }else{
            jRadioButton1.setSelected(true);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Customer_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JRadioButton jRadioButton1;
    public static javax.swing.JRadioButton jRadioButton2;
    public static javax.swing.JRadioButton jRadioButton3;
    public static javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable2;
    public static javax.swing.JTextField u_id;
    // End of variables declaration//GEN-END:variables

    private void search() {
        DefaultTableModel df = (DefaultTableModel) jTable2.getModel();
        try {
            ResultSet rs = DB.MyDB.search("SELECT * FROM customer");
            df.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("idcustomer"));
                v.add(rs.getString("name"));
                v.add(rs.getString("nic"));
                v.add(rs.getString("tp1"));
                v.add(rs.getString("tp2"));
                String add = (rs.getString("address_1") + "," + rs.getString("address_2") + "," + rs.getString("address_3"));
                v.add(add);
                df.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
