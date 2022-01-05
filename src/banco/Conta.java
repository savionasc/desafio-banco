package banco;

public abstract class Conta implements IConta{

    private static int SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected String tipo;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void sacar(double valor) {
        if(valor > 0 && valor <= getSaldo())
            setSaldo(getSaldo()-valor);
    }

    @Override
    public void depositar(double valor) {
        if(valor > 0)
            setSaldo(getSaldo()+valor);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        double saldoAnterior = getSaldo();
        sacar(valor);
        if(saldoAnterior != getSaldo())
            contaDestino.setSaldo(contaDestino.getSaldo()+valor);
    }

    protected void imprimirDadosComuns() {
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Numero: " + this.numero);
        System.out.println("Saldo: " + this.saldo );
        System.out.println("Cliente: " + this.cliente.getNome());
    }
}
