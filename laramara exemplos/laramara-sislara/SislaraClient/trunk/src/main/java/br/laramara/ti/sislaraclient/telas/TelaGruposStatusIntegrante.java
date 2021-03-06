package br.laramara.ti.sislaraclient.telas;

import br.laramara.ti.sislaraclient.controladores.ControladorTelaGruposStatusIntegrante;
import br.laramara.ti.sislaraclient.utilitarios.JOptionPanePersonalizado;
import br.laramara.ti.sislaracommons.dtos.grupo.ModuloPeriodoDTO;
import br.laramara.ti.sislaracommons.dtos.grupo.ModuloRelacaoBaseDTO;
import javax.swing.JDialog;

public class TelaGruposStatusIntegrante extends JDialog {

    /** Creates new form TelaGruposStatusIntegrante */
    public TelaGruposStatusIntegrante(JDialog parent, ModuloRelacaoBaseDTO moduloRelacaoBaseDto, ModuloPeriodoDTO moduloPeriodoDto) {
        super(parent, true);
        initComponents();
        setLocationRelativeTo(parent);
        controlador = new ControladorTelaGruposStatusIntegrante(this, moduloRelacaoBaseDto, moduloPeriodoDto, jtfUsuarioComunidade, jcbStatus, jftDataOcorrencia, jchAprovado, jchIgnorarReuniaoIntegracao, jtaObservacoes);
        controlador.abrirTela();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpaStatusIntegrante = new javax.swing.JPanel();
        jlaUsuarioComunidade = new javax.swing.JLabel();
        jtfUsuarioComunidade = new javax.swing.JTextField();
        jlaStatus = new javax.swing.JLabel();
        jcbStatus = new javax.swing.JComboBox();
        jlaDataOcorrencia = new javax.swing.JLabel();
        jftDataOcorrencia = new javax.swing.JFormattedTextField();
        jlaObservacoes = new javax.swing.JLabel();
        jbuSelecionarDataDesligamento = new javax.swing.JButton();
        jchAprovado = new javax.swing.JCheckBox();
        jchIgnorarReuniaoIntegracao = new javax.swing.JCheckBox();
        jbuSalvar = new javax.swing.JButton();
        jbuFechar = new javax.swing.JButton();
        jspObservacoes = new javax.swing.JScrollPane();
        jtaObservacoes = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(TelaGruposStatusIntegrante.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setName("Form"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jpaStatusIntegrante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpaStatusIntegrante.setName("jpaStatusIntegrante"); // NOI18N
        jpaStatusIntegrante.setLayout(null);

        jlaUsuarioComunidade.setFont(resourceMap.getFont("jlaUsuarioComunidade.font")); // NOI18N
        jlaUsuarioComunidade.setText(resourceMap.getString("jlaUsuarioComunidade.text")); // NOI18N
        jlaUsuarioComunidade.setName("jlaUsuarioComunidade"); // NOI18N
        jpaStatusIntegrante.add(jlaUsuarioComunidade);
        jlaUsuarioComunidade.setBounds(10, 40, 190, 17);

        jtfUsuarioComunidade.setEditable(false);
        jtfUsuarioComunidade.setFont(resourceMap.getFont("jtfUsuarioComunidade.font")); // NOI18N
        jtfUsuarioComunidade.setText(resourceMap.getString("jtfUsuarioComunidade.text")); // NOI18N
        jtfUsuarioComunidade.setName("jtfUsuarioComunidade"); // NOI18N
        jpaStatusIntegrante.add(jtfUsuarioComunidade);
        jtfUsuarioComunidade.setBounds(10, 60, 900, 23);
        jtfUsuarioComunidade.getAccessibleContext().setAccessibleName(resourceMap.getString("jtfUsuarioComunidade.AccessibleContext.accessibleName")); // NOI18N

        jlaStatus.setFont(resourceMap.getFont("jlaStatus.font")); // NOI18N
        jlaStatus.setText(resourceMap.getString("jlaStatus.text")); // NOI18N
        jlaStatus.setName("jlaStatus"); // NOI18N
        jpaStatusIntegrante.add(jlaStatus);
        jlaStatus.setBounds(10, 90, 90, 17);

        jcbStatus.setFont(resourceMap.getFont("jcbStatus.font")); // NOI18N
        jcbStatus.setName("jcbStatus"); // NOI18N
        jpaStatusIntegrante.add(jcbStatus);
        jcbStatus.setBounds(10, 110, 200, 25);
        jcbStatus.getAccessibleContext().setAccessibleName(resourceMap.getString("jcbStatus.AccessibleContext.accessibleName")); // NOI18N

        jlaDataOcorrencia.setFont(resourceMap.getFont("jlaDataOcorrencia.font")); // NOI18N
        jlaDataOcorrencia.setText(resourceMap.getString("jlaDataOcorrencia.text")); // NOI18N
        jlaDataOcorrencia.setName("jlaDataOcorrencia"); // NOI18N
        jpaStatusIntegrante.add(jlaDataOcorrencia);
        jlaDataOcorrencia.setBounds(220, 90, 170, 17);

        try {
            jftDataOcorrencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftDataOcorrencia.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        jftDataOcorrencia.setFont(resourceMap.getFont("jftDataOcorrencia.font")); // NOI18N
        jftDataOcorrencia.setName("jftDataOcorrencia"); // NOI18N
        jpaStatusIntegrante.add(jftDataOcorrencia);
        jftDataOcorrencia.setBounds(220, 110, 125, 23);
        jftDataOcorrencia.getAccessibleContext().setAccessibleName(resourceMap.getString("jftDataDesligamento.AccessibleContext.accessibleName")); // NOI18N
        jftDataOcorrencia.getAccessibleContext().setAccessibleDescription(resourceMap.getString("jftDataDesligamento.AccessibleContext.accessibleDescription")); // NOI18N

        jlaObservacoes.setFont(resourceMap.getFont("jlaObservacoes.font")); // NOI18N
        jlaObservacoes.setText(resourceMap.getString("jlaObservacoes.text")); // NOI18N
        jlaObservacoes.setName("jlaObservacoes"); // NOI18N
        jpaStatusIntegrante.add(jlaObservacoes);
        jlaObservacoes.setBounds(10, 170, 120, 17);

        jbuSelecionarDataDesligamento.setIcon(resourceMap.getIcon("jbuSelecionarDataDesligamento.icon")); // NOI18N
        jbuSelecionarDataDesligamento.setText(resourceMap.getString("jbuSelecionarDataDesligamento.text")); // NOI18N
        jbuSelecionarDataDesligamento.setBorderPainted(false);
        jbuSelecionarDataDesligamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuSelecionarDataDesligamento.setName("jbuSelecionarDataDesligamento"); // NOI18N
        jbuSelecionarDataDesligamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuSelecionarDataDesligamentoActionPerformed(evt);
            }
        });
        jpaStatusIntegrante.add(jbuSelecionarDataDesligamento);
        jbuSelecionarDataDesligamento.setBounds(350, 110, 25, 25);
        jbuSelecionarDataDesligamento.getAccessibleContext().setAccessibleName(resourceMap.getString("jbuSelecionarDataDesligamento.AccessibleContext.accessibleName")); // NOI18N
        jbuSelecionarDataDesligamento.getAccessibleContext().setAccessibleDescription(resourceMap.getString("jbuSelecionarDataDesligamento.AccessibleContext.accessibleDescription")); // NOI18N

        jchAprovado.setFont(resourceMap.getFont("jchAprovado.font")); // NOI18N
        jchAprovado.setText(resourceMap.getString("jchAprovado.text")); // NOI18N
        jchAprovado.setName("jchAprovado"); // NOI18N
        jpaStatusIntegrante.add(jchAprovado);
        jchAprovado.setBounds(10, 140, 110, 25);

        jchIgnorarReuniaoIntegracao.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jchIgnorarReuniaoIntegracao.setText(resourceMap.getString("jchIgnorarReuniaoIntegracao.text")); // NOI18N
        jchIgnorarReuniaoIntegracao.setName("jchIgnorarReuniaoIntegracao"); // NOI18N
        jpaStatusIntegrante.add(jchIgnorarReuniaoIntegracao);
        jchIgnorarReuniaoIntegracao.setBounds(120, 140, 250, 25);

        jbuSalvar.setFont(resourceMap.getFont("jbuSalvar.font")); // NOI18N
        jbuSalvar.setIcon(resourceMap.getIcon("jbuSalvar.icon")); // NOI18N
        jbuSalvar.setMnemonic('S');
        jbuSalvar.setText(resourceMap.getString("jbuSalvar.text")); // NOI18N
        jbuSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuSalvar.setName("jbuSalvar"); // NOI18N
        jbuSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuSalvarActionPerformed(evt);
            }
        });
        jpaStatusIntegrante.add(jbuSalvar);
        jbuSalvar.setBounds(10, 570, 110, 33);
        jbuSalvar.getAccessibleContext().setAccessibleName(resourceMap.getString("jbuSalvar.AccessibleContext.accessibleName")); // NOI18N

        jbuFechar.setFont(resourceMap.getFont("jbuFechar.font")); // NOI18N
        jbuFechar.setIcon(resourceMap.getIcon("jbuFechar.icon")); // NOI18N
        jbuFechar.setMnemonic('F');
        jbuFechar.setText(resourceMap.getString("jbuFechar.text")); // NOI18N
        jbuFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuFechar.setName("jbuFechar"); // NOI18N
        jbuFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuFecharActionPerformed(evt);
            }
        });
        jpaStatusIntegrante.add(jbuFechar);
        jbuFechar.setBounds(790, 570, 120, 33);
        jbuFechar.getAccessibleContext().setAccessibleName(resourceMap.getString("jbuFechar.AccessibleContext.accessibleName")); // NOI18N

        jspObservacoes.setName("jspObservacoes"); // NOI18N

        jtaObservacoes.setColumns(20);
        jtaObservacoes.setFont(resourceMap.getFont("jtaObservacoes.font")); // NOI18N
        jtaObservacoes.setLineWrap(true);
        jtaObservacoes.setRows(5);
        jtaObservacoes.setWrapStyleWord(true);
        jtaObservacoes.setName("jtaObservacoes"); // NOI18N
        jspObservacoes.setViewportView(jtaObservacoes);
        jtaObservacoes.getAccessibleContext().setAccessibleName(resourceMap.getString("jtaObservacoes.AccessibleContext.accessibleName")); // NOI18N

        jpaStatusIntegrante.add(jspObservacoes);
        jspObservacoes.setBounds(10, 190, 900, 370);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaStatusIntegrante, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaStatusIntegrante, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuFecharActionPerformed
        controlador.fecharTela();
    }//GEN-LAST:event_jbuFecharActionPerformed

    private void jbuSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuSalvarActionPerformed
        controlador.salvar();
    }//GEN-LAST:event_jbuSalvarActionPerformed

private void jbuSelecionarDataDesligamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuSelecionarDataDesligamentoActionPerformed
        JOptionPanePersonalizado.mostrarTelaSelecionarData(this, jftDataOcorrencia);
}//GEN-LAST:event_jbuSelecionarDataDesligamentoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        controlador.fecharTela();
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbuFechar;
    private javax.swing.JButton jbuSalvar;
    private javax.swing.JButton jbuSelecionarDataDesligamento;
    private javax.swing.JComboBox jcbStatus;
    private javax.swing.JCheckBox jchAprovado;
    private javax.swing.JCheckBox jchIgnorarReuniaoIntegracao;
    private javax.swing.JFormattedTextField jftDataOcorrencia;
    private javax.swing.JLabel jlaDataOcorrencia;
    private javax.swing.JLabel jlaObservacoes;
    private javax.swing.JLabel jlaStatus;
    private javax.swing.JLabel jlaUsuarioComunidade;
    private javax.swing.JPanel jpaStatusIntegrante;
    private javax.swing.JScrollPane jspObservacoes;
    private javax.swing.JTextArea jtaObservacoes;
    private javax.swing.JTextField jtfUsuarioComunidade;
    // End of variables declaration//GEN-END:variables
    private ControladorTelaGruposStatusIntegrante controlador;
}
