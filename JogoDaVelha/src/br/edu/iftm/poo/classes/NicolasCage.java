package br.edu.iftm.poo.classes;

import java.util.Random;

public class NicolasCage extends Player implements Autenticacao {

    public NicolasCage() {
        this.nickname = "Nicolas Cage";
        this.simbolo = 'N';
    }

    @Override
    public boolean login() {
        return false;
    }

    @Override
    public int[] realizaJogada() {
        Random rand = new Random();
        int[] posicao = new int[2];
        int jogadaCage = rand.nextInt(2);
        posicao[0] = jogadaCage;
        posicao[1] = jogadaCage;
        return posicao;
    }
}
