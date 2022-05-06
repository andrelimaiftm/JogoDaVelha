package br.edu.iftm.poo.classes;

public abstract class Player {

    //atributos da classe
    protected String nickname;
    protected char simbolo;

    public abstract int[] realizaJogada();

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
