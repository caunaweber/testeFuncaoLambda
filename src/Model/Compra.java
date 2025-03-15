package Model;

public class Compra implements Comparable<Compra>{

    private String descricao;
    private double preco;

    public Compra(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Compra o) {
        return Double.compare(this.preco, o.preco);
    }

}
