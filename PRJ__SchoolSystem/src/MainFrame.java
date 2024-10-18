
import Tools.Matricula;
import Components.ComboInput;
import Components.TableIten;
import Tools.CheckInputs;
import java.awt.Color;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class MainFrame extends javax.swing.JFrame {
    private Mysql G_dbLink = new Mysql();
    private TableIten G_selectd_register = null;   
    private final int G_NO_UPDATE = -1;
    private int G_update_TAB1 = G_NO_UPDATE; 
    private int G_update_TAB2 = G_NO_UPDATE; 
    private int G_update_TAB3 = G_NO_UPDATE; 
    private int G_update_TAB4 = G_NO_UPDATE;
    private boolean runner_egg = true;

 
   
    public MainFrame() { initComponents(); }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        egg = new javax.swing.JLabel();
        forms = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        aluno_nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        aluno_email = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        aluno_turmas_info = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        aluno_cpf = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        aluno_telefone = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        aluno_genero = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        aluno_turma = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        aluno_bnt_registrar = new javax.swing.JButton();
        aluno_deficiente = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        aluno_endereco = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        aluno_nascimento = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        disciplina_nome = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        disciplina_sala = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        disciplina_responsavel = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        disciplina_ch = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        disciplina_detalhes_professor = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        disciplina_detalhes_turma = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        disciplina_semestre = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        disciplina_hora_entrada = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        disciplina_turma = new javax.swing.JComboBox<>();
        bnt_reg_disciplina = new javax.swing.JButton();
        disciplina_hora_saida = new javax.swing.JTextField();
        disciplina_dia = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        disciplina_media = new javax.swing.JTextField();
        disciplina_local_id = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        turma_nome = new javax.swing.JTextField();
        turma_proxima_turma = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        turma_nivel = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        turma_max_alunos = new javax.swing.JTextField();
        turma_max_disciplinas = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        turmas_regs_bnt = new javax.swing.JButton();
        turma_tuno = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        tm_tb = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        professor_nome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        professor_email = new javax.swing.JTextField();
        professor_telefone = new javax.swing.JTextField();
        professor_genero = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        professor_cpf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        professor_data_nascimento = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        professor_endereco = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        professor_descricao = new javax.swing.JTextArea();
        disciplina_bnt = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        aluno_faltas_table = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        table_detalhes_aluno = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        aluno_nota3 = new javax.swing.JTextField();
        aluno_nota2 = new javax.swing.JTextField();
        aluno_nota1 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        aluno_faltas = new javax.swing.JSpinner();
        jLabel38 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        aluno_data_falta = new javax.swing.JTextField();
        search_input = new javax.swing.JTextField();
        db_status = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_regs = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        table_regs_count = new javax.swing.JTable();
        jLabel43 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton9.setText("jButton9");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane10.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("crud 1.1");
        setFont(new java.awt.Font("Hack", 0, 12)); // NOI18N
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        egg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zorro_1.gif"))); // NOI18N
        egg.setAlignmentX(-90.0F);
        egg.setFocusable(false);
        egg.setInheritsPopupMenu(false);
        egg.setRequestFocusEnabled(false);
        egg.setVerifyInputWhenFocusTarget(false);

        forms.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                formsHierarchyChanged(evt);
            }
        });
        forms.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formsAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        forms.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                formsStateChanged(evt);
            }
        });
        forms.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formsFocusGained(evt);
            }
        });
        forms.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formsComponentShown(evt);
            }
        });

        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        jLabel1.setText("Nome");

        aluno_nome.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        aluno_nome.setToolTipText("nome do aluno");
        aluno_nome.setMargin(new java.awt.Insets(2, 10, 2, 10));
        aluno_nome.setPreferredSize(new java.awt.Dimension(64, 33));

        jLabel3.setText("Email");

        aluno_email.setToolTipText("exemplo@email.com");
        aluno_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aluno_emailActionPerformed(evt);
            }
        });

        aluno_turmas_info.setBackground(java.awt.SystemColor.window);
        aluno_turmas_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Disciplina", "Professor", "Local", "Carga H"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        aluno_turmas_info.setEnabled(false);
        aluno_turmas_info.setFocusable(false);
        aluno_turmas_info.setRowSelectionAllowed(false);
        aluno_turmas_info.setShowGrid(true);
        aluno_turmas_info.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(aluno_turmas_info);

        jLabel22.setText("CPF");

        aluno_cpf.setToolTipText("xxx.xxx.xxx-xx");
        aluno_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aluno_cpfActionPerformed(evt);
            }
        });

        jLabel25.setText("Telefone");

        aluno_telefone.setToolTipText("DD 9.xxxx-xxxx");

        jLabel26.setText("Genero");

        jLabel27.setText("Turma");

        aluno_turma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aluno_turmaActionPerformed(evt);
            }
        });

        aluno_bnt_registrar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        aluno_bnt_registrar.setText("Registrar");
        aluno_bnt_registrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        aluno_bnt_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aluno_bnt_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aluno_bnt_registrarMouseClicked(evt);
            }
        });
        aluno_bnt_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aluno_bnt_registrarActionPerformed(evt);
            }
        });

        aluno_deficiente.setText("Possue deficiencia?");
        aluno_deficiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aluno_deficiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aluno_deficienteActionPerformed(evt);
            }
        });

        jLabel5.setText("Endereço");

        jLabel29.setText("Data Nascimento");

        aluno_nascimento.setToolTipText("yyyy-mm-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel25)
                                .addGap(75, 75, 75))
                            .addComponent(aluno_deficiente)
                            .addComponent(aluno_nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aluno_cpf)
                                    .addComponent(aluno_genero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(aluno_telefone, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                        .addComponent(aluno_nascimento)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5)
                                        .addComponent(aluno_email, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                        .addComponent(aluno_endereco, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                        .addComponent(jLabel27)
                                        .addComponent(aluno_turma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(aluno_bnt_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel2)
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aluno_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aluno_email, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel25)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aluno_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aluno_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aluno_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel29)
                    .addComponent(jLabel27))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(aluno_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aluno_turma, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aluno_nascimento, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(21, 21, 21)
                .addComponent(aluno_deficiente)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(aluno_bnt_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        forms.addTab("+alunos", jPanel1);

        jPanel8.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel8ComponentShown(evt);
            }
        });

        jLabel19.setText("Nome");

        jLabel21.setText("Sala");

        jLabel15.setText("Prf. Responsavel");

        disciplina_responsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disciplina_responsavelActionPerformed(evt);
            }
        });

        jLabel18.setText("Carga/H");

        disciplina_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disciplina_chActionPerformed(evt);
            }
        });

        disciplina_detalhes_professor.setBackground(java.awt.SystemColor.window);
        disciplina_detalhes_professor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Email", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        disciplina_detalhes_professor.setEnabled(false);
        disciplina_detalhes_professor.setFocusable(false);
        disciplina_detalhes_professor.setRequestFocusEnabled(false);
        disciplina_detalhes_professor.setRowSelectionAllowed(false);
        jScrollPane6.setViewportView(disciplina_detalhes_professor);
        if (disciplina_detalhes_professor.getColumnModel().getColumnCount() > 0) {
            disciplina_detalhes_professor.getColumnModel().getColumn(0).setResizable(false);
            disciplina_detalhes_professor.getColumnModel().getColumn(1).setResizable(false);
            disciplina_detalhes_professor.getColumnModel().getColumn(2).setResizable(false);
        }

        disciplina_detalhes_turma.setBackground(java.awt.SystemColor.window);
        disciplina_detalhes_turma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Turno", "nivel", "Qtd. Alunos", "Qtd. Max Alunos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        disciplina_detalhes_turma.setEnabled(false);
        disciplina_detalhes_turma.setFocusable(false);
        disciplina_detalhes_turma.setRequestFocusEnabled(false);
        disciplina_detalhes_turma.setRowSelectionAllowed(false);
        disciplina_detalhes_turma.setShowGrid(true);
        jScrollPane7.setViewportView(disciplina_detalhes_turma);
        if (disciplina_detalhes_turma.getColumnModel().getColumnCount() > 0) {
            disciplina_detalhes_turma.getColumnModel().getColumn(0).setResizable(false);
            disciplina_detalhes_turma.getColumnModel().getColumn(1).setResizable(false);
            disciplina_detalhes_turma.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel6.setText("Detalhes da turma");

        jLabel20.setText("Detalhes do professor");

        jLabel30.setText("Semestre");

        jLabel31.setText("Dia");

        disciplina_hora_entrada.setToolTipText("HH:MM");

        jLabel32.setText("Turma");

        disciplina_turma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disciplina_turmaActionPerformed(evt);
            }
        });

        bnt_reg_disciplina.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        bnt_reg_disciplina.setText("Registrar");
        bnt_reg_disciplina.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bnt_reg_disciplina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bnt_reg_disciplina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnt_reg_disciplinaMouseClicked(evt);
            }
        });

        disciplina_hora_saida.setToolTipText("HH:MM");
        disciplina_hora_saida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disciplina_hora_saidaActionPerformed(evt);
            }
        });

        disciplina_dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segunda", "Terça", "Quarta", "Quinta","Sexta","Sabado"}));

        jLabel33.setText("Media APV");

        disciplina_local_id.setEditable(false);
        disciplina_local_id.setForeground(new java.awt.Color(204, 204, 204));
        disciplina_local_id.setFocusable(false);
        disciplina_local_id.setOpaque(true);
        disciplina_local_id.setRequestFocusEnabled(false);
        disciplina_local_id.setVerifyInputWhenFocusTarget(false);

        jLabel34.setText("H.Inicio");

        jLabel35.setText("H.término");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bnt_reg_disciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane6)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addComponent(jLabel30)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel33)
                                            .addGap(25, 25, 25))
                                        .addComponent(jLabel32)
                                        .addComponent(disciplina_turma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addComponent(disciplina_semestre, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(disciplina_media, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
                                    .addComponent(jLabel19)
                                    .addComponent(disciplina_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(disciplina_ch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(disciplina_sala))
                                    .addComponent(disciplina_responsavel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(disciplina_local_id)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel15)
                                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                                        .addGap(86, 86, 86)
                                                        .addComponent(jLabel21))
                                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(disciplina_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel31))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel34)
                                                            .addComponent(disciplina_hora_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(disciplina_hora_saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel35))))
                                        .addGap(2, 2, 2))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel20))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(34, 34, 34))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(disciplina_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(disciplina_responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(disciplina_ch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disciplina_sala, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(disciplina_semestre, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(disciplina_media))))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel31)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(disciplina_turma, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(disciplina_hora_saida, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(disciplina_hora_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(disciplina_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(disciplina_local_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bnt_reg_disciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );

        forms.addTab("+disciplinas", jPanel8);

        jPanel7.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel7AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel7FocusGained(evt);
            }
        });
        jPanel7.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel7ComponentShown(evt);
            }
        });

        jLabel13.setText("Nome");

        turma_nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                turma_nomeKeyTyped(evt);
            }
        });

        turma_proxima_turma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turma_proxima_turmaActionPerformed(evt);
            }
        });

        jLabel14.setText("Proxima turma");

        jLabel17.setText("nivel");

        turma_nivel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                turma_nivelItemStateChanged(evt);
            }
        });
        turma_nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turma_nivelActionPerformed(evt);
            }
        });

        jLabel12.setText("Max alunos");

        turma_max_disciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turma_max_disciplinasActionPerformed(evt);
            }
        });

        jLabel24.setText("Max Disciplinas");

        jLabel16.setText("Turno");

        turmas_regs_bnt.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        turmas_regs_bnt.setText("Registrar");
        turmas_regs_bnt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        turmas_regs_bnt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        turmas_regs_bnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                turmas_regs_bntMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                turmas_regs_bntMouseEntered(evt);
            }
        });

        tm_tb.setBackground(java.awt.SystemColor.window);
        tm_tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "nivel", "turno"
            }
        ));
        tm_tb.setAutoscrolls(false);
        tm_tb.setEnabled(false);
        tm_tb.setFocusable(false);
        tm_tb.setRowSelectionAllowed(false);
        tm_tb.setShowGrid(true);
        tm_tb.setUpdateSelectionOnSort(false);
        tm_tb.setVerifyInputWhenFocusTarget(false);
        jScrollPane5.setViewportView(tm_tb);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(turma_max_alunos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(turma_proxima_turma, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(turmas_regs_bnt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane5)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(turma_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                            .addComponent(turma_max_disciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(9, 9, 9))))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(turma_tuno, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)
                                    .addComponent(turma_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel17))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(turma_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(turma_nivel)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel12))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turma_tuno, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turma_max_alunos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turma_max_disciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(turma_proxima_turma, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(turmas_regs_bnt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );

        forms.addTab("+Turmas", jPanel7);

        jPanel6.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel6ComponentShown(evt);
            }
        });

        jLabel7.setText("Nome");

        jLabel9.setText("Email");

        professor_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professor_emailActionPerformed(evt);
            }
        });

        professor_telefone.setToolTipText("DD 9.xxxx-xxxx");

        professor_genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professor_generoActionPerformed(evt);
            }
        });

        jLabel4.setText("Telefone");

        jLabel8.setText("CPF");

        professor_cpf.setToolTipText("xxx.xxx.xxx-xx");
        professor_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professor_cpfActionPerformed(evt);
            }
        });

        jLabel10.setText("Genero");

        jLabel11.setText("Data Nasc.");

        professor_data_nascimento.setToolTipText("yyyy-mm-dd");

        jLabel23.setText("Endereço");

        jLabel28.setText("Resumo");

        professor_descricao.setColumns(20);
        professor_descricao.setRows(5);
        jScrollPane1.setViewportView(professor_descricao);

        disciplina_bnt.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        disciplina_bnt.setText("Registrar");
        disciplina_bnt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        disciplina_bnt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disciplina_bnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disciplina_bntMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(disciplina_bnt, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(professor_email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(professor_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9)))
                                    .addComponent(professor_telefone, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(120, 120, 120)
                                        .addComponent(jLabel11))
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(professor_cpf, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                            .addComponent(professor_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(professor_data_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel23)
                                    .addComponent(professor_endereco, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))))
                        .addGap(49, 49, 49))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(professor_cpf, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(professor_nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(professor_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(professor_data_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(professor_email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(professor_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(professor_endereco)
                        .addGap(2, 2, 2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(disciplina_bnt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        forms.addTab("+professores", jPanel6);

        aluno_faltas_table.setBackground(java.awt.SystemColor.window);
        aluno_faltas_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Turno", "Dia/Aula", "Faltas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        aluno_faltas_table.setAutoscrolls(false);
        aluno_faltas_table.setFocusable(false);
        aluno_faltas_table.setShowGrid(true);
        aluno_faltas_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aluno_faltas_tableMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(aluno_faltas_table);
        if (aluno_faltas_table.getColumnModel().getColumnCount() > 0) {
            aluno_faltas_table.getColumnModel().getColumn(0).setResizable(false);
            aluno_faltas_table.getColumnModel().getColumn(1).setResizable(false);
            aluno_faltas_table.getColumnModel().getColumn(2).setResizable(false);
            aluno_faltas_table.getColumnModel().getColumn(3).setResizable(false);
            aluno_faltas_table.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel37.setText("Histórico de faltas");

        table_detalhes_aluno.setBackground(java.awt.SystemColor.window);
        table_detalhes_aluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Matricula", "Nome", "CPF", "email"
            }
        ));
        table_detalhes_aluno.setAutoscrolls(false);
        table_detalhes_aluno.setEnabled(false);
        table_detalhes_aluno.setFocusable(false);
        table_detalhes_aluno.setRequestFocusEnabled(false);
        table_detalhes_aluno.setRowSelectionAllowed(false);
        table_detalhes_aluno.setUpdateSelectionOnSort(false);
        table_detalhes_aluno.setVerifyInputWhenFocusTarget(false);
        jScrollPane9.setViewportView(table_detalhes_aluno);

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton4.setText("Atualizar");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
        });

        aluno_nota3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aluno_nota3ActionPerformed(evt);
            }
        });

        jLabel40.setText("N1");

        jLabel41.setText("N2");

        jLabel42.setText("N3");

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel38.setText("Faltas");

        jLabel44.setText("Data/Aula ");

        aluno_data_falta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aluno_data_faltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(268, 268, 268)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(aluno_nota1)
                                                .addComponent(jLabel40)
                                                .addComponent(aluno_faltas))
                                            .addComponent(jLabel38))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel44)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(aluno_nota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel41)))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(aluno_nota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel42)))
                                            .addComponent(aluno_data_falta)))
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel41))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(aluno_nota1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aluno_nota2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aluno_nota3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(jLabel38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aluno_data_falta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aluno_faltas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator4)
                        .addContainerGap())))
        );

        forms.addTab("Notas e Faltas", jPanel2);

        search_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                search_inputKeyTyped(evt);
            }
        });

        db_status.setForeground(new java.awt.Color(102, 102, 102));
        db_status.setText("Desconectado");
        db_status.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton6.setText("modificar");
        jButton6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 102, 102));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 204));
        jButton7.setText("remover");
        jButton7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        table_regs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Nome", "Tipo/Registro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_regs.setColumnSelectionAllowed(true);
        table_regs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table_regs.setShowGrid(true);
        table_regs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_regsMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(table_regs);
        table_regs.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(153, 153, 153));
        jLabel39.setText("C.R.U.D 1.1");
        jLabel39.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel39MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel39MouseReleased(evt);
            }
        });

        table_regs_count.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_regs_count.setAutoscrolls(false);
        table_regs_count.setEnabled(false);
        table_regs_count.setFocusable(false);
        table_regs_count.setGridColor(new java.awt.Color(255, 255, 255));
        table_regs_count.setIntercellSpacing(new java.awt.Dimension(7, 7));
        table_regs_count.setRequestFocusEnabled(false);
        table_regs_count.setRowSelectionAllowed(false);
        table_regs_count.setShowGrid(false);
        table_regs_count.setUpdateSelectionOnSort(false);
        table_regs_count.setVerifyInputWhenFocusTarget(false);
        jScrollPane11.setViewportView(table_regs_count);

        jLabel43.setText("Busca por nome");

        jButton1.setBackground(new java.awt.Color(106, 133, 251));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Editar Notas/Faltas");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(forms, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(db_status)
                        .addGap(266, 266, 266)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 14, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(egg, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
                                    .addComponent(search_input, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(195, 195, 195))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(forms, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(db_status)
                .addGap(7, 7, 7))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search_input, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(egg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        G_dbLink.close();
    }//GEN-LAST:event_formWindowClosed

private void update_table_register() {
        DefaultTableModel model = (DefaultTableModel) table_regs.getModel();
        List<TableIten> regs = G_dbLink.listRegistres();
        model.setRowCount(0);
        
        if ( regs != null ) {
            regs.forEach(reg -> {
                model.addRow(new Object[]{reg,reg.getType()});
            });
        }
}
    
    private void alert(String msg) {
        JOptionPane.showMessageDialog(null,msg, "Avisos", JOptionPane.INFORMATION_MESSAGE);
    }
    
  
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        egg.setVisible(false);
        Gson gson = new Gson();
        
        String jarDir = new File(System.getProperty("user.dir")).getAbsolutePath();
        File jsonFile = new File(jarDir, "settings.json");
        
        try (FileInputStream fileInputStream = new FileInputStream(jsonFile)) {
            if (!jsonFile.exists()) {
                alert("Arquivo settings não encontrado");
                return;
            }

            InputStreamReader reader = new InputStreamReader(fileInputStream);
            Conection cnx = gson.fromJson(reader, Conection.class);

            if (G_dbLink.open(
                    cnx.getData_serv(),
                    cnx.getUser_name(),
                    cnx.getUser_pass(),
                    cnx.getData_name()
                )) {
                db_status.setText(G_dbLink.getStatus());
                update_table_register();
                update_combos();
            }
        } catch (IOException e) { e.printStackTrace();}
    }//GEN-LAST:event_formWindowOpened

     private void startTimeout(int milliseconds) {
        Timer timer = new Timer(milliseconds, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                egg.setVisible(true);
                startAnimation();
            }
        });
        timer.setRepeats(false); 
        timer.start();
    }
     
    private void startAnimation() {
        int[] x = {getWidth()-160}; 
        Timer timer;
       
        timer = new Timer(80, new ActionListener() {
            boolean animation = true;
            @Override
            public void actionPerformed(ActionEvent e) {
                if (animation) {
                    x[0] -= 25;
                     if (x[0] < (getWidth()/2)-160){
                        animation = false;
                        egg.setVisible(false);
                        return;
                    }
                    egg.setLocation(x[0], egg.getY()); 
                }
            }
        });
        timer.start();
    }

    
    private void update_combos() {
        if ( G_dbLink != null ) {
            List<ComboInput> levels = G_dbLink.listLevels();
            List<ComboInput> turnos = G_dbLink.listTurnos();
            List<ComboInput> turmas = G_dbLink.listTurmasIdNome();
            List<ComboInput> profrs = G_dbLink.listProfesIdNome();
            List<ComboInput> genero = G_dbLink.listGenders();
            
            turma_nivel.removeAllItems();
            turma_tuno.removeAllItems();
            aluno_genero.removeAllItems();
            aluno_turma.removeAllItems();
            disciplina_responsavel.removeAllItems();
            disciplina_turma.removeAllItems();
            professor_genero.removeAllItems();
            
            if (genero != null ){genero.forEach(option ->{professor_genero.addItem(option);});}
            if (turmas != null ){turmas.forEach(option ->{disciplina_turma.addItem(option);});}
            if (profrs != null ){profrs.forEach(option ->{disciplina_responsavel.addItem(option);});}
            if (turmas != null ){turmas.forEach(option ->{aluno_turma.addItem(option);});}
            if (genero != null ){genero.forEach(option ->{aluno_genero.addItem(option);});}
            if (levels != null ){levels.forEach(option ->{turma_nivel.addItem(option);});}
            if (turnos != null ){turnos.forEach(option ->{turma_tuno.addItem(option);});}
     
            
           Object[][] regsInfos = G_dbLink.select_registers_count();
           if (regsInfos != null && regsInfos.length > 0) {
                String[] colunas = {"Alunos", "Professores", "Disciplinas", "Turmas"};
                DefaultTableModel tableModel = new DefaultTableModel(regsInfos, colunas);
                table_regs_count.setModel(tableModel);
            }
        }
    }
    
    
    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
       if (G_selectd_register == null ){ return;}
        switch(G_selectd_register.getTable()) {
           case "alunos" -> {
               G_update_TAB1 = G_selectd_register.getId();
               if (G_update_TAB1 != G_NO_UPDATE ) {
                    List<String> alunoInfo = G_dbLink.select_aluno_byID(G_update_TAB1);
                    aluno_nome.setText(alunoInfo.get(0));
                    aluno_email.setText(alunoInfo.get(3));
                    aluno_cpf.setText(alunoInfo.get(1));
                    aluno_telefone.setText(alunoInfo.get(2));
                    aluno_endereco.setText(alunoInfo.get(4));
                    aluno_nascimento.setText(alunoInfo.get(8));
                    aluno_deficiente.setSelected((1 == Integer.parseInt(alunoInfo.get(6))));
                    
                    for (int i=0; i < aluno_turma.getItemCount(); i++) {
                        if (aluno_turma.getItemAt(i).getId() == Integer.parseInt(alunoInfo.get(7))) {
                            aluno_turma.setSelectedIndex(i);
                        }
                    }

                    for (int i=0; i < aluno_genero.getItemCount(); i++) {
                        if (aluno_genero.getItemAt(i).getId() == Integer.parseInt(alunoInfo.get(5))) {
                            aluno_genero.setSelectedIndex(i);
                        }
                    }
                    aluno_bnt_registrar.setText("Atualizar");
               }
               forms.setSelectedIndex(0);
            }
           
           case "disciplinas" -> {
               G_update_TAB2 = G_selectd_register.getId();
               if (G_update_TAB2 != G_NO_UPDATE ) {
                   List<String> disciplinaInfo = G_dbLink.select_disciplina_local_aula(G_update_TAB2);
                   disciplina_nome.setText(disciplinaInfo.get(0));
                   disciplina_semestre.setText(disciplinaInfo.get(1));
                   disciplina_media.setText(disciplinaInfo.get(2));
                   disciplina_nome.setText(disciplinaInfo.get(0));
                   disciplina_ch.setText(disciplinaInfo.get(5));
                   disciplina_sala.setText(disciplinaInfo.get(6));
                   disciplina_hora_entrada.setText(disciplinaInfo.get(7));
                   disciplina_hora_saida.setText(disciplinaInfo.get(8));
                   disciplina_local_id.setText(disciplinaInfo.get(10));
                   
                   for (int i=0; i < disciplina_turma.getItemCount(); i++) {
                        if (disciplina_turma.getItemAt(i).getId() == Integer.parseInt(disciplinaInfo.get(3))) {
                            disciplina_turma.setSelectedIndex(i);
                        }
                   }
                   
                   for (int i=0; i < disciplina_responsavel.getItemCount(); i++) {
                        if (disciplina_responsavel.getItemAt(i).getId() == Integer.parseInt(disciplinaInfo.get(4))) {
                            disciplina_responsavel.setSelectedIndex(i);
                        }
                   }
                   
                   for (int i=0; i < disciplina_dia.getItemCount(); i++) {
                        if (disciplina_dia.getSelectedItem().toString().equals(disciplinaInfo.get(9))) {
                            disciplina_dia.setSelectedIndex(i);
                        }
                   }
                   bnt_reg_disciplina.setText("Atualizar");
               }
               forms.setSelectedIndex(1);
            }
           
           case "turmas" -> {
               G_update_TAB3 = G_selectd_register.getId();
               if (G_update_TAB3 != G_NO_UPDATE ) {
                   List<String> turmasInfo = G_dbLink.select_detalhes_turmas_by_id(G_update_TAB3);
                   turma_nome.setText(turmasInfo.get(0));
                   turma_max_disciplinas.setText(turmasInfo.get(1));
                   turma_max_alunos.setText(turmasInfo.get(2));
                   
                   for (int i=0; i < turma_nivel.getItemCount(); i++) {
                        if (turma_nivel.getItemAt(i).getId() == Integer.parseInt(turmasInfo.get(3))) {
                            turma_nivel.setSelectedIndex(i);
                        }
                   }
                   
                   for (int i=0; i < turma_proxima_turma.getItemCount(); i++) {
                        if (turma_proxima_turma.getItemAt(i).getId() == Integer.parseInt(turmasInfo.get(5))) {
                            turma_proxima_turma.setSelectedIndex(i);
                        }
                   }
                   for (int i=0; i < turma_tuno.getItemCount(); i++) {
                        if (turma_tuno.getItemAt(i).getId() == Integer.parseInt(turmasInfo.get(4))) {
                            turma_tuno.setSelectedIndex(i);
                        }
                   }
                   turmas_regs_bnt.setText("Atualizar");
                   forms.setSelectedIndex(2);
               }
            }
           
           case "professores" -> {
               G_update_TAB4 = G_selectd_register.getId();
               if (G_update_TAB4 != G_NO_UPDATE ) {
                   List<String> professorInfos = G_dbLink.select_professor_by_id(G_update_TAB4);
                   professor_nome.setText(professorInfos.get(0));
                   professor_email.setText(professorInfos.get(1));
                   professor_cpf.setText(professorInfos.get(2));
                   professor_endereco.setText(professorInfos.get(4));
                   professor_data_nascimento.setText(professorInfos.get(5));
                   professor_descricao.setText(professorInfos.get(6));
                   professor_telefone.setText(professorInfos.get(7));
                   
                   for (int i=0; i < professor_genero.getItemCount(); i++) {
                        if (professor_genero.getItemAt(i).getId() == Integer.parseInt(professorInfos.get(3))) {
                            professor_genero.setSelectedIndex(i);
                        }
                   }
               }
               disciplina_bnt.setText("Atualizar");
               forms.setSelectedIndex(3);
            }
       }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        if (G_selectd_register == null ){ return;}
        if (
           G_selectd_register.getId() == G_update_TAB1 ||
           G_selectd_register.getId() == G_update_TAB2 || 
           G_selectd_register.getId() == G_update_TAB3 ||
           G_selectd_register.getId() == G_update_TAB4 
        ){
            alert("você não pode remover esse registro, ele está sendo atualizado !!");
            return;
        }

        if (G_selectd_register != null) {
            int resposta = JOptionPane.showOptionDialog(null,"Deseja continuar com a remoção?","opções - remover registro",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
            if (resposta == JOptionPane.YES_OPTION) {
                if (G_dbLink.removerRegistro(G_selectd_register)){
                    update_table_register();
                    JOptionPane.showMessageDialog(null, "registro removido", "Avisos", JOptionPane.INFORMATION_MESSAGE);
                    update_combos();
                }else {
                    JOptionPane.showMessageDialog(null, "registro não foi removido", "Avisos", JOptionPane.INFORMATION_MESSAGE);
                }
                G_selectd_register = null;
                return;
            } 
            else {return;}
        } 
        JOptionPane.showMessageDialog(null, "nenhum registro selecionado", "Avisos", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton7MouseClicked

    private void table_regsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_regsMouseClicked
       int row = table_regs.getSelectedRow();
       G_selectd_register = (TableIten) table_regs.getValueAt(row, 0); 
    }//GEN-LAST:event_table_regsMouseClicked

    private void formsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formsComponentShown

    }//GEN-LAST:event_formsComponentShown

    private void formsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formsFocusGained

    }//GEN-LAST:event_formsFocusGained

    private void formsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_formsStateChanged

    }//GEN-LAST:event_formsStateChanged

    private void formsAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formsAncestorAdded
       
    }//GEN-LAST:event_formsAncestorAdded

    private void formsHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formsHierarchyChanged

    }//GEN-LAST:event_formsHierarchyChanged

    private void jPanel6ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel6ComponentShown
       
    }//GEN-LAST:event_jPanel6ComponentShown

    private void disciplina_bntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disciplina_bntMouseClicked
        CheckInputs check_input = new CheckInputs();
        check_input.nome(professor_nome);
        check_input.cpf(professor_cpf);
        check_input.telefone(professor_telefone);
        check_input.email(professor_email);
        check_input.endereco(professor_endereco);
        check_input.data(professor_data_nascimento);
        check_input.textArea(professor_descricao,350);
        ComboInput genero = (ComboInput) professor_genero.getSelectedItem();

        if (genero == null || check_input.asErros()) {return;}
        if (G_update_TAB4 == G_NO_UPDATE) {
            boolean status =  G_dbLink.inserProfessor(
                professor_nome.getText(),
                professor_email.getText(),
                professor_telefone.getText(),
                professor_cpf.getText(),
                genero.getId(),
                professor_endereco.getText(),
                professor_data_nascimento.getText(),
                professor_descricao.getText());

            if (status) {
                alert("Professor cadastrado");
                professor_nome.setText("");
                professor_email.setText("");
                professor_telefone.setText("");
                professor_cpf.setText("");
                professor_endereco.setText("");
                professor_data_nascimento.setText("");
                professor_descricao.setText("");
                update_table_register();
                update_combos();
                return;
            }
            alert("ERRO: O professor não foi cadastrado");
            return;
        }
        boolean status = G_dbLink.updateProfessor(
            professor_nome.getText(),
            professor_email.getText(),
            professor_telefone.getText(),
            professor_cpf.getText(),
            genero.getId(),
            professor_endereco.getText(),
            professor_data_nascimento.getText(),
            professor_descricao.getText(),
            G_update_TAB4);
        if (status) {
            G_update_TAB4 = G_NO_UPDATE;
            alert("Professor Atualizado");
            professor_nome.setText("");
            professor_email.setText("");
            professor_telefone.setText("");
            professor_cpf.setText("");
            professor_endereco.setText("");
            professor_data_nascimento.setText("");
            professor_descricao.setText("");
            update_table_register();
            update_combos();
            disciplina_bnt.setText("Registrar");
            return;
        }
        alert("ERRO: O professor não foi atualizado");

    }//GEN-LAST:event_disciplina_bntMouseClicked

    private void professor_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professor_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_professor_cpfActionPerformed

    private void professor_generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professor_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_professor_generoActionPerformed

    private void professor_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professor_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_professor_emailActionPerformed

    private void jPanel7ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel7ComponentShown
        if (runner_egg) {
            startTimeout(3000);
            runner_egg = false;
        }
    }//GEN-LAST:event_jPanel7ComponentShown

    private void jPanel7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel7FocusGained

    }//GEN-LAST:event_jPanel7FocusGained

    private void jPanel7AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel7AncestorAdded

    }//GEN-LAST:event_jPanel7AncestorAdded

    private void turmas_regs_bntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turmas_regs_bntMouseClicked
        CheckInputs check_input = new CheckInputs();

        check_input.nome(turma_nome);
        check_input.numero(turma_max_disciplinas,0,100);
        check_input.numero(turma_max_alunos,1,400);
        ComboInput nivel = (ComboInput) turma_nivel.getSelectedItem();
        ComboInput turno = (ComboInput) turma_tuno.getSelectedItem();
        ComboInput proxima = (ComboInput) turma_proxima_turma.getSelectedItem();

        if (nivel == null || turno == null ) {return;}
        if (!check_input.asErros()) {
            if (G_update_TAB3 == G_NO_UPDATE)  {
                boolean status = G_dbLink.insertTurma(
                    turma_nome.getText(),nivel.getId(),
                    turno.getId(),
                    Integer.parseInt(turma_max_alunos.getText()),
                    Integer.parseInt(turma_max_disciplinas.getText()),
                    (proxima == null) ? 0 : proxima.getId());
                if (status) {
                    alert("Turma cadastrada");
                    update_table_register();
                    update_combos();
                    return;
                }
                alert("ERRO: A turma não foi cadastrada");
            }
            boolean status = G_dbLink.updateTurma(
                turma_nome.getText(),
                nivel.getId(),
                turno.getId(),
                Integer.parseInt(turma_max_alunos.getText()),
                Integer.parseInt(turma_max_disciplinas.getText()),
                (proxima == null) ? 0 : proxima.getId(),
                G_update_TAB3
            );
            if (status) {
                alert("Turma Atualizada");
                update_table_register();
                update_combos();
                G_update_TAB3 = G_NO_UPDATE;
                turma_nome.setText("");
                turma_max_alunos.setText("");
                turma_max_disciplinas.setText("");
                turmas_regs_bnt.setText("Registrar");
                return;
            }
            alert("ERRO: A turma não foi Atualizada");
        }
    }//GEN-LAST:event_turmas_regs_bntMouseClicked

    private void turma_max_disciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turma_max_disciplinasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_turma_max_disciplinasActionPerformed

    private void turma_nivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turma_nivelActionPerformed
        ComboInput selectd = (ComboInput) turma_nivel.getSelectedItem();
        
        if (selectd != null ) {
            List<ComboInput> turmas = G_dbLink.listTurmasAfter(selectd.getId());
              turma_proxima_turma.removeAllItems();
              if ( turmas != null ) {turmas.forEach(option ->{ turma_proxima_turma.addItem(option);});}
        }  
    }//GEN-LAST:event_turma_nivelActionPerformed

    private void turma_nivelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_turma_nivelItemStateChanged

    }//GEN-LAST:event_turma_nivelItemStateChanged

    private void turma_proxima_turmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turma_proxima_turmaActionPerformed
        ComboInput turmaPrx = (ComboInput) turma_proxima_turma.getSelectedItem();
        if ( turmaPrx != null ) {
            List<String> turma = G_dbLink.listTurmasNivelTurnoById(turmaPrx.getId());
            tm_tb.setValueAt(turma.get(0), 0, 0);
            tm_tb.setValueAt(turma.get(1), 0, 1);
        }
    }//GEN-LAST:event_turma_proxima_turmaActionPerformed

    private void turma_nomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_turma_nomeKeyTyped

    }//GEN-LAST:event_turma_nomeKeyTyped

    private void jPanel8ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel8ComponentShown

    }//GEN-LAST:event_jPanel8ComponentShown

    private void disciplina_hora_saidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disciplina_hora_saidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disciplina_hora_saidaActionPerformed

    private void bnt_reg_disciplinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnt_reg_disciplinaMouseClicked
        CheckInputs check_input = new CheckInputs();
        check_input.nome(disciplina_nome);
        check_input.sala(disciplina_sala);
        check_input.hora(disciplina_hora_entrada);
        check_input.hora(disciplina_hora_saida);
        check_input.numero(disciplina_semestre, 1, 20);
        check_input.numero(disciplina_media, 1, 10);
        check_input.numero(disciplina_ch, 1, Integer.MAX_VALUE);

        ComboInput turma = (ComboInput) disciplina_turma.getSelectedItem();
        ComboInput responsavel = (ComboInput) disciplina_responsavel.getSelectedItem();

        if (turma == null || responsavel == null ) {return;}
        if (!check_input.asErros()){
            if (G_update_TAB2 == G_NO_UPDATE ) {
                boolean status =  G_dbLink.insertDisciplina(
                    disciplina_sala.getText(),
                    disciplina_hora_entrada.getText(),
                    disciplina_hora_saida.getText(),
                    disciplina_dia.getSelectedItem().toString(),
                    disciplina_nome.getText(),
                    Integer.parseInt(disciplina_semestre.getText()),
                    Integer.parseInt(disciplina_media.getText()),
                    turma.getId(),
                    responsavel.getId(),
                    Integer.parseInt(disciplina_ch.getText())
                );
                if (status) {
                    alert("Disciplina cadastrada");
                    disciplina_sala.setText("");
                    disciplina_hora_entrada.setText("");
                    disciplina_hora_saida.setText("");
                    disciplina_nome.setText("");
                    disciplina_semestre.setText("");
                    disciplina_media.setText("");
                    disciplina_ch.setText("");
                    update_table_register();
                    update_combos();
                    return;
                }
                alert("ERRO: A Disciplina não foi cadastrada");
                return;
            }
            boolean status = G_dbLink.updateDisciplina (
                disciplina_sala.getText(),
                disciplina_hora_entrada.getText(),
                disciplina_hora_saida.getText(),
                disciplina_dia.getSelectedItem().toString(),
                disciplina_nome.getText(),
                Integer.parseInt(disciplina_semestre.getText()),
                Integer.parseInt(disciplina_media.getText()),
                turma.getId(),
                responsavel.getId(),
                Integer.parseInt(disciplina_ch.getText()),
                G_update_TAB2,
                Integer.parseInt(disciplina_local_id.getText())
            );
            if (status) {
                G_update_TAB2 = G_NO_UPDATE;
                alert("Disciplina Atualizada");
                disciplina_sala.setText("");
                disciplina_hora_entrada.setText("");
                disciplina_hora_saida.setText("");
                disciplina_nome.setText("");
                disciplina_semestre.setText("");
                disciplina_media.setText("");
                disciplina_ch.setText("");
                update_table_register();
                update_combos();
                bnt_reg_disciplina.setText("Registra");
                return;
            }
            alert(" [Error] Houve algum conflito de registros, e os dados não foram atualizados");
        }
    }//GEN-LAST:event_bnt_reg_disciplinaMouseClicked

    private void disciplina_turmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disciplina_turmaActionPerformed
        DefaultTableModel model = (DefaultTableModel) disciplina_detalhes_turma.getModel();
        ComboInput turma_id = (ComboInput) disciplina_turma.getSelectedItem();
        if (turma_id != null ) {
            model.setNumRows(0);
            model.addRow(G_dbLink.select_detalhes_turmas(turma_id.getId()));
        }
    }//GEN-LAST:event_disciplina_turmaActionPerformed

    private void disciplina_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disciplina_chActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disciplina_chActionPerformed

    private void disciplina_responsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disciplina_responsavelActionPerformed
        DefaultTableModel model = (DefaultTableModel) disciplina_detalhes_professor.getModel();
        ComboInput prof_id = (ComboInput) disciplina_responsavel.getSelectedItem();
        if (prof_id != null ) {
            model.setNumRows(0);
            model.addRow(G_dbLink.select_detalhes_professor(prof_id.getId()));
        }
    }//GEN-LAST:event_disciplina_responsavelActionPerformed

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown

    }//GEN-LAST:event_jPanel1ComponentShown

    private void aluno_deficienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aluno_deficienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aluno_deficienteActionPerformed

    private void aluno_bnt_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aluno_bnt_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aluno_bnt_registrarActionPerformed

    private void aluno_bnt_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aluno_bnt_registrarMouseClicked
        CheckInputs check_input = new CheckInputs();

        check_input.nome(aluno_nome);
        check_input.email(aluno_email);
        check_input.cpf(aluno_cpf);
        check_input.telefone(aluno_telefone);
        check_input.endereco(aluno_endereco);
        check_input.data(aluno_nascimento);

        ComboInput genero = (ComboInput) aluno_genero.getSelectedItem();
        ComboInput turmas = (ComboInput) aluno_turma.getSelectedItem();

        if (genero == null || turmas == null) {return;}
        if ( ! check_input.asErros()) {
            if ( G_update_TAB1 == G_NO_UPDATE ) {
                Matricula mat = new Matricula();

                boolean status = G_dbLink.insertAluno(
                    mat.gen(),
                    aluno_nome.getText(),
                    aluno_cpf.getText(),
                    aluno_telefone.getText(),
                    aluno_email.getText(),
                    aluno_endereco.getText(),
                    genero.getId(),
                    aluno_deficiente.isSelected(),
                    turmas.getId(),
                    aluno_nascimento.getText()
                );

                if (status) {
                    alert("Aluno cadastrado");
                    aluno_nascimento.setText("");
                    aluno_nome.setText("");
                    aluno_cpf.setText("");
                    aluno_telefone.setText("");
                    aluno_email.setText("");
                    aluno_endereco.setText("");
                    update_table_register();
                    update_combos();
                    return;
                }
                alert("ERRO: O aluno não foi cadastrado !!");
                return;
            }
            boolean status = G_dbLink.updateAluno(
                aluno_nome.getText(),
                aluno_cpf.getText(),
                aluno_telefone.getText(),
                aluno_email.getText(),
                aluno_endereco.getText(),
                genero.getId(),
                aluno_deficiente.isSelected(),
                turmas.getId(),
                aluno_nascimento.getText(), G_update_TAB1
            );
            if (status) {
                alert("Dados do aluno atualizados");
                aluno_nascimento.setText("");
                aluno_nome.setText("");
                aluno_cpf.setText("");
                aluno_telefone.setText("");
                aluno_email.setText("");
                aluno_endereco.setText("");
                update_table_register();
                update_combos();
                G_update_TAB1 = G_NO_UPDATE;
                aluno_bnt_registrar.setText("Registrar");
                return;
            }
            alert(" [Error] Houve algum conflito de registros, e os dados não foram atualizados");
        }
    }//GEN-LAST:event_aluno_bnt_registrarMouseClicked

    private void aluno_turmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aluno_turmaActionPerformed
        ComboInput selectd = (ComboInput) aluno_turma.getSelectedItem();
       
        if (selectd != null) {
            Object[][] turmasInfos = G_dbLink.getTurmaInfos(selectd.getId());
            String[] colunas = {"Nome", "Local", "Nível", "Turno"};
            DefaultTableModel tableModel = new DefaultTableModel(turmasInfos,colunas);
            aluno_turmas_info.setModel(tableModel);
        }
    }//GEN-LAST:event_aluno_turmaActionPerformed

    private void aluno_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aluno_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aluno_cpfActionPerformed

    private void aluno_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aluno_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aluno_emailActionPerformed

    private void aluno_nota3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aluno_nota3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aluno_nota3ActionPerformed

    private void turmas_regs_bntMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turmas_regs_bntMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_turmas_regs_bntMouseEntered

    private void jLabel39MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseReleased
        
    }//GEN-LAST:event_jLabel39MouseReleased

    private void jLabel39MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseEntered

    }//GEN-LAST:event_jLabel39MouseEntered

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       
    }//GEN-LAST:event_formComponentShown

    private void search_inputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_inputKeyTyped
       String search_term = search_input.getText();
       DefaultTableModel model = (DefaultTableModel) table_regs.getModel();
       List<TableIten> regs = G_dbLink.listRegistresByTerm(search_term);
       model.setRowCount(0);
        
       if ( regs != null ) {
            regs.forEach(reg -> {
                model.addRow(new Object[]{reg,reg.getType()});
            });
        }
       
    }//GEN-LAST:event_search_inputKeyTyped

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       if (G_selectd_register == null ){ return;}
       
       if (G_selectd_register.getTable().equals("alunos")) {
           DefaultTableModel model = (DefaultTableModel) table_detalhes_aluno.getModel();
           model.setNumRows(0);
           model.addRow(G_dbLink.select_detalhes_aluno_by_id(G_selectd_register.getId()));
           String aluno_matricula = table_detalhes_aluno.getValueAt(0,0).toString();
           
           Object[][] turmasInfos = G_dbLink.getFaltasInfos(aluno_matricula);
           String[] colunas = {"ID","Disciplina", "Turno", "Dia/Aula", "Faltas"};
           DefaultTableModel tableModel = new DefaultTableModel(turmasInfos,colunas);
           aluno_faltas_table.setModel(tableModel); 
           forms.setSelectedIndex(4);
           return;
       }
       
       alert("Voce precisa selecionar um aluno");
    }//GEN-LAST:event_jButton1MouseClicked

    private void aluno_data_faltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aluno_data_faltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aluno_data_faltaActionPerformed

    private void aluno_faltas_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aluno_faltas_tableMouseClicked
        int disciplina_id = Integer.parseInt(aluno_faltas_table.getValueAt(aluno_faltas_table.getSelectedRow(),0).toString());
        String aluno_matricula = table_detalhes_aluno.getValueAt(0,0).toString();
        
        List<String> dados = G_dbLink.select_notas_dia_faltas(disciplina_id,aluno_matricula);
        
        aluno_nota1.setText(dados.get(0));
        aluno_nota2.setText(dados.get(1));
        aluno_nota3.setText(dados.get(2));
        aluno_faltas.setValue(Integer.parseInt(dados.get(4)));
        aluno_data_falta.setText(dados.get(3));
    }//GEN-LAST:event_aluno_faltas_tableMouseClicked

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4KeyPressed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        CheckInputs check = new CheckInputs();
        int disciplina_id;
        
        try {
            disciplina_id = Integer.parseInt(aluno_faltas_table.getValueAt(aluno_faltas_table.getSelectedRow(),0).toString());
        }
        catch(ArrayIndexOutOfBoundsException e){return;}
        
        check.numero(aluno_nota1,0.0,100);
        check.numero(aluno_nota2,0.0,100);
        check.numero(aluno_nota3,0.0,100);
        check.data(aluno_data_falta);
        check.numero(aluno_faltas,0,900);
        
        if(!check.asErros()) {
            String aluno_matricula = table_detalhes_aluno.getValueAt(0,0).toString();
            boolean update_falta = G_dbLink.updateFaltas(aluno_matricula, disciplina_id,Integer.parseInt(aluno_faltas.getValue().toString()));
            boolean update_notas = G_dbLink.updateNotas(
                    Double.parseDouble(aluno_nota1.getText()),
                    Double.parseDouble(aluno_nota2.getText()),
                    Double.parseDouble(aluno_nota3.getText()),
                    aluno_matricula, 
                    disciplina_id
            );
            if (update_falta && update_notas) {
                Object[][] turmasInfos = G_dbLink.getFaltasInfos(aluno_matricula);
                String[] colunas = {"ID","Disciplina", "Turno", "Dia/Aula", "Faltas"};
                DefaultTableModel tableModel = new DefaultTableModel(turmasInfos,colunas);
                aluno_faltas_table.setModel(tableModel);  
                alert("Notas e faltas lançadas");
                update_combos();
                return;
            }
            alert("[Error] ouve algum erro interno");
            return;
        }
    }//GEN-LAST:event_jButton4MouseClicked

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            FlatLightLaf.install();
            new MainFrame().setVisible(true);
        });
        
    }
    
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aluno_bnt_registrar;
    private javax.swing.JTextField aluno_cpf;
    private javax.swing.JTextField aluno_data_falta;
    private javax.swing.JCheckBox aluno_deficiente;
    private javax.swing.JTextField aluno_email;
    private javax.swing.JTextField aluno_endereco;
    private javax.swing.JSpinner aluno_faltas;
    private javax.swing.JTable aluno_faltas_table;
    private javax.swing.JComboBox<ComboInput> aluno_genero;
    private javax.swing.JTextField aluno_nascimento;
    private javax.swing.JTextField aluno_nome;
    private javax.swing.JTextField aluno_nota1;
    private javax.swing.JTextField aluno_nota2;
    private javax.swing.JTextField aluno_nota3;
    private javax.swing.JTextField aluno_telefone;
    private javax.swing.JComboBox<ComboInput> aluno_turma;
    private javax.swing.JTable aluno_turmas_info;
    private javax.swing.JButton bnt_reg_disciplina;
    private javax.swing.JLabel db_status;
    private javax.swing.JButton disciplina_bnt;
    private javax.swing.JTextField disciplina_ch;
    private javax.swing.JTable disciplina_detalhes_professor;
    private javax.swing.JTable disciplina_detalhes_turma;
    private javax.swing.JComboBox<String> disciplina_dia;
    private javax.swing.JTextField disciplina_hora_entrada;
    private javax.swing.JTextField disciplina_hora_saida;
    private javax.swing.JTextField disciplina_local_id;
    private javax.swing.JTextField disciplina_media;
    private javax.swing.JTextField disciplina_nome;
    private javax.swing.JComboBox<ComboInput> disciplina_responsavel;
    private javax.swing.JTextField disciplina_sala;
    private javax.swing.JTextField disciplina_semestre;
    private javax.swing.JComboBox<ComboInput> disciplina_turma;
    private javax.swing.JLabel egg;
    private javax.swing.JTabbedPane forms;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField professor_cpf;
    private javax.swing.JTextField professor_data_nascimento;
    private javax.swing.JTextArea professor_descricao;
    private javax.swing.JTextField professor_email;
    private javax.swing.JTextField professor_endereco;
    private javax.swing.JComboBox<ComboInput> professor_genero;
    private javax.swing.JTextField professor_nome;
    private javax.swing.JTextField professor_telefone;
    private javax.swing.JTextField search_input;
    private javax.swing.JTable table_detalhes_aluno;
    private javax.swing.JTable table_regs;
    private javax.swing.JTable table_regs_count;
    private javax.swing.JTable tm_tb;
    private javax.swing.JTextField turma_max_alunos;
    private javax.swing.JTextField turma_max_disciplinas;
    private javax.swing.JComboBox<ComboInput> turma_nivel;
    private javax.swing.JTextField turma_nome;
    private javax.swing.JComboBox<ComboInput> turma_proxima_turma;
    private javax.swing.JComboBox<ComboInput> turma_tuno;
    private javax.swing.JButton turmas_regs_bnt;
    // End of variables declaration//GEN-END:variables
}
