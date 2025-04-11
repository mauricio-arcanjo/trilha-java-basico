package PetShop;

public class Pet {
    private String nome;
    private TipoPet tipo;

    public Pet(String nome, TipoPet tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoPet getTipo() {
        return tipo;
    }

    public void setTipo(TipoPet tipo) {
        this.tipo = tipo;
    }
}
