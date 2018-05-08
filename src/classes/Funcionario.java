package classes;

/**
 * @author Jean
 */
public class Funcionario implements java.io.Serializable{
    private int Matricula;
    private String Nome;
    private Departamento Dep;

    public Funcionario() {
    }

    public Funcionario(int Matricula, String Nome, Departamento Dep) {
        this.Matricula = Matricula;
        this.Nome = Nome;
        this.Dep = Dep;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Departamento getDep() {
        return Dep;
    }

    public void setDep(Departamento Dep) {
        this.Dep = Dep;
    }
    
    
}
