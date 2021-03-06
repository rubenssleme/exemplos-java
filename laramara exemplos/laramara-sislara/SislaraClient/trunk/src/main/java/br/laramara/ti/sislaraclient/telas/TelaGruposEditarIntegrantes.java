package br.laramara.ti.sislaraclient.telas;

import br.laramara.ti.sislaraclient.controladores.ControladorTelaGruposEditarIntegrantes;
import br.laramara.ti.sislaraclient.infra.PermissaoDeTelas;
import br.laramara.ti.sislaraclient.modelos.ModeloTabelaModuloPreCadastro;
import br.laramara.ti.sislaraclient.modelos.ModeloTabelaModuloUsuario;
import br.laramara.ti.sislaraclient.utilitarios.JOptionPanePersonalizado;
import br.laramara.ti.sislaracommons.dtos.grupo.GrupoDTO;
import br.laramara.ti.sislaracommons.dtos.grupo.ModuloPeriodoDTO;
import javax.swing.JDialog;

public class TelaGruposEditarIntegrantes extends javax.swing.JDialog {

    /** Creates new form TelaGruposEditarIntegrantes */
    public TelaGruposEditarIntegrantes(JDialog parent, GrupoDTO grupoDto, ModuloPeriodoDTO moduloPeriodoDto) {
        super(parent, true);
        initComponents();
        setLocationRelativeTo(parent);
        controlador = new ControladorTelaGruposEditarIntegrantes(this, grupoDto, moduloPeriodoDto, jtfGrupo, jtfModuloAtividade, jftProntuario, jtfUsuario, jftDataInicioUsuario, jcbStatus, jchIgnorarReuniaoIntegracao, jtaUsuarios, jtaComunidades);
        controlador.abrirSomenteSeHouverPermissaoEBloquearDTO(grupoDto.toStringApenasNomeETurma(), PermissaoDeTelas.GRUPO_TELA_EDICAO_VISUALIZAR);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpaEditarIntegrantesGrupo = new javax.swing.JPanel();
        jlaGrupo = new javax.swing.JLabel();
        jtfGrupo = new javax.swing.JTextField();
        jlaModuloAtividade = new javax.swing.JLabel();
        jtfModuloAtividade = new javax.swing.JTextField();
        jtpEditarIntegrantes = new javax.swing.JTabbedPane();
        jpaUsuarios = new javax.swing.JPanel();
        jlaProntuario = new javax.swing.JLabel();
        jftProntuario = new javax.swing.JFormattedTextField();
        jlaUsuario = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jlaDataInicioUsuario = new javax.swing.JLabel();
        jftDataInicioUsuario = new javax.swing.JFormattedTextField();
        jbuSelecionarDataInicioUsuario = new javax.swing.JButton();
        jlaStatus = new javax.swing.JLabel();
        jcbStatus = new javax.swing.JComboBox();
        jchIgnorarReuniaoIntegracao = new javax.swing.JCheckBox();
        jbuUtilizarUsuario = new javax.swing.JButton();
        jbuAdicionarUsuario = new javax.swing.JButton();
        jlaUsuarios = new javax.swing.JLabel();
        jspUsuarios = new javax.swing.JScrollPane();
        jtaUsuarios = new javax.swing.JTable();
        jbuStatus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jpaComunidade = new javax.swing.JPanel();
        jbuAdicionarParticipante = new javax.swing.JButton();
        jlaComunidades = new javax.swing.JLabel();
        jspComunidades = new javax.swing.JScrollPane();
        jtaComunidades = new javax.swing.JTable();
        jbuStatusParticipante = new javax.swing.JButton();
        jbuOrigem = new javax.swing.JButton();
        jbuSalvar = new javax.swing.JButton();
        jbuFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(TelaGruposEditarIntegrantes.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setName("Form"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jpaEditarIntegrantesGrupo.setBorder(javax.swing.BorderFactory.createLineBorder(resourceMap.getColor("jpaEditarIntegrantesGrupo.border.lineColor"))); // NOI18N
        jpaEditarIntegrantesGrupo.setName("jpaEditarIntegrantesGrupo"); // NOI18N
        jpaEditarIntegrantesGrupo.setLayout(null);

        jlaGrupo.setFont(resourceMap.getFont("jlaGrupo.font")); // NOI18N
        jlaGrupo.setText(resourceMap.getString("jlaGrupo.text")); // NOI18N
        jlaGrupo.setName("jlaGrupo"); // NOI18N
        jpaEditarIntegrantesGrupo.add(jlaGrupo);
        jlaGrupo.setBounds(10, 40, 43, 17);

        jtfGrupo.setEditable(false);
        jtfGrupo.setFont(resourceMap.getFont("jtfGrupo.font")); // NOI18N
        jtfGrupo.setText(resourceMap.getString("jtfGrupo.text")); // NOI18N
        jtfGrupo.setName("jtfGrupo"); // NOI18N
        jpaEditarIntegrantesGrupo.add(jtfGrupo);
        jtfGrupo.setBounds(10, 60, 190, 23);
        jtfGrupo.getAccessibleContext().setAccessibleName(resourceMap.getString("jtfGrupo.AccessibleContext.accessibleName")); // NOI18N

        jlaModuloAtividade.setFont(resourceMap.getFont("jlaModuloAtividade.font")); // NOI18N
        jlaModuloAtividade.setText(resourceMap.getString("jlaModuloAtividade.text")); // NOI18N
        jlaModuloAtividade.setName("jlaModuloAtividade"); // NOI18N
        jpaEditarIntegrantesGrupo.add(jlaModuloAtividade);
        jlaModuloAtividade.setBounds(210, 40, 180, 17);

        jtfModuloAtividade.setEditable(false);
        jtfModuloAtividade.setFont(resourceMap.getFont("jtfModuloAtividade.font")); // NOI18N
        jtfModuloAtividade.setText(resourceMap.getString("jtfModuloAtividade.text")); // NOI18N
        jtfModuloAtividade.setName("jtfModuloAtividade"); // NOI18N
        jpaEditarIntegrantesGrupo.add(jtfModuloAtividade);
        jtfModuloAtividade.setBounds(210, 60, 800, 23);
        jtfModuloAtividade.getAccessibleContext().setAccessibleName(resourceMap.getString("jtfModuloAtividade.AccessibleContext.accessibleName")); // NOI18N

        jtpEditarIntegrantes.setFont(resourceMap.getFont("jtpEditarIntegrantes.font")); // NOI18N
        jtpEditarIntegrantes.setName("jtpEditarIntegrantes"); // NOI18N

        jpaUsuarios.setName("jpaUsuarios"); // NOI18N
        jpaUsuarios.setLayout(null);

        jlaProntuario.setFont(resourceMap.getFont("jlaProntuario.font")); // NOI18N
        jlaProntuario.setText(resourceMap.getString("jlaProntuario.text")); // NOI18N
        jlaProntuario.setName("jlaProntuario"); // NOI18N
        jpaUsuarios.add(jlaProntuario);
        jlaProntuario.setBounds(10, 20, 80, 17);

        try {
            jftProntuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftProntuario.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        jftProntuario.setFont(resourceMap.getFont("jftProntuario.font")); // NOI18N
        jftProntuario.setName("jftProntuario"); // NOI18N
        jftProntuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jftProntuarioFocusLost(evt);
            }
        });
        jpaUsuarios.add(jftProntuario);
        jftProntuario.setBounds(10, 40, 80, 23);
        jftProntuario.getAccessibleContext().setAccessibleName(resourceMap.getString("jftProntuario.AccessibleContext.accessibleName")); // NOI18N

        jlaUsuario.setFont(resourceMap.getFont("jlaUsuario.font")); // NOI18N
        jlaUsuario.setText(resourceMap.getString("jlaUsuario.text")); // NOI18N
        jlaUsuario.setName("jlaUsuario"); // NOI18N
        jpaUsuarios.add(jlaUsuario);
        jlaUsuario.setBounds(100, 20, 100, 17);

        jtfUsuario.setEditable(false);
        jtfUsuario.setFont(resourceMap.getFont("jtfUsuario.font")); // NOI18N
        jtfUsuario.setName("jtfUsuario"); // NOI18N
        jpaUsuarios.add(jtfUsuario);
        jtfUsuario.setBounds(100, 40, 360, 23);
        jtfUsuario.getAccessibleContext().setAccessibleName(resourceMap.getString("jtfUsuario.AccessibleContext.accessibleName")); // NOI18N

        jlaDataInicioUsuario.setFont(resourceMap.getFont("jlaDataInicioUsuario.font")); // NOI18N
        jlaDataInicioUsuario.setText(resourceMap.getString("jlaDataInicioUsuario.text")); // NOI18N
        jlaDataInicioUsuario.setName("jlaDataInicioUsuario"); // NOI18N
        jpaUsuarios.add(jlaDataInicioUsuario);
        jlaDataInicioUsuario.setBounds(470, 20, 100, 17);

        try {
            jftDataInicioUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftDataInicioUsuario.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        jftDataInicioUsuario.setFont(resourceMap.getFont("jftDataInicioUsuario.font")); // NOI18N
        jftDataInicioUsuario.setName("jftDataInicioUsuario"); // NOI18N
        jpaUsuarios.add(jftDataInicioUsuario);
        jftDataInicioUsuario.setBounds(470, 40, 100, 23);
        jftDataInicioUsuario.getAccessibleContext().setAccessibleName(resourceMap.getString("jftDataInicioUsuario.AccessibleContext.accessibleName")); // NOI18N
        jftDataInicioUsuario.getAccessibleContext().setAccessibleDescription(resourceMap.getString("jftDataInicioUsuario.AccessibleContext.accessibleDescription")); // NOI18N

        jbuSelecionarDataInicioUsuario.setIcon(resourceMap.getIcon("jbuSelecionarDataInicioUsuario.icon")); // NOI18N
        jbuSelecionarDataInicioUsuario.setText(resourceMap.getString("jbuSelecionarDataInicioUsuario.text")); // NOI18N
        jbuSelecionarDataInicioUsuario.setBorderPainted(false);
        jbuSelecionarDataInicioUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuSelecionarDataInicioUsuario.setName("jbuSelecionarDataInicioUsuario"); // NOI18N
        jbuSelecionarDataInicioUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuSelecionarDataInicioUsuarioActionPerformed(evt);
            }
        });
        jpaUsuarios.add(jbuSelecionarDataInicioUsuario);
        jbuSelecionarDataInicioUsuario.setBounds(570, 40, 25, 25);
        jbuSelecionarDataInicioUsuario.getAccessibleContext().setAccessibleName(resourceMap.getString("jbuSelecionarDataInicioUsuario.AccessibleContext.accessibleName")); // NOI18N
        jbuSelecionarDataInicioUsuario.getAccessibleContext().setAccessibleDescription(resourceMap.getString("jbuSelecionarDataInicioUsuario.AccessibleContext.accessibleDescription")); // NOI18N

        jlaStatus.setFont(resourceMap.getFont("jlaStatus.font")); // NOI18N
        jlaStatus.setText(resourceMap.getString("jlaStatus.text")); // NOI18N
        jlaStatus.setName("jlaStatus"); // NOI18N
        jpaUsuarios.add(jlaStatus);
        jlaStatus.setBounds(600, 20, 120, 17);

        jcbStatus.setFont(resourceMap.getFont("jcbStatus.font")); // NOI18N
        jcbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jcbStatus.setName("jcbStatus"); // NOI18N
        jpaUsuarios.add(jcbStatus);
        jcbStatus.setBounds(600, 40, 120, 25);
        jcbStatus.getAccessibleContext().setAccessibleName(resourceMap.getString("jcbStatus.AccessibleContext.accessibleName")); // NOI18N

        jchIgnorarReuniaoIntegracao.setFont(resourceMap.getFont("jchIgnorarReuniaoIntegracao.font")); // NOI18N
        jchIgnorarReuniaoIntegracao.setText(resourceMap.getString("jchIgnorarReuniaoIntegracao.text")); // NOI18N
        jchIgnorarReuniaoIntegracao.setName("jchIgnorarReuniaoIntegracao"); // NOI18N
        jpaUsuarios.add(jchIgnorarReuniaoIntegracao);
        jchIgnorarReuniaoIntegracao.setBounds(730, 40, 250, 25);
        jchIgnorarReuniaoIntegracao.getAccessibleContext().setAccessibleName(resourceMap.getString("jchIgnorarReuniaoIntegracao.AccessibleContext.accessibleName")); // NOI18N

        jbuUtilizarUsuario.setFont(resourceMap.getFont("jbuUtilizarUsuario.font")); // NOI18N
        jbuUtilizarUsuario.setIcon(resourceMap.getIcon("jbuUtilizarUsuario.icon")); // NOI18N
        jbuUtilizarUsuario.setMnemonic('U');
        jbuUtilizarUsuario.setText(resourceMap.getString("jbuUtilizarUsuario.text")); // NOI18N
        jbuUtilizarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuUtilizarUsuario.setName("jbuUtilizarUsuario"); // NOI18N
        jbuUtilizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuUtilizarUsuarioActionPerformed(evt);
            }
        });
        jpaUsuarios.add(jbuUtilizarUsuario);
        jbuUtilizarUsuario.setBounds(730, 70, 120, 35);
        jbuUtilizarUsuario.getAccessibleContext().setAccessibleName(resourceMap.getString("jbuUtilizarUsuario.AccessibleContext.accessibleName")); // NOI18N

        jbuAdicionarUsuario.setFont(resourceMap.getFont("jbuAdicionarUsuario.font")); // NOI18N
        jbuAdicionarUsuario.setIcon(resourceMap.getIcon("jbuAdicionarUsuario.icon")); // NOI18N
        jbuAdicionarUsuario.setMnemonic('A');
        jbuAdicionarUsuario.setText(resourceMap.getString("jbuAdicionarUsuario.text")); // NOI18N
        jbuAdicionarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuAdicionarUsuario.setName("jbuAdicionarUsuario"); // NOI18N
        jbuAdicionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuAdicionarUsuarioActionPerformed(evt);
            }
        });
        jpaUsuarios.add(jbuAdicionarUsuario);
        jbuAdicionarUsuario.setBounds(860, 70, 130, 35);
        jbuAdicionarUsuario.getAccessibleContext().setAccessibleName(resourceMap.getString("jbuAdicionarUsuario.AccessibleContext.accessibleName")); // NOI18N

        jlaUsuarios.setFont(resourceMap.getFont("jlaUsuarios.font")); // NOI18N
        jlaUsuarios.setText(resourceMap.getString("jlaUsuarios.text")); // NOI18N
        jlaUsuarios.setName("jlaUsuarios"); // NOI18N
        jpaUsuarios.add(jlaUsuarios);
        jlaUsuarios.setBounds(10, 90, 90, 17);

        jspUsuarios.setName("jspUsuarios"); // NOI18N

        jtaUsuarios.setAutoCreateRowSorter(true);
        jtaUsuarios.setFont(resourceMap.getFont("jtaUsuarios.font")); // NOI18N
        jtaUsuarios.setModel(new ModeloTabelaModuloUsuario());
        jtaUsuarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtaUsuarios.setName("jtaUsuarios"); // NOI18N
        jtaUsuarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtaUsuariosMouseClicked(evt);
            }
        });
        jtaUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtaUsuariosKeyPressed(evt);
            }
        });
        jspUsuarios.setViewportView(jtaUsuarios);
        jtaUsuarios.getAccessibleContext().setAccessibleName(resourceMap.getString("jtaUsuarios.AccessibleContext.accessibleName")); // NOI18N

        jpaUsuarios.add(jspUsuarios);
        jspUsuarios.setBounds(10, 110, 840, 420);

        jbuStatus.setFont(resourceMap.getFont("jbuStatus.font")); // NOI18N
        jbuStatus.setIcon(resourceMap.getIcon("jbuStatus.icon")); // NOI18N
        jbuStatus.setMnemonic('t');
        jbuStatus.setText(resourceMap.getString("jbuStatus.text")); // NOI18N
        jbuStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuStatus.setName("jbuStatus"); // NOI18N
        jbuStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuStatusActionPerformed(evt);
            }
        });
        jpaUsuarios.add(jbuStatus);
        jbuStatus.setBounds(860, 110, 130, 35);
        jbuStatus.getAccessibleContext().setAccessibleName(resourceMap.getString("jbuRemoverUsuario.AccessibleContext.accessibleName")); // NOI18N

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setForeground(resourceMap.getColor("jLabel1.foreground")); // NOI18N
        jLabel1.setText("<html>N�o precisa passar na reuni�o<br>de integra��o.</html>");
        jLabel1.setName("jLabel1"); // NOI18N
        jpaUsuarios.add(jLabel1);
        jLabel1.setBounds(740, 4, 250, 40);

        jtpEditarIntegrantes.addTab(resourceMap.getString("jpaUsuarios.TabConstraints.tabTitle"), jpaUsuarios); // NOI18N

        jpaComunidade.setName("jpaComunidade"); // NOI18N
        jpaComunidade.setLayout(null);

        jbuAdicionarParticipante.setFont(resourceMap.getFont("jbuAdicionarParticipante.font")); // NOI18N
        jbuAdicionarParticipante.setIcon(resourceMap.getIcon("jbuAdicionarParticipante.icon")); // NOI18N
        jbuAdicionarParticipante.setMnemonic('A');
        jbuAdicionarParticipante.setText(resourceMap.getString("jbuAdicionarParticipante.text")); // NOI18N
        jbuAdicionarParticipante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuAdicionarParticipante.setName("jbuAdicionarParticipante"); // NOI18N
        jbuAdicionarParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuAdicionarParticipanteActionPerformed(evt);
            }
        });
        jpaComunidade.add(jbuAdicionarParticipante);
        jbuAdicionarParticipante.setBounds(850, 30, 130, 35);
        jbuAdicionarParticipante.getAccessibleContext().setAccessibleName(resourceMap.getString("jbuAdicionarParticipante.AccessibleContext.accessibleName")); // NOI18N

        jlaComunidades.setFont(resourceMap.getFont("jlaComunidades.font")); // NOI18N
        jlaComunidades.setText(resourceMap.getString("jlaComunidades.text")); // NOI18N
        jlaComunidades.setName("jlaComunidades"); // NOI18N
        jpaComunidade.add(jlaComunidades);
        jlaComunidades.setBounds(10, 10, 230, 17);

        jspComunidades.setName("jspComunidades"); // NOI18N

        jtaComunidades.setAutoCreateRowSorter(true);
        jtaComunidades.setFont(resourceMap.getFont("jtaComunidades.font")); // NOI18N
        jtaComunidades.setModel(new ModeloTabelaModuloPreCadastro());
        jtaComunidades.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtaComunidades.setName("jtaComunidades"); // NOI18N
        jtaComunidades.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jspComunidades.setViewportView(jtaComunidades);
        jtaComunidades.getAccessibleContext().setAccessibleName(resourceMap.getString("jtaComunidade.AccessibleContext.accessibleName")); // NOI18N

        jpaComunidade.add(jspComunidades);
        jspComunidades.setBounds(10, 30, 830, 490);

        jbuStatusParticipante.setFont(resourceMap.getFont("jbuStatusParticipante.font")); // NOI18N
        jbuStatusParticipante.setIcon(resourceMap.getIcon("jbuStatusParticipante.icon")); // NOI18N
        jbuStatusParticipante.setMnemonic('t');
        jbuStatusParticipante.setText(resourceMap.getString("jbuStatusParticipante.text")); // NOI18N
        jbuStatusParticipante.setToolTipText(resourceMap.getString("jbuStatusParticipante.toolTipText")); // NOI18N
        jbuStatusParticipante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuStatusParticipante.setName("jbuStatusParticipante"); // NOI18N
        jbuStatusParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuStatusParticipanteActionPerformed(evt);
            }
        });
        jpaComunidade.add(jbuStatusParticipante);
        jbuStatusParticipante.setBounds(850, 110, 130, 35);
        jbuStatusParticipante.getAccessibleContext().setAccessibleName(resourceMap.getString("jbuRemoverParticipante.AccessibleContext.accessibleName")); // NOI18N

        jbuOrigem.setFont(resourceMap.getFont("jbuOrigem.font")); // NOI18N
        jbuOrigem.setIcon(resourceMap.getIcon("jbuOrigem.icon")); // NOI18N
        jbuOrigem.setMnemonic('a');
        jbuOrigem.setText(resourceMap.getString("jbuOrigem.text")); // NOI18N
        jbuOrigem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuOrigem.setName("jbuOrigem"); // NOI18N
        jbuOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuOrigemActionPerformed(evt);
            }
        });
        jpaComunidade.add(jbuOrigem);
        jbuOrigem.setBounds(850, 70, 130, 35);

        jtpEditarIntegrantes.addTab(resourceMap.getString("jpaComunidade.TabConstraints.tabTitle"), jpaComunidade); // NOI18N

        jpaEditarIntegrantesGrupo.add(jtpEditarIntegrantes);
        jtpEditarIntegrantes.setBounds(10, 90, 1000, 570);

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
        jpaEditarIntegrantesGrupo.add(jbuSalvar);
        jbuSalvar.setBounds(10, 670, 130, 35);
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
        jpaEditarIntegrantesGrupo.add(jbuFechar);
        jbuFechar.setBounds(880, 670, 130, 35);
        jbuFechar.getAccessibleContext().setAccessibleName(resourceMap.getString("jbuFechar.AccessibleContext.accessibleName")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaEditarIntegrantesGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpaEditarIntegrantesGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuFecharActionPerformed
        controlador.desbloquearDTOeFecharTela();
    }//GEN-LAST:event_jbuFecharActionPerformed

    private void jbuUtilizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuUtilizarUsuarioActionPerformed
        controlador.localizarUsuario();
    }//GEN-LAST:event_jbuUtilizarUsuarioActionPerformed

    private void jbuAdicionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuAdicionarUsuarioActionPerformed
        controlador.adicionarIntegrante();
    }//GEN-LAST:event_jbuAdicionarUsuarioActionPerformed

    private void jbuSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuSalvarActionPerformed
        controlador.salvar();
    }//GEN-LAST:event_jbuSalvarActionPerformed

    private void jbuStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuStatusActionPerformed
        controlador.alterarModuloUsuarioSelecionado();
    }//GEN-LAST:event_jbuStatusActionPerformed

    private void jbuSelecionarDataInicioUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuSelecionarDataInicioUsuarioActionPerformed
        JOptionPanePersonalizado.mostrarTelaSelecionarData(this, jftDataInicioUsuario);
    }//GEN-LAST:event_jbuSelecionarDataInicioUsuarioActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        controlador.desbloquearDTOeFecharTela();
    }//GEN-LAST:event_formWindowClosing

    private void jbuAdicionarParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuAdicionarParticipanteActionPerformed
        controlador.adicionarComunidade();
    }//GEN-LAST:event_jbuAdicionarParticipanteActionPerformed

    private void jbuStatusParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuStatusParticipanteActionPerformed
        controlador.alterarModuloPreCadastroSelecionado();
    }//GEN-LAST:event_jbuStatusParticipanteActionPerformed

    private void jbuOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuOrigemActionPerformed
        controlador.alterarOrigem();
    }//GEN-LAST:event_jbuOrigemActionPerformed

    private void jftProntuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jftProntuarioFocusLost
        controlador.selecionarProntuario();
    }//GEN-LAST:event_jftProntuarioFocusLost

    private void jtaUsuariosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtaUsuariosKeyPressed
        controlador.transferirFocoNaTabulacao(evt);
        controlador.abrirTelaDeAlteracaoModuloUsuario(evt);
    }//GEN-LAST:event_jtaUsuariosKeyPressed

    private void jtaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtaUsuariosMouseClicked
        controlador.abrirTelaTexto(evt);
    }//GEN-LAST:event_jtaUsuariosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbuAdicionarParticipante;
    private javax.swing.JButton jbuAdicionarUsuario;
    private javax.swing.JButton jbuFechar;
    private javax.swing.JButton jbuOrigem;
    private javax.swing.JButton jbuSalvar;
    private javax.swing.JButton jbuSelecionarDataInicioUsuario;
    private javax.swing.JButton jbuStatus;
    private javax.swing.JButton jbuStatusParticipante;
    private javax.swing.JButton jbuUtilizarUsuario;
    private javax.swing.JComboBox jcbStatus;
    private javax.swing.JCheckBox jchIgnorarReuniaoIntegracao;
    private javax.swing.JFormattedTextField jftDataInicioUsuario;
    private javax.swing.JFormattedTextField jftProntuario;
    private javax.swing.JLabel jlaComunidades;
    private javax.swing.JLabel jlaDataInicioUsuario;
    private javax.swing.JLabel jlaGrupo;
    private javax.swing.JLabel jlaModuloAtividade;
    private javax.swing.JLabel jlaProntuario;
    private javax.swing.JLabel jlaStatus;
    private javax.swing.JLabel jlaUsuario;
    private javax.swing.JLabel jlaUsuarios;
    private javax.swing.JPanel jpaComunidade;
    private javax.swing.JPanel jpaEditarIntegrantesGrupo;
    private javax.swing.JPanel jpaUsuarios;
    private javax.swing.JScrollPane jspComunidades;
    private javax.swing.JScrollPane jspUsuarios;
    private javax.swing.JTable jtaComunidades;
    private javax.swing.JTable jtaUsuarios;
    private javax.swing.JTextField jtfGrupo;
    private javax.swing.JTextField jtfModuloAtividade;
    private javax.swing.JTextField jtfUsuario;
    private javax.swing.JTabbedPane jtpEditarIntegrantes;
    // End of variables declaration//GEN-END:variables
    private ControladorTelaGruposEditarIntegrantes controlador;
}
