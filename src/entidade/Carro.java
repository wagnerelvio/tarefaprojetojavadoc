package entidade;

/**
 * *
 * <h1>Programa Principal</h1>
 * <p>
 * Tarefas
 * <ol>
 * 
 *<li> Programa com orientacao a objetos e imprima na tela, as característica dos
 * tres carros. </li>
 * 
 * <li>Crie um metodo que calcule a distância que o carro pode percorrer com o tanque totalmente cheio; </li>
 * 
 * <li> Considerando o preco do litro da gasolina igual a <b>R$7,80</b>, crie um método para calcular o preço total a ser 
 *  gasto pra preencher o tanque do carro por completo;</li>
 * 
 * 
 *<li> Faça uma lógica com o uso do (if-else) que informe se um determinado carro  (carro tipo 1 ou tipo 2 ou tipo 3 ) pode percorrer a
 * distância de <b>700km</b> entre duas cidades, sem fazer reabastecimento.</li>
 * </ol>
 * <b>Foram atribuidos alguns atributos a essa classe, como: </b>
 * <ol>
* <li>marca</li>
* <li>cor</li>
* <li>modelo</li>
* <li>ano</li>
* <li>numedoDePassageiros</li>
* <li>capacidadeDoTanque</li>
* <li>consumoDeCombustivelPorkm</li>
* <li>potenciaDoMotor</li>
*  <li>preco</li>
* <li>tracao4x4</li>
* <li>sensorDeChuva</li>
* </ol>
* 
 * </p>
 * 
 * @author wagner
 * @version 0.2
 * @since 16/04/2022
 */
public class Carro {
	public String marca;
	public String cor;
	public String modelo;
	public int ano;
	public int numedoDePassageiros;
	public double capacidadeDoTanque;
	public double consumoDeCombustivelPorkm;
	public double potenciaDoMotor;
	public double preco;
	public boolean tracao4x4;
	public boolean sensorDeChuva;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getCapacidadeDoTanque() {
		return capacidadeDoTanque;
	}

	public void setCapacidadeDoTanque(double capacidadeDoTanque) {
		this.capacidadeDoTanque = capacidadeDoTanque;
	}

	public double getConsumoDeCombustivelPorkm() {
		return consumoDeCombustivelPorkm;
	}

	public void setConsumoDeCombustivelPorkm(double consumoDeCombustivelPorkm) {
		this.consumoDeCombustivelPorkm = consumoDeCombustivelPorkm;
	}

	public boolean isTracao4x4() {
		return tracao4x4;
	}

	public void setTracao4x4(boolean tracao4x4) {
		this.tracao4x4 = tracao4x4;
	}

	// Metodos
	public static final double PRECOLITROGASOLINA = 7.80;

	// Declaracao do Metodo Simples

	/**
	 * Este metodo é utilizado para calcular a autonomia do carro, forncecidas a
	 * capacidade do tanque do veiculo e o seu consumo de combustivel por km.
	 * 
	 * @param capacidadeDoTanque        - representa a capacidade do tanque de
	 *                                  combustivel em litros
	 * @param consumoDeCombustivelPorkm - representa o consumo de combustivel por 1
	 *                                  km.
	 * @return retornara a autonomia do veiculo, o quanto o carro ira percorrer com
	 *         o tanque totalmente cheio.
	 */

	public void mostrarAutonomia() {
		// Bloco de Codigo
		double result = capacidadeDoTanque * consumoDeCombustivelPorkm;
		// System.out.println(" *** Letra a) do Exercicios - Autonomia de cada carro
		// ******************");
		System.out.println(" ***    Método autonomia sendo executado -  Autonomia do  carro: " + marca);
		System.out.println(
				"A autonomia do carro" + " " + marca + " " + capacidadeDoTanque * consumoDeCombustivelPorkm + " km");
	}

	/**
	 * Este metodo é utilizado para calcular o percursso que um carro faz,
	 * forncecidas a capacidade do tanque do veiculo e o seu consumo de combustivel
	 * por km.
	 * 
	 * @deprecated
	 * @param capacidadeDoTanque        - representa a capacidade do tanque de
	 *                                  combustivel em litros
	 * @param consumoDeCombustivelPorkm - representa o consumo de combustivel por 1
	 *                                  km.
	 * @return retornara a autonomia do veiculo, o quanto o carro ira percorrer com
	 *         o tanque totalmente cheio.
	 */

	public double calcularPercuso() {
		double result2 = capacidadeDoTanque * consumoDeCombustivelPorkm;
		return result2;
	}

	// Custo para encher o tanque - 01

	/**
	 * Este metodo é utilizado para calcular o gasto para encher o tanque do carro
	 * por completo, forncecidas a capacidade do tanque do veiculo e o preçodo litro
	 * da gasolina.
	 * 
	 * @param capacidadeDoTanque - representa a capacidade do tanque de combustivel
	 *                           em litros
	 * @param PRECOLITROGASOLINA - representa o preço do litro da gasolina.
	 * @return retornara o custo para encher todo o taanque de combustível do carro
	 * 
	 * 
	 */

	public void calcularCustoDoCombustivel() {
		double result = capacidadeDoTanque * PRECOLITROGASOLINA;
		// return valor;

		System.out.println("O gasto para encher o tanque do carro" + "  " + marca + " foi igual a R$ "
				+ capacidadeDoTanque * PRECOLITROGASOLINA);
		// System.out.printf("O gasto para encher o tanque do carro" + " " + marca + "
		// foi igual a R$ %.2f" +result);

	}
}
