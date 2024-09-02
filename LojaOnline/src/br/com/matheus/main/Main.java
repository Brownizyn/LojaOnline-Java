package br.com.matheus.main;

import br.com.matheus.produto.Energetico;
import br.com.matheus.produto.Pelucia;

public class Main {

	public static void main(String[] args) {
		Pelucia pelucia = new Pelucia("Squirtle de Pelúcia", 89.99, "Pelucia fofinha", "Pokemon");
		
        Energetico energetico = new Energetico("Energético Monster", 5.99, "Energético para dar energia extra", "Monster", "Mango");

        System.out.println("Pelúcia: " + pelucia.getNome() + ", Tipo: " + pelucia.getTipo() + ", Preço: " + pelucia.getPreco());
        pelucia.realizarCompra();

        System.out.println("Energético: " + energetico.getNome() + ", Marca: " + energetico.getMarca() + ", Preço: " + energetico.getPreco());
        energetico.realizarCompra();
    }

	}
