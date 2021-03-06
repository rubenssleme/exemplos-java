package br.laramara.ti.sislaraclient.telas;

import br.laramara.ti.sislaraclient.controladores.ControladorTelaGruposStatusIntegrantes;
import br.laramara.ti.sislaraclient.utilitarios.JOptionPanePersonalizado;
import br.laramara.ti.sislaracommons.dtos.grupo.ModuloPeriodoDTO;
import br.laramara.ti.sislaracommons.dtos.grupo.ModuloRelacaoBaseDTO;
import java.util.List;
import javax.swing.JDialog;

public class TelaGruposStatusIntegrantes extends javax.swing.JDialog {

    /**
     * Creates new form TelaGruposStatusIntegrantes
     */
    public TelaGruposStatusIntegrantes(JDialog parent, List<? extends ModuloRelacaoBaseDTO> modulosRelacaoDto, ModuloPeriodoDTO moduloPeriodoDto) {
        super(parent, true);
        initComponents();
        setLocationRelativeTo(parent);
        controlador = new ControladorTelaGruposStatusIntegrantes(this, modulosRelacaoDto, moduloPeriodoDto, jcbStatus, jftDataOcorrencia, jchAprovado, jepObservacoes);
        controlador.abrirTela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpaStatusIntegrantes = new javax.swing.JPanel();
        jlaStatus = new javax.swing.JLabel();
        jcbStatus = new javax.swing.JComboBox();
        jlaDataOcorrencia = new javax.swing.JLabel();
        jftDataOcorrencia = new javax.swing.JFormattedTextField();
        jlaObservacoes = new javax.swing.JLabel();
        jbuSelecionarDataDesligamento = new javax.swing.JButton();
        jchAprovado = new javax.swing.JCheckBox();
        jspObservacoes = new javax.swing.JScrollPane();
        jepObservacoes = new javax.swing.JEditorPane();
        jbuSalvar = new javax.swing.JButton();
        jbuFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar status dos integrantes");
        setLocationByPlatform(true);
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jpaStatusIntegrantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jpaStatusIntegrantes.setName("jpaStatusIntegrantes"); // NOI18N
        jpaStatusIntegrantes.setLayout(null);

        jlaStatus.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaStatus.setText("Status");
        jlaStatus.setName("jlaStatus"); // NOI18N
        jpaStatusIntegrantes.add(jlaStatus);
        jlaStatus.setBounds(10, 30, 90, 17);

        jcbStatus.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jcbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jcbStatus.setName("jcbStatus"); // NOI18N
        jpaStatusIntegrantes.add(jcbStatus);
        jcbStatus.setBounds(10, 50, 200, 25);

        jlaDataOcorrencia.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaDataOcorrencia.setText("Data da Ocorrência");
        jlaDataOcorrencia.setName("jlaDataOcorrencia"); // NOI18N
        jpaStatusIntegrantes.add(jlaDataOcorrencia);
        jlaDataOcorrencia.setBounds(220, 30, 170, 17);

        try {
            jftDataOcorrencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftDataOcorrencia.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        jftDataOcorrencia.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jftDataOcorrencia.setName("jftDataOcorrencia"); // NOI18N
        jpaStatusIntegrantes.add(jftDataOcorrencia);
        jftDataOcorrencia.setBounds(220, 50, 125, 23);

        jlaObservacoes.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaObservacoes.setText("Observações:");
        jlaObservacoes.setName("jlaObservacoes"); // NOI18N
        jpaStatusIntegrantes.add(jlaObservacoes);
        jlaObservacoes.setBounds(10, 110, 120, 17);

        jbuSelecionarDataDesligamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/laramara/ti/sislaraclient/telas/resources/icones/Calendario.png"))); // NOI18N
        jbuSelecionarDataDesligamento.setBorderPainted(false);
        jbuSelecionarDataDesligamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuSelecionarDataDesligamento.setName("jbuSelecionarDataDesligamento"); // NOI18N
        jbuSelecionarDataDesligamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuSelecionarDataDesligamentoActionPerformed(evt);
            }
        });
        jpaStatusIntegrantes.add(jbuSelecionarDataDesligamento);
        jbuSelecionarDataDesligamento.setBounds(350, 50, 25, 25);

        jchAprovado.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jchAprovado.setText("Aprovado");
        jchAprovado.setName("jchAprovado"); // NOI18N
        jpaStatusIntegrantes.add(jchAprovado);
        jchAprovado.setBounds(10, 80, 110, 25);

        jspObservacoes.setName("jspObservacoes"); // NOI18N

        jepObservacoes.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jepObservacoes.setName("jepObservacoes"); // NOI18N
        jspObservacoes.setViewportView(jepObservacoes);

        jpaStatusIntegrantes.add(jspObservacoes);
        jspObservacoes.setBounds(10, 130, 550, 160);

        jbuSalvar.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jbuSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/laramara/ti/sislaraclient/telas/resources/icones/Salvar.png"))); // NOI18N
        jbuSalvar.setMnemonic('S');
        jbuSalvar.setText("Salvar");
        jbuSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuSalvar.setName("jbuSalvar"); // NOI18N
        jbuSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuSalvarActionPerformed(evt);
            }
        });
        jpaStatusIntegrantes.add(jbuSalvar);
        jbuSalvar.setBounds(10, 300, 110, 33);

        jbuFechar.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jbuFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/laramara/ti/sislaraclient/telas/resources/icones/Fechar.png"))); // NOI18N
        jbuFechar.setMnemonic('F');
        jbuFechar.setText("Fechar");
        jbuFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuFechar.setName("jbuFechar"); // NOI18N
        jbuFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuFecharActionPerformed(evt);
            }
        });
        jpaStatusIntegrantes.add(jbuFechar);
        jbuFechar.setBounds(440, 300, 120, 33);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaStatusIntegrantes, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaStatusIntegrantes, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuSelecionarDataDesligamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuSelecionarDataDesligamentoActionPerformed
        JOptionPanePersonalizado.mostrarTelaSelecionarData(this, jftDataOcorrencia);
    }//GEN-LAST:event_jbuSelecionarDataDesligamentoActionPerformed

    private void jbuSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuSalvarActionPerformed
        controlador.salvar();
    }//GEN-LAST:event_jbuSalvarActionPerformed

    private void jbuFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuFecharActionPerformed
        controlador.fecharTela();
    }//GEN-LAST:event_jbuFecharActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        controlador.fecharTela();
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbuFechar;
    private javax.swing.JButton jbuSalvar;
    private javax.swing.JButton jbuSelecionarDataDesligamento;
    private javax.swing.JComboBox jcbStatus;
    private javax.swing.JCheckBox jchAprovado;
    private javax.swing.JEditorPane jepObservacoes;
    private javax.swing.JFormattedTextField jftDataOcorrencia;
    private javax.swing.JLabel jlaDataOcorrencia;
    private javax.swing.JLabel jlaObservacoes;
    private javax.swing.JLabel jlaStatus;
    private javax.swing.JPanel jpaStatusIntegrantes;
    private javax.swing.JScrollPane jspObservacoes;
    // End of variables declaration//GEN-END:variables
    private ControladorTelaGruposStatusIntegrantes controlador;
}
