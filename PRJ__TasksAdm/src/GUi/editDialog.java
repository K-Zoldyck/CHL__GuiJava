
package GUi;
import TSq.Categoria;
import TSq.Tarefa;
import TSq.TarefaPrioritaria;
import java.util.ArrayList;

public class editDialog extends javax.swing.JPanel {
    public editDialog (
            ArrayList<Categoria> categorias, 
            int categoria_selecionada, 
            Tarefa tarefa
    ) {
        initComponents();
        cb_categoria_regs.removeAllItems();
        categorias.forEach(ct -> { cb_categoria_regs.addItem(ct);});
        cb_categoria_regs.setSelectedIndex(categoria_selecionada);
      
        if (tarefa instanceof TarefaPrioritaria) {
            short hora = ((TarefaPrioritaria) tarefa).getHora();
            short mnut = ((TarefaPrioritaria) tarefa).getMnut();
            boolean pmam = ((TarefaPrioritaria) tarefa).getPmAm();
            
            this.tf_hora.setText(String.format("%d",hora));
            this.tf_mnut.setText(String.format("%d",mnut));
            this.tf_pmam.setSelected(pmam);
        }
        
        this.tf_data.setText(tarefa.getData());
        this.tf_desc.setText(tarefa.getDesc());
        this.tf_titl.setText(tarefa.getNome());
        this.tf_ntf.setSelected(tarefa.getNotfy());
    }

    
    public Categoria getSelectedCategoria(){ 
        Categoria ct = (Categoria)cb_categoria_regs.getSelectedItem();
        return (ct != null ) ? ct : null;
    }
    
    public String getData() {return tf_data.getText();}
    public String getDesc() {return tf_desc.getText();}
    public String getTitl() {return tf_titl.getText();}
    
    public short getHora() {return Short.parseShort(tf_hora.getText());}
    public short getMnut() {return Short.parseShort(tf_mnut.getText());}
    public boolean getNtfc() {return tf_ntf.isEnabled();}
    public boolean getPmAM() {return this.tf_pmam.isSelected();}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cb_categoria_regs = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        tf_data = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_titl = new javax.swing.JTextField();
        tf_ntf = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tf_desc = new javax.swing.JTextArea();
        lb_hora = new javax.swing.JLabel();
        tf_hora = new javax.swing.JTextField();
        lb_mnut = new javax.swing.JLabel();
        tf_mnut = new javax.swing.JTextField();
        tf_pmam = new javax.swing.JCheckBox();

        jLabel1.setText("Categoria");

        cb_categoria_regs.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cb_categoria_regs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_categoria_regsActionPerformed(evt);
            }
        });

        jLabel2.setText("Prazo Final / Data");

        tf_data.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Título");

        tf_titl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tf_ntf.setText("Notificar?");
        tf_ntf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ntfActionPerformed(evt);
            }
        });

        jLabel4.setText("Anotações");

        tf_desc.setColumns(20);
        tf_desc.setLineWrap(true);
        tf_desc.setRows(5);
        tf_desc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tf_desc.setMargin(new java.awt.Insets(7, 7, 7, 7));
        jScrollPane2.setViewportView(tf_desc);

        lb_hora.setText("Hora");

        tf_hora.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lb_mnut.setText("Minuto");

        tf_mnut.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tf_pmam.setText(" depois do meio-dia?");
        tf_pmam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pmamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(tf_titl, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cb_categoria_regs, javax.swing.GroupLayout.Alignment.LEADING, 0, 203, Short.MAX_VALUE))
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tf_ntf)
                                        .addGap(142, 142, 142)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_pmam, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lb_hora)
                                            .addGap(70, 70, 70)
                                            .addComponent(lb_mnut))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(tf_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(tf_mnut, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(tf_data)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_data, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_categoria_regs, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_hora)
                        .addComponent(lb_mnut)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_mnut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_titl, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ntf)
                    .addComponent(tf_pmam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tf_ntfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ntfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ntfActionPerformed

    private void cb_categoria_regsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_categoria_regsActionPerformed
        Categoria cat = (Categoria) cb_categoria_regs.getSelectedItem();
        if ( cat != null ) {
             if (cat.getPrioridade() <= 1 ) {
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Categoria> cb_categoria_regs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_hora;
    private javax.swing.JLabel lb_mnut;
    private javax.swing.JTextField tf_data;
    private javax.swing.JTextArea tf_desc;
    private javax.swing.JTextField tf_hora;
    private javax.swing.JTextField tf_mnut;
    private javax.swing.JCheckBox tf_ntf;
    private javax.swing.JCheckBox tf_pmam;
    private javax.swing.JTextField tf_titl;
    // End of variables declaration//GEN-END:variables
}
