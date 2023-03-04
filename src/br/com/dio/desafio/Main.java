package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDecricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDecricao("descrição curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de java");
		mentoria.setData(LocalDate.now());
		mentoria.setDecricao("descrição mentoria java");
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp java Developer");
		bootcamp.setDescricao("Descrição bootcamp java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev();
		dev1.setNome("Luan");
		dev1.inscreverBootcamp(bootcamp);
		dev1.progredir();
		System.out.println("Conteudos inscritos de Luan: " + dev1.getConteudosInscritos());
		System.out.println("Conteudos concluidos de Luan: " + dev1.getConteudosConcluidos());
		System.out.println("XP: " + dev1.calcularTotalXp());
		
		
		System.out.println("------------");
		
		Dev dev2 = new Dev();
		dev2.setNome("Joao");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos de Joao: " + dev2.getConteudosInscritos());
		dev2.progredir();
		System.out.println("Conteudos concluidos de Joao: " + dev2.getConteudosConcluidos());
		dev2.progredir();
		System.out.println("Conteudos concluidos de Joao: " + dev2.getConteudosConcluidos());
		
		System.out.println("XP: " + dev2.calcularTotalXp());
		
		
	}

}
