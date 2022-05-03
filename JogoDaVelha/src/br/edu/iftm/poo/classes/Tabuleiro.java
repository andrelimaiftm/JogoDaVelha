package br.edu.iftm.poo.classes;

public class Tabuleiro {

    //atributo da classe
    private char[][] tabuleiro;
    private int numeroLinhas = 3;
    private int numeroColunas = 3;

    //metodo construtor
    public Tabuleiro(){
        this.tabuleiro = new char[numeroLinhas][numeroColunas];
    }

    //metodos da classe
    public void inicializaTabuleiro(){
        for (int i = 0; i < numeroLinhas; i++) {
            for (int j = 0; j < numeroColunas; j++) {
                tabuleiro[i][j] = '*';
            }

        }
    }

    public boolean insertM(int linha, int coluna, char simbolo){
        if(linha < 0 || linha > numeroLinhas || coluna < 0 || coluna > numeroColunas ){
            System.out.println("Posição invalida");
            return false;
        }else{
            if(tabuleiro[linha][coluna ] == '*'){
                tabuleiro[linha][coluna] = simbolo;
                return true;
            }else{
                return false;
            }
        }
    }

    public boolean verificaLinhas(char simbolo) {
        if (tabuleiro[0][0] == simbolo && tabuleiro[0][1] == simbolo && tabuleiro[0][2] == simbolo) {
            return true;
        } else if (tabuleiro[1][0] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[1][2] == simbolo) {
            return true;
        } else if (tabuleiro[2][0] == simbolo && tabuleiro[2][1] == simbolo && tabuleiro[2][2] == simbolo){
            return true;
        }
        return false;
    }
    
    public boolean verificaColuna(char simbolo){
        if (tabuleiro[0][0] == simbolo && tabuleiro[1][0] == simbolo && tabuleiro[2][0] == simbolo) {
            return true;
        } else if (tabuleiro[0][1] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][1] == simbolo) {
            return true;
        } else if (tabuleiro[0][2] == simbolo && tabuleiro[1][2] == simbolo && tabuleiro[2][2] == simbolo){
            return true;
        }
        return false;
    }

    //metodo getter e setter
    public char[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(char[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public int getNumeroLinhas() {
        return numeroLinhas;
    }

    public int getNumeroColunas() {
        return numeroColunas;
    }
}
