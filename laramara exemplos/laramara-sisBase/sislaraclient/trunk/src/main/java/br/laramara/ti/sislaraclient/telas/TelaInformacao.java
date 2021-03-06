package br.laramara.ti.sislaraclient.telas;

import java.awt.Window;

public class TelaInformacao extends javax.swing.JDialog {

    /** Creates new form Informacao */
    public TelaInformacao(Window parent, String informacao) {
        super(parent, ModalityType.APPLICATION_MODAL);
        inicializaTela(parent, informacao);
    }
     
    private void inicializaTela(Window parent, String informacao){
        initComponents();
        jlaInformacao.setText("<html>" + informacao);
        setLocationRelativeTo(parent);
        setVisible(true);
    }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpaInformacao = new javax.swing.JPanel();
        jlaIcone = new javax.swing.JLabel();
        jbuOK = new javax.swing.JButton();
        jspInfo = new javax.swing.JScrollPane();
        jlaInformacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(TelaInformacao.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setName("Form"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jpaInformacao.setBorder(javax.swing.BorderFactory.createLineBorder(resourceMap.getColor("jpaInformacao.border.lineColor"))); // NOI18N
        jpaInformacao.setName("jpaInformacao"); // NOI18N
        jpaInformacao.setLayout(null);

        jlaIcone.setIcon(resourceMap.getIcon("jlaIcone.icon")); // NOI18N
        jlaIcone.setText(resourceMap.getString("jlaIcone.text")); // NOI18N
        jlaIcone.setToolTipText(resourceMap.getString("jlaIcone.toolTipText")); // NOI18N
        jlaIcone.setName("jlaIcone"); // NOI18N
        jpaInformacao.add(jlaIcone);
        jlaIcone.setBounds(14, 36, 50, 180);

        jbuOK.setFont(resourceMap.getFont("jbuOK.font")); // NOI18N
        jbuOK.setMnemonic('O');
        jbuOK.setText(resourceMap.getString("jbuOK.text")); // NOI18N
        jbuOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuOK.setName("jbuOK"); // NOI18N
        jbuOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuOKActionPerformed(evt);
            }
        });
        jpaInformacao.add(jbuOK);
        jbuOK.setBounds(220, 210, 250, 40);

        jspInfo.setBorder(null);
        jspInfo.setName("jspInfo"); // NOI18N

        jlaInformacao.setFont(resourceMap.getFont("jlaInformacao.font")); // NOI18N
        jlaInformacao.setText(resourceMap.getString("jlaInformacao.text")); // NOI18N
        jlaInformacao.setToolTipText(resourceMap.getString("jlaInformacao.toolTipText")); // NOI18N
        jlaInformacao.setName("jlaInformacao"); // NOI18N
        jspInfo.setViewportView(jlaInformacao);
        jlaInformacao.getAccessibleContext().setAccessibleName(resourceMap.getString("jlbInformacao.AccessibleContext.accessibleName")); // NOI18N

        jpaInformacao.add(jspInfo);
        jspInfo.setBounds(70, 40, 620, 160);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaInformacao, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaInformacao, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuOKActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jbuOKActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
         dispose();  
    }//GEN-LAST:event_formWindowClosed

    /**
    * @param args the command line arguments
    */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbuOK;
    private javax.swing.JLabel jlaIcone;
    private javax.swing.JLabel jlaInformacao;
    private javax.swing.JPanel jpaInformacao;
    private javax.swing.JScrollPane jspInfo;
    // End of variables declaration//GEN-END:variables

}
