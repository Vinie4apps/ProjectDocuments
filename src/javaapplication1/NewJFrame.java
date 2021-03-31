/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;



public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        matUser = new javax.swing.JLabel();
        regUser = new javax.swing.JLabel();
        nomeUser1 = new javax.swing.JLabel();
        imputName = new javax.swing.JTextField();
        imputReg = new javax.swing.JTextField();
        imputMat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        imputDate = new javax.swing.JFormattedTextField();
        matUser1 = new javax.swing.JLabel();
        matUser2 = new javax.swing.JLabel();
        clear_bnt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Meu programa");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(720, 600));

        matUser.setText("Digite a matricula :");

        regUser.setText("Digite o registro :");

        nomeUser1.setText("Digite o nome :");

        imputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imputNameActionPerformed(evt);
            }
        });

        imputReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imputRegActionPerformed(evt);
            }
        });

        imputMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imputMatActionPerformed(evt);
            }
        });

        jButton1.setText("Gerar documento");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Criado por Vinicius Fortes");

        imputDate.setColumns(1);
        imputDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        imputDate.setToolTipText("");
        imputDate.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        imputDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imputDateActionPerformed(evt);
            }
        });

        matUser1.setText("Digite a data de nascimento :");

        matUser2.setText("Formato (dd/mm/aa)");

        clear_bnt.setText("Limpar campos");
        clear_bnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_bntActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(regUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(matUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nomeUser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(matUser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imputName, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imputReg, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imputMat, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(imputDate, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(matUser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jButton1)
                .addGap(98, 98, 98)
                .addComponent(clear_bnt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regUser, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imputReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matUser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imputMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imputDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matUser2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(clear_bnt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imputNameActionPerformed
      
    }//GEN-LAST:event_imputNameActionPerformed

    private void imputRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imputRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imputRegActionPerformed

    private void imputMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imputMatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imputMatActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String s = this.imputName.getText();
        gerarPDF();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void imputDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imputDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imputDateActionPerformed

    private void clear_bntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_bntActionPerformed
        this.imputName.setText("");
        this.imputMat.setText("");
        this.imputReg.setText("");
        this.imputDate.setText("");
    }//GEN-LAST:event_clear_bntActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
        
    }
    public void gerarPDF (){ 
        
        Document doc = new Document();
        String Strtitulo = this.imputName.getText();
        String nomePDF = "C:\\Users\\vinic\\Desktop\\"+Strtitulo+".pdf";
        
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(nomePDF));
            doc.open();
            
            Paragraph p = new Paragraph("Documento cabeçalho");
            p.setAlignment(1);
            doc.add(p);
            
            p = new Paragraph("\n");
            doc.add(p);
            
            String Strnome = this.imputName.getText();
            Paragraph nome = new Paragraph("Nome: " + Strnome);
            nome.setAlignment(0);
            doc.add(nome);
            
            p = new Paragraph("\n");
            doc.add(p);
            
            String Strreg = this.imputReg.getText();
            Paragraph reg = new Paragraph("Registro: " + Strreg);
            reg.setAlignment(0);
            doc.add(reg);
            
            p = new Paragraph("\n");
            doc.add(p);
            
            String Strmat = this.imputMat.getText();
            Paragraph mat = new Paragraph("Matricula: " + Strmat);
            mat.setAlignment(0);
            doc.add(mat);
            
            p = new Paragraph("\n");
            doc.add(p);
            
            String Strdate = this.imputDate.getText();
            Paragraph date = new Paragraph("Data de nascimento: " + Strdate);
            date.setAlignment(0);
            doc.add(date);
            
            
            doc.close();
            
        } catch (Exception e){
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear_bnt;
    private javax.swing.JFormattedTextField imputDate;
    private javax.swing.JTextField imputMat;
    private javax.swing.JTextField imputName;
    private javax.swing.JTextField imputReg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel matUser;
    private javax.swing.JLabel matUser1;
    private javax.swing.JLabel matUser2;
    private javax.swing.JLabel nomeUser1;
    private javax.swing.JLabel regUser;
    // End of variables declaration//GEN-END:variables
}

