import PetShop.MaquinaBanhoService;
import PetShop.Pet;
import PetShop.TipoPet;

public class DesafioPetShop {
    public static void main(String[] args) {

        MaquinaBanhoService maquina = new MaquinaBanhoService();

        maquina.abastecerAgua();
        maquina.abastecerShampoo();
        maquina.limparMaquina();
        maquina.limparMaquina();
        maquina.nivelAgua();
        maquina.nivelShampoo();
        maquina.abastecerAgua();
        maquina.abastecerShampoo();
        maquina.darBanho();
        maquina.maquinaOcupada();
        maquina.colocarPet(new Pet("Lili", TipoPet.CACHORRO));
        maquina.darBanho();
        maquina.maquinaOcupada();
        maquina.retirarPet();
        maquina.colocarPet(new Pet("Lili", TipoPet.CACHORRO));
        maquina.retirarPet();
        maquina.maquinaOcupada();
        maquina.darBanho();
        maquina.colocarPet(new Pet("Lili", TipoPet.CACHORRO));
        maquina.limparMaquina();
        maquina.colocarPet(new Pet("Lili", TipoPet.CACHORRO));
        maquina.darBanho();
        maquina.nivelAgua();
        maquina.nivelShampoo();
        maquina.colocarPet(new Pet("Lili", TipoPet.CACHORRO));
        maquina.darBanho();
        maquina.nivelAgua();
        maquina.nivelShampoo();
        maquina.abastecerAgua();
        maquina.abastecerAgua();
        maquina.abastecerAgua();
        maquina.abastecerAgua();
        maquina.abastecerAgua();
        maquina.abastecerShampoo();
        maquina.nivelAgua();
        maquina.nivelShampoo();
        maquina.darBanho();
        maquina.retirarPet();


    }
}
