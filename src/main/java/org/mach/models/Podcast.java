package org.mach.models;

public class Podcast extends Audio {

    private int episodio;
    private String descricao;
    private String resumo;

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public void exibirResumo() {
        System.out.println("Resumo do episódio: " + resumo);
    }
}
