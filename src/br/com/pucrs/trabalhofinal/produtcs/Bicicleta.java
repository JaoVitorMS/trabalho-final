package br.com.pucrs.trabalhofinal.produtcs;

import br.com.pucrs.trabalhofinal.clients.CadastroMembro;
import br.com.pucrs.trabalhofinal.clients.Membro;



public class Bicicleta {
    //Atributos
    private int NumeroBicicleta;
    private String Modelo;
    private int QuantidadeDisponivel;



    //Construtor
    public Bicicleta ( int NumeroBicicleta, String Modelo ) {
        this.NumeroBicicleta = NumeroBicicleta;
        this.Modelo = Modelo;
        this.QuantidadeDisponivel = 0;
    }

    CadastroMembro cadastroMembro = new CadastroMembro();
    CadastroBicicletas cadastroBicicletas = new CadastroBicicletas();

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



    //Método para realizar emprestimo da bicicleta
    public void RetirarBicicleta ( int matricula ) {
        if (QuantidadeDisponivel > 0 && cadastroMembro.dadoBike(matricula) == false) {
            cadastroBicicletas.diminuirQuantidadeBicicletas();
            System.out.println("Bicicleta retirada com sucesso!");
        }
        else if (cadastroMembro.dadoBike(matricula) == true) {
            System.out.println("Quantidade maxima atingida!");
        } else if (QuantidadeDisponivel == 0) {
            System.out.println("Não há bicicletas disponíveis no momento.");
        }
    }

    //Método para realizar devolução da bicicleta
    public void DevolverBicicleta ( int matricula ) {
        if (QuantidadeDisponivel >= 0 && cadastroMembro.dadoBike(matricula) == true) {
            cadastroBicicletas.aumentarQuantidadeBicicletas();
            System.out.println("Bicicleta devolvida com sucesso!");
        }
        else if (cadastroMembro.dadoBike(matricula) == false) {
            System.out.println("Você não alugou nenhuma bicicleta.");
        }
    }

    @Override
    public String toString () {
        return "Bicicletas: " + NumeroBicicleta +'\'' +
                ", Modelo = " + Modelo;
    }
}