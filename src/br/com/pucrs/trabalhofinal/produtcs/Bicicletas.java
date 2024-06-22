package br.com.pucrs.trabalhofinal.produtcs;

public class Bicicletas {
    private boolean bikeDisponivel; //atributo para verficar na classe membro

    public Bicicletas ( boolean bikeDisponivel ) {
        this.bikeDisponivel = bikeDisponivel;
    }

    public boolean isBikeDisponivel () {
        return bikeDisponivel;
    }

    public void setBikeDisponivel ( boolean bikeDisponivel ) {
        this.bikeDisponivel = bikeDisponivel;
    }
}
