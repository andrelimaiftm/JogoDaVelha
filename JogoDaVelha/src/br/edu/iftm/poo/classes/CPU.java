package br.edu.iftm.poo.classes;

import java.util.Random;

public class CPU extends Player{

    //metodo construtor
    public CPU(char simbolo){
        this.nickname = "computador";
        this.simbolo = simbolo;
    }

    //metodos da classe
    @Override
    public int[] realizaJogada(){
        int[] posicao = new int[2];
        Random jogadaCPU = new Random();
        posicao[0] = jogadaCPU.nextInt(2);
        posicao[1] = jogadaCPU.nextInt(2);
        return posicao;
    }
}
