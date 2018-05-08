package Utils;




import classes.Departamento;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author fabricio@utfpr.edu.br
 */
public class ArquivoBinario {

    public ObjectOutputStream CriaEscritorBinario(File arquivo,boolean append) {
        ObjectOutputStream out = null;
        try {
            if (arquivo.exists()) {
                out = new ObjectOutputStream(new FileOutputStream(arquivo, append)) {
                    @Override
                    protected void writeStreamHeader() {
                        // do not write a header
                    }
                };
            } else {
                out = new ObjectOutputStream(new FileOutputStream(arquivo, append));
            }
        } catch (IOException erro) {
            System.out.println("Erro ao criar arquivo. " + erro);
        }
        return out;
    }

    public ObjectInputStream CriaLeitorBinario(File arquivo) {
        ObjectInputStream ois = null;
        try {
            FileInputStream fis
                    = new FileInputStream(arquivo);
            ois = new ObjectInputStream(fis);
        } catch (IOException erro) {
            System.out.println("Erro ao ler arquivo. " + erro);
        }
        return ois;
    }

    public void EscreveObjeto(ObjectOutputStream oos,Object obj,boolean flush) {
        try {
            oos.writeObject(obj);
            if (flush) {
                oos.flush();
            }            
        } catch (IOException erro) {
            System.out.println("Erro na escrita. " + erro);
        }
    }

    public Object LeObjeto(ObjectInputStream ois) {
        Object objlido = null;
        try {
            objlido = ois.readObject();             
        } catch (ClassNotFoundException erro) {
            System.out.println("Classe nao encontrada. "
                    + erro);
        } catch (java.io.EOFException erro) {
            System.out.println("Final de arquivo. "
                    + erro);
        } catch (IOException erro) {
            System.out.println("Erro na leitura do objeto. " + erro);
        } finally {            
            return objlido;
        }
    }
    
    public ArrayList listaTodoArquivo(ObjectInputStream leitor) {
        Object o = null;
        ArrayList<Object> lista = new ArrayList<>();
        do {
             o = (Object) LeObjeto(leitor);  
             lista.add(o);
        } while (o != null);
        lista.remove(lista.size()-1);
        return lista;
    }

    public static void main(String[] args) {
        
    }

    
}
