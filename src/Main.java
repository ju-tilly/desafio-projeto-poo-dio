import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        //Lista de cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Desenvolvimento Java com Spring Boot");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("\nCurso Js");
        curso2.setDescricao("Desenvolvimento JavaScript");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("\nCurso HTML/CSS3/JS");
        curso3.setDescricao("Desenvolvimento Frontend");
        curso3.setCargaHoraria(6);

        Curso curso4 = new Curso();
        curso4.setTitulo("\nAngular");
        curso4.setDescricao("Introdução ao Angular 8");
        curso4.setCargaHoraria(5);

        //Lista de mentorias
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("\nMentoria (Live)");
        mentoria1.setDescricao("Desenvolva seu pensamento computacional com orientação a objetos");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        //Lista de Bootcamps
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Santander Code Girls");
        bootcamp.setDescricao("Sejam todas bem-vindas ao Santander Bootcamp 2022!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Santander Bootcamp FullStack Developer");
        bootcamp2.setDescricao("Comece sua jornada na trilha de Fullstack");
        bootcamp2.getConteudos().add(curso3);
        bootcamp2.getConteudos().add(curso4);
        bootcamp2.getConteudos().add(mentoria1);

        //Criação de Devs e suas matriculas
        Dev dev1 = new Dev();
        dev1.setNome("Juce");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos Inscritos " + dev1.getNome() + " : " + dev1.getConteudosInscritos());

        dev1.progredir();
        System.out.println("\nConteúdos Concluídos " + dev1.getNome() + " : " + dev1.getConteudosConcluidos());
        System.out.println("\nConteúdos Não Concluidos " + dev1.getNome() + " : " + dev1.getConteudosInscritos());
        System.out.println("\nXP: " + dev1.calcularTotalXp());

        System.out.println("\n------------------------------------------------------------------\n");

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp2);
        System.out.println("\nConteúdos Inscritos " + dev2.getNome() + " : " + dev2.getConteudosInscritos());

        dev2.progredir();
        System.out.println("\nConteúdos Concluídos " + dev2.getNome() + " : " + dev2.getConteudosConcluidos());
        System.out.println("\nConteúdos Não Concluídos " + dev2.getNome() + " : " + dev2.getConteudosInscritos());
        System.out.println("\nXP: " + dev2.calcularTotalXp());


    }
}
