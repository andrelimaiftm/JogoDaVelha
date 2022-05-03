package br.edu.iftm.poo.classes;

import java.util.Random;
import java.util.Scanner;

public class CPU {
    //atributos da classe
    private String nickname;
    char simbolo;

    //metodo construtor
    public CPU(char simbolo){
        this.nickname = "Computador";
        this.simbolo = simbolo;
    }

    //metodos da classe
    public int[] realizaJogada(){
        int[] posicao = new int[2];
        Random jogadaCPU = new Random();
        posicao[0] = jogadaCPU.nextInt(2);
        posicao[1] = jogadaCPU.nextInt(2);
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
