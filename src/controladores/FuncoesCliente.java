/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Utils.ArquivoBinario;
import classes.Cliente;
import classes.Departamento;
import controladores.FuncoesDepartamento;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jean
 */
public class FuncoesCliente {
    File arquivo = new File("Clientes.obj");
    ArquivoBinario util = new ArquivoBinario();
    ArrayList<Cliente> ListaCliente;

    public void GravarClientes(ArrayList<Cliente> ListaCliente, String nome,String fone, int idade, String CPF, String modo) {
        Cliente cli;

        try {
            if (modo.equals("Excluir/Editar")) {
                if (arquivo.delete()) {
                    ObjectOutputStream escritor = util.CriaEscritorBinario(arquivo, true);

                    for (int i = 0; i < ListaCliente.size(); i++) {
                        cli = new Cliente(ListaCliente.get(i).getNome(), ListaCliente.get(i).getFone(), ListaCliente.get(i).getIdade(), ListaCliente.get(i).getCPF());
                        util.EscreveObjeto(escritor, cli, true);
                    }
                    escritor.close();
                }else{
                    JOptionPane.showMessageDialog(null, "Arquivo Clientes não foi excluído !");
                }
            } else if(modo.equals("Novo")){
                cli = new Cliente(nome, fone, idade, CPF);
                ObjectOutputStream escritor = util.CriaEscritorBinario(arquivo, true);
                util.EscreveObjeto(escritor, cli, true);
                escritor.close();
            }

        } catch (IOException ex) {
            Logger.getLogger(FuncoesDepartamento.class.getName()).log(Level.SEVERE, null, ex);
        }

    }    

    public ArrayList CarregaTblClientes(JTable tbl_clientes) {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"CPF","Nome", "Idade", "Fone"}, 0);

        try {
            ObjectInputStream leitor = util.CriaLeitorBinario(arquivo);
            ListaCliente = util.listaTodoArquivo(leitor);
            leitor.close();

            for (int i = 0; i < ListaCliente.size(); i++) {
                Object linha[] = new Object[]{ListaCliente.get(i).getCPF(),
                    ListaCliente.get(i).getNome(),
                    ListaCliente.get(i).getIdade(),
                    ListaCliente.get(i).getFone()};
                modelo.addRow(linha);
            }

            tbl_clientes.setModel(modelo);
            tbl_clientes.getColumnModel().getColumn(0).setPreferredWidth(150);
            tbl_clientes.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbl_clientes.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbl_clientes.getColumnModel().getColumn(3).setPreferredWidth(100);

        } catch (IOException ex) {
            Logger.getLogger(FuncoesCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return ListaCliente;
        }

    }      

    
}

   
    

