package br.edu.iftm.poo.main;

import br.edu.iftm.poo.classes.CPU;
import br.edu.iftm.poo.classes.Jogador;
import br.edu.iftm.poo.classes.Player;

public class Principal {

    public static void main(String[] args) {
        Jogador player1 = new Jogador("Joao", 'X');
        Jogador player2 = new Jogador("Maria", 'O');
        //System.out.println(player1.getNickname());
        //System.out.println(player1.getSimbolo());
        //System.out.println(player2.getNickname());
        //System.out.println(player2.getSimbolo());

        CPU computador = new CPU('C');
        int[] jogada = computador.realizaJogada();
        System.out.println(jogada[0]);
        System.out.println(jogada[1]);

        player1.login();
        //computador.login();

    }
}
