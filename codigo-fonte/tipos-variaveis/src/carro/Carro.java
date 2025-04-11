package carro;

public class Carro {

    private boolean ligado;
    private int marcha;
    private int velocidade;

    public Carro() {
        this.ligado = false;
        this.marcha = 0;
        this.velocidade = 0;
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("O carro foi ligado com sucesso!");
    }

    public void desligar(){
        if (marcha == 0 && velocidade == 0 && ligado){
            this.ligado = false;
            System.out.println("O carro foi desligado com sucesso!");
        } else {
            System.out.println("Para ser desligado o carro precisa estar parado e no ponto morto!");
        }
    }

    private boolean carroEstaDesligado(){
        return !this.ligado;
    }

    protected void aumentarVelocidade(){
        if(carroEstaDesligado()){
            System.out.println("O carro está desligado!");
        } else {
            if (velocidade < 120){
                switch (marcha){
                    case 0 -> System.out.println("O carro está em ponto morto e não pode acelerar!");
                    case 1 -> checarRelacaoVelocidadeMarcha(0, 20);
                    case 2 -> checarRelacaoVelocidadeMarcha(20, 40);
                    case 3 -> checarRelacaoVelocidadeMarcha(40, 60);
                    case 4 -> checarRelacaoVelocidadeMarcha(60, 80);
                    case 5 -> checarRelacaoVelocidadeMarcha(80, 100);
                    case 6 -> checarRelacaoVelocidadeMarcha(100, 120);
                }
            } else {
                System.out.println("Velocidade máxima de 120Km/h atingida!");
            }
        }
    }

    private void checarRelacaoVelocidadeMarcha(int minima, int maxima){
        if (velocidade >= minima && velocidade < maxima){
            velocidade++;
            System.out.println("Velocidade atual é: " + velocidade + "Km/h");
        } else {
            System.out.println("Velocidade fora do limite da marcha!");
        }
    }

    protected void diminuirVelocidade(){
        if(carroEstaDesligado()){
            System.out.println("O carro está desligado!");
        } else {
            if (velocidade > 0){
                velocidade --;
                System.out.println("Velocidade atual é: " + velocidade + "Km/h");
            } else {
                System.out.println("O carro já está parado!");
            }
        }
    }

    protected void aumentarMarcha(){
        if (marcha < 6 && ligado){
            marcha++;
            System.out.println("A marcha atual é: " + marcha);
        } else {
            System.out.println("O carro está desligado ou na maior marcha!");
        }
    }

    protected void diminuirMarcha(){
        if (marcha > 0 && ligado){
            marcha--;
            System.out.println("A marcha atual é: " + marcha);
        } else {
            System.out.println("O carro está desligado ou em ponto morto!");
        }
    }

    protected void virar(String lado){
        if (lado.equalsIgnoreCase("esquerda") || lado.equalsIgnoreCase("direita")){
            if (velocidade > 0 && velocidade <= 40){
                System.out.println("O carro virou para a " + lado);
            } else {
                System.out.println("Para virar a velocidade precisa estar entre 1 e 40Km/h");
            }
        }
    }
}
