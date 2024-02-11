package br.com.campeonato;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Campeonato {
    public List<Clube> clubes;
    public Random random;

    public Campeonato() {
        this.clubes = new ArrayList<>();
        this.random = new Random();
    }

    public void adicionarClube(Clube clube) {
        clubes.add(clube);
    }
    public void jogarCampeonato() {
        for (Clube team1 : clubes) {
            for (Clube team2 : clubes) {
                if (team1 != team2) {
                    int saldoDeGolsIda = random.nextInt(6);
                    jogarPartida(team1, team2, saldoDeGolsIda);

                    int saldoDeGolsVolta = random.nextInt(6);
                    jogarPartida(team2, team1, saldoDeGolsVolta);
                }
            }
        }
    }

    private void jogarPartida(Clube team1, Clube team2,int saldoGols) {
        if (saldoGols > 0) {
            team1.ganhar(saldoGols);
            team2.perder(saldoGols);
        } else if (saldoGols < 0) {
            team1.perder(-saldoGols);
            team2.ganhar(-saldoGols);
        } else {
            team1.empatar();
            team2.empatar();
        }
    }
    public void getClassificacao() {
        for (Clube clube : clubes) {
            System.out.println(clube.getNome() + " - Pontos: " + clube.getPontos());
        }
    }

    public Clube getCampeao() {
        Clube campeao = clubes.get(0);
        for (Clube clube : clubes) {
            if (clube.getPontos() > campeao.getPontos()) {
                campeao = clube;
            }
        }
        return campeao;
    }
}
