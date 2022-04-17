
package tipoDocarro;

import java.util.Locale;

import entidade.Carro;

/**
 * Nesta classe foram instanciada a Classe Carro para tres classes: a) gol b)
 * fiat c) renegade
 * 
 * 
 * E após instanciadas, foram declaradas variáveis de instancias como: a) marca
 * b) capacidadeDoTanque; c) consumoDeCombustivelPorkm;
 * 
 * @author wagner
 * @version 0.2
 * @since 16/04/2022
 * 
 * 
 */
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Carro gol = new Carro();

		gol.marca = "Gol";
		gol.cor = "Branco";
		gol.modelo = "Gol 2022 1.6 AT";
		gol.ano = 2022;
		gol.numedoDePassageiros = 4;
		gol.capacidadeDoTanque = 40;
		gol.consumoDeCombustivelPorkm = 10;
		gol.potenciaDoMotor = 77;
		gol.preco = 76490;
		gol.tracao4x4 = false;
		gol.sensorDeChuva = false;

		Carro fiat = new Carro();
		fiat.marca = "Argo";
		fiat.capacidadeDoTanque = 50;
		fiat.consumoDeCombustivelPorkm = 10;

		Carro renegade = new Carro();

		renegade.marca = "Jeep Renegade";
		renegade.capacidadeDoTanque = 90;
		renegade.consumoDeCombustivelPorkm = 10;

		// System.out.println("****************************************************************");
		System.out.println("********************* Express RentCars    *********************");
		// System.out.println("****************************************************************");
		System.out.println("\n");

		// Uso do metodo no carro 01
		gol.mostrarAutonomia();
		// Uso do metodo no carro 02
		fiat.mostrarAutonomia();
		// Uso do metodo no carro 03
		renegade.mostrarAutonomia();
		// maior de tres numeros
		System.out.println("\n");
		System.out.println("******  Gasto em reais com o Combustivel ***************");
		System.out.println("\n");

		// Gastos
		// double g1 = gol.calcularCustoDoCombustivel();
		// double g2 = fiat.calcularCustoDoCombustivel();
		// double g3 = renegade.calcularCustoDoCombustivel();

		gol.calcularCustoDoCombustivel();
		fiat.calcularCustoDoCombustivel();
		renegade.calcularCustoDoCombustivel();

		// aaaaaaaaaaa
		/**
		 * Preciso saber qual dos tres carros tem a maior autonomia
		 * 
		 */

		double maior;
		double t1 = gol.calcularPercuso();
		double t2 = fiat.calcularPercuso();
		double t3 = renegade.calcularPercuso();

		// Maior de tres numeros

		/**
		 * Aqui foi calculado qual é o maior dos três percursos para saber se o carro
		 * de maior percurso consegue fazer o trajeto entre duas cidades, separadas por
		 * 700 km, sem fazer o reabastecimento.
		 */
		if (t1 > t2) {
			if (t1 > t3)
				maior = t1;
		} else {
			if (t2 > t3)
				maior = t2;
			else
				maior = t3;
			System.out.println("\n");
			System.out.println("****************************************************************");
			System.out.printf("  A  maior autonomia entre os três carros é igual a  " + maior + "km");
			System.out.println("\n");
			System.out.println("****************************************************************");
			System.out.println("\n");
			if (maior > 700) {
				System.out.println(
						"O Carro com a maior autonomia consegue percorrer o trecho \n entre as duas cidades de 700km ");
			} else {
				System.out.println(
						"O Carro com a maior autonomia NÃO consegue percorrer o trecho \n entre as duas cidades de 700km ");
				System.out.println("É necessário um reabastecimento.");
			}
		}

	}

}
