package sitematização;

public class Funcionario {
    private String nome;
    private String email;
    private String telefone;
    private String alergias;
    private String condicoesMedicas;


    public Funcionario(String nome, String email, String telefone, String alergias, String condicoesMedicas) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.alergias = alergias;
        this.condicoesMedicas = condicoesMedicas;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getCondicoesMedicas() {
        return condicoesMedicas;
    }

    public void setCondicoesMedicas(String condicoesMedicas) {
        this.condicoesMedicas = condicoesMedicas;
    }
}
