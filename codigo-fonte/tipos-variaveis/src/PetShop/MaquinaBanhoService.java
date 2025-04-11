package PetShop;

public class MaquinaBanhoService {

    MaquinaBanho maquinaBanho = new MaquinaBanho();

    public void colocarPet(Pet pet){
        System.out.println("maquina limpa? " + maquinaBanho.isMaquinaLimpa());
        maquinaBanho.colocarPet(pet);
    }

    public void retirarPet(){
        maquinaBanho.retirarPet();
    }

    public void darBanho(){
        maquinaBanho.darBanho();
    }

    public void limparMaquina(){
        maquinaBanho.limparMaquina();
    }

    public void abastecerAgua(){
        maquinaBanho.abastecerAgua();
    }

    public void abastecerShampoo(){
        maquinaBanho.abastecerShampoo();
    }

    public void nivelAgua(){
        System.out.println("O nível de água é: " + maquinaBanho.getNivelAgua());
    }

    public void nivelShampoo(){
        System.out.println("O nível de shampoo é: " + maquinaBanho.getNivelShampoo());
    }

    public void maquinaOcupada(){
        System.out.println("Máquina ocupada: " + maquinaBanho.getPet());
    }

}
