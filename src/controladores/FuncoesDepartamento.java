/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Utils.ArquivoBinario;
import classes.Departamento;
import janelas.JanelaDepartamento;
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
 * @author Jean Camillo
 */
public class FuncoesDepartamento {

    File arquivo = new File("Departamentos.obj");
    ArquivoBinario util = new ArquivoBinario();
    ArrayList<Departamento> listaDep;

    public void GravarDepartamentos(ArrayList<Departamento> ListaDep, int codigo, String nome, String modo) {
        Departamento dep;

        try {
            if (modo.equals("Excluir/Editar")) {
                if (arquivo.delete()) {
                    ObjectOutputStream escritor = util.CriaEscritorBinario(arquivo, true);

                    for (int i = 0; i < ListaDep.size(); i++) {
                        dep = new Departamento(ListaDep.get(i).getCodigo(), ListaDep.get(i).getNome());
                        util.EscreveObjeto(escritor, dep, true);
                    }
                    escritor.close();
                } else {
                    JOptionPane.showMessageDialog(null, "Arquivo departamentos não foi excluído !");
                }
            } else if (modo.equals("Novo")) {
                dep = new Departamento(codigo, nome);
                ObjectOutputStream escritor = util.CriaEscritorBinario(arquivo, true);
                util.EscreveObjeto(escritor, dep, true);
                escritor.close();
            }

        } catch (IOException ex) {
            Logger.getLogger(FuncoesDepartamento.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void EditarDepartamentos(Departamento dep) {        

        try {
            ObjectOutputStream escritor = util.CriaEscritorBinario(arquivo, true);            
            util.EscreveObjeto(escritor, dep, true);            
            escritor.close();

        } catch (IOException ex) {
            Logger.getLogger(FuncoesDepartamento.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList CarregaTblDepartamentos(JTable tbl_dep_dpts) {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Código", "Nome"}, 0);

        try {
            ObjectInputStream leitor = util.CriaLeitorBinario(arquivo);
            listaDep = util.listaTodoArquivo(leitor);
            leitor.close();

            for (int i = 0; i < listaDep.size(); i++) {
                Object linha[] = new Object[]{listaDep.get(i).getCodigo(),
                    listaDep.get(i).getNome()};
                modelo.addRow(linha);
            }

            tbl_dep_dpts.setModel(modelo);
            tbl_dep_dpts.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbl_dep_dpts.getColumnModel().getColumn(1).setPreferredWidth(200);

        } catch (IOException ex) {
            Logger.getLogger(FuncoesDepartamento.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return listaDep;
        }

    }

    public ArrayList CarregaDBDepartamentos(JComboBox cb_func_deps) {

        try {
            ObjectInputStream leitor = util.CriaLeitorBinario(arquivo);
            listaDep = util.listaTodoArquivo(leitor);
            leitor.close();

            cb_func_deps.removeAllItems();
            cb_func_deps.addItem("Selecione");
            for (int i = 0; i < listaDep.size(); i++) {
                cb_func_deps.addItem(listaDep.get(i).getNome());
            }

        } catch (IOException ex) {
            Logger.getLogger(FuncoesDepartamento.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return listaDep;
        }

    }

}
