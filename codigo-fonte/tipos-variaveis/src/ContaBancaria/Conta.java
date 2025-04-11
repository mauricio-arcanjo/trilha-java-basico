package ContaBancaria;

public class Conta {

    private double saldo;
    private double chequeEspecial;

    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
        definirChequeEspecial(saldo);
    }

    private void definirChequeEspecial(double saldo) {
        if (saldo > 0 && saldo <= 500){
            chequeEspecial = 50.0;
        } else if (saldo > 500) {
            chequeEspecial = saldo * 0.5;
        } else {
            System.out.println("O saldo precisa ser positivo!");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double consultarChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", chequeEspecial=" + chequeEspecial +
                '}';
    }

    public void depositar(double valor){
        if (valor > 0){
            if (saldo >= 0) {
                this.saldo += valor;
                System.out.println("Valor depositado com sucesso!");
            } else {
                //Cenário onde cheque especial está sendo utilizado
                double juros = (-saldo) * 0.2;
                saldo = saldo + valor - juros;
            }
        } else  {
            System.out.println("Valor precisa ser maior que zero!");
        }
    }
    public void sacar(double valorSaque){
        if (valorSaque > 0 && (saldo - valorSaque) >= -chequeEspecial){
            this.saldo -= valorSaque;
            System.out.println("Valor sacado com sucesso!");
            System.out.println("O novo saldo é: " + saldo);
        } else  {
            System.out.println("Saldo insuficiente!");
        }
    }
    public void pagarBoleto(double valorBoleto){
        if (valorBoleto > 0 && (saldo - valorBoleto) >= -chequeEspecial){
            this.saldo -= valorBoleto;
            System.out.println("Boleto pago com sucesso!");
            System.out.println("O novo saldo é: " + saldo);
        } else  {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void verificarChequeEspecial(){
        if (saldo < 0) {
            System.out.println("Cheque especial está sendo utilizado na quantia de: " + (-saldo));
        } else
            System.out.println("Cheque especial não está sendo utilizado!");
    }



}
