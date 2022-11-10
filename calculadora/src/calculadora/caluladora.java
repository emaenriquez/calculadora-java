package calculadora;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class caluladora extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        res_operacion = new javax.swing.JLabel();
        text_operacion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btn_c = new javax.swing.JButton();
        btn_num_cuatro = new javax.swing.JButton();
        btn_num_ocho = new javax.swing.JButton();
        btn_num_cinco = new javax.swing.JButton();
        btn_num_seis = new javax.swing.JButton();
        btn_num_tres = new javax.swing.JButton();
        btn_num_uno = new javax.swing.JButton();
        btn_num_2 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_num_nueve = new javax.swing.JButton();
        btn_num_siete = new javax.swing.JButton();
        btn_porsentaje = new javax.swing.JButton();
        btn_multiplicar = new javax.swing.JButton();
        btn_positivo = new javax.swing.JButton();
        btn_negativo = new javax.swing.JButton();
        btn_num_cero = new javax.swing.JButton();
        text_result = new javax.swing.JLabel();
        operacion = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        res_operacion.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        res_operacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        res_operacion.setText(" 50");
        jPanel1.add(res_operacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 380, 60));

        text_operacion.setBackground(new java.awt.Color(0, 0, 0));
        text_operacion.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        text_operacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        text_operacion.setText(" 5 x 10");
        jPanel1.add(text_operacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 43));

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton3.setText("C");
        jButton3.setBorder(null);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_dark.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton4.setText("+");
        jButton4.setBorder(null);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_dark.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton5.setText("%");
        jButton5.setBorder(null);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_dark.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton6.setText("/");
        jButton6.setBorder(null);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_dark.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 102, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, 390));

        jPanel6.setBackground(new java.awt.Color(255, 51, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, 390));

        btn_c.setText("C");
        btn_c.setBorder(null);
        btn_c.setPreferredSize(new java.awt.Dimension(65, 65));
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });
        jPanel4.add(btn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        btn_num_cuatro.setText("4");
        btn_num_cuatro.setBorder(null);
        btn_num_cuatro.setPreferredSize(new java.awt.Dimension(65, 65));
        btn_num_cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_num_cuatroActionPerformed(evt);
            }
        });
        jPanel4.add(btn_num_cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        btn_num_ocho.setText("8");
        btn_num_ocho.setBorder(null);
        btn_num_ocho.setPreferredSize(new java.awt.Dimension(65, 65));
        btn_num_ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_num_ochoActionPerformed(evt);
            }
        });
        jPanel4.add(btn_num_ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        btn_num_cinco.setText("5");
        btn_num_cinco.setBorder(null);
        btn_num_cinco.setPreferredSize(new java.awt.Dimension(65, 65));
        btn_num_cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_num_cincoActionPerformed(evt);
            }
        });
        jPanel4.add(btn_num_cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        btn_num_seis.setText("6");
        btn_num_seis.setBorder(null);
        btn_num_seis.setPreferredSize(new java.awt.Dimension(65, 65));
        btn_num_seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_num_seisActionPerformed(evt);
            }
        });
        jPanel4.add(btn_num_seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        btn_num_tres.setText("3");
        btn_num_tres.setBorder(null);
        btn_num_tres.setPreferredSize(new java.awt.Dimension(65, 65));
        btn_num_tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_num_tresActionPerformed(evt);
            }
        });
        jPanel4.add(btn_num_tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        btn_num_uno.setText("1");
        btn_num_uno.setBorder(null);
        btn_num_uno.setPreferredSize(new java.awt.Dimension(65, 65));
        btn_num_uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_num_unoActionPerformed(evt);
            }
        });
        jPanel4.add(btn_num_uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        btn_num_2.setText("2");
        btn_num_2.setBorder(null);
        btn_num_2.setPreferredSize(new java.awt.Dimension(65, 65));
        btn_num_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_num_2ActionPerformed(evt);
            }
        });
        jPanel4.add(btn_num_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        btn_punto.setText(".");
        btn_punto.setBorder(null);
        btn_punto.setPreferredSize(new java.awt.Dimension(65, 65));
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });
        jPanel4.add(btn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 80, -1));

        btn_igual.setText("=");
        btn_igual.setBorder(null);
        btn_igual.setPreferredSize(new java.awt.Dimension(65, 65));
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel4.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 355, 230, 80));

        btn_num_nueve.setText("9");
        btn_num_nueve.setBorder(null);
        btn_num_nueve.setPreferredSize(new java.awt.Dimension(65, 65));
        btn_num_nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_num_nueveActionPerformed(evt);
            }
        });
        jPanel4.add(btn_num_nueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        btn_num_siete.setText("7");
        btn_num_siete.setBorder(null);
        btn_num_siete.setPreferredSize(new java.awt.Dimension(65, 65));
        btn_num_siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_num_sieteActionPerformed(evt);
            }
        });
        jPanel4.add(btn_num_siete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        btn_porsentaje.setText("/");
        btn_porsentaje.setBorder(null);
        btn_porsentaje.setPreferredSize(new java.awt.Dimension(65, 65));
        btn_porsentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porsentajeActionPerformed(evt);
            }
        });
        jPanel4.add(btn_porsentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        btn_multiplicar.setText("X");
        btn_multiplicar.setBorder(null);
        btn_multiplicar.setPreferredSize(new java.awt.Dimension(65, 65));
        btn_multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicarActionPerformed(evt);
            }
        });
        jPanel4.add(btn_multiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 80, -1));

        btn_positivo.setText("+");
        btn_positivo.setBorder(null);
        btn_positivo.setPreferredSize(new java.awt.Dimension(65, 65));
        btn_positivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_positivoActionPerformed(evt);
            }
        });
        jPanel4.add(btn_positivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 275, 80, 160));

        btn_negativo.setText("-");
        btn_negativo.setBorder(null);
        btn_negativo.setPreferredSize(new java.awt.Dimension(65, 65));
        btn_negativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_negativoActionPerformed(evt);
            }
        });
        jPanel4.add(btn_negativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        btn_num_cero.setText("0");
        btn_num_cero.setBorder(null);
        btn_num_cero.setPreferredSize(new java.awt.Dimension(65, 65));
        btn_num_cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_num_ceroActionPerformed(evt);
            }
        });
        jPanel4.add(btn_num_cero, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 80, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 360, 450));

        text_result.setBackground(new java.awt.Color(0, 0, 0));
        text_result.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        text_result.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(text_result, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 350, 50));

        operacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(operacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 40, 350, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
    
    public caluladora() {
        initComponents();
    }
      
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btn_num_cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_num_cuatroActionPerformed
        // TODO add your handling code here:
        addNumber("4");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_num_cuatroActionPerformed

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
        // TODO add your handling code here:
        text_result.setText("");
        operacion.setText("");
    }//GEN-LAST:event_btn_cActionPerformed

    private void btn_num_ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_num_ochoActionPerformed
        // TODO add your handling code here:
        addNumber("8");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_num_ochoActionPerformed

    private void btn_num_cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_num_cincoActionPerformed
        // TODO add your handling code here:
        addNumber("5");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_num_cincoActionPerformed

    private void btn_num_seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_num_seisActionPerformed
        // TODO add your handling code here:
        addNumber("6");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_num_seisActionPerformed

    private void btn_num_tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_num_tresActionPerformed
        // TODO add your handling code here:
        addNumber("3");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_num_tresActionPerformed

    private void btn_num_unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_num_unoActionPerformed
        // TODO add your handling code here:
        addNumber("1");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_num_unoActionPerformed

    private void btn_num_ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_num_ceroActionPerformed
        // TODO add your handling code here:
        addNumber("0");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_num_ceroActionPerformed

    private void btn_num_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_num_2ActionPerformed
        // TODO add your handling code here:
        addNumber("2");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_num_2ActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        // TODO add your handling code here:
        addNumber(".");
    }//GEN-LAST:event_btn_puntoActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        // TODO add your handling code here:
        try{
           String res = se.eval(operacion.getText()).toString();
           text_result.setText(res);
        } catch(Exception e){
            operacion.setText("Eror");
        }
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_positivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_positivoActionPerformed
        // TODO add your handling code here:
        addNumber("+");
    }//GEN-LAST:event_btn_positivoActionPerformed

    private void btn_num_nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_num_nueveActionPerformed
        // TODO add your handling code here:
        addNumber("9");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_num_nueveActionPerformed

    private void btn_num_sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_num_sieteActionPerformed
        // TODO add your handling code here:
        addNumber("7");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_num_sieteActionPerformed

    private void btn_porsentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porsentajeActionPerformed
        // TODO add your handling code here:
        addNumber("/");
    }//GEN-LAST:event_btn_porsentajeActionPerformed

    private void btn_multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicarActionPerformed
        // TODO add your handling code here:
        addNumber("*");
    }//GEN-LAST:event_btn_multiplicarActionPerformed

    private void btn_negativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_negativoActionPerformed
        // TODO add your handling code here:
        addNumber("-");
    }//GEN-LAST:event_btn_negativoActionPerformed

 
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
            java.util.logging.Logger.getLogger(caluladora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(caluladora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(caluladora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(caluladora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new caluladora().setVisible(true);
            }
        });
    }
    
    public void addNumber(String digito){
        operacion.setText(operacion.getText() + digito);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multiplicar;
    private javax.swing.JButton btn_negativo;
    private javax.swing.JButton btn_num_2;
    private javax.swing.JButton btn_num_cero;
    private javax.swing.JButton btn_num_cinco;
    private javax.swing.JButton btn_num_cuatro;
    private javax.swing.JButton btn_num_nueve;
    private javax.swing.JButton btn_num_ocho;
    private javax.swing.JButton btn_num_seis;
    private javax.swing.JButton btn_num_siete;
    private javax.swing.JButton btn_num_tres;
    private javax.swing.JButton btn_num_uno;
    private javax.swing.JButton btn_porsentaje;
    private javax.swing.JButton btn_positivo;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel operacion;
    private javax.swing.JLabel res_operacion;
    private javax.swing.JLabel text_operacion;
    private javax.swing.JLabel text_result;
    // End of variables declaration//GEN-END:variables

}
