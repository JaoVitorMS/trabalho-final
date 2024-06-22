package br.com.pucrs.trabalhofinal;

public class Bicicleta {
    //Atributos
    private int NumeroBicicleta;
    private String Modelo;
    private int QuantidadeDisponivel;

    //Construtor
    public Bicicleta(int NumeroBicicleta, String Modelo, int QuantidadeDisponivel) {
        this.NumeroBicicleta = NumeroBicicleta;
        this.Modelo = Modelo;
        QuantidadeDisponivel = 10;
    }

    //Getters e Setters
    public int getNumeroBicicleta() {
        return NumeroBicicleta;
    }

    public void setNumeroBicicleta(int NumeroBicicleta) {
        this.NumeroBicicleta = NumeroBicicleta;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getQuantidadeDisponivel() {
        return QuantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int QuantidadeDisponivel) {
        this.QuantidadeDisponivel = QuantidadeDisponivel;
    }

    //Método para realizar emprestimo da bicicleta
    public void RetirarBicicleta() {
        if (QuantidadeDisponivel > 0) {
            QuantidadeDisponivel--;
            System.out.println("Bicicleta retirada com sucesso!");
        } else {
            System.out.println("Não há bicicletas disponíveis no momento.");
        }
    }

    //Método para realizar devolução da bicicleta
    public void DevolverBicicleta() {
        QuantidadeDisponivel++;
        System.out.println("Bicicleta devolvida com sucesso!");
    }
}
