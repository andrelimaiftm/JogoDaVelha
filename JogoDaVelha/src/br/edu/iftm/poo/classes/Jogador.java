package br.edu.iftm.poo.classes;

import java.util.Scanner;

public class Jogador extends Player implements Autenticacao{

    //metodos construtores
    public Jogador (String nome, char simbolo){
        this.nickname = nome;
        this.simbolo = simbolo;
    }


    //metodos da classe
    @Override
    public int[] realizaJogada(){
        int[] posicao = new int[2];
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor da linha: ");
        posicao[0] = entrada.nextInt();
        System.out.print("Digite o valor da coluna: ");
        posicao[1] = entrada.nextInt();
        return posicao;
    }

    @Override
    public boolean login() {
        return false;
    }
}
