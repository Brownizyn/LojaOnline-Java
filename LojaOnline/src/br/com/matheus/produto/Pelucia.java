package br.com.matheus.produto;

public class Pelucia extends Produto{
	 private String tipo;

	    public Pelucia(String nome, double preco, String descricao, String tipo) {
	        super(nome, preco, descricao);
	        this.tipo = tipo;
	    }
	    public String getTipo() {
	        return tipo;
	    }
	    public void setTipo(String tipo) {
	        this.tipo = tipo;
	    }
	    
	    @Override
	    public void realizarCompra() {
	        System.out.println("Compra realizada com sucesso para a pelúcia: " + getNome());
       }
	    }