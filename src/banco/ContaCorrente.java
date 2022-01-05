package banco;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
        this.tipo = "Corrente";
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Corrente");
        System.out.println("Agencia: " + super.agencia);
        System.out.println("Numero: " + super.numero);
        System.out.println("Saldo: " + super.saldo );
    }
}
