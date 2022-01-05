package banco;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Banco {
    private String nome;
    private List<Conta> contas;
    private Set<Cliente> clientes;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
        this.clientes = new HashSet<>();
    }

    void adicionarConta(Conta conta){
        contas.add(conta);
        clientes.add(conta.getCliente());
    }

    void removerConta(Conta conta){
        contas.remove(conta);
        int i = 0;
        for (Conta c: contas) {
            if(c.getCliente() == conta.getCliente())
                break;
        }
        if(i == 0)
            clientes.remove(conta.cliente);
    }

    void mostrarTodosOsClientes(){
        System.out.println("Mostrando os clientes do Banco "+nome);
        for (Cliente c : clientes)
            System.out.println("Cliente: " + c.getNome());
    }

    void mostrarTodasAsContas(){
        System.out.println("Mostrando as contas do Banco "+nome);
        for (Conta c : contas)
            System.out.println("Tipo: "+c.getTipo()+" Cliente: " + c.getCliente().getNome());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
