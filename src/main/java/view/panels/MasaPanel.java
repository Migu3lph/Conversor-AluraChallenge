package view.panels;

import controller.beans.ImportBeans;
import controller.logic.MasaLogic;
import controller.templates.ValuesReadersInterface;

public class MasaPanel extends javax.swing.JPanel implements ValuesReadersInterface {
    

    String[] masa = {
        "Milígramo",
        "Gramo",
        "Kilogramo",
        "Tonelada"
    };
    
    public MasaPanel() {
        initComponents();
        
        ImportBeans.justNumbers(textField1, textField2);
        ImportBeans.fillCombo(comboBox1, masa);
        ImportBeans.ImportImage("src/main/java/view/img/peso.png", jLabel1);
        ImportBeans.ImportImage("src/main/java/view/img/convertirW.png", actionBtn1);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rightPane1 = new view.modules.panels.RightPane();
        comboBox2 = new view.modules.comboBox.ComboBox();
        jLabel1 = new javax.swing.JLabel();
        panelTitle1 = new view.modules.txts.PanelTitle();
        textField1 = new view.modules.textFields.textField();
        textField2 = new view.modules.textFields.textField();
        actionBtn1 = new view.modules.btns.ActionBtn();
        comboBox1 = new view.modules.comboBox.ComboBox();

        rightPane1.setBackground(new java.awt.Color(51, 51, 51));

        comboBox2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setPreferredSize(new java.awt.Dimension(34, 34));

        panelTitle1.setText("Conversor de masa");

        textField1.setBackground(new java.awt.Color(102, 102, 102));

        textField2.setBackground(new java.awt.Color(102, 102, 102));
        textField2.setEnabled(false);

        actionBtn1.setBackground(new java.awt.Color(102, 102, 102));
        actionBtn1.setText("Convertir");
        actionBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionBtn1ActionPerformed(evt);
            }
        });

        comboBox1.setBackground(new java.awt.Color(102, 102, 102));
        comboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightPane1Layout = new javax.swing.GroupLayout(rightPane1);
        rightPane1.setLayout(rightPane1Layout);
        rightPane1Layout.setHorizontalGroup(
            rightPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPane1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(rightPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rightPane1Layout.createSequentialGroup()
                        .addGroup(rightPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(108, 108, 108)
                        .addGroup(rightPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(actionBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        rightPane1Layout.setVerticalGroup(
            rightPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPane1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(rightPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addGroup(rightPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114)
                .addGroup(rightPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(actionBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void actionBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionBtn1ActionPerformed
        ReaderValue();
    }//GEN-LAST:event_actionBtn1ActionPerformed

    private void comboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox1ActionPerformed
        ImportBeans.fillCombo(comboBox1, comboBox2, masa);
    }//GEN-LAST:event_comboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.modules.btns.ActionBtn actionBtn1;
    private view.modules.comboBox.ComboBox comboBox1;
    private view.modules.comboBox.ComboBox comboBox2;
    private javax.swing.JLabel jLabel1;
    private view.modules.txts.PanelTitle panelTitle1;
    private view.modules.panels.RightPane rightPane1;
    private view.modules.textFields.textField textField1;
    private view.modules.textFields.textField textField2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void ReaderValue() {
        
        MasaLogic ml = new MasaLogic();
        
        switch (comboBox1.getSelectedIndex()) {
            // Operaciones miligramos
            case 0 -> {
                switch (comboBox2.getSelectedIndex()) {
                    case 0 -> {
                        ml.miligramoToGramo(textField1, textField2, comboBox1, comboBox2);
                }
                    case 1 -> {
                        ml.miligramoToKilogramo(textField1, textField2, comboBox1, comboBox2);
                }
                    case 2 -> {
                        ml.miligramoToTonelada(textField1, textField2, comboBox1, comboBox2);
                }
                    default -> throw new AssertionError();
                }
            }
            
            // Operaciones gramos
            case 1 -> {
                switch (comboBox2.getSelectedIndex()) {
                    case 0 -> {
                        ml.gramoToMiligramo(textField1, textField2, comboBox1, comboBox2);
                }
                    case 1 -> {
                        ml.gramoToKilogramo(textField1, textField2, comboBox1, comboBox2);
                }
                    case 2 -> {
                        ml.gramoToTonelada(textField1, textField2, comboBox1, comboBox2);
                }
                    default -> throw new AssertionError();
                }
            }
            
            // Operaciones kilogramos
            case 2 -> {
                switch (comboBox2.getSelectedIndex()) {
                    case 0 -> {
                        ml.kilogramoToMiligramo(textField1, textField2, comboBox1, comboBox2);
                }
                    case 1 -> {
                        ml.kilogramoToGramo(textField1, textField2, comboBox1, comboBox2);
                }
                    case 2 -> {
                        ml.kilogramoToTonelada(textField1, textField2, comboBox1, comboBox2);
                }
                    default -> throw new AssertionError();
                }
            }
            
            // Operaciones toneladas
            case 3 -> {
                switch (comboBox2.getSelectedIndex()) {
                    case 0 -> {
                        ml.toneladaToMiligramo(textField1, textField2, comboBox1, comboBox2);
                }
                    case 1 -> {
                        ml.toneladaToGramo(textField1, textField2, comboBox1, comboBox2);
                }
                    case 2 -> {
                        ml.toneladaToKilogramo(textField1, textField2, comboBox1, comboBox2);
                }
                    default -> throw new AssertionError();
                }
            }
            default -> throw new AssertionError();
        }
    }
}
