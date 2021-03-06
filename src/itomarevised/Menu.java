/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itomarevised;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setIcon();
        
        Toolkit tool = Toolkit.getDefaultToolkit();
        int width = (int)tool.getScreenSize().getWidth();
        int height = (int)tool.getScreenSize().getWidth();
        
        this.setSize(width, height);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        whitePanel = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        menuText = new javax.swing.JLabel();
        logout = new java.awt.Button();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        regusers = new javax.swing.JButton();
        records = new javax.swing.JButton();
        books = new javax.swing.JButton();
        bluePanel = new javax.swing.JPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        innovate = new javax.swing.JLabel();
        create = new javax.swing.JLabel();
        carangian = new javax.swing.JLabel();
        transform = new javax.swing.JLabel();
        cclogo = new javax.swing.JLabel();
        colleges = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Bookshelf");
        setResizable(false);

        whitePanel.setBackground(new java.awt.Color(255, 255, 255));

        menuText.setBackground(new java.awt.Color(255, 255, 255));
        menuText.setFont(new java.awt.Font("Century Gothic", 1, 29)); // NOI18N
        menuText.setForeground(new java.awt.Color(0, 51, 102));
        menuText.setText("Menu");

        logout.setBackground(new java.awt.Color(255, 0, 0));
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setLabel("LOG OUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        regusers.setBackground(new java.awt.Color(255, 255, 51));
        regusers.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        regusers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reguser small.png"))); // NOI18N
        regusers.setText("REGISTERED USERS");
        regusers.setToolTipText("");
        regusers.setBorder(null);
        regusers.setBorderPainted(false);
        regusers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regusers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regusersActionPerformed(evt);
            }
        });

        records.setBackground(new java.awt.Color(0, 153, 51));
        records.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        records.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/record SMALL.png"))); // NOI18N
        records.setText("RECORDS");
        records.setToolTipText("");
        records.setBorder(null);
        records.setBorderPainted(false);
        records.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        records.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordsActionPerformed(evt);
            }
        });

        books.setBackground(new java.awt.Color(255, 153, 51));
        books.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        books.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/book small.png"))); // NOI18N
        books.setText("BOOKS");
        books.setToolTipText("");
        books.setBorder(null);
        books.setBorderPainted(false);
        books.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksActionPerformed(evt);
            }
        });

        jLayeredPane3.setLayer(regusers, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(records, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(books, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regusers, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                    .addComponent(books, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(records, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(books, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(regusers, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(records, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLayeredPane1.setLayer(menuText, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(logout, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap(30, Short.MAX_VALUE)
                        .addComponent(jLayeredPane3))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(menuText)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuText)
                .addGap(43, 43, 43)
                .addComponent(jLayeredPane3)
                .addGap(24, 24, 24)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout whitePanelLayout = new javax.swing.GroupLayout(whitePanel);
        whitePanel.setLayout(whitePanelLayout);
        whitePanelLayout.setHorizontalGroup(
            whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whitePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        whitePanelLayout.setVerticalGroup(
            whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, whitePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bluePanel.setBackground(new java.awt.Color(0, 51, 102));

        innovate.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        innovate.setForeground(new java.awt.Color(255, 255, 255));
        innovate.setText("INNOVATE");

        create.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        create.setForeground(new java.awt.Color(255, 255, 255));
        create.setText("CREATE");

        carangian.setFont(new java.awt.Font("Century Gothic", 1, 45)); // NOI18N
        carangian.setForeground(new java.awt.Color(255, 255, 255));
        carangian.setText("CARANGIAN");

        transform.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        transform.setForeground(new java.awt.Color(255, 255, 255));
        transform.setText("TRANSFORM");

        cclogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cc new large white.png"))); // NOI18N

        colleges.setFont(new java.awt.Font("Century Gothic", 1, 45)); // NOI18N
        colleges.setForeground(new java.awt.Color(255, 255, 255));
        colleges.setText("COLLEGES");

        jLayeredPane2.setLayer(innovate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(create, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(carangian, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(transform, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(cclogo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(colleges, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(create)
                        .addGap(30, 30, 30)
                        .addComponent(innovate)
                        .addGap(18, 18, 18)
                        .addComponent(transform))
                    .addComponent(cclogo)
                    .addComponent(carangian, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colleges))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(innovate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transform, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(cclogo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(carangian)
                .addGap(6, 6, 6)
                .addComponent(colleges)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bluePanelLayout = new javax.swing.GroupLayout(bluePanel);
        bluePanel.setLayout(bluePanelLayout);
        bluePanelLayout.setHorizontalGroup(
            bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bluePanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLayeredPane2)
                .addGap(39, 39, 39))
        );
        bluePanelLayout.setVerticalGroup(
            bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bluePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLayeredPane2)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bluePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(whitePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(whitePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bluePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void booksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksActionPerformed
        // TODO add your handling code here:
        new Books().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_booksActionPerformed

    private void regusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regusersActionPerformed
        // TODO add your handling code here:
        new Regusers().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regusersActionPerformed

    private void recordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordsActionPerformed
        // TODO add your handling code here:
        new Record().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_recordsActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Confirm logout",
                JOptionPane.YES_OPTION) == JOptionPane.YES_OPTION){
            new Login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_logoutActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bluePanel;
    private javax.swing.JButton books;
    private javax.swing.JLabel carangian;
    private javax.swing.JLabel cclogo;
    private javax.swing.JLabel colleges;
    private javax.swing.JLabel create;
    private javax.swing.JLabel innovate;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private java.awt.Button logout;
    private javax.swing.JLabel menuText;
    private javax.swing.JButton records;
    private javax.swing.JButton regusers;
    private javax.swing.JLabel transform;
    private javax.swing.JPanel whitePanel;
    // End of variables declaration//GEN-END:variables
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().
                getResource("/icons/frameicon2.png")));
    }
}

