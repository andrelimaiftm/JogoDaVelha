package br.edu.iftm.poo.classes;

public class Jogo {
    //atributos da classe
    private Jogador player1;
    private Jogador player2;
    private CPU computador;
    private Tabuleiro tabuleiro;
    private boolean temGanhador = false;

    //metodo construtor
    public Jogo(Jogador player1, Jogador player2, Tabuleiro tabuleiro) {
        this.player1 = player1;
        this.player2 = player2;
        this.tabuleiro = tabuleiro;
    }

    public Jogo(Jogador player1, CPU computador, Tabuleiro tabuleiro) {
        this.player1 = player1;
        this.computador = computador;
        this.tabuleiro = tabuleiro;
    }

    //metodos getter e setter
}
