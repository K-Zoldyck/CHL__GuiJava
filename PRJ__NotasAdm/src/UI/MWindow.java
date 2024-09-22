
package UI;
import Bleach.Chk_inputs;
import Main.App;
import NotesAdm.Disciplina;
import NotesAdm.Prova;
import NotesAdm.Trabalho;
import com.formdev.flatlaf.FlatLightLaf;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MWindow extends javax.swing.JFrame {
    private App app = null;

    public MWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        forms = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        prov_cob_dsp = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        prov_name = new javax.swing.JTextField();
        prov_date = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        prov_nota = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        prov_desc = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        task_cob_dsp = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        task_titl = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        task_note = new javax.swing.JTextField();
        task_date = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        task_desc = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        task_deliv = new javax.swing.JCheckBox();
        cob_dsp_1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        prova_table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        trabalho_table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lb_media = new javax.swing.JLabel();
        lb_defit = new javax.swing.JLabel();
        lb_stats = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel10.setText("jLabel10");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NotasADM");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        forms.setBackground(new java.awt.Color(255, 255, 255));
        forms.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Disciplina");

        prov_cob_dsp.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Título");

        jLabel5.setText("Data");

        prov_name.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        prov_date.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setText("Nota ");

        prov_nota.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setText("Anotações");

        prov_desc.setColumns(20);
        prov_desc.setRows(5);
        prov_desc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane3.setViewportView(prov_desc);

        jButton5.setText("Adicionar");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                        .addContainerGap(242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prov_cob_dsp, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prov_name)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)
                                            .addComponent(prov_nota))
                                        .addComponent(prov_date, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prov_cob_dsp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prov_date, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prov_name, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(prov_nota, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(43, 43, 43)
                .addComponent(jLabel9)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        forms.addTab("+ Provas", jPanel1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("Disciplina");

        task_cob_dsp.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setText("Título");

        jLabel13.setText("Data");

        task_titl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setText("Nota");

        task_note.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        task_note.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                task_noteActionPerformed(evt);
            }
        });

        task_date.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel17.setText("Anotações");

        task_desc.setColumns(20);
        task_desc.setRows(5);
        task_desc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane4.setViewportView(task_desc);

        jButton6.setText("Adicionar");
        jButton6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        task_deliv.setText("Entregue?");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(task_cob_dsp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(task_deliv)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(task_note, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel17))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(task_titl, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(task_date, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(task_cob_dsp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(task_titl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(task_date, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(task_note, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(task_deliv)))
                .addGap(28, 28, 28)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        forms.addTab("+ Trabalhos", jPanel2);

        cob_dsp_1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cob_dsp_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cob_dsp_1ActionPerformed(evt);
            }
        });

        prova_table.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        prova_table.setFont(new java.awt.Font("Nimbus Sans", 0, 12)); // NOI18N
        prova_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Nota", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        prova_table.setAutoscrolls(false);
        prova_table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prova_table.setSelectionBackground(new java.awt.Color(0, 204, 102));
        prova_table.setSelectionForeground(new java.awt.Color(255, 255, 255));
        prova_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        prova_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        prova_table.setShowGrid(true);
        prova_table.getTableHeader().setReorderingAllowed(false);
        prova_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prova_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(prova_table);

        jButton1.setText("+");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        trabalho_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Título", "Nota", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        trabalho_table.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                trabalho_tableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        trabalho_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trabalho_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(trabalho_table);

        jLabel2.setText("Trabalhos");

        jLabel1.setText("Provas");

        lb_media.setText("Média:  0.0");

        lb_defit.setText("Défice: 0.0");

        lb_stats.setText("Status: ???");

        jButton2.setText("-");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Disciplinas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_media, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(lb_defit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(lb_stats, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cob_dsp_1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(forms, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(forms, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cob_dsp_1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_media)
                    .addComponent(lb_defit)
                    .addComponent(lb_stats))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void updateProvasTable() {
        Disciplina  ds = (Disciplina) cob_dsp_1.getSelectedItem();
        String[] head = new String[]{"Título", "Nota", "Data"};
        Object[][] data = (ds != null ) ? ds.provasToTable() : new Object[0][0];
        
        DefaultTableModel model = new DefaultTableModel(data, head) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };      
        prova_table.setModel(model);
        return;
    }
    
   
    public void updateTrablTable() {
        Disciplina  ds = (Disciplina) cob_dsp_1.getSelectedItem();
        String[] head = new String[]{"Título", "Nota", "Data"};
        Object[][] data = (ds != null ) ? ds.trablsToTable() : new Object[0][0];
            
        DefaultTableModel model = new DefaultTableModel(data, head) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        trabalho_table.setModel(model);
        return;
    }
    
    public void updateBarStatus() {
        Disciplina  ds = (Disciplina) cob_dsp_1.getSelectedItem();
        if (ds != null ) {
            lb_media.setText(ds.getMedia());
            lb_defit.setText(ds.getDefit());
            lb_stats.setText(ds.getStatus());
            return;
        }
        lb_media.setText("Média:  0.0");
        lb_defit.setText("Défice: 0.0");
        lb_stats.setText("Status: ???");
    }
    
    
    public void dataDumpWrite() {
        try {
            FileOutputStream fout = new FileOutputStream("data.ser");
            ObjectOutputStream output = new ObjectOutputStream(fout);
            output.writeObject(app);
            output.close();
        }catch(IOException o){}
    }
    
    
    public void dataDumpRead() throws ClassNotFoundException {
        try {
            FileInputStream fin = new FileInputStream("data.ser");
            ObjectInputStream output = new ObjectInputStream(fin);
            this.app = (App) output.readObject();
            output.close();
        }
        catch(IOException o){this.app = new App();}
    }

    public void sucess(String message) {
        JOptionPane.showMessageDialog (
                null,message,
                "Sucesso",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
    
    public void erro(String message) {
        JOptionPane.showMessageDialog (
                null,message,
                "Erro",
                JOptionPane.ERROR_MESSAGE
        );
    }
    
    public int Poup_options() {
        Object[] options= { "Ver detalhes", "Excluir" };
        int resp = JOptionPane.showOptionDialog(
                    null,"Escolha uma ação","",JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,null,
                    options,options[0]
         );
        return resp;
    }
    
    public int Poup_remove() {
        Object[] options= { "SIM", "NÃO" };
        int resp = JOptionPane.showOptionDialog(
                    null,"Tem certeza?","",JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,null,
                    options,options[0]
         );
        return resp;
    }
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       if (Chk_inputs.nameAsErro(prov_name)) return;
       if (Chk_inputs.nameAsErro(prov_date)) return;
       if (Chk_inputs.descAsErro(prov_desc)) return;
       if (Chk_inputs.notaAsErro(prov_nota)) return;
       Disciplina disciplina = (Disciplina) prov_cob_dsp.getSelectedItem();
       
       if ( disciplina != null ) {
           Prova new_prova = new Prova(
                   prov_name.getText(),
                   prov_date.getText(),
                   prov_desc.getText(),
                   Double.parseDouble(prov_nota.getText())
           );
           if (disciplina.addProva(new_prova)){
                prov_name.setText("");
                prov_date.setText("");
                prov_desc.setText("");
                prov_nota.setText("");
                this.sucess("Prova Adicionada");
                this.dataDumpWrite();
                this.updateProvasTable();
                updateBarStatus();
                return;
           }
            this.erro("Essa prova já foi adicionada");
            return;
       }
       this.erro("Selecione uma disciplina");
       return;
    }//GEN-LAST:event_jButton5ActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NDisciplineDialog dialog = new NDisciplineDialog();
        
        int result = JOptionPane.showConfirmDialog(
                null, dialog,"Nova Disciplina", 
                JOptionPane.OK_CANCEL_OPTION, 
                JOptionPane.PLAIN_MESSAGE
        );
        
        if (result == JOptionPane.OK_OPTION) {
            String discipline_name = dialog.getName();
            double discipline_note = Double.parseDouble(dialog.getNote());
            Disciplina new_ds = app.addDiscipline(discipline_name, discipline_note);
            
            if (new_ds != null) {
                this.sucess("Disciplina cadastrada !");
                cob_dsp_1.addItem(new_ds);
                prov_cob_dsp.addItem(new_ds);
                task_cob_dsp.addItem(new_ds);
                this.dataDumpWrite();
            }else{
                this.erro("Essa Disciplina já foi cadastrada");
                return;
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void task_noteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_task_noteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_task_noteActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       if (Chk_inputs.nameAsErro(task_titl)) return;
       if (Chk_inputs.nameAsErro(task_date)) return;
       if (Chk_inputs.descAsErro(task_desc)) return;
       if (Chk_inputs.notaAsErro(task_note)) return;
       Disciplina disciplina = (Disciplina) task_cob_dsp.getSelectedItem();
       
       if ( disciplina != null ) {
           Trabalho new_trabl = new Trabalho(
                   task_titl.getText(),
                   task_date.getText(),
                   task_desc.getText(),
                   Double.parseDouble(task_note.getText()),
                   task_deliv.isSelected()
           );
           if (disciplina.addTrabl(new_trabl)){
                task_titl.setText("");
                task_date.setText("");
                task_desc.setText("");
                task_note.setText("");
                this.sucess("Trabalho Adicionado");
                this.dataDumpWrite();
                updateTrablTable();
                updateBarStatus();
                return;
           }
            this.erro("Esse trabalho já foi adicionado");
            return;
       }
       this.erro("Selecione uma disciplina");
       return;
    }//GEN-LAST:event_jButton6ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            this.dataDumpRead(); 
        }catch (ClassNotFoundException ex) {}
        
        if (app != null) {
            ArrayList<Disciplina> ds_list = app.getDisciplinas();
            
            if (ds_list != null) {
                ds_list.forEach(ds -> {
                    cob_dsp_1.addItem(ds);
                    prov_cob_dsp.addItem(ds);
                    task_cob_dsp.addItem(ds);
                });
           }
        }
    }//GEN-LAST:event_formWindowOpened

    private void cob_dsp_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cob_dsp_1ActionPerformed
        if (cob_dsp_1.getSelectedItem() != null ) {
            this.updateProvasTable();
            this.updateTrablTable();
            updateBarStatus();
        }
    }//GEN-LAST:event_cob_dsp_1ActionPerformed

    private void prova_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prova_tableMouseClicked
        if (evt.getClickCount() == 2) {
            Disciplina disciplina = (Disciplina) cob_dsp_1.getSelectedItem();
            String ds_selectd = prova_table.getValueAt(prova_table.getSelectedRow(), 0).toString();
            int option = Poup_options();
            
            if ( option == JOptionPane.YES_OPTION) {
                Prova prova = disciplina.getProva(ds_selectd);
                DescDialog descdialog = new DescDialog();
                
                if ( prova != null ) {
                    descdialog.setTitle(prova.getName());
                    descdialog.setDate(prova.getDate());
                    descdialog.setDesc(prova.getDesc());
                    descdialog.setNote(String.format("%.1f",prova.getNota()));
                    
                    JOptionPane.showConfirmDialog (
                        null, descdialog,"Detalhes, Prova", 
                        JOptionPane.PLAIN_MESSAGE, 
                        JOptionPane.PLAIN_MESSAGE
                    );
                }
                
            }else if (option  == JOptionPane.NO_OPTION){
                if ( Poup_remove() == JOptionPane.YES_OPTION )
                    if (disciplina.remProva(ds_selectd)) {
                        this.sucess("Ok, prova removida");
                        this.updateProvasTable();
                        this.dataDumpWrite();
                        updateBarStatus();
                    }
            }
        }
    }//GEN-LAST:event_prova_tableMouseClicked

    private void trabalho_tableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_trabalho_tableAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_trabalho_tableAncestorAdded

    private void trabalho_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trabalho_tableMouseClicked
        if (evt.getClickCount() == 2) {
            Disciplina disciplina = (Disciplina) cob_dsp_1.getSelectedItem();
            String tb_selectd = trabalho_table.getValueAt(trabalho_table.getSelectedRow(), 0).toString();
            int option = Poup_options();
            
            if ( option == JOptionPane.YES_OPTION) {
                Trabalho trabl = disciplina.getTrabl(tb_selectd);
                DescDialog descdialog = new DescDialog();
                
                if ( trabl != null ) {
                    descdialog.setTitle(trabl.getName());
                    descdialog.setDate(trabl.getDate());
                    descdialog.setDesc(trabl.getDesc());
                    descdialog.setNote(String.format("%.1f",trabl.getNota()));
                    
                    JOptionPane.showConfirmDialog (
                        null, descdialog,"Detalhes,Trabalho", 
                        JOptionPane.PLAIN_MESSAGE, 
                        JOptionPane.PLAIN_MESSAGE
                    );
                }
                
                return;
            }else if (option  == JOptionPane.NO_OPTION)
                if ( Poup_remove() == JOptionPane.YES_OPTION )
                    if (disciplina.remTrabl(tb_selectd)) {
                        this.sucess("Ok, Trabalho removido");
                        this.updateTrablTable();
                        this.dataDumpWrite();
                        updateBarStatus();
                        return;
                    }
        }
    }//GEN-LAST:event_trabalho_tableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         Disciplina disciplina = (Disciplina) cob_dsp_1.getSelectedItem();
         
         if ( disciplina != null  && app.remDisciplina(disciplina.getName())) {
            ArrayList<Disciplina> ds_list = app.getDisciplinas();
            cob_dsp_1.removeAllItems();
            prov_cob_dsp.removeAllItems();
            task_cob_dsp.removeAllItems();
            
            if (ds_list != null) {
                ds_list.forEach(ds -> {
                    cob_dsp_1.addItem(ds);
                    prov_cob_dsp.addItem(ds);
                    task_cob_dsp.addItem(ds);
                });
            }
            this.sucess("Disciplina removida");
            this.updateBarStatus();
            this.updateProvasTable();
            this.updateTrablTable();
            this.dataDumpWrite();
        }
           
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FlatLightLaf.install();
                new MWindow().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<NotesAdm.Disciplina> cob_dsp_1;
    private javax.swing.JTabbedPane forms;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lb_defit;
    private javax.swing.JLabel lb_media;
    private javax.swing.JLabel lb_stats;
    private javax.swing.JComboBox<NotesAdm.Disciplina> prov_cob_dsp;
    private javax.swing.JTextField prov_date;
    private javax.swing.JTextArea prov_desc;
    private javax.swing.JTextField prov_name;
    private javax.swing.JTextField prov_nota;
    private javax.swing.JTable prova_table;
    private javax.swing.JComboBox<NotesAdm.Disciplina> task_cob_dsp;
    private javax.swing.JTextField task_date;
    private javax.swing.JCheckBox task_deliv;
    private javax.swing.JTextArea task_desc;
    private javax.swing.JTextField task_note;
    private javax.swing.JTextField task_titl;
    private javax.swing.JTable trabalho_table;
    // End of variables declaration//GEN-END:variables
}
