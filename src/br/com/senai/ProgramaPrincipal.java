package br.com.senai;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		
		pessoa1.setNome("Victor");
		pessoa1.setAnoDeNascimento(2004);
		pessoa1.setSexo("M");
		
		pessoa2.setNome("Carlos");
		pessoa2.setAnoDeNascimento(2001);
		pessoa2.setSexo("M");
		
		pessoa3.setNome("Gabriel");
		pessoa3.setAnoDeNascimento(2004);
		pessoa3.setSexo("M");
		
		System.out.println("--- PESSOA 1 ---");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getAnoDeNascimento());
		System.out.println(pessoa1.getSexo());
		System.out.println("----------------");
		
		System.out.println("--- PESSOA 2 ---");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getAnoDeNascimento());
		System.out.println(pessoa2.getSexo());
		System.out.println("----------------");
		
		System.out.println("--- PESSOA 3 ---");
		System.out.println(pessoa3.getNome());
		System.out.println(pessoa3.getAnoDeNascimento());
		System.out.println(pessoa3.getSexo());
		System.out.println("----------------");
	}
}
