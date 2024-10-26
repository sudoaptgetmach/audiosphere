package org.mach;

import org.mach.models.Podcast;
import org.mach.services.Classificacao;

public class Main {
    public static void main(String[] args) {

        Podcast podcast = new Podcast();
        Classificacao classificacao = new Classificacao();

        podcast.setNome("Teste");
        podcast.setDescricao("Lorem ipsum.");
        podcast.setDuracao(500);
        classificacao.setClassificacao(podcast, 3);
        classificacao.setClassificacao(podcast, 1);
        classificacao.setClassificacao(podcast, 99);
        classificacao.setClassificacao(podcast, 1);

        System.out.println(podcast.getNome());
        System.out.println(podcast.getDescricao());
        System.out.println(podcast.getDuracao());
        classificacao.getClassificacao();

    }
}