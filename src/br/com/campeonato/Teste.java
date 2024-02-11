package br.com.campeonato;

public class Teste {
    public static void main(String[] args) {
        Campeonato campeonato = new Campeonato();

        Clube team1 = new Clube("Python FC");
        Clube team2 = new Clube("C++ Lovers FC");
        Clube team3 = new Clube("União Windows Update");
        Clube team4 = new Clube("Atletico Alan Turing");
        Clube team5 = new Clube("Unix FC");
        Clube team6 = new Clube("Console.log FC");
        campeonato.adicionarClube(team1);
        campeonato.adicionarClube(team2);
        campeonato.adicionarClube(team3);
        campeonato.adicionarClube(team4);
        campeonato.adicionarClube(team5);
        campeonato.adicionarClube(team6);

        campeonato.jogarCampeonato();

        campeonato.getClassificacao();

        Clube campeao = campeonato.getCampeao();
        String nomeCampeao = campeao.getNome();

        System.out.println("O campeão é: " + nomeCampeao);
    }
}
