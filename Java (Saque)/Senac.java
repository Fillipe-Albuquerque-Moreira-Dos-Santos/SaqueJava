package aula;
import java.util.Scanner;

public class Senac {

	String NomeCurso;
	
	 public Senac (String nome) {
		 NomeCurso = nome;
	 }

	public String getNomeCurso() {
		return NomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		NomeCurso = nomeCurso;
	}
	
	public void MostraMensagem() {
		System.out.println("Bem vindo ao Cruso: " + getNomeCurso());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		 Senac mostrar = new Senac("Desenvolvimento de Sistemas");
		 
		 // Chama o método mostra mensagem
		 
		 mostrar.MostraMensagem();
		 mostrar.setNomeCurso("GTI");
		 System.out.println("Mudei o meu curso para: " + mostrar.getNomeCurso());
	}

}
