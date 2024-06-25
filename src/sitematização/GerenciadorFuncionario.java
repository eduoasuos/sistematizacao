package sitematização;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorFuncionario {
    private List<Funcionario> funcionarios;

    public GerenciadorFuncionario() {
        this.funcionarios = new ArrayList<>();
    }

    
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    
    public Funcionario buscarFuncionarioPorNome(String nome) {
        for (Funcionario func : funcionarios) {
            if (func.getNome().equalsIgnoreCase(nome)) {
                return func;
            }
        }
        return null;
    }
}

