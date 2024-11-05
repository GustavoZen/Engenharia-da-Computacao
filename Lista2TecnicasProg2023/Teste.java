package implementacaoDeMetodos;

public class Teste {
	public static void main(String[] args) {
		int vet1[] = { 0, 1, 2, 3, 4 };
		int vet2[] = { 5, 6, 7, 8, 9 };
		int vet3[] = { 1, 1, 1, 1, 1 };
		int vet4[] = { 9, 8, 7, 6, 5, 2, 6, 9 };
		String texto = "Hello, World!";
		String palindromo = "racecar";
		Utilidades util = new Utilidades();
		System.out.println("Somatorio de vet1, ignorando dois iniciais e finais: " + util.somatorio(vet1));
		System.out.print("Número pares entre 0 e 10: ");
		util.numerosPares(0, 10);
		System.out.println("\nMedia dos vetores 1 e 2: " + util.media(vet1, vet2));
		System.out.println("Media ponderada dos vetores 2 e 3: " + util.mediaPonderada(vet2, vet3));
		System.out.println("Contagem de elementos [1] no vetor 3: " + util.contagemDeElementos(vet3, 1));
		System.out.println("vetor 4 esta ordenado: " + util.verificarOrdem(vet4));
		util.ordenarVetorCrescente(vet4);
		util.imprimirVetor(vet4);
		System.out.println("vetor 4 esta ordenado: " + util.verificarOrdem(vet4));
		System.out.println("O segundo maior valor de vet2 é: " + util.kEsimoMaior(vet2, 2));
		System.out.println("O terceiro menor valor de vet2 é: " + util.kEsimoMenor(vet2, 3));
		System.out.println("Verificacao se os vetores 1 e 1 são iguais: " + util.verificacaoDeIgualdade(vet1, vet1));
		System.out.println("Potencia de 3 elevado a 4: " + util.potenciacao(3, 4));
		System.out.println("Verificacao se numero 37 eh primo: " + util.primo(37));
		System.out.print("Busca por Ocorrencias vet1 e vet 2: ");
		util.imprimirVetor(util.buscaPorOcorrencias(vet1, vet2));
		System.out.print("vetor 4 sem elementos 9: ");
		util.imprimirVetor(util.remocaodeElementoDoVetor(vet4, 9));
		System.out.println("String texto invertida: " + util.inversaoDeString(texto));
		System.out.println("A string palindromo eh um palindromo: " + util.verificacaoDePalindromo(palindromo));
		System.out.println("A string texto eh um palindromo: " + util.verificacaoDePalindromo(texto));
		System.out.println("Juros Exemplo: 1000, 0.05, 3   ->  " + util.jurosCompostos(1000, 0.05, 3));
		System.out.println("O numero 6 eh perfeito: " + util.numeroPerfeito(6));
		System.out.println("O numero 10 eh perfeito: " + util.numeroPerfeito(10));
		util.imprimirElementosA();
		util.imprimirElementosB();
		util.imprimirElementosC();
		util.imprimirElementosD();
		util.imprimirElementosE();
		util.imprimirElementosF();
		
	}
}
