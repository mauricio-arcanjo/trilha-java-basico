import carro.Carro;
import carro.CarroService;

public class DesafioCarro {

    public static void main(String[] args) {
        Carro carro = new Carro();
        CarroService carroService = new CarroService();

        carroService.ligar(carro);
        carroService.virar(carro, "direita");
//        carroService.desligar(carro);
        carroService.aumentarMarcha(carro);
        carroService.desligar(carro);
        for (int i = 0; i <= 22; i++){
            carroService.acelerar(carro);
        }
        carroService.virar(carro, "direita");
        carroService.aumentarMarcha(carro);
        for (int i = 0; i <= 22; i++){
            carroService.acelerar(carro);
        }
        carroService.aumentarMarcha(carro);
        for (int i = 0; i <= 22; i++){
            carroService.acelerar(carro);
        }
        carroService.desligar(carro);
        carroService.aumentarMarcha(carro);
        for (int i = 0; i <= 22; i++){
            carroService.acelerar(carro);
        }
        carroService.aumentarMarcha(carro);
        for (int i = 0; i <= 22; i++){
            carroService.acelerar(carro);
        }
        carroService.aumentarMarcha(carro);
        for (int i = 0; i <= 22; i++){
            carroService.acelerar(carro);
        }
        carroService.aumentarMarcha(carro);
        carroService.desligar(carro);



    }

}
