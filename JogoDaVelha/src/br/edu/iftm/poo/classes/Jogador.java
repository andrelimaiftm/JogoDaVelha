package br.edu.iftm.poo.classes;

import java.util.Scanner;

public class Jogador {

    //atributos da classe
    private String nickname;
    private char simbolo;

    //metodos construtores
    public Jogador (String nome, char simbolo){
        this.nickname = nome;
        this.simbolo = simbolo;
    }

    //metodos da classe
    public int[] realizaJogada(){
        int[] posicao = new int[2];
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor da linha: ");
        posicao[0] = entrada.nextInt();
        System.out.print("Digite o valor da coluna: ");
        posicao[1] = entrada.nextInt();
        return posicao;
    }

    //metodos getter e setter
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }
}
