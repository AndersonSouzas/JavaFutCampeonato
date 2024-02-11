package br.com.campeonato;
public class Clube {
    private String nome;
    private int pontos;
    private int saldoGols;

    public Clube(String nome) {
        this.nome = nome;
        this.pontos = 0;
        this.saldoGols = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void ganhar(int saldoGols) {
        if (saldoGols > 0) {
            this.pontos += 3;
        }
    }

    public void empatar() {
        this.pontos += 1;
    }

    public void perder(int saldoGols) {
        if (saldoGols < 0) {
            this.pontos += pontos;
        }
    }
}