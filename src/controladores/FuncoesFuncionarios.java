/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Utils.ArquivoBinario;
import classes.Departamento;
import classes.Funcionario;
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
public class FuncoesFuncionarios {

    File arquivo = new File("Funcionarios.obj");
    ArquivoBinario util = new ArquivoBinario();
    ArrayList<Funcionario> listaFunc;

    public void GravarFuncionario(ArrayList<Funcionario> ListaFunc, int matricula, String nome, Departamento dep, String modo) {
        Funcionario func;

        try {
            if (modo.equals("Editar")) {
                ExcluirFuncionario(ListaFunc);
            } else if (modo.equals("Novo")) {
                func = new Funcionario(matricula, nome, dep);
                ObjectOutputStream escritor = util.CriaEscritorBinario(arquivo, true);
                util.EscreveObjeto(escritor, func, true);
                escritor.close();
            }

        } catch (IOException ex) {
            Logger.getLogger(FuncoesDepartamento.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void ExcluirFuncionario(ArrayList<Funcionario> ListaFunc) {
        Funcionario func;

        try {
            if (arquivo.delete()) {
                ObjectOutputStream escritor = util.CriaEscritorBinario(arquivo, true);

                for (int i = 0; i < listaFunc.size(); i++) {
                    func = new Funcionario(listaFunc.get(i).getMatricula(), listaFunc.get(i).getNome(), listaFunc.get(i).getDep());
                    util.EscreveObjeto(escritor, func, true);
                }
                escritor.close();
            } else {
                JOptionPane.showMessageDialog(null, "Arquivo funcionaios.obj não foi excluído !");                
            }

        } catch (IOException ex) {
            Logger.getLogger(FuncoesDepartamento.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList CarregaTblFuncionarios(JTable tbl_func_funcs) {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Matrícula", "Nome", "Departamento"}, 0);

        try {
            ObjectInputStream leitor = util.CriaLeitorBinario(arquivo);
            listaFunc = util.listaTodoArquivo(leitor);
            leitor.close();

            for (int i = 0; i < listaFunc.size(); i++) {
                Object linha[] = new Object[]{listaFunc.get(i).getMatricula(),listaFunc.get(i).getNome(),listaFunc.get(i).getDep().getNome()};
                modelo.addRow(linha);
            }

            tbl_func_funcs.setModel(modelo);
            tbl_func_funcs.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbl_func_funcs.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbl_func_funcs.getColumnModel().getColumn(2).setPreferredWidth(150);

        } catch (IOException ex) {
            Logger.getLogger(FuncoesDepartamento.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return listaFunc;
        }

    }
}
