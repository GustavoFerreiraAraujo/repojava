package br.com.fiap.motors.model;

public class Carro {

	//Atributos
	String modelo;
	
	int ano;
	
	double valor;
	
	//Metodos
	//idade calcularIdade(ano atual)
	public int calcularIdade(int anoAtual) {
		//Calcular a idade
		int idade = anoAtual - ano;
		//Retornar a idade
		return idade;
	}
		
		//atualizar o valor do carro
		void atualizarValor(double porcentagem) {
			valor *= (1 + porcentagem);
			}
		
		//criar um valor que calcula e retona o valor do seguro do carro 
		// seguro do carro eh baseado em 5% de seu valor 
		
		 double seguroCarro() {
			double seguro = valor *= 0.05;
			return seguro;
			}
			
			//criar um metodo que recebe a quantidade de parcelas, calcula e retorna 
			//o valor da parcela do seguro 
			
			double calcularValorParcelaSeguro(int parcelas) {
				double parcela = (valor * 0.05) / parcelas;
				return parcela;
				
			}
			
		
		
	}