package variaveis;

public class Tipos {

	public static void main(String[] args) {
		// <tipo do dado> < nome da variavel/Objeto>;
		// String (alfanumerico)
		//Int[Numeros inteiros] e double[números reais] (numérico)
		
		String nome =  "Luiz Fernando de Toledo Junior";
		int idade = 39;
		double altura = 1.85;
		double peso = 88.500;
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade + " anos.");
		System.out.println("Altura: " + altura + " metros.");
		System.out.println("Peso: " + peso + " Kilos.");
		
		double imc = peso / (altura * altura);
		System.out.printf("IMC: %.2f\n",  + imc);
		System.out.printf("%s seu imc é: %.2f\n", nome, imc);
		
				
	}

}
