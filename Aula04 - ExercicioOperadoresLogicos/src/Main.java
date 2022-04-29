
public class Main {
	
	public static void main(String[] args) {
		
		String nome;
		byte idade;
		float altura;
		boolean resultado;
		
		nome = "Lucas";
		idade = 25;
		altura = 1.80f;
		
		resultado = (altura >= 1.70) && (idade > 18);
		System.out.println(resultado);
		
		resultado = (altura >= 1.70) || (idade > 18);
		System.out.println(resultado);
				
		
		
		
		
	}

}
