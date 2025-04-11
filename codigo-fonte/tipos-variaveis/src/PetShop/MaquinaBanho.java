package PetShop;

public class MaquinaBanho {

    private int nivelAgua;
    private int nivelShampoo;
    private Pet pet;
    private boolean maquinaLimpa;

    public MaquinaBanho() {
        this.nivelAgua = 30;
        this.nivelShampoo = 10;
        this.maquinaLimpa = true;
    }

    protected void colocarPet(Pet pet){
       if (this.pet == null){
           if (maquinaLimpa){
               this.pet = pet;
               this.maquinaLimpa = false;
               System.out.println("Pet " + pet.getNome() + " introduzido na máquina com sucesso!");
           } else {
               System.out.println("É preciso limpar a máquina antes de introduzir um novo pet!");
           }
       } else {
           System.out.println("É permitido apenas um pet por vez!");
       }
    }

    protected void retirarPet(){
       if (this.pet != null){
           System.out.println("Pet " + this.pet.getNome() + " retirado da máquina com sucesso!");
           this.pet = null;
       } else {
           System.out.println("A máquina já está vazia!");
       }
    }

    protected void darBanho(){
        if (pet != null && nivelAgua >= 10 && nivelShampoo >= 2){
            nivelAgua -= 10;
            nivelShampoo -=2;
            maquinaLimpa = true;
            System.out.println("Pet limpo com sucesso!");
        } else {
            System.out.println("Verifique se existe pet na máquina, o nível de água e shampoo antes de tentar ligar a máquina!");
        }
    }

    protected void limparMaquina(){
        if (nivelAgua >= 3 && nivelShampoo >= 1){
            nivelAgua -= 3;
            nivelShampoo -=1;
            maquinaLimpa = true;
            System.out.println("Máquina limpa com sucesso!");
        } else {
            System.out.println("Verifique o nível de água e shampoo antes de tentar ligar a máquina!");
        }
    }

    protected void abastecerAgua(){
        if(nivelAgua <= 28) {
            nivelAgua = nivelAgua + 2;
            System.out.println("Água abastecida com sucesso!");
        } else {
            System.out.println("Nível máximo de água atingido!");
        }
    }

    protected void abastecerShampoo(){
        if(nivelShampoo <= 8) {
            nivelShampoo = nivelShampoo + 2;
            System.out.println("Shampoo abastecida com sucesso!");
        } else {
            System.out.println("Nível máximo de shampoo atingido!");
        }
    }

    protected int getNivelAgua() {
        return nivelAgua;
    }

    protected int getNivelShampoo() {
        return nivelShampoo;
    }

    protected boolean getPet() {
        return pet != null;
    }

    public boolean isMaquinaLimpa() {
        return maquinaLimpa;
    }
}
