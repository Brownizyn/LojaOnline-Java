package br.com.matheus.produto;

public class Energetico extends Produto{

	private String marca;
    private String sabor;

    public Energetico(String nome, double preco, String descricao, String marca, String sabor) {
        super(nome, preco, descricao);
        this.marca = marca;
        this.sabor = sabor;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
    @Override
    public void realizarCompra() {
        System.out.println("Compra realizada com sucesso para o energético: " + getNome());
    }
}
