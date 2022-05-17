package br.edu.iftm.poo.classes;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
    //atributos da classe
    private Player player1;
    private Player player2;
    private Tabuleiro tabuleiro;
    private boolean temGanhador = false;
    Scanner teclado = new Scanner(System.in);

    //metodo construtor
    public Jogo(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.tabuleiro = new Tabuleiro();
        tabuleiro.inicializaTabuleiro();
    }

    public char[] sorteiaSimbolo(){
        char[] simbolo = new char[2];
        Random rand = new Random();
        int numeroSimbolo = rand.nextInt(1);
        if(numeroSimbolo == 1){
            simbolo[0] = 'X';
            simbolo[1] = 'O';
        }else{
            simbolo[0] = 'O';
            simbolo[1] = 'X';
        }
        return simbolo;
    }

    public void criarJogador(){
        //sorteia simbolo dos jogadores
        char[] simbolo = this.sorteiaSimbolo();

        //Escolha do jogado 1
        System.out.println("Jogador 1");
        System.out.println("Digite seu nickname: ");
        String nick = teclado.next();


        this.player1 = new Jogador(nick, simbolo[0]);

        //Escolha do jogador 2
        System.out.println("1 - Jogador ");
        System.out.println("2 - CPU ");
        System.out.println("3 - Nicolas Cage");
        System.out.println("Escolha seu adversário: ");
        int escolha = teclado.nextInt();
        switch (escolha){

            case 1:
                System.out.println("Jogador 2");
                System.out.println("Digite seu nickname: ");
                nick = teclado.next();
                this.player2 = new Jogador(nick, simbolo[1]);
                break;
            case 2:
                this.player2 = new CPU(simbolo[1]);
            break;
            case 3:
                this.player2 = new NicolasCage();
            break;
        }
    }

    public void realizaJogada(Player p1){
        boolean jogadaValida = false;
        while(jogadaValida == false){
            int[] posicao = p1.realizaJogada();
            int linha = posicao[0];
            int coluna = posicao[1];
            char simbolo = p1.getSimbolo();
            jogadaValida = tabuleiro.insertM(linha, coluna, simbolo);
        }

    }

    //metodos getter e setter
}
