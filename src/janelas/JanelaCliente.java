/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import classes.Cliente;
import controladores.FuncoesCliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jean Camillo
 */
public class JanelaCliente extends javax.swing.JFrame {

    ArrayList<Cliente> ListaCliente = new ArrayList<Cliente>();
    String modoCliente;
    FuncoesCliente funcCliente = new FuncoesCliente();
    /**
     * Creates new form JanelaCliente
     */
    public JanelaCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        modoCliente = "Navegar";
        ManipulaInterfaceCliente();
        ListaCliente = funcCliente.CarregaTblClientes(tbl_clientes);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_clientes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        c_cli_cpf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        c_cli_nome = new javax.swing.JTextField();
        btn_cli_salvar = new javax.swing.JButton();
        btn_cli_cancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        c_cli_fone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        c_cli_idade = new javax.swing.JTextField();
        btn_cli_novo = new javax.swing.JButton();
        btn_cli_editar = new javax.swing.JButton();
        btn_cli_excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cliente");

        tbl_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Idade", "Fone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_clientes.getTableHeader().setReorderingAllowed(false);
        tbl_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_clientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_clientes);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cliente"));
        jPanel3.setToolTipText("Cfsd");

        jLabel1.setText("CPF:");

        jLabel2.setText("Nome:");

        btn_cli_salvar.setText("Salvar");
        btn_cli_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cli_salvarActionPerformed(evt);
            }
        });

        btn_cli_cancelar.setText("Cancelar");
        btn_cli_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cli_cancelarActionPerformed(evt);
            }
        });

        jLabel3.setText("Fone:");

        c_cli_fone.setName(""); // NOI18N

        jLabel5.setText("Idade:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(c_cli_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(c_cli_cpf))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(c_cli_idade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addComponent(c_cli_fone, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btn_cli_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cli_cancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(c_cli_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(c_cli_fone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(c_cli_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(c_cli_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cli_salvar)
                    .addComponent(btn_cli_cancelar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btn_cli_novo.setText("Novo");
        btn_cli_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cli_novoActionPerformed(evt);
            }
        });

        btn_cli_editar.setText("Editar");
        btn_cli_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cli_editarActionPerformed(evt);
            }
        });

        btn_cli_excluir.setText("Excluir");
        btn_cli_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cli_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_cli_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btn_cli_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(btn_cli_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cli_novo)
                    .addComponent(btn_cli_editar)
                    .addComponent(btn_cli_excluir))
                .addGap(13, 13, 13)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.getAccessibleContext().setAccessibleName("Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_clientesMouseClicked
        int index = tbl_clientes.getSelectedRow();
        if (index >= 0 && index < ListaCliente.size()) {
            Cliente cli = ListaCliente.get(index);
            c_cli_cpf.setText(String.valueOf(cli.getCPF()));
            c_cli_nome.setText(cli.getNome());
            c_cli_fone.setText(cli.getFone());
            c_cli_idade.setText(Integer.toString(cli.getIdade()));
            modoCliente = "Selecao";
            ManipulaInterfaceCliente();
        }
    }//GEN-LAST:event_tbl_clientesMouseClicked

    
     public void ManipulaInterfaceCliente() {
        switch (modoCliente) {
            case "Navegar":
                btn_cli_salvar.setEnabled(false);
                btn_cli_cancelar.setEnabled(false);
                c_cli_nome.setEnabled(false);
                c_cli_fone.setEnabled(false);
                c_cli_idade.setEnabled(false);
                c_cli_cpf.setEnabled(false);
                btn_cli_novo.setEnabled(true);
                btn_cli_editar.setEnabled(false);
                btn_cli_excluir.setEnabled(false);
                break;

            case "Novo":
                btn_cli_salvar.setEnabled(true);
                btn_cli_cancelar.setEnabled(true);
                c_cli_nome.setEnabled(true);
                c_cli_fone.setEnabled(true);
                c_cli_idade.setEnabled(true);
                c_cli_cpf.setEnabled(true);
                btn_cli_novo.setEnabled(false);
                btn_cli_editar.setEnabled(false);
                btn_cli_excluir.setEnabled(false);
                break;

            case "Editar":
                btn_cli_salvar.setEnabled(true);
                btn_cli_cancelar.setEnabled(true);
                c_cli_nome.setEnabled(true);
                c_cli_fone.setEnabled(true);
                c_cli_idade.setEnabled(true);
                c_cli_cpf.setEnabled(true);
                btn_cli_novo.setEnabled(true);
                btn_cli_editar.setEnabled(false);
                btn_cli_excluir.setEnabled(false);
                break;

            case "Excluir":
                btn_cli_salvar.setEnabled(false);
                btn_cli_cancelar.setEnabled(false);
                c_cli_nome.setEnabled(false);
                c_cli_fone.setEnabled(false);
                c_cli_idade.setEnabled(false);
                c_cli_cpf.setEnabled(false);
                btn_cli_novo.setEnabled(true);
                btn_cli_editar.setEnabled(false);
                btn_cli_excluir.setEnabled(false);
                break;

            case "Selecao":
                btn_cli_salvar.setEnabled(false);
                btn_cli_cancelar.setEnabled(false);
                c_cli_nome.setEnabled(false);
                c_cli_fone.setEnabled(false);
                c_cli_idade.setEnabled(false);
                c_cli_cpf.setEnabled(false);
                btn_cli_novo.setEnabled(true);
                btn_cli_editar.setEnabled(true);
                btn_cli_excluir.setEnabled(true);
                break;
            default:
                System.out.println("Modo inválido");
        }
    }
     
    private void btn_cli_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_salvarActionPerformed
        
        double cpf = Double.parseDouble(c_cli_cpf.getText());

        if (c_cli_cpf.getText().equals("") || c_cli_fone.getText().equals("") || c_cli_idade.getText().equals("") || c_cli_nome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Não é permitido campos em branco !");
        }else{
            if (modoCliente.equals("Novo")) {
                funcCliente.GravarClientes(ListaCliente, c_cli_nome.getText(), c_cli_fone.getText(), Integer.parseInt(c_cli_idade.getText()), c_cli_cpf.getText(), "Novo");
            } else if (modoCliente.equals("Editar")) {
                int index = tbl_clientes.getSelectedRow();
                ListaCliente.get(index).setCPF(Double.toString(cpf));
                ListaCliente.get(index).setNome(c_cli_nome.getText());
                ListaCliente.get(index).setFone(c_cli_fone.getText());
                ListaCliente.get(index).setIdade(Integer.parseInt(c_cli_idade.getText()));
                funcCliente.GravarClientes(ListaCliente, c_cli_nome.getText(), c_cli_fone.getText(), Integer.parseInt(c_cli_idade.getText()), c_cli_cpf.getText(), "Excluir/Editar");
            }
        }

        ListaCliente = funcCliente.CarregaTblClientes(tbl_clientes);
        modoCliente = "Navegar";
        ManipulaInterfaceCliente();
        c_cli_cpf.setText("");
        c_cli_fone.setText("");
        c_cli_idade.setText("");
        c_cli_nome.setText("");
    }//GEN-LAST:event_btn_cli_salvarActionPerformed

    private void btn_cli_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_cancelarActionPerformed
        c_cli_nome.setText("");
        c_cli_fone.setText("");
        c_cli_idade.setText("");
        c_cli_cpf.setText("");
        modoCliente = "Navegar";
        ManipulaInterfaceCliente();
    }//GEN-LAST:event_btn_cli_cancelarActionPerformed

    private void btn_cli_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_novoActionPerformed
        c_cli_nome.setText("");
        c_cli_fone.setText("");
        c_cli_idade.setText("");
        c_cli_cpf.setText("");

        modoCliente = "Novo";
        ManipulaInterfaceCliente();
    }//GEN-LAST:event_btn_cli_novoActionPerformed

    private void btn_cli_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_editarActionPerformed
        modoCliente = "Editar";
        ManipulaInterfaceCliente();
    }//GEN-LAST:event_btn_cli_editarActionPerformed

    private void btn_cli_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_excluirActionPerformed
        int index = tbl_clientes.getSelectedRow();

        if (index >= 0 && index < ListaCliente.size()) {
            ListaCliente.remove(index);
        }

        funcCliente.GravarClientes(ListaCliente, c_cli_nome.getText(), c_cli_fone.getText(), Integer.parseInt(c_cli_idade.getText()), c_cli_cpf.getText(), "Excluir/Editar");
        ListaCliente = funcCliente.CarregaTblClientes(tbl_clientes);
        modoCliente = "Navegar";
        ManipulaInterfaceCliente();
        c_cli_cpf.setText("");
        c_cli_fone.setText("");
        c_cli_idade.setText("");
        c_cli_nome.setText("");
    }//GEN-LAST:event_btn_cli_excluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cli_cancelar;
    private javax.swing.JButton btn_cli_editar;
    private javax.swing.JButton btn_cli_excluir;
    private javax.swing.JButton btn_cli_novo;
    private javax.swing.JButton btn_cli_salvar;
    private javax.swing.JTextField c_cli_cpf;
    private javax.swing.JTextField c_cli_fone;
    private javax.swing.JTextField c_cli_idade;
    private javax.swing.JTextField c_cli_nome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_clientes;
    // End of variables declaration//GEN-END:variables
}
