package banco;

public class Main {
    public static void main(String[] args) {
        Banco b = new Banco("Santander");
        Cliente s = new Cliente("Sávio");
        Conta cCorrente = new ContaCorrente(s);
        Conta cPoupanca = new ContaPoupanca(s);
        b.adicionarConta(cCorrente);
        b.adicionarConta(cPoupanca);
        cPoupanca.depositar(250);
        cPoupanca.transferir(80, cCorrente);

        cCorrente.imprimirExtrato();
        cPoupanca.imprimirExtrato();
        b.mostrarTodosOsClientes();
        b.mostrarTodasAsContas();
    }
}
