package banco;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        this.tipo = "Poupança";
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Poupança");
        imprimirDadosComuns();
    }
}
