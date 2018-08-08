package Teste;

public class Socio {
    private final long id;
    private final String nome;

    public Socio(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "id = " + getId() + ", nome = " + getNome();
    }
}