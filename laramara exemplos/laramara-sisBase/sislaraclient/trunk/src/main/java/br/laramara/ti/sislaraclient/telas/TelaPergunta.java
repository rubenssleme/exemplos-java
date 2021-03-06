package br.laramara.ti.sislaraclient.telas;

import java.awt.Window;
import javax.swing.JOptionPane;

public class TelaPergunta extends javax.swing.JDialog {

    /** Creates new form TelaPergunta */
    public TelaPergunta(Window parent, String pergunta) {
        super(parent, ModalityType.APPLICATION_MODAL);
        initComponents();
        jlaPergunta.setText("<html>" + pergunta);
        resposta = JOptionPane.CLOSED_OPTION;
        jbuNao.requestFocusInWindow();
        setLocationRelativeTo(parent);
        setVisible(true);
    }

    public int resposta(){
        return resposta;
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
        jlaPergunta = new javax.swing.JLabel();
        jbuSim = new javax.swing.JButton();
        jbuNao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(TelaPergunta.class);
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
        jlaIcone.setToolTipText(resourceMap.getString("jlaIcone.toolTipText")); // NOI18N
        jlaIcone.setName("jlaIcone"); // NOI18N
        jpaInformacao.add(jlaIcone);
        jlaIcone.setBounds(24, 15, 60, 90);

        jlaPergunta.setFont(resourceMap.getFont("jlaPergunta.font")); // NOI18N
        jlaPergunta.setText(resourceMap.getString("jlaPergunta.text")); // NOI18N
        jlaPergunta.setToolTipText(resourceMap.getString("jlaPergunta.toolTipText")); // NOI18N
        jlaPergunta.setName("jlaPergunta"); // NOI18N
        jpaInformacao.add(jlaPergunta);
        jlaPergunta.setBounds(90, 15, 457, 90);

        jbuSim.setFont(resourceMap.getFont("jbuSim.font")); // NOI18N
        jbuSim.setMnemonic('S');
        jbuSim.setText(resourceMap.getString("jbuSim.text")); // NOI18N
        jbuSim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuSim.setName("jbuSim"); // NOI18N
        jbuSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuSimActionPerformed(evt);
            }
        });
        jpaInformacao.add(jbuSim);
        jbuSim.setBounds(130, 110, 130, 40);

        jbuNao.setFont(resourceMap.getFont("jbuNao.font")); // NOI18N
        jbuNao.setMnemonic('N');
        jbuNao.setText(resourceMap.getString("jbuNao.text")); // NOI18N
        jbuNao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuNao.setName("jbuNao"); // NOI18N
        jbuNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuNaoActionPerformed(evt);
            }
        });
        jpaInformacao.add(jbuNao);
        jbuNao.setBounds(280, 110, 130, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaInformacao, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaInformacao, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuSimActionPerformed
        resposta = JOptionPane.YES_OPTION;
        dispose();        // TODO add your handling code here:
}//GEN-LAST:event_jbuSimActionPerformed

    private void jbuNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuNaoActionPerformed
        resposta = JOptionPane.NO_OPTION;
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jbuNaoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        dispose();  
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbuNao;
    private javax.swing.JButton jbuSim;
    private javax.swing.JLabel jlaIcone;
    private javax.swing.JLabel jlaPergunta;
    private javax.swing.JPanel jpaInformacao;
    // End of variables declaration//GEN-END:variables
    private int resposta;
}
