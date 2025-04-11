package carro;

public class CarroService {

    public void ligar(Carro carro){
        carro.ligar();

    }

    public void desligar(Carro carro){
        carro.desligar();
    }

    public void acelerar(Carro carro){
        carro.aumentarVelocidade();
    }

    public void desacelerar(Carro carro){
        carro.diminuirVelocidade();
    }

    public void diminuirMarcha(Carro carro){
        carro.diminuirMarcha();
    }

    public void aumentarMarcha(Carro carro){
        carro.aumentarMarcha();
    }

    public void virar(Carro carro, String lado){
        carro.virar(lado);
    }
}
