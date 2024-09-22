
package UI;
public class NDisciplineDialog extends javax.swing.JPanel {
    private javax.swing.JTextField discipline_md;
    private javax.swing.JTextField discipline_name;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;

    public NDisciplineDialog() {
        jLabel2 = new javax.swing.JLabel();
        discipline_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        discipline_md = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setName("new_discipline");

        jLabel2.setText("Nome");

        jLabel3.setText("Média/Ap");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(discipline_name, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(discipline_md))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(discipline_name, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(discipline_md))
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }
    
    public String getName() {return this.discipline_name.getText();}
    public String getNote() {return this.discipline_md.getText();}
}
