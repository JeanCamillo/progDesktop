package classes;



/**
 * @author Jean
 */
public class Cliente implements java.io.Serializable {    
    private String nome;
    private String fone;
    private int idade;
    private String CPF;    

    private Cliente() {
        nome = "não informado";
        fone = "não informado";
        idade = 0;
        CPF = "não informado";
    }        

    @Override
    public String toString() {
        if (this != null) {
            return (nome +"  "+fone+" "+idade+" "+CPF);
        } else {
            return (null);
        }
    }

    public Cliente(String nm, String fon, int id, String cpf) {
        nome = nm;
        fone = fon;
        idade = id;
        CPF = cpf;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the fone
     */
    public String getFone() {
        return fone;
    }

    /**
     * @param fone the fone to set
     */
    public void setFone(String fone) {
        this.fone = fone;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    /**
     * @return the cpf
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param cpf the idade to set
     */
    public void setCPF(String cpf) {
        this.CPF = cpf;
    }
}
