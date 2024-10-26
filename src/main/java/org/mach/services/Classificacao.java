package org.mach.services;

import org.mach.models.Audio;
import org.mach.models.Music;

import java.util.ArrayList;

public class Classificacao extends Audio {

    ArrayList<Integer> classificacoes = new ArrayList<>();

    public void setClassificacao(Audio audio, int classificacao) {
        if (audio instanceof Music) {
            if (classificacao > 5) {
                classificacao = 5;
                System.out.println("Sua avaliação a música " + audio.getNome() + " foi: " + classificacao);
                System.out.println("Você não pode inserir um número maior que cinco, portanto sua avaliação foi contabilizada como cinco.");
            } else if (classificacao < 0) {
                classificacao = 0;
                System.out.println("Sua avaliação a música " + audio.getNome() + " foi: " + classificacao);
                System.out.println("Você não pode inserir um número menor que zero, portanto sua avaliação foi contabilizada como zero.");
            }
        } else {
            if (classificacao > 10) {
                classificacao = 10;
                System.out.println("Sua avaliação ao podcast " + audio.getNome() + " foi:" + classificacao);
                System.out.println("Você não pode inserir um número maior que dez, portanto sua avaliação foi contabilizada como dez.");
            } else if (classificacao < 0) {
                classificacao = 0;
                System.out.println("Sua avaliação ao podcast " + audio.getNome() + " foi: " + classificacao);
                System.out.println("Você não pode inserir um número menor que zero, portanto sua avaliação foi contabilizada como zero.");
            }
        }
        this.classificacoes.add(classificacao);
    }

    public void getClassificacao() {
        if (classificacoes.isEmpty()) {
            return;
        }
        int n = 0;
        for (int c : classificacoes) {
            n += c;
        }
    }
}