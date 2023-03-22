package br.com.fiap.motors.model;

public class View {

	//main -> CTRL + espaco
	public static void main(String[] args) {
		//Instanciar o Carro
		Carro gol = new Carro();
		
		//Colocar informacoes nos atributos
		gol.ano = 1999;
		gol.modelo = "Gol Bola";
		gol.valor = 15000;
		
		//Calcular a idade do carro
		int i = gol.calcularIdade(2023);
		
		//Exibir a idade
		System.out.println("Idade do carro: " + i);
		
		// aumentar o valor do carro em 20%
		gol.atualizarValor(0.2);
		
		//exibir valor do carro 
		System.out.println("Valor do carro: " + gol.valor);
		
		//calcular e exivir o valor do seguro
		
		double seguro = gol.seguroCarro();
		System.out.println("Valor do seguro" + seguro );
	
		double parcelas = gol.calcularValorParcelaSeguro(3) ;
		System.out.println( "herehr"+ parcelas);
		
		}
	
	}
