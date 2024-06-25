package br.com.pucrs.trabalhofinal.produtcs;

import br.com.pucrs.trabalhofinal.clients.Membro;


public class Bicicleta {
    //Atributos
    private int NumeroBicicleta;
    private String Modelo;
    private int QuantidadeDisponivel;
    private static int dados_bicicleta_emprestadas = 0;


    //Construtor
    public Bicicleta ( int NumeroBicicleta, String Modelo, int QuantidadeDisponivel ) {
        this.NumeroBicicleta = NumeroBicicleta;
        this.Modelo = Modelo;
        this.QuantidadeDisponivel = 10;
        this.dados_bicicleta_emprestadas = 0;
    }
    // static boolean alugouBike = false;

    //Getters e Setters
    public int getNumeroBicicleta () {
        return NumeroBicicleta;
    }

    public void setNumeroBicicleta ( int NumeroBicicleta ) {
        this.NumeroBicicleta = NumeroBicicleta;
    }

    public String getModelo () {
        return Modelo;
    }

    public void setModelo ( String Modelo ) {
        this.Modelo = Modelo;
    }

    public int getQuantidadeDisponivel () {
        return QuantidadeDisponivel;
    }

    public void setQuantidadeDisponivel ( int QuantidadeDisponivel ) {
        this.QuantidadeDisponivel = QuantidadeDisponivel;
    }

    public static int getDados_bicicleta_emprestadas () {
        return dados_bicicleta_emprestadas;
    }


    //Método para realizar emprestimo da bicicleta
    public void RetirarBicicleta ( Membro matricula ) {
        if (QuantidadeDisponivel > 0) {
            QuantidadeDisponivel--;
            dados_bicicleta_emprestadas = 1;
            System.out.println("Bicicleta retirada com sucesso!");
        } else {
            System.out.println("Não há bicicletas disponíveis no momento.");
        }
    }

    //Método para realizar devolução da bicicleta
    public void DevolverBicicleta ( Membro matricula ) {
        QuantidadeDisponivel++;
        dados_bicicleta_emprestadas = 0;
        System.out.println("Bicicleta devolvida com sucesso!");
    }

    // Método para verificar se a bicicleta já foi alugada
//    public static boolean alugouBicicleta () {
//        if (alugouBike == true){ // Se for true é porque já foi alugada
//            return true;
//        } else {return false;}
//    }
//    public void dadosBicicleta() {
//        if (alugouBicicleta() == false) {
//            if (dados_bicicleta_emprestadas == 0) {
//                dados_bicicleta_emprestadas += 1;
//            }
//        }
//    }

}