
package GUi;
import APP.App;
import APP.Validator;
import MSg.Msg;
import TSq.Categoria;
import TSq.Tarefa;
import TSq.TarefaPrioritaria;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;


public class Mwindow extends javax.swing.JFrame {
    private App app = new App();
    private boolean form_tl = true;
    private boolean form_dt = true;
    private boolean form_ds = true;
    private boolean form_hr = true;
    private boolean form_mn = true;
    
    public Mwindow() {
        initComponents();
        notifications();
        
        // mudar estado
        ts_mc.addActionListener(e -> {
            String[] options = {"Pendente", "Concluida", "Atrasada"};
            String opt = (String) JOptionPane.showInputDialog (null,"Escolha uma opção:","Seleção de Opção",JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
            Categoria categoria = (Categoria) cb_categoria_main.getSelectedItem();
            String    tarefa_nm = tabela_tarefas.getValueAt(tabela_tarefas.getSelectedRow(), 0).toString();
            Tarefa tarefa = categoria.getTarefa(tarefa_nm);
            
            if (opt.equals("Pendente"))  tarefa.setStatus(Tarefa.PENDENTE);
            if (opt.equals("Atrasada"))  tarefa.setStatus(Tarefa.ATRASADA);
            if (opt.equals("Concluida")) tarefa.setStatus(Tarefa.CONCLUIDA);
            updateTableFilter();
        });
        
        // remoção
        ts_rm.addActionListener(e -> {
            Categoria categoria = (Categoria) cb_categoria_main.getSelectedItem();
            String    tarefa_nm = tabela_tarefas.getValueAt(tabela_tarefas.getSelectedRow(), 0).toString();
            Object[] options = {"Sim", "Não"};
            
            int result = JOptionPane.showOptionDialog(
                null,"Tem certeza","Remoção", 
                JOptionPane.OK_CANCEL_OPTION, 
                JOptionPane.PLAIN_MESSAGE, 
                null, options,options[0]
            );
            if ( result == JOptionPane.OK_OPTION ) {
                categoria.delTarefa(tarefa_nm);
                JOptionPane.showMessageDialog(rootPane,Msg.tf_removida());
                updateTableFilter();
            }
        });
        
        //edição
        ts_ed.addActionListener(e -> {
            int cat_selecionada_id = cb_categoria_main.getSelectedIndex();
            Categoria cat_selecionada = (Categoria) cb_categoria_main.getSelectedItem();
            String tarefa_nome = tabela_tarefas.getValueAt(tabela_tarefas.getSelectedRow(), 0).toString();
            Tarefa tarefa = cat_selecionada.getTarefa(tarefa_nome);
            Object[] options = {"Atualizar", "Cancelar"};
           
            
            editDialog editDialog = new editDialog(
                 app.getCategorias(),
                 cat_selecionada_id,
                 tarefa
            );
           
            int result = JOptionPane.showOptionDialog(
                null,editDialog,"Edição", 
                JOptionPane.OK_CANCEL_OPTION, 
                JOptionPane.PLAIN_MESSAGE, 
                null, options,options[0]
            );
            
            if ( result == JOptionPane.OK_OPTION ) {
                if ( tarefa instanceof TarefaPrioritaria ) {
                    ((TarefaPrioritaria) tarefa).editar(
                        editDialog.getTitl(),
                        editDialog.getData(),
                        editDialog.getDesc(),
                        editDialog.getNtfc(),
                        editDialog.getHora(),
                        editDialog.getMnut(),
                        editDialog.getPmAM()
                    );
                    
                }else{
                    tarefa.editar (
                        editDialog.getTitl(),
                        editDialog.getData(),
                        editDialog.getDesc(),
                        editDialog.getNtfc()
                    );
                }
                
                // mudança de categoria
                Categoria ct = editDialog.getSelectedCategoria();
                if ( !cat_selecionada.getNome().equals(ct.getNome())) {
                    cat_selecionada.moveTarefa(tarefa_nome, ct);
                }
                
                JOptionPane.showMessageDialog(rootPane,Msg.tf_modificada());
                this.updateTable();
            }
            
        });
    }
    
    public void updateCombos() {
        ArrayList<Categoria> categorias = app.getCategorias();
        cb_categoria_main.removeAllItems();
        cb_categoria_regs.removeAllItems();
        
        if ( categorias != null) {
            categorias.forEach(ct -> {
                cb_categoria_main.addItem(ct);
                cb_categoria_regs.addItem(ct);
            });
        }
    }
    
    public void updateTable() {
        Categoria categoria = (Categoria) cb_categoria_main.getSelectedItem();
        String[] head = new String[]{"Título", "Prazo final", "Status"};
        Object[][] data = ( categoria != null ) ? categoria.tarefasToMatriz() : new Object[0][0];
        
        DefaultTableModel model =  new DefaultTableModel(data, head) {
            @Override
             public boolean isCellEditable(int row, int column) {
                return false;
             }
        };
        tabela_tarefas.setModel(model);
    }
    
    public void updateTableFilter() {
        Categoria s_categoria = (Categoria) cb_categoria_main.getSelectedItem();
        String filter_by = tf_filter.getSelectedItem().toString();
        short  filter_opt = 0;
        Object[][] data = new Object[0][0];
        
        switch(filter_by) {
            case "Todas"      ->{filter_opt = 0;}
            case "Pendentes"  ->{filter_opt = 1;}
            case "Concluidas" ->{filter_opt = 2;}
            case "Atrasadas"  ->{filter_opt = 3;}
        }
        
        if ( s_categoria != null ) {
            String[] head = new String[]{"Título", "Prazo final", "Status"};
            if ( filter_opt == 0 )
                data = s_categoria.tarefasToMatriz();
            else
                data = s_categoria.tarefasToMatrizIfStatus(filter_opt);
            
            DefaultTableModel model =  new DefaultTableModel(data, head) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            tabela_tarefas.setModel(model);
        } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        right_mouse_menu = new javax.swing.JPopupMenu();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_turno = new javax.swing.JComboBox<>();
        jToggleButton1 = new javax.swing.JToggleButton();
        cb_categoria_main = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_tarefas = new javax.swing.JTable();
        tf_filter = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cb_categoria_regs = new javax.swing.JComboBox<>();
        data_lb = new javax.swing.JLabel();
        tf_data = new javax.swing.JTextField();
        titl_lb = new javax.swing.JLabel();
        tf_titl = new javax.swing.JTextField();
        tf_ntfc = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tf_desc = new javax.swing.JTextArea();
        registrar_bnt = new javax.swing.JButton();
        lb_hora = new javax.swing.JLabel();
        lb_mnut = new javax.swing.JLabel();
        tf_hora = new javax.swing.JTextField();
        tf_mnut = new javax.swing.JTextField();
        tf_pmam = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        tf_turno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        cb_categoria_main.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cb_categoria_main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_categoria_mainActionPerformed(evt);
            }
        });

        tabela_tarefas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Prazo final", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabela_tarefas.setToolTipText("double click, or right button mouse");
        tabela_tarefas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_tarefasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_tarefas);

        tf_filter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas", "Pendentes", "Concluidas","Atrasadas"}));
        tf_filter.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tf_filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_filterActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Categorias");

        cb_categoria_regs.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cb_categoria_regs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cb_categoria_regs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_categoria_regsActionPerformed(evt);
            }
        });

        data_lb.setText("Prazo Final / Data");

        tf_data.setToolTipText("dd/mm/aaaa");
        tf_data.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tf_data.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_dataKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_dataKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_dataKeyTyped(evt);
            }
        });

        titl_lb.setText("Título");

        tf_titl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tf_titl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_titlKeyReleased(evt);
            }
        });

        tf_ntfc.setText("  Notificar?");
        tf_ntfc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_ntfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ntfcActionPerformed(evt);
            }
        });

        jLabel4.setText("Anotações");

        tf_desc.setColumns(20);
        tf_desc.setLineWrap(true);
        tf_desc.setRows(5);
        tf_desc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tf_desc.setMargin(new java.awt.Insets(7, 7, 7, 7));
        tf_desc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_descKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tf_desc);

        registrar_bnt.setText("Registrar");
        registrar_bnt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        registrar_bnt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrar_bnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_bntActionPerformed(evt);
            }
        });

        lb_hora.setText("Hora");

        lb_mnut.setText("Minutos");

        tf_hora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_horaKeyReleased(evt);
            }
        });

        tf_mnut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_mnutKeyReleased(evt);
            }
        });

        tf_pmam.setText("depois do meio dia?");
        tf_pmam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pmamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tf_titl, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cb_categoria_regs, javax.swing.GroupLayout.Alignment.LEADING, 0, 203, Short.MAX_VALUE))
                            .addComponent(titl_lb)
                            .addComponent(tf_ntfc)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_data, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(data_lb)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lb_hora)
                                .addGap(66, 66, 66)
                                .addComponent(lb_mnut))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tf_pmam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(tf_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(tf_mnut, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(registrar_bnt, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(data_lb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_data, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_categoria_regs, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_hora)
                            .addComponent(lb_mnut))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_mnut, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(tf_hora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_pmam))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titl_lb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_titl, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_ntfc)))
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registrar_bnt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setMargin(new java.awt.Insets(4, 4, 4, 4));
        jMenuBar1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jMenuBar1AncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jMenu1.setText("Menu");
        jMenu1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu1MenuSelected(evt);
            }
        });

        jMenuItem1.setText("Nova Categoria");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Categorias");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);
        jMenuBar1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cb_categoria_main, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_filter, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(cb_categoria_main))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_ntfcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ntfcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ntfcActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        NcatDialog NCdialog = new NcatDialog();
        int result = JOptionPane.showConfirmDialog(
            null, NCdialog,"Nova Categoria", 
            JOptionPane.OK_CANCEL_OPTION, 
            JOptionPane.PLAIN_MESSAGE
        );
        
        if ( result == JOptionPane.OK_OPTION ) {
            if (app.addCategoria(NCdialog.getTitulo(),NCdialog.getPrioridade())) {
                JOptionPane.showMessageDialog(rootPane,Msg.ct_criada());
                updateCombos();
                return;
            }
            JOptionPane.showMessageDialog(rootPane,Msg.ct_dpicad());
            return;
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu1MenuSelected
        
    }//GEN-LAST:event_jMenu1MenuSelected

    private void jMenuBar1AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jMenuBar1AncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuBar1AncestorMoved

    private void registrar_bntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_bntActionPerformed
        Categoria s_categoria = (Categoria) cb_categoria_regs.getSelectedItem();   
        
        if (this.form_ds || this.form_dt || this.form_hr || this.form_mn || this.form_tl )
            return;
               
        if ( s_categoria != null ) {
            if (s_categoria.getPrioridade() > 1 ) {
                TarefaPrioritaria ntf = new TarefaPrioritaria (
                    tf_titl.getText(),tf_data.getText(),
                    tf_desc.getText(),tf_ntfc.isSelected(),
                    Short.parseShort(tf_hora.getText()),
                    Short.parseShort(tf_mnut.getText()),
                    tf_pmam.isSelected()
                );
                if (s_categoria.addTarefa(ntf)){
                    JOptionPane.showMessageDialog(rootPane,Msg.tf_criada());
                    updateTableFilter();
                    return;
                }
            }
            else {
                Tarefa ntf = new Tarefa (
                    tf_titl.getText(),tf_data.getText(),
                    tf_desc.getText(),tf_ntfc.isSelected()
                );
                if (s_categoria.addTarefa(ntf)){
                    JOptionPane.showMessageDialog(rootPane,Msg.tf_criada());
                    tf_data.setForeground(Color.black);
                    titl_lb.setForeground(Color.black);
                    updateTableFilter();
                    return;
                }
            }           
            JOptionPane.showMessageDialog(rootPane,Msg.tf_dpicad());
            return;
        }
    }//GEN-LAST:event_registrar_bntActionPerformed
      
    private void notifications() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Timestamp current_timestamp = new Timestamp(System.currentTimeMillis());
                if (!app.isEmpty()) {
                    app.getCategorias().forEach((Categoria categoria) -> {
                        if (!categoria.isEmpty())
                            categoria.getTarefas().forEach(tarefa -> {
                                Timestamp tarefa_tmsp = tarefa.getTimestamp();
                                long diff = Math.abs(tarefa_tmsp.getTime() - current_timestamp.getTime());

                                if (tarefa_tmsp.before(current_timestamp)) tarefa.setStatus(Tarefa.ATRASADA);
                                if (tarefa_tmsp.after(current_timestamp))  tarefa.setStatus(Tarefa.PENDENTE);

                                if ( diff <= 1000 ) {
                                    if (tarefa.getNotfy()) {
                                        Object[] options = {"M/concluída", "M/pendente"};
                                        int choice = JOptionPane.showOptionDialog (
                                            null, 
                                            tarefa.getDesc(),tarefa.getNome(),
                                            JOptionPane.DEFAULT_OPTION, 
                                            JOptionPane.INFORMATION_MESSAGE,
                                            null,options,options[0] 
                                        );
                                        if (choice == 0) tarefa.setStatus(Tarefa.CONCLUIDA);
                                        if (choice == 1) tarefa.setStatus(Tarefa.PENDENTE);
                                    }
                                }
                                
                                int row = tabela_tarefas.getSelectedRow();
                                updateTableFilter();
                                if (row >= 0 && row < tabela_tarefas.getRowCount())
                                    tabela_tarefas.setRowSelectionInterval(row, row);
                            });
                    });
                }
            }
         });
         timer.start();
    }
    
    private void tabela_tarefasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_tarefasMouseClicked
        if ( evt.getButton() == 3 || evt.getClickCount() == 2) {
            right_mouse_menu.add(ts_ed);
            right_mouse_menu.add(ts_rm);
            right_mouse_menu.add(ts_mc);
           
            right_mouse_menu.show( this, 
                evt.getPoint().x+20, 
                evt.getPoint().y+(right_mouse_menu.getHeight()*2)-20
            );
       }
    }//GEN-LAST:event_tabela_tarefasMouseClicked

    private void cb_categoria_mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_categoria_mainActionPerformed
        this.updateTable();
    }//GEN-LAST:event_cb_categoria_mainActionPerformed

    private void tf_filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_filterActionPerformed
       updateTableFilter();
    }//GEN-LAST:event_tf_filterActionPerformed

    private void cb_categoria_regsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_categoria_regsActionPerformed
        Categoria cat = (Categoria) cb_categoria_regs.getSelectedItem();
        if ( cat != null ) {
            if (cat.getPrioridade() == 1 ) {
                this.tf_hora.setVisible(false);
                this.tf_mnut.setVisible(false);
                this.lb_hora.setVisible(false);
                this.lb_mnut.setVisible(false);
                this.tf_pmam.setVisible(false);
            }
            else {
                this.tf_hora.setVisible(true);
                this.tf_mnut.setVisible(true);
                this.lb_hora.setVisible(true);
                this.lb_mnut.setVisible(true);
                this.tf_pmam.setVisible(true);
            }
        }
    }//GEN-LAST:event_cb_categoria_regsActionPerformed

    private void tf_pmamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pmamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pmamActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        CatsDialog catsdialog = new CatsDialog(null,true, app.getCategorias());
        catsdialog.setVisible(true);
        updateCombos();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void tf_dataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_dataKeyPressed
      
    }//GEN-LAST:event_tf_dataKeyPressed

    private void tf_dataKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_dataKeyTyped
      
    }//GEN-LAST:event_tf_dataKeyTyped

    private void tf_dataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_dataKeyReleased
        if (!Validator.validarData(tf_data.getText())) {
            tf_data.setForeground(Color.red);
            this.form_dt = true;
        }else {
           tf_data.setForeground(Color.black);
           this.form_dt = false;
        }
    }//GEN-LAST:event_tf_dataKeyReleased

    private void tf_titlKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_titlKeyReleased
       if (!Validator.validarTexto(tf_titl.getText(), 30)) {
            tf_titl.setForeground(Color.red);
            this.form_tl = true;
       }else {
           tf_titl.setForeground(Color.black);
           this.form_tl = false;
       }
    }//GEN-LAST:event_tf_titlKeyReleased

    private void tf_horaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_horaKeyReleased
        if (!Validator.validarHora(tf_hora.getText())) {
            tf_hora.setForeground(Color.red);
            this.form_hr = true;
        }else {
           tf_hora.setForeground(Color.black);
           this.form_hr = false;
        }
    }//GEN-LAST:event_tf_horaKeyReleased

    private void tf_mnutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_mnutKeyReleased
        if (!Validator.validarMinutos(tf_mnut.getText())) {
            tf_mnut.setForeground(Color.red);
            this.form_mn = true;
        }else {
           tf_mnut.setForeground(Color.black);
           this.form_mn = false;
        }
    }//GEN-LAST:event_tf_mnutKeyReleased

    private void tf_descKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_descKeyReleased
        if (!Validator.validarTexto(tf_desc.getText(), 300)) {
            tf_desc.setForeground(Color.red);
            this.form_ds = true;
       }else {
           tf_desc.setForeground(Color.black);
           this.form_ds = false;
       }
    }//GEN-LAST:event_tf_descKeyReleased
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FlatLightLaf.install();
                new Mwindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Categoria> cb_categoria_main;
    private javax.swing.JComboBox<Categoria> cb_categoria_regs;
    private javax.swing.JLabel data_lb;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lb_hora;
    private javax.swing.JLabel lb_mnut;
    private javax.swing.JButton registrar_bnt;
    private javax.swing.JPopupMenu right_mouse_menu;
    private javax.swing.JTable tabela_tarefas;
    private javax.swing.JTextField tf_data;
    private javax.swing.JTextArea tf_desc;
    private javax.swing.JComboBox<String> tf_filter;
    private javax.swing.JTextField tf_hora;
    private javax.swing.JTextField tf_mnut;
    private javax.swing.JCheckBox tf_ntfc;
    private javax.swing.JCheckBox tf_pmam;
    private javax.swing.JTextField tf_titl;
    private javax.swing.JComboBox<String> tf_turno;
    private javax.swing.JLabel titl_lb;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JMenuItem ts_ed = new javax.swing.JMenuItem("Editar");
    private javax.swing.JMenuItem ts_rm = new javax.swing.JMenuItem("Remover");
    private javax.swing.JMenuItem ts_mc = new javax.swing.JMenuItem("Mudar Status");

}
