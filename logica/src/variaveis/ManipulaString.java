package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		String email = "xpTo@gMaiL.coM.Br";
		System.out.println("Original:" + email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiscula: "  + email.toUpperCase());
		System.out.println("Quantidade de Caraceters " + email.length());
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println ("Qual a posi��o do arroba no e-mail? " + email.indexOf("@"));
		System.out.println("Do 2� at� o 4�: " + email.substring(0,4));
		// quero que exibam a primeira metade do email.
		System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
		// quero que exibam o usu�rio do email
		System.out.println("usu�rio do email: " + email.substring(0, email.indexOf("@")));
		// quero que exibam o servidor
		System.out.println("servidor: " + email.substring(email.indexOf("@")+1).toLowerCase());
		System.out.println("Compara��o sem case: " + email.equals("xpto@gmail.com.br"));
		System.out.println("Compara��o com case: " + email.equalsIgnoreCase("xpto@gmail.com.br"));
	}

}
