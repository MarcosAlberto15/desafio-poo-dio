package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Dominando a linguagem de programação JAVA");
		curso1.setDescricao("Aprenda a desenvolver códigos com JAVA");
		curso1.setCargaHoraria(105);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Dominando a linguagem de programação KOTLIN");
		curso2.setDescricao("Aprenda a desenvolver códigos com KOTLIN");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Dominando a Orientação a Objetos com KOTLIN");
		mentoria.setDescricao("Aprenda a aplicar os paradigmas da Orientação a Objetos utilizando KOTLIN");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java/Kotlin Backend");
		bootcamp.setDescricao("Bootcamp Java/Kotlin para Backend");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devMarcos = new Dev();
		devMarcos.setNome("Marcos Alberto");
		devMarcos.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos: " + devMarcos.getConteudosInscritos());
		System.out.println("--------");
		devMarcos.progredir();
		devMarcos.progredir();
		System.out.println("Conteúdos Inscritos: " + devMarcos.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos: " + devMarcos.getConteudosConcluidos());
		System.out.println("XP: " + devMarcos.calcularTotalXp());

		System.out.println("--------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos: " + devJoao.getConteudosInscritos());
		System.out.println("--------");
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("Conteúdos Inscritos: " + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos: " + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());

		
	}

}
